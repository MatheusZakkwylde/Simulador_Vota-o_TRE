package view;

import controller.Dao;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tre.modal.Eleitor;

public class JanelaEncerrarVotacao extends javax.swing.JFrame {

    private JanelaVotacao votar;

    public JanelaEncerrarVotacao() {
        initComponents();
        setSize(1224, 700);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        foto = new javax.swing.JLabel();
        encerrar = new javax.swing.JTextField();
        EncerrarVotacao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PainelTrabalho = new javax.swing.JDesktopPane();
        BarradeMenu = new javax.swing.JMenuBar();
        tre = new javax.swing.JMenu();
        home = new javax.swing.JMenuItem();
        encerrarVotacao = new javax.swing.JMenuItem();
        menuJustificar = new javax.swing.JMenu();
        justicarVoto = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone.png"))); // NOI18N
        getContentPane().add(foto);
        foto.setBounds(550, 240, 140, 150);

        encerrar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        encerrar.setForeground(new java.awt.Color(0, 0, 0));
        encerrar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(encerrar);
        encerrar.setBounds(470, 430, 290, 40);

        EncerrarVotacao.setBackground(new java.awt.Color(0, 153, 51));
        EncerrarVotacao.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        EncerrarVotacao.setForeground(new java.awt.Color(0, 0, 0));
        EncerrarVotacao.setText("Encerrar");
        EncerrarVotacao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EncerrarVotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncerrarVotacaoActionPerformed(evt);
            }
        });
        getContentPane().add(EncerrarVotacao);
        EncerrarVotacao.setBounds(470, 500, 290, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Encerrar Votação");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(520, 390, 190, 28);
        getContentPane().add(PainelTrabalho);
        PainelTrabalho.setBounds(0, -1, 1260, 730);

        BarradeMenu.setFont(new java.awt.Font("Liberation Serif", 0, 20)); // NOI18N

        tre.setForeground(new java.awt.Color(0, 0, 0));
        tre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/application_osx_terminal.png"))); // NOI18N
        tre.setText("Terminal Regional Eleitoral");

        home.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        home.setForeground(new java.awt.Color(0, 0, 0));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/application_osx_terminal.png"))); // NOI18N
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        tre.add(home);

        encerrarVotacao.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        encerrarVotacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        encerrarVotacao.setText("Encerrar Votação");
        tre.add(encerrarVotacao);

        BarradeMenu.add(tre);

        menuJustificar.setForeground(new java.awt.Color(0, 0, 0));
        menuJustificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flag_green.png"))); // NOI18N
        menuJustificar.setText("Justificar");
        menuJustificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuJustificarActionPerformed(evt);
            }
        });

        justicarVoto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        justicarVoto.setForeground(new java.awt.Color(0, 0, 0));
        justicarVoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/group.png"))); // NOI18N
        justicarVoto.setText("Justicar Votação");
        justicarVoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                justicarVotoActionPerformed(evt);
            }
        });
        menuJustificar.add(justicarVoto);

        BarradeMenu.add(menuJustificar);

        setJMenuBar(BarradeMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents
     /**
     * Metodo encerrar votacao se for clicaco no botão encerrar votacao da um
     * exit fechando a tela.
     *
     * @param evt
     */
    private void EncerrarVotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncerrarVotacaoActionPerformed
        try {
            if (encerrar.getText().equals("9999 9999 9999")) {
                Thread.sleep(1000);
                JOptionPane.showMessageDialog(null, "Encerrando Votação", "Encerrar", JOptionPane.INFORMATION_MESSAGE, null);
                System.exit(0);
            } else {

                JOptionPane.showMessageDialog(null, "Insira o código de encerramento corretoo", "Error", JOptionPane.ERROR_MESSAGE, null);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(JanelaEncerrarVotacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EncerrarVotacaoActionPerformed

    private void menuJustificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuJustificarActionPerformed

    }//GEN-LAST:event_menuJustificarActionPerformed

    private void justicarVotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_justicarVotoActionPerformed
        JanelaJustificar justificar = new JanelaJustificar();
        justificar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_justicarVotoActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        JanelaTerminal janelaTerminal = new JanelaTerminal();
        janelaTerminal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarradeMenu;
    private javax.swing.JButton EncerrarVotacao;
    private javax.swing.JDesktopPane PainelTrabalho;
    private javax.swing.JTextField encerrar;
    private javax.swing.JMenuItem encerrarVotacao;
    private javax.swing.JLabel foto;
    private javax.swing.JMenuItem home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem justicarVoto;
    private javax.swing.JMenu menuJustificar;
    private javax.swing.JMenu tre;
    // End of variables declaration//GEN-END:variables

}
