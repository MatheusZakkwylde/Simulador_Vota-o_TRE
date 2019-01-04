package view;

import controller.Dao;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setSize(459, 430);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        foto = new javax.swing.JLabel();
        labelSecao = new javax.swing.JLabel();
        secao = new javax.swing.JTextField();
        entrar = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icone.png"))); // NOI18N
        getContentPane().add(foto);
        foto.setBounds(170, 40, 128, 140);

        labelSecao.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labelSecao.setForeground(new java.awt.Color(255, 255, 255));
        labelSecao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSecao.setText("Secao");
        getContentPane().add(labelSecao);
        labelSecao.setBounds(190, 220, 70, 28);

        secao.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        secao.setForeground(new java.awt.Color(0, 0, 0));
        secao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secaoActionPerformed(evt);
            }
        });
        getContentPane().add(secao);
        secao.setBounds(80, 270, 320, 40);

        entrar.setBackground(new java.awt.Color(0, 204, 51));
        entrar.setForeground(new java.awt.Color(255, 255, 255));
        entrar.setText("Entrar");
        entrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        getContentPane().add(entrar);
        entrar.setBounds(310, 331, 90, 40);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.png"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 460, 430);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * quando clicar em entrar verificar se a seçao existe no arquivo
     * TRE_Dados.txt Se sim entra no sistema, se não informa seção não
     * cadastrada.
     *
     * @param evt
     */
    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        
         //passa o numero da seção. se a seção existe no método secaoUrna
        //que vai no arquivo do terminal e ver se a seção esta lá
        // se sim ele entra no if e chama a tela aguardando votação
        //até que o terminal libere para volta se não diz que
        //o a seção não esta cadastrada no sistema.
        if (Dao.secaoUrna(secao.getText()) == true) {
            Dao.urna(secao.getText());
            JanelaAguarde aguarde = new JanelaAguarde();
            aguarde.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Seção não cadastrada");
        }
    }//GEN-LAST:event_entrarActionPerformed

    private void secaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secaoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entrar;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel labelSecao;
    private javax.swing.JTextField secao;
    // End of variables declaration//GEN-END:variables
}
