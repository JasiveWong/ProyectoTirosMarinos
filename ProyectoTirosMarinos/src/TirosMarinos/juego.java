/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TirosMarinos;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class juego extends javax.swing.JFrame {

    int puntos = 0, intento = 0;
    boolean colores = false, game = false;
    int y = 0, x = 0;
    int barcos[][] = new int[5][5];
  

    public juego() {
        initComponents();        
        
        EscondeSubmarinos(barcos);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(barcos[i][j] + " ");
            }
            System.out.println("");
        }
        this.setExtendedState(MAXIMIZED_BOTH);

    }

    static int[][] EscondeSubmarinos(int matriz[][]) {
        int contador = 0;
        int y = 0, x = 0;
        do {
            y = (int) (Math.random() * matriz.length - 1);
            x = (int) (Math.random() * matriz[y].length - 1);
            if (matriz[y][x] == 1) {
                contador = contador - 1;
            }
            matriz[y][x] = 1;
            contador = contador + 1;
        } while (contador < 5);
        return matriz;
    }

    static boolean Color(int matriz[][], int y, int x) {
        boolean color = false;

        if (matriz[y][x] == 1) {

            color = true;
        } else {
            color = false;
        }
        return color;
    }

    static int[][] Balazomarino(int matriz[][], int y, int x) {

        if (matriz[y][x] == 1) {

            matriz[y][x] = 2;
            JOptionPane.showMessageDialog(null, "Acertaste");
        } else {
            JOptionPane.showMessageDialog(null, "Fallaste");
            matriz[y][x] = 3;
        }
        return matriz;
    }

    static boolean validar(int matriz[][]) {
        int y = 0;
        boolean game = true;
        do {
            for (int i = 0; i < matriz[y].length; i++) {

                if (matriz[y][i] == 1) {
                    game = false;

                }

            }

            y++;

        } while (game != false && y < matriz.length);

        return game;
    }

  
     static int puntaje(int matriz[][], int puntos){    
        int y=0,cont=0;                
               for(int i2=0; i2<matriz.length; i2++){ 
                   
             for(int i=0;i<matriz[i2].length; i++ ){
            
                if(matriz[i2][i]== 2){
                    cont=cont+1;                               
                }             
                }             
                      
        }
         puntos= cont * 100;            
        return puntos;
    } 
    
    
    
    
    
    
    void AccionBoton(int y, int x, JButton boton) {
        colores = Color(barcos, y, x);
        barcos = Balazomarino(barcos, y, x);
        game = validar(barcos);

        if (colores == true) {
               boton.setBackground(Color.red);
        
        } else {
            boton.setBackground(Color.BLACK);
        }

        boton.setEnabled(false);
       
        
        if (game == true) {
            JOptionPane.showMessageDialog(null, "Ganaste, destruiste todos los barcos");
            
        } else {
            if (intento >= 5) {
                JOptionPane.showMessageDialog(null, "Perdiste, aún hay barcos enemigos activos");
                
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        a2 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        a1 = new javax.swing.JButton();
        a4 = new javax.swing.JButton();
        a5 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        c1 = new javax.swing.JButton();
        d1 = new javax.swing.JButton();
        e1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        c2 = new javax.swing.JButton();
        c3 = new javax.swing.JButton();
        c4 = new javax.swing.JButton();
        c5 = new javax.swing.JButton();
        d2 = new javax.swing.JButton();
        e2 = new javax.swing.JButton();
        d3 = new javax.swing.JButton();
        d4 = new javax.swing.JButton();
        d5 = new javax.swing.JButton();
        e3 = new javax.swing.JButton();
        e4 = new javax.swing.JButton();
        e5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnbarcodestruido = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btntiros = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });
        jPanel3.add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 80, 60));

        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });
        jPanel3.add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, 80, 60));

        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });
        jPanel3.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 80, 60));

        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });
        jPanel3.add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 380, 80, 60));

        a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ActionPerformed(evt);
            }
        });
        jPanel3.add(a5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 380, 80, 60));

        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel3.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 80, 60));

        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        jPanel3.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 80, 60));

        d1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d1ActionPerformed(evt);
            }
        });
        jPanel3.add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 560, 80, 60));

        e1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e1ActionPerformed(evt);
            }
        });
        jPanel3.add(e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 620, 80, 60));

        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel3.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, 80, 60));

        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel3.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 80, 60));

        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel3.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 440, 80, 60));

        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel3.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 440, 80, 60));

        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        jPanel3.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 500, 80, 60));

        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });
        jPanel3.add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 500, 80, 60));

        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });
        jPanel3.add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 500, 80, 60));

        c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c5ActionPerformed(evt);
            }
        });
        jPanel3.add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 500, 80, 60));

        d2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2ActionPerformed(evt);
            }
        });
        jPanel3.add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 560, 80, 60));

        e2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e2ActionPerformed(evt);
            }
        });
        jPanel3.add(e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 620, 80, 60));

        d3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d3ActionPerformed(evt);
            }
        });
        jPanel3.add(d3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 560, 80, 60));

        d4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d4ActionPerformed(evt);
            }
        });
        jPanel3.add(d4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 560, 80, 60));

        d5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d5ActionPerformed(evt);
            }
        });
        jPanel3.add(d5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 560, 80, 60));

        e3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e3ActionPerformed(evt);
            }
        });
        jPanel3.add(e3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 620, 80, 60));

        e4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e4ActionPerformed(evt);
            }
        });
        jPanel3.add(e4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 620, 80, 60));

        e5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e5ActionPerformed(evt);
            }
        });
        jPanel3.add(e5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 620, 80, 60));

        jLabel12.setFont(new java.awt.Font("Verdana", 3, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("A");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 50, 50));

        jLabel13.setFont(new java.awt.Font("Verdana", 3, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("B");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 50, 50));

        jLabel14.setFont(new java.awt.Font("Verdana", 3, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("C");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 50, 50));

        jLabel15.setFont(new java.awt.Font("Verdana", 3, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("D");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 560, 50, 50));

        jLabel7.setFont(new java.awt.Font("Verdana", 3, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("E");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 620, 50, 50));

        jLabel6.setFont(new java.awt.Font("Verdana", 3, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("1");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 60, 50));

        jLabel8.setFont(new java.awt.Font("Verdana", 3, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("2");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 60, 50));

        jLabel10.setFont(new java.awt.Font("Verdana", 3, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("3");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 60, 50));

        jLabel11.setFont(new java.awt.Font("Verdana", 3, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("4");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 320, 60, 50));

        jLabel9.setFont(new java.awt.Font("Verdana", 3, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("5");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 320, 60, 50));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/jugador.png"))); // NOI18N
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, 110, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TITULO.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumen"));
        jPanel2.setFont(new java.awt.Font("Trebuchet MS", 3, 48)); // NOI18N

        btnbarcodestruido.setText("Barcos destruidos:");

        jLabel5.setText("Barcos restantes:");

        btntiros.setText("Tiros restantes:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(btntiros)
                    .addComponent(btnbarcodestruido))
                .addGap(0, 39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnbarcodestruido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btntiros)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 380, 140, 110));

        jLabel17.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Barco hundido o Tiro fallado");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 710, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ship-World-of-Warships-video-games-vehicle-artwork-iceberg-575205-wallhere.com.jpg"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1570, 840));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        AccionBoton(0, 1,a2);
        
    }//GEN-LAST:event_a2ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
    AccionBoton(0,2,a3);    // TODO add your handling code here:
    }//GEN-LAST:event_a3ActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        AccionBoton(0,0,a1);
      
       // TODO add your handling code here:
    }//GEN-LAST:event_a1ActionPerformed

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
AccionBoton(0,3,a4);        // TODO add your handling code here:
    }//GEN-LAST:event_a4ActionPerformed

    private void a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5ActionPerformed
