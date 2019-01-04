package view;

import controller.Dao;
import javax.swing.JOptionPane;
import tre.modal.Eleitor;

public class JanelaTerminal extends javax.swing.JFrame {

    private JanelaVotacao votarEleitor;

    public JanelaTerminal() {
        initComponents();
        setSize(1224, 700);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        foto = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        btnBuscaEleitor = new javax.swing.JButton();
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
        foto.setBounds(550, 200, 140, 150);

        titulo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(titulo);
        titulo.setBounds(470, 430, 290, 40);

        btnBuscaEleitor.setBackground(new java.awt.Color(0, 153, 51));
        btnBuscaEleitor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnBuscaEleitor.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscaEleitor.setText("Busca");
        btnBuscaEleitor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscaEleitor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscaEleitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaEleitorActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscaEleitor);
        btnBuscaEleitor.setBounds(470, 500, 290, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TituloEleitoral");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(510, 360, 210, 30);
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
    /**
     * Método busca eleitor se clicar ele vai verificar se a janela existe se
     * não, então ela e nula e ele criar a janela. Se sim ela fica estatica e
     * passa o eleitor buscado para ela para ser vizualizado seus dados veja os
     * ifs
     *
     * @param evt
     */
    private void btnBuscaEleitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaEleitorActionPerformed

        if (votarEleitor == null) {
            Eleitor eleitor = Dao.Titulo(titulo.getText());

            if (eleitor != null && eleitor.getStatus().equals("APTO")) {
                votarEleitor = new JanelaVotacao();
                votarEleitor.setVisible(true);
                votarEleitor.setEleitor(eleitor);
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Eleitor não pertence a seção ou está inápto ou voto consumado!", "ERROR!", JOptionPane.ERROR_MESSAGE, null);

            }
        } else {
            votarEleitor.setVisible(true);
            votarEleitor.setState(votarEleitor.NORMAL);
        }
    }//GEN-LAST:event_btnBuscaEleitorActionPerformed

    private void menuJustificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuJustificarActionPerformed

    }//GEN-LAST:event_menuJustificarActionPerformed
    /**
     * Método justificar voto se clicar no botão justifcar ele entra no método
     * justificar
     *
     * @param evt
     */
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
    /** Metodo encerrar votação
     * se clicar em encerrar votação chama a tela encerrar votcao
     * @param evt 
     */
    private void encerrarVotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encerrarVotacaoActionPerformed
        JanelaEncerrarVotacao encerrar = new JanelaEncerrarVotacao();
        encerrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_encerrarVotacaoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarradeMenu;
    private javax.swing.JDesktopPane PainelTrabalho;
    private javax.swing.JButton btnBuscaEleitor;
    private javax.swing.JMenuItem encerrarVotacao;
    private javax.swing.JLabel foto;
    private javax.swing.JMenuItem home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem justicarVoto;
    private javax.swing.JMenu menuJustificar;
    private javax.swing.JTextField titulo;
    private javax.swing.JMenu tre;
    // End of variables declaration//GEN-END:variables

}
