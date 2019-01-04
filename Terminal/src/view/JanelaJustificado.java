package view;

import tre.modal.Eleitor;

public class JanelaJustificado extends javax.swing.JFrame {

    public JanelaJustificado() {
        initComponents();
        setSize(1224, 700);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        data = new javax.swing.JTextField();
        titulo = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
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

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("CPF:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(430, 230, 50, 17);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(430, 160, 80, 17);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Título:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(430, 300, 36, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Data de Nascimento:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(430, 370, 170, 17);

        data.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        data.setForeground(new java.awt.Color(0, 0, 0));
        data.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(data);
        data.setBounds(430, 400, 330, 30);

        titulo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(titulo);
        titulo.setBounds(430, 330, 330, 30);

        cpf.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cpf.setForeground(new java.awt.Color(0, 0, 0));
        cpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfActionPerformed(evt);
            }
        });
        getContentPane().add(cpf);
        cpf.setBounds(430, 260, 330, 30);

        nome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nome.setForeground(new java.awt.Color(0, 0, 0));
        nome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        getContentPane().add(nome);
        nome.setBounds(430, 190, 330, 30);
        getContentPane().add(PainelTrabalho);
        PainelTrabalho.setBounds(0, 0, 1290, 750);

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

    private void cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

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

    private void justicarVotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_justicarVotoActionPerformed
        JanelaJustificar justificar = new JanelaJustificar();
        justificar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_justicarVotoActionPerformed

    private void menuJustificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuJustificarActionPerformed

    }//GEN-LAST:event_menuJustificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarradeMenu;
    private javax.swing.JDesktopPane PainelTrabalho;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField data;
    private javax.swing.JMenuItem encerrarVotacao;
    private javax.swing.JMenuItem home;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem justicarVoto;
    private javax.swing.JMenu menuJustificar;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField titulo;
    private javax.swing.JMenu tre;
    // End of variables declaration//GEN-END:variables
    public void setEleitor(Eleitor eleitor){
        nome.setText(eleitor.getNome());
        nome.setEnabled(false);
        
        cpf.setText(eleitor.getCpf());
        cpf.setEnabled(false);
        
        titulo.setText(eleitor.getTitulo());
        titulo.setEnabled(false);
        
        data.setText(eleitor.getDataNascimento());
        data.setEnabled(false);   
    }
}
