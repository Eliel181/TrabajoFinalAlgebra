package proyectoalgebra;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Matriz extends javax.swing.JFrame {

    int matriz[][];

    public Matriz() {
        initComponents();

    }

    //esta funcion verifica si la matriz es transitiva
    public static boolean esMatrizTransitiva(int[][] matriz) {
        int n = matriz.length;

        // Verificar si la matriz es cuadrada
        if (n != matriz[0].length) {
            return false;
        }

        // Verificar la transitividad
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == 1) {
                    for (int k = 0; k < n; k++) {
                        if (matriz[j][k] == 1 && matriz[i][k] != 1) {
                            // Si aRb y bRc, entonces aRc debe ser verdadero
                            return false;
                        }
                    }
                }
            }
        }

        // Si no se encontró ninguna inconsistencia, la matriz es transitiva
        return true;
    }

    public static String obtenerRelacion(int[][] matriz) {
        int n = matriz.length;

        // Verificar si la matriz es cuadrada
        if (n != matriz[0].length) {
            return "La matriz no es cuadrada, no se puede representar una relación.";
        }

        StringBuilder relacion = new StringBuilder("{");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == 1) {
                    relacion.append("(").append(i).append(", ").append(j).append("), ");
                }
            }
        }

        // Eliminar la coma final si hay pares ordenados en la relación
        if (relacion.length() > 1) {
            relacion.delete(relacion.length() - 2, relacion.length());
        }

        relacion.append("}");

        return relacion.toString();
    }

    //Mostrar Matriz en El formulario
    public void MostrarMatriz() {
        String cadena = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                cadena += "[" + matriz[i][j] + "] ";
            }
            cadena += "\n";
        }
        this.txpMatriz.setText(cadena);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txpMatriz = new javax.swing.JTextPane();
        btnCargarMatriz = new javax.swing.JButton();
        btnCalcularPropiedades = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblRelacion = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblSimetria1 = new javax.swing.JLabel();
        lblAntisimetrica = new javax.swing.JLabel();
        lblTransitiva = new javax.swing.JLabel();
        btnRelacionMatriz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matriz 1");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnAtras.setBackground(new java.awt.Color(51, 51, 255));
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        txpMatriz.setEditable(false);
        txpMatriz.setBorder(javax.swing.BorderFactory.createTitledBorder("MATRIZ"));
        txpMatriz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txpMatriz.setAlignmentY(1.5F);
        txpMatriz.setAutoscrolls(false);
        txpMatriz.setMargin(new java.awt.Insets(3, 3, 3, 20));
        jScrollPane3.setViewportView(txpMatriz);

        btnCargarMatriz.setBackground(new java.awt.Color(51, 51, 255));
        btnCargarMatriz.setForeground(new java.awt.Color(255, 255, 255));
        btnCargarMatriz.setText("CARGAR MATRIZ");
        btnCargarMatriz.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCargarMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarMatrizActionPerformed(evt);
            }
        });

        btnCalcularPropiedades.setBackground(new java.awt.Color(51, 51, 255));
        btnCalcularPropiedades.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcularPropiedades.setText("MOSTRAR PROPIEDADES");
        btnCalcularPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularPropiedadesActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Relacion de  la Matriz"));

        lblRelacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRelacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRelacion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Propiedades de la Matriz"));

        lblSimetria1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblAntisimetrica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblTransitiva.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblAntisimetrica, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSimetria1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTransitiva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSimetria1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(lblAntisimetrica, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lblTransitiva, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnRelacionMatriz.setBackground(new java.awt.Color(51, 51, 255));
        btnRelacionMatriz.setForeground(new java.awt.Color(255, 255, 255));
        btnRelacionMatriz.setText("MOSTRAR RELACION");
        btnRelacionMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelacionMatrizActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnAtras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCalcularPropiedades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCargarMatriz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRelacionMatriz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCalcularPropiedades)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCargarMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnRelacionMatriz))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtras)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnCargarMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarMatrizActionPerformed
        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz cuadrada (n): "));

            matriz = new int[n][n];

            // Ingresar elementos de la matriz
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero(1 o 0) en pocision [" + i + "][" + j + "]"));
                    if(matriz[i][j] > 1 || matriz[i][j] < 0){
                         throw new IllegalStateException("Valor Incorrecto, debes ingresar un 0 o un 1");
                    }
                }
            }
            MostrarMatriz();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "no debes ingresar caracteres o letras");
        } catch (IllegalStateException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }


    }//GEN-LAST:event_btnCargarMatrizActionPerformed

    private void btnCalcularPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularPropiedadesActionPerformed
        // Verificar si la matriz es no simétrica y/o antisimétrica
        boolean noSimetrica = false;
        boolean antisimetrica = true;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i != j && (matriz[i][j] != matriz[j][i])) {
                    noSimetrica = true;
                }
                if (i != j && (matriz[i][j] == 1 && matriz[j][i] == 1) || (matriz[i][j] == -1 && matriz[j][i] == -1)) {
                    antisimetrica = false;
                }
            }
        }

        if (noSimetrica) {
            this.lblSimetria1.setText("La matriz es no simétrica.");
            this.lblSimetria1.setForeground(Color.red);
        } else {
            this.lblSimetria1.setText("La matriz es simétrica.");
            this.lblSimetria1.setForeground(Color.green);
        }

        if (antisimetrica) {
            this.lblAntisimetrica.setText("La matriz es antisimétrica.");
            this.lblAntisimetrica.setForeground(Color.green);
        } else {
            this.lblAntisimetrica.setText("La matriz no es antisimétrica.");
            this.lblAntisimetrica.setForeground(Color.red);
        }

        if (esMatrizTransitiva(matriz)) {
            this.lblTransitiva.setText("La matriz es transitiva.");
            this.lblTransitiva.setForeground(Color.green);
        } else {
            this.lblTransitiva.setText("La matriz no es transitiva.");
            this.lblTransitiva.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnCalcularPropiedadesActionPerformed

    private void btnRelacionMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelacionMatrizActionPerformed
        lblRelacion.setText(obtenerRelacion(matriz));
    }//GEN-LAST:event_btnRelacionMatrizActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCalcularPropiedades;
    private javax.swing.JButton btnCargarMatriz;
    private javax.swing.JButton btnRelacionMatriz;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAntisimetrica;
    private javax.swing.JLabel lblRelacion;
    private javax.swing.JLabel lblSimetria1;
    private javax.swing.JLabel lblTransitiva;
    private javax.swing.JTextPane txpMatriz;
    // End of variables declaration//GEN-END:variables
}
