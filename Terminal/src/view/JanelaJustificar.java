package view;

import controller.Dao;
import javax.swing.JOptionPane;
import tre.modal.Eleitor;

public class JanelaJustificar extends javax.swing.JFrame {

    private JanelaJustificado justificarVoto;

    public JanelaJustificar() {
        initComponents();
        setSize(1224, 700);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        btnjustificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        secao = new javax.swing.JTextField();
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(540, 140, 140, 150);

        titulo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(titulo);
        titulo.setBounds(470, 450, 290, 40);

        btnjustificar.setBackground(new java.awt.Color(0, 204, 51));
        btnjustificar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnjustificar.setForeground(new java.awt.Color(0, 0, 0));
        btnjustificar.setText("Justificar");
        btnjustificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnjustificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjustificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnjustificar);
        btnjustificar.setBounds(470, 500, 290, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Justifique Seu Voto");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(490, 300, 230, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Seção:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(470, 360, 49, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Título:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(470, 430, 36, 17);

        secao.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        secao.setForeground(new java.awt.Color(0, 0, 0));
        secao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secaoActionPerformed(evt);
            }
        });
        getContentPane().add(secao);
        secao.setBounds(470, 380, 290, 40);
        getContentPane().add(PainelTrabalho);
        PainelTrabalho.setBounds(0, 0, 1430, 770);

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
        encerrarVotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encerrarVotacaoActionPerformed(evt);
            }
        });
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
    /** Metodo justicar voto
     * se ele estiver apto a justificar e existe na lista ele justificar
     * @param evt 
     */
    private void btnjustificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjustificarActionPerformed

        if (justificarVoto == null) {

            Eleitor eleitor = Dao.TituloJustificar(secao.getText(), titulo.getText());

            if (eleitor != null && eleitor.getStatus().equals("APTO")) {
                Dao.justificar(titulo.getText());
                
                justificarVoto = new JanelaJustificado();
                justificarVoto.setVisible(true);

                JOptionPane.showMessageDialog(null, "Justificado com sucesso!");
                justificarVoto.setEleitor(eleitor);
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Eleitor não pertence a seção ou está inápto!", "ERROR!", JOptionPane.ERROR_MESSAGE, null);

            }
        } else {
            justificarVoto.setVisible(true);
            justificarVoto.setState(justificarVoto.NORMAL);

        }
    }//GEN-LAST:event_btnjustificarActionPerformed

    private void secaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secaoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_secaoActionPerformed

    private void justicarVotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_justicarVotoActionPerformed
        JanelaJustificar justificar = new JanelaJustificar();
        justificar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_justicarVotoActionPerformed

    private void menuJustificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuJustificarActionPerformed

    }//GEN-LAST:event_menuJustificarActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        JanelaTerminal janelaTerminal = new JanelaTerminal();
        janelaTerminal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void encerrarVotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encerrarVotacaoActionPerformed
        JanelaEncerrarVotacao encerrar = new JanelaEncerrarVotacao();
        encerrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_encerrarVotacaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarradeMenu;
    private javax.swing.JDesktopPane PainelTrabalho;
    private javax.swing.JButton btnjustificar;
    private javax.swing.JMenuItem encerrarVotacao;
    private javax.swing.JMenuItem home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem justicarVoto;
    private javax.swing.JMenu menuJustificar;
    private javax.swing.JTextField secao;
    private javax.swing.JTextField titulo;
    private javax.swing.JMenu tre;
    // End of variables declaration//GEN-END:variables
}
