package view;

import controller.GraficoSecaoG;
import java.awt.BorderLayout;

public class JanelaSecaoG extends javax.swing.JFrame {

    public JanelaSecaoG() {
        initComponents();
        setSize(1224, 700);
        GraficoSecaoG grafico = new GraficoSecaoG();
        this.painelGraficoG.setLayout(new BorderLayout());
        this.painelGraficoG.add(grafico.jfreechar());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        painelGraficoG = new javax.swing.JPanel();
        BarradeMenu = new javax.swing.JMenuBar();
        tre = new javax.swing.JMenu();
        Home = new javax.swing.JMenuItem();
        fechar = new javax.swing.JMenuItem();
        apuracaoSecao = new javax.swing.JMenu();
        prefeitoSecao = new javax.swing.JMenuItem();
        governadorSecao = new javax.swing.JMenuItem();
        apuracao = new javax.swing.JMenu();
        prefeitoApuracao = new javax.swing.JMenuItem();
        governadorapuracao = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(550, 240, 140, 150);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 760, 10);
        getContentPane().add(painelGraficoG);
        painelGraficoG.setBounds(0, 0, 1270, 730);

        tre.setForeground(new java.awt.Color(0, 0, 0));
        tre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/application_osx_terminal.png"))); // NOI18N
        tre.setText("TRE");

        Home.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Home.setForeground(new java.awt.Color(0, 0, 0));
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/application_osx_terminal.png"))); // NOI18N
        Home.setText("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        tre.add(Home);

        fechar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        fechar.setForeground(new java.awt.Color(0, 0, 0));
        fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        fechar.setText("Fechar");
        fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharActionPerformed(evt);
            }
        });
        tre.add(fechar);

        BarradeMenu.add(tre);

        apuracaoSecao.setForeground(new java.awt.Color(0, 0, 0));
        apuracaoSecao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/folder_table.png"))); // NOI18N
        apuracaoSecao.setText("Apuração Seções");

        prefeitoSecao.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        prefeitoSecao.setForeground(new java.awt.Color(0, 0, 0));
        prefeitoSecao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/group_go.png"))); // NOI18N
        prefeitoSecao.setText("Prefeito");
        prefeitoSecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prefeitoSecaoActionPerformed(evt);
            }
        });
        apuracaoSecao.add(prefeitoSecao);

        governadorSecao.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        governadorSecao.setForeground(new java.awt.Color(0, 0, 0));
        governadorSecao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/group.png"))); // NOI18N
        governadorSecao.setText("Governador");
        governadorSecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                governadorSecaoActionPerformed(evt);
            }
        });
        apuracaoSecao.add(governadorSecao);

        BarradeMenu.add(apuracaoSecao);

        apuracao.setForeground(new java.awt.Color(0, 0, 0));
        apuracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/chart_bar.png"))); // NOI18N
        apuracao.setText("Apuração");

        prefeitoApuracao.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        prefeitoApuracao.setForeground(new java.awt.Color(0, 0, 0));
        prefeitoApuracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/group.png"))); // NOI18N
        prefeitoApuracao.setText("Prefeito");
        prefeitoApuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prefeitoApuracaoActionPerformed(evt);
            }
        });
        apuracao.add(prefeitoApuracao);

        governadorapuracao.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        governadorapuracao.setForeground(new java.awt.Color(0, 0, 0));
        governadorapuracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/group_go.png"))); // NOI18N
        governadorapuracao.setText("Governador");
        governadorapuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                governadorapuracaoActionPerformed(evt);
            }
        });
        apuracao.add(governadorapuracao);

        BarradeMenu.add(apuracao);

        setJMenuBar(BarradeMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        Tre tre = new Tre();
        tre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeActionPerformed

    private void fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharActionPerformed
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_fecharActionPerformed

    private void prefeitoSecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prefeitoSecaoActionPerformed
        JanelaSecaoP graficoP = new JanelaSecaoP();
        graficoP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_prefeitoSecaoActionPerformed

    private void governadorSecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_governadorSecaoActionPerformed

        JanelaSecaoG graficoG = new JanelaSecaoG();
        graficoG.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_governadorSecaoActionPerformed

    private void prefeitoApuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prefeitoApuracaoActionPerformed
        JanelaApuracaoP apuracaoP = new JanelaApuracaoP();
        apuracaoP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_prefeitoApuracaoActionPerformed

    private void governadorapuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_governadorapuracaoActionPerformed
        JanelaApuracaoG apuracaoG = new JanelaApuracaoG();
        apuracaoG.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_governadorapuracaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarradeMenu;
    private javax.swing.JMenuItem Home;
    private javax.swing.JMenu apuracao;
    private javax.swing.JMenu apuracaoSecao;
    private javax.swing.JMenuItem fechar;
    private javax.swing.JMenuItem governadorSecao;
    private javax.swing.JMenuItem governadorapuracao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel painelGraficoG;
    private javax.swing.JMenuItem prefeitoApuracao;
    private javax.swing.JMenuItem prefeitoSecao;
    private javax.swing.JMenu tre;
    // End of variables declaration//GEN-END:variables
}
