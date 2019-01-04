package controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import tre.modal.Secao;

public class GraficoSecaoG {

    private DefaultCategoryDataset barra;
    private ChartPanel painel;
    private JFreeChart grafico;

    public GraficoSecaoG() {
        new Dados().start();
    }

    public ChartPanel jfreechar() {
        barra = new DefaultCategoryDataset();
        grafico = ChartFactory.createBarChart3D("Terminal Regional Eletoral- Seções pelo RN - Gonvernador", "Urnas", "Votos", barra, PlotOrientation.VERTICAL, true, true, false);
        painel = new ChartPanel(grafico);
        return painel;
    }

    public class Dados extends Thread {

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                    List<Secao> ListSecao = (List<Secao>) Dao.listar();
                    for (int i = 0; i < ListSecao.size(); i++) {
                        for (int j = 0; j < ListSecao.get(i).getCandidatos().size(); j++) {
                            if (ListSecao.get(i).getCandidatos().get(j).getCargo().equals("Governador")) {
                                barra.setValue(ListSecao.get(i).getCandidatos().get(j).getVotos(), "( Seção: " + ListSecao.get(i).getNumero() + ") Candidato: " + ListSecao.get(i).getCandidatos().get(j).getNome(), "");
                            }
                        }

                    }

                } catch (InterruptedException ex) {
                    Logger.getLogger(GraficoSecaoG.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
