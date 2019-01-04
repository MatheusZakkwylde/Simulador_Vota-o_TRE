package view;
import controller.Dao;
import controller.FatorConexao;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.LiberarUrnaTerminal;
import tre.modal.Eleitor;

public class JanelaAguardando extends javax.swing.JFrame {

    public JanelaAguardando() {
        initComponents();
        setSize(1224, 700);
        new LiberarTerminal().start();
    }

    private void fecharJanela() {
        this.dispose();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PainelTrabalho = new javax.swing.JDesktopPane();
        BarradeMenu = new javax.swing.JMenuBar();
        tre = new javax.swing.JMenu();

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(550, 240, 140, 150);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Aguardando Votação");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(460, 150, 360, 50);
        getContentPane().add(PainelTrabalho);
        PainelTrabalho.setBounds(0, -1, 1270, 740);

        BarradeMenu.setFont(new java.awt.Font("Liberation Serif", 0, 20)); // NOI18N

        tre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/application_osx_terminal.png"))); // NOI18N
        tre.setText("Terminal Regional Eleitoral");
        BarradeMenu.add(tre);

        setJMenuBar(BarradeMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarradeMenu;
    private javax.swing.JDesktopPane PainelTrabalho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu tre;
    // End of variables declaration//GEN-END:variables
/**
 * Variavel criada para roda a Thread até que a condicao mude para
 * false; se mudar para false a Thread para
 */
private boolean condicao = true;
/** objeto que recebe o eleitor que votou urna
 * 
 */
private Eleitor eleitor;

/** Método getEleitor
 * Quando instanciado recebe um eleitor e passa para o obejeto eleitor
 * @param eleitor 
 */
public void settEleitor (Eleitor eleitor){
    this.eleitor = eleitor;
}


    public class LiberarTerminal extends Thread {

        @Override
        public void run() {

            while (condicao) {

                try {
                    FileInputStream caminho = null;
                    Thread.sleep(2000);
                    caminho = new FileInputStream(FatorConexao.urlTerminal_urna());
                    ObjectInputStream informacao = new ObjectInputStream(caminho);
                    LiberarUrnaTerminal liberarTerminal = (LiberarUrnaTerminal) informacao.readObject();

                    if (liberarTerminal != null) {
                        if (liberarTerminal.getLiberar() == false) {
                            Dao.votoVotou(eleitor.getTitulo());
                            fecharJanela();
                            JanelaTerminal janelaterminal = new JanelaTerminal();
                            janelaterminal.setVisible(true);
                            condicao = false;
                        }
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(JanelaAguardando.class.getName()).log(Level.SEVERE, null, ex);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(JanelaAguardando.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(JanelaAguardando.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(JanelaAguardando.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
