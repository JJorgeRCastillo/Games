/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresenraya;

/**
 *
 * @author JorgeRC
 */
public class Ventana extends javax.swing.JFrame {

    char botones[][] = new char[3][3];
    char COMPUTADORA = 'O';
    char JUGADOR = 'X';
    int MAX = 1;
    int MIN = 2;
    final int LIM = 100;
    int mejorFila = 0, mejorCol = 0;
    boolean turno = false;
    int ganador = -3;

    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        llenar();
        //imprimir();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TRES EN RAYA");
        setResizable(false);

        btn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblResultado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblResultado.setText("Resultado: ");

        jButton1.setText("REINICIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TRES EN RAYA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("PLAYER vs PC");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(lblResultado)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (turno != true) {
            btn1.setText("X");
            botones[0][0] = JUGADOR;
            btn1.setEnabled(false);
            bt(MAX);
            botones[mejorFila][mejorCol] = COMPUTADORA;
            marcaCasillaMachine(mejorFila, mejorCol);
            //imprimir();
            ganador = eval();
            fin();
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (turno != true) {
            btn2.setText("X");
            botones[0][1] = JUGADOR;
            btn2.setEnabled(false);
            bt(MAX);
            botones[mejorFila][mejorCol] = COMPUTADORA;
            marcaCasillaMachine(mejorFila, mejorCol);
            //imprimir();
            ganador = eval();
            fin();
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (turno != true) {
            btn3.setText("X");
            botones[0][2] = JUGADOR;
            btn3.setEnabled(false);
            bt(MAX);
            botones[mejorFila][mejorCol] = COMPUTADORA;
            marcaCasillaMachine(mejorFila, mejorCol);
            //imprimir();
            ganador = eval();
            fin();
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if (turno != true) {
            btn4.setText("X");
            botones[1][0] = JUGADOR;
            btn4.setEnabled(false);
            bt(MAX);
            botones[mejorFila][mejorCol] = COMPUTADORA;
            marcaCasillaMachine(mejorFila, mejorCol);
            //imprimir();
            ganador = eval();
            fin();
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (turno != true) {
            btn5.setText("X");
            botones[1][1] = JUGADOR;
            btn5.setEnabled(false);
            bt(MAX);
            botones[mejorFila][mejorCol] = COMPUTADORA;
            marcaCasillaMachine(mejorFila, mejorCol);
            //imprimir();
            ganador = eval();
            fin();
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (turno != true) {
            btn6.setText("X");
            botones[1][2] = JUGADOR;
            btn6.setEnabled(false);
            bt(MAX);
            botones[mejorFila][mejorCol] = COMPUTADORA;
            marcaCasillaMachine(mejorFila, mejorCol);
            //imprimir();
            ganador = eval();
            fin();
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (turno != true) {
            btn7.setText("X");
            botones[2][0] = JUGADOR;
            btn7.setEnabled(false);
            bt(MAX);
            botones[mejorFila][mejorCol] = COMPUTADORA;
            marcaCasillaMachine(mejorFila, mejorCol);
            //imprimir();
            ganador = eval();
            fin();
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (turno != true) {
            btn8.setText("X");
            botones[2][1] = JUGADOR;
            btn8.setEnabled(false);
            bt(MAX);
            botones[mejorFila][mejorCol] = COMPUTADORA;
            marcaCasillaMachine(mejorFila, mejorCol);
            //imprimir();
            ganador = eval();
            fin();
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (turno != true) {
            btn9.setText("X");
            botones[2][2] = JUGADOR;
            btn9.setEnabled(false);
            bt(MAX);
            botones[mejorFila][mejorCol] = COMPUTADORA;
            marcaCasillaMachine(mejorFila, mejorCol);
            //imprimir();
            ganador = eval();
            fin();
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        llenar();
        limpiarBotones();
        habilitarBotones();
        lblResultado.setText("Resultado: "); 
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblResultado;
    // End of variables declaration//GEN-END:variables

    public void marcaCasillaMachine(int i, int j) {
        if (i == 0 && j == 0) {
            btn1.setText("O");
            btn1.setEnabled(false);
        }
        if (i == 0 && j == 1) {
            btn2.setText("O");
            btn2.setEnabled(false);
        }
        if (i == 0 && j == 2) {
            btn3.setText("O");
            btn3.setEnabled(false);
        }
        if (i == 1 && j == 0) {
            btn4.setText("O");
            btn4.setEnabled(false);
        }
        if (i == 1 && j == 1) {
            btn5.setText("O");
            btn5.setEnabled(false);
        }
        if (i == 1 && j == 2) {
            btn6.setText("O");
            btn6.setEnabled(false);
        }
        if (i == 2 && j == 0) {
            btn7.setText("O");
            btn7.setEnabled(false);
        }
        if (i == 2 && j == 1) {
            btn8.setText("O");
            btn8.setEnabled(false);
        }
        if (i == 2 && j == 2) {
            btn9.setText("O");
            btn9.setEnabled(false);
        }
    }

    public void marcaCasillaPlayer(int i, int j) {
        if (i == 0 && j == 0) {
            btn1.setText("X");
        }
        if (i == 0 && j == 1) {
            btn1.setText("X");
        }
        if (i == 0 && j == 2) {
            btn1.setText("X");
        }
        if (i == 1 && j == 0) {
            btn1.setText("X");
        }
        if (i == 1 && j == 1) {
            btn1.setText("X");
        }
        if (i == 1 && j == 2) {
            btn1.setText("X");
        }
        if (i == 2 && j == 0) {
            btn1.setText("X");
        }
        if (i == 2 && j == 1) {
            btn1.setText("X");
        }
        if (i == 2 && j == 2) {
            btn1.setText("X");
        }
    }

    public void casillaSeleccionada(int i, int j) {
        botones[i][j] = COMPUTADORA;
        marcaCasillaMachine(i, j);
    }

    public int bt(int modo) {
        int i, j, val, mfLocal = 2, mcLocal = 2;
        int valor = eval();

        if (valor != 2) {
            return valor;
        }

        if (modo == MAX) {
            valor = LIM * -1;
        } else {
            valor = LIM;
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (botones[i][j] == '-') {
                    if (modo == MAX) {
                        botones[i][j] = COMPUTADORA;
                        val = bt(MIN);
                        if (valor < val) {
                            valor = val;
                            mfLocal = i;
                            mcLocal = j;
                        }
                    } else {
                        botones[i][j] = JUGADOR;
                        val = bt(MAX);
                        if (valor > val) {
                            valor = val;
                            mfLocal = i;
                            mcLocal = j;
                        }
                    }
                    botones[i][j] = '-';
                }
            }
        }
        mejorFila = mfLocal;
        mejorCol = mcLocal;
        return valor;
    }

    public void llenar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botones[i][j] = '-';
            }
        }
    }

    public int eval() {
        int i, j;
        char winner = '-';

        for (i = 0; i < 3; i++) {
            if (botones[i][0] != '-' && botones[i][0] == botones[i][1]
                    && botones[i][1] == botones[i][2]) {
                winner = botones[i][0];
            }
        }

        for (j = 0; j < 3; j++) {
            if (botones[0][j] != '-' && botones[0][j] == botones[1][j]
                    && botones[1][j] == botones[2][j]) {
                winner = botones[0][j];
            }
        }

        for (i = 0; i < 3; i++) {
            if (botones[0][0] != '-' && botones[0][0] == botones[1][1]
                    && botones[1][1] == botones[2][2]) {
                winner = botones[0][0];
            }
        }

        for (i = 0; i < 3; i++) {
            if (botones[0][2] != '-' && botones[0][2] == botones[1][1]
                    && botones[1][1] == botones[2][0]) {
                winner = botones[0][2];
            }
        }

        if (winner == JUGADOR) {
            return -1;
        }
        if (winner == COMPUTADORA) {
            return 1;
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (botones[i][j] == '-') {
                    return 2;
                }
            }
        }
        return 0;
    }

    public void imprimir() {
        int i, j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(botones[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public void fin() {
        boolean ok = false;
        if (ganador == 1) {
            lblResultado.setText("GANA COMPUTADORA");
            ok = true;
        }
        if (ganador == -1) {
            lblResultado.setText("GANA JUGADOR");
            ok = true;
        }

        if (ganador != 1 && ganador != -1 && ganador != 2) {
            lblResultado.setText("EMPATE");
            ok = true;
        }

        if (ok == true) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    btn1.setEnabled(false);
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    btn5.setEnabled(false);
                    btn6.setEnabled(false);
                    btn7.setEnabled(false);
                    btn8.setEnabled(false);
                    btn9.setEnabled(false);
                }
            }
        }
    }
    
    public void limpiarBotones(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
    }

    public void habilitarBotones(){
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
    }
}
