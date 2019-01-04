package view;

import controller.Dao;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.JOptionPane;
import tre.modal.Candidato;

public class JanelaPrefeito extends javax.swing.JFrame {

    public JanelaPrefeito() {
        initComponents();
        setSize(700, 400);
        cargo.setText("Prefeito(a):");
        foto.setVisible(false);
        nomep.setVisible(false);
        txtNome.setVisible(false);
        numeroo.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnUm = new javax.swing.JButton();
        btnDois = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnQuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnSete = new javax.swing.JButton();
        btnOito = new javax.swing.JButton();
        btnNove = new javax.swing.JButton();
        btnBranco = new javax.swing.JButton();
        btnCorrige = new javax.swing.JButton();
        btnConfirma = new javax.swing.JButton();
        btnzero = new javax.swing.JButton();
        cargo = new javax.swing.JLabel();
        foto = new javax.swing.JLabel();
        num1 = new javax.swing.JLabel();
        num2 = new javax.swing.JLabel();
        nomep = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        numero = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        numeroo = new javax.swing.JLabel();
        numero2 = new javax.swing.JLabel();
        numerop = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        btnUm.setBackground(new java.awt.Color(0, 0, 0));
        btnUm.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnUm.setForeground(new java.awt.Color(255, 255, 255));
        btnUm.setText("1");
        btnUm.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnUm.setBorderPainted(false);
        btnUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUmActionPerformed(evt);
            }
        });

        btnDois.setBackground(new java.awt.Color(0, 0, 0));
        btnDois.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnDois.setForeground(new java.awt.Color(255, 255, 255));
        btnDois.setText("2");
        btnDois.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnDois.setBorderPainted(false);
        btnDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoisActionPerformed(evt);
            }
        });

        btnTres.setBackground(new java.awt.Color(0, 0, 0));
        btnTres.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnTres.setForeground(new java.awt.Color(255, 255, 255));
        btnTres.setText("3");
        btnTres.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnTres.setBorderPainted(false);
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnQuatro.setBackground(new java.awt.Color(0, 0, 0));
        btnQuatro.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnQuatro.setForeground(new java.awt.Color(255, 255, 255));
        btnQuatro.setText("4");
        btnQuatro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnQuatro.setBorderPainted(false);
        btnQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuatroActionPerformed(evt);
            }
        });

        btnCinco.setBackground(new java.awt.Color(0, 0, 0));
        btnCinco.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnCinco.setForeground(new java.awt.Color(255, 255, 255));
        btnCinco.setText("5");
        btnCinco.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCinco.setBorderPainted(false);
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        btnSeis.setBackground(new java.awt.Color(0, 0, 0));
        btnSeis.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnSeis.setForeground(new java.awt.Color(255, 255, 255));
        btnSeis.setText("6");
        btnSeis.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSeis.setBorderPainted(false);
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        btnSete.setBackground(new java.awt.Color(0, 0, 0));
        btnSete.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnSete.setForeground(new java.awt.Color(255, 255, 255));
        btnSete.setText("7");
        btnSete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSete.setBorderPainted(false);
        btnSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeteActionPerformed(evt);
            }
        });

        btnOito.setBackground(new java.awt.Color(0, 0, 0));
        btnOito.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnOito.setForeground(new java.awt.Color(255, 255, 255));
        btnOito.setText("8");
        btnOito.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnOito.setBorderPainted(false);
        btnOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOitoActionPerformed(evt);
            }
        });

        btnNove.setBackground(new java.awt.Color(0, 0, 0));
        btnNove.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnNove.setForeground(new java.awt.Color(255, 255, 255));
        btnNove.setText("9");
        btnNove.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNove.setBorderPainted(false);
        btnNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoveActionPerformed(evt);
            }
        });

        btnBranco.setBackground(new java.awt.Color(255, 255, 255));
        btnBranco.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnBranco.setText("Branco");
        btnBranco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBrancoMouseClicked(evt);
            }
        });

        btnCorrige.setBackground(new java.awt.Color(255, 102, 51));
        btnCorrige.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnCorrige.setText("Corrige");
        btnCorrige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorrigeActionPerformed(evt);
            }
        });

        btnConfirma.setBackground(new java.awt.Color(0, 153, 51));
        btnConfirma.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnConfirma.setText("Confirma");
        btnConfirma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnConfirmaMousePressed(evt);
            }
        });

        btnzero.setBackground(new java.awt.Color(0, 0, 0));
        btnzero.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnzero.setForeground(new java.awt.Color(255, 255, 255));
        btnzero.setText("0");
        btnzero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnzero.setBorderPainted(false);
        btnzero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnzeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btnCorrige, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUm, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSete, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDois, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOito, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnzero, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSeis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUm, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDois, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOito, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNove, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnzero, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnCorrige, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(360, 40, 310, 270);

        cargo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cargo.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(cargo);
        cargo.setBounds(30, 60, 200, 30);

        foto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(foto);
        foto.setBounds(240, 100, 90, 110);

        num1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        num1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(num1);
        num1.setBounds(40, 100, 40, 40);

        num2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        num2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(num2);
        num2.setBounds(90, 100, 40, 40);

        nomep.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nomep.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(nomep);
        nomep.setBounds(50, 180, 170, 20);
        getContentPane().add(nome);
        nome.setBounds(50, 220, 140, 0);
        getContentPane().add(numero);
        numero.setBounds(110, 180, 0, 0);

        txtNome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.setText("Nome:");
        getContentPane().add(txtNome);
        txtNome.setBounds(50, 160, 51, 17);

        numeroo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        numeroo.setForeground(new java.awt.Color(0, 0, 0));
        numeroo.setText("Numero:");
        getContentPane().add(numeroo);
        numeroo.setBounds(50, 210, 70, 17);

        numero2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(numero2);
        numero2.setBounds(50, 230, 100, 20);

        numerop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(numerop);
        numerop.setBounds(20, 40, 330, 270);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCorrigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrigeActionPerformed
        num1.setText("");
        num2.setText("");
        passa = 0;
        num1.setVisible(true);
        num2.setVisible(true);
        foto.setVisible(false);
        nomep.setVisible(false);
        txtNome.setVisible(false);
        numeroo.setVisible(false);
        numero2.setVisible(false);


    }//GEN-LAST:event_btnCorrigeActionPerformed

    //Adicionar o nome e foto quando selecionado
    private void btnUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUmActionPerformed
        if (passa == 1) {
            num2.setText("1");
            passa = 2;
        }
        if (passa == 0) {
            num1.setText("1");
            passa = 1;
        }

        if (passa == 2) {
            candidato();
        }
    }//GEN-LAST:event_btnUmActionPerformed
    //Adicionar o nome e foto quando selecionado
    private void btnQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuatroActionPerformed
        if (passa == 1) {
            num2.setText("4");
            passa = 2;
        }
        if (passa == 0) {
            num1.setText("4");
            passa = 1;
        }

        if (passa == 2) {
            candidato();
        }
    }//GEN-LAST:event_btnQuatroActionPerformed
    //Adicionar o nome e foto quando selecionado
    private void btnSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeteActionPerformed
        if (passa == 1) {
            num2.setText("7");
            passa = 2;
        }
        if (passa == 0) {
            num1.setText("7");
            passa = 1;
        }

        if (passa == 2) {
            candidato();
        }
    }//GEN-LAST:event_btnSeteActionPerformed
    //Adicionar o nome e foto quando selecionado
    private void btnOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOitoActionPerformed
        if (passa == 1) {
            num2.setText("8");
            passa = 2;
        }
        if (passa == 0) {
            num1.setText("8");
            passa = 1;
        }

        if (passa == 2) {
            candidato();
        }
    }//GEN-LAST:event_btnOitoActionPerformed
    //Adicionar o nome e foto quando selecionado
    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        if (passa == 1) {
            num2.setText("5");
            passa = 2;
        }
        if (passa == 0) {
            num1.setText("5");
            passa = 1;
        }

        if (passa == 2) {
            candidato();
        }
    }//GEN-LAST:event_btnCincoActionPerformed
    //Adicionar o nome e foto quando selecionado
    private void btnDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoisActionPerformed
        if (passa == 1) {
            num2.setText("2");
            passa = 2;
        }
        if (passa == 0) {
            num1.setText("2");
            passa = 1;
        }

        if (passa == 2) {
            candidato();
        }

        if (passa == 2) {
            candidato();
        }
    }//GEN-LAST:event_btnDoisActionPerformed
    //Adicionar o nome e foto quando selecionado
    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        if (passa == 1) {
            num2.setText("3");
            passa = 2;
        }
        if (passa == 0) {
            num1.setText("3");
            passa = 1;
        }

        if (passa == 2) {
            candidato();
        }
    }//GEN-LAST:event_btnTresActionPerformed
    //Adicionar o nome e foto quando selecionado
    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        if (passa == 1) {
            num2.setText("6");
            passa = 2;
        }

        if (passa == 0) {
            num1.setText("6");
            passa = 1;
        }
        if (passa == 2) {
            candidato();
        }
    }//GEN-LAST:event_btnSeisActionPerformed
    //Adicionar o nome e foto quando selecionado
    private void btnNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoveActionPerformed
        if (passa == 1) {
            num2.setText("9");
            passa = 2;
        }
        if (passa == 0) {
            num1.setText("9");
            passa = 1;
        }

        if (passa == 2) {
            candidato();
        }
    }//GEN-LAST:event_btnNoveActionPerformed

    private void btnConfirmaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmaMousePressed
          play("confirmar");
        //se conficao for igual a falso é porque foi encontrado um candidato com um
       //numero e o eleitor votou nele.Se não ele não contabilizar voto e vao para
       //proxima tela;
        if (condicao == false) {
            Dao.setarVotosPrefeito(num1.getText() + num2.getText());
            JanelaGovernador gonvernador = new JanelaGovernador();
            gonvernador.setVisible(true);
            this.dispose();
        } else {
            JanelaGovernador gonvernador = new JanelaGovernador();
            gonvernador.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnConfirmaMousePressed

    private void btnBrancoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBrancoMouseClicked
        JOptionPane.showMessageDialog(null, "Voto comtabilizado Branco");
    }//GEN-LAST:event_btnBrancoMouseClicked

    private void btnzeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnzeroActionPerformed
        // TODO add your handling code here:

        if (passa == 1) {
            num2.setText("0");
            passa = 2;

        }
        if (passa == 0) {
            num1.setText("0");
            passa = 1;

        }

        if (passa == 2) {
            candidato();
        }


    }//GEN-LAST:event_btnzeroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBranco;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnConfirma;
    private javax.swing.JButton btnCorrige;
    private javax.swing.JButton btnDois;
    private javax.swing.JButton btnNove;
    private javax.swing.JButton btnOito;
    private javax.swing.JButton btnQuatro;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSete;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUm;
    private javax.swing.JButton btnzero;
    private javax.swing.JLabel cargo;
    private javax.swing.JLabel foto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel nomep;
    private javax.swing.JLabel num1;
    private javax.swing.JLabel num2;
    private javax.swing.JLabel numero;
    private javax.swing.JLabel numero2;
    private javax.swing.JLabel numeroo;
    private javax.swing.JLabel numerop;
    private javax.swing.JLabel txtNome;
    // End of variables declaration//GEN-END:variables
    private int passa = 0;
    private boolean condicao = false;

    private Candidato candidato() {
        Candidato candidato = Dao.candidatoPrefeito(num1.getText() + num2.getText());
        if (candidato != null) {

            num1.setVisible(false);
            num2.setVisible(false);
            nomep.setText(candidato.getNome());
            numero2.setText(Integer.toString(candidato.getNumero()));
            numeroo.setVisible(true);
            nomep.setVisible(true);
            txtNome.setVisible(true);
            numero2.setVisible(true);
            //se o voto for nulo ele pede para confirma e seta condição como nulo para não contabilizar o voto quando ele votar
        } else {
            JOptionPane.showMessageDialog(null, "Voto nulo Confirme seu voto", "voto nulo", JOptionPane.INFORMATION_MESSAGE, null);
            condicao = false;
        }
        return candidato;
    }
    
     public void play(String archive) {
        URL url = getClass().getResource(archive + ".wav");
        AudioClip audio = Applet.newAudioClip(url);
        audio.play();
    }

}