AccionBoton(0,4,a5);        // TODO add your handling code here:
    }//GEN-LAST:event_a5ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
AccionBoton(1,0,b1);        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
AccionBoton(2,0,c1);        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

    private void d1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d1ActionPerformed
AccionBoton(3,0,d1);         // TODO add your handling code here:
    }//GEN-LAST:event_d1ActionPerformed

    private void e1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e1ActionPerformed
AccionBoton(4,0,e1);         // TODO add your handling code here:
    }//GEN-LAST:event_e1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
AccionBoton(1,1,b2);        // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
AccionBoton(1,2,b3);        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
AccionBoton(1,3,b4);        // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
AccionBoton(1,4,b5);        // TODO add your handling code here:
    }//GEN-LAST:event_b5ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
AccionBoton(2,1,c2);         // TODO add your handling code here:
    }//GEN-LAST:event_c2ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
AccionBoton(2,2,c3);         // TODO add your handling code here:
    }//GEN-LAST:event_c3ActionPerformed

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ActionPerformed
AccionBoton(2,3,c4);         // TODO add your handling code here:
    }//GEN-LAST:event_c4ActionPerformed

    private void c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c5ActionPerformed
AccionBoton(2,4,c5);         // TODO add your handling code here:
    }//GEN-LAST:event_c5ActionPerformed

    private void d2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d2ActionPerformed
AccionBoton(3,1,d2);         // TODO add your handling code here:
    }//GEN-LAST:event_d2ActionPerformed

    private void e2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e2ActionPerformed
AccionBoton(4,1,e2);          // TODO add your handling code here:
    }//GEN-LAST:event_e2ActionPerformed

    private void d3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d3ActionPerformed
AccionBoton(3,2,d3);         // TODO add your handling code here:
    }//GEN-LAST:event_d3ActionPerformed

    private void d4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d4ActionPerformed
AccionBoton(3,3,d4);         // TODO add your handling code here:
    }//GEN-LAST:event_d4ActionPerformed

    private void d5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d5ActionPerformed
AccionBoton(3,4,d5);         // TODO add your handling code here:
    }//GEN-LAST:event_d5ActionPerformed

    private void e3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e3ActionPerformed
AccionBoton(4,2,e3);          // TODO add your handling code here:
    }//GEN-LAST:event_e3ActionPerformed

    private void e4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e4ActionPerformed
AccionBoton(4,3,e4);          // TODO add your handling code here:
    }//GEN-LAST:event_e4ActionPerformed

    private void e5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e5ActionPerformed
AccionBoton(4,4,e5);          // TODO add your handling code here:
    }//GEN-LAST:event_e5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a1;
    private javax.swing.JButton a2;
    private javax.swing.JButton a3;
    private javax.swing.JButton a4;
    private javax.swing.JButton a5;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JLabel btnbarcodestruido;
    private javax.swing.JLabel btntiros;
    private javax.swing.JButton c1;
    private javax.swing.JButton c2;
    private javax.swing.JButton c3;
    private javax.swing.JButton c4;
    private javax.swing.JButton c5;
    private javax.swing.JButton d1;
    private javax.swing.JButton d2;
    private javax.swing.JButton d3;
    private javax.swing.JButton d4;
    private javax.swing.JButton d5;
    private javax.swing.JButton e1;
    private javax.swing.JButton e2;
    private javax.swing.JButton e3;
    private javax.swing.JButton e4;
    private javax.swing.JButton e5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
