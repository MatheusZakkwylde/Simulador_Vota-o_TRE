package controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import tre.modal.Candidato;
import tre.modal.Secao;

public class GraficoApuracaoP {

    private DefaultCategoryDataset barra;
    private ChartPanel painel;
    private JFreeChart grafico;

    public GraficoApuracaoP() {
        new Dados().start();
    }

    public ChartPanel jfreechar() {
        barra = new DefaultCategoryDataset();
        grafico = ChartFactory.createBarChart3D("Terminal Regional Eletoral- Apuração pelo RN- Prefeito", "Urnas", "Votos", barra, PlotOrientation.VERTICAL, true, true, false);
        painel = new ChartPanel(grafico);
        return painel;
    }

    public class Dados extends Thread {

        @Override
        public void run() {
            while (true) {
                //Atualizando os dados e eimprimindo na tela
               
                try {
                    Thread.sleep(1000);
                    List<Secao> ListSecao = (List<Secao>) Dao.listar();
                    List<Candidato> ListCandidatos = null;

                    ListCandidatos = ListSecao.get(0).getCandidatos();

                    for (int i = 0; i < ListCandidatos.size(); i++) {
                        if (ListCandidatos.get(i).getCargo().equals("Prefeito")) {
                            for (int j = 1; j < ListSecao.size(); j++) {
                                for (int p = 0; p < ListSecao.get(j).getCandidatos().size(); p++) {
                                    if (ListCandidatos.get(i).getNome().equals(ListSecao.get(j).getCandidatos().get(p).getNome())) {
                                        ListCandidatos.get(i).setVotos(ListCandidatos.get(i).getVotos()+ ListSecao.get(j).getCandidatos().get(p).getVotos());
                                        barra.setValue(ListCandidatos.get(i).getVotos(), "( Candidato: " + ListCandidatos.get(i).getNome(), "");
                                    }
                                }
                            }
                        }
                    }

                } catch (InterruptedException ex) {
                    Logger.getLogger(GraficoApuracaoP.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

    }

}
