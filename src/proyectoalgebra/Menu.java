package proyectoalgebra;

public class Menu extends javax.swing.JFrame {
    
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnProg1 = new javax.swing.JButton();
        btnProg2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnProg3 = new javax.swing.JButton();
        btnProg5 = new javax.swing.JButton();
        btnProg4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Algebra II");
        setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Menu Principal");

        btnProg1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnProg1.setText("Propiedades-Matriz");
        btnProg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProg1ActionPerformed(evt);
            }
        });

        btnProg2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnProg2.setText("Grafo Bipartito");
        btnProg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProg2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Algebra I I - Proyecto FInal");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Integrantes: Calisaya Matias");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText(" Ramos Mariela");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText(" Balero Sergio");

        btnProg3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnProg3.setText("Prob. 3 Dados");
        btnProg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProg3ActionPerformed(evt);
            }
        });

        btnProg5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnProg5.setText("Matriz de Adyacencia");
        btnProg5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProg5ActionPerformed(evt);
            }
        });

        btnProg4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnProg4.setText("Prob. 2 Dados");
        btnProg4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProg4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(87, 87, 87)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(76, 76, 76)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(btnProg5))))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnProg3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnProg2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnProg1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnProg4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(btnProg1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProg2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProg5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnProg4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProg3)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //boton para ingresar al programa 1
    private void btnProg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProg1ActionPerformed
        Matriz matriz = new Matriz();
        matriz.setVisible(true);
        matriz.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnProg1ActionPerformed
    
    //boton para ingresar al programa 2
    private void btnProg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProg2ActionPerformed
        GrafoBipartitoGUI bipartito = new GrafoBipartitoGUI();
        bipartito.setVisible(true);
        bipartito.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnProg2ActionPerformed

    private void btnProg5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProg5ActionPerformed
        Vista vista = new Vista();
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnProg5ActionPerformed

    private void btnProg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProg3ActionPerformed
        Dados dados = new Dados();
        dados.setVisible(true);
        dados.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnProg3ActionPerformed

    private void btnProg4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProg4ActionPerformed
        Dados2 dados2 = new Dados2();
        dados2.setVisible(true);
        dados2.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnProg4ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProg1;
    private javax.swing.JButton btnProg2;
    private javax.swing.JButton btnProg3;
    private javax.swing.JButton btnProg4;
    private javax.swing.JButton btnProg5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
