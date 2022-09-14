/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.bmoises.jogo8;

import java.awt.Color;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public final class TelaJogo extends javax.swing.JFrame {

    int[][] inicio;
    No estado = new No();
    int[][] solucao;

    /**
     * Creates new form TelaJogo
     */
    public TelaJogo() {
        initComponents();
        this.setTitle("Jogo dos 8");
        inicio = new int[3][3];
        solucao = new int[3][3];
        gerarJogo();
    }

    public void gerarJogo() {
        
        solucao[0][0] = 1;
        solucao[0][1] = 2;
        solucao[0][2] = 3;
        solucao[1][0] = 4;
        solucao[1][1] = 5;
        solucao[1][2] = 6;
        solucao[2][0] = 7;
        solucao[2][1] = 8;
        solucao[2][2] = 0;
        
        bt1.setBackground(Color.getHSBColor(240, 240, 240));
        bt2.setBackground(Color.getHSBColor(240, 240, 240));
        bt3.setBackground(Color.getHSBColor(240, 240, 240));
        bt4.setBackground(Color.getHSBColor(240, 240, 240));
        bt5.setBackground(Color.getHSBColor(240, 240, 240));
        bt6.setBackground(Color.getHSBColor(240, 240, 240));
        bt7.setBackground(Color.getHSBColor(240, 240, 240));
        bt8.setBackground(Color.getHSBColor(240, 240, 240));
        bt9.setBackground(Color.getHSBColor(240, 240, 240));

        int numero = (int) (Math.random() * 6) + 1;

        switch (numero) {

            case 1 -> {
                inicio[0][0] = 1;
                inicio[0][1] = 2;
                inicio[0][2] = 3;
                inicio[1][0] = 4;
                inicio[1][1] = 0;
                inicio[1][2] = 6;
                inicio[2][0] = 7;
                inicio[2][1] = 5;
                inicio[2][2] = 8;

                bt1.setText("1");
                bt2.setText("2");
                bt3.setText("3");
                bt4.setText("4");
                bt5.setText("0");
                bt5.setBackground(Color.red);
                bt6.setText("6");
                bt7.setText("7");
                bt8.setText("5");
                bt9.setText("8");
            }

            case 2 -> {
                inicio[0][0] = 1;
                inicio[0][1] = 0;
                inicio[0][2] = 3;
                inicio[1][0] = 4;
                inicio[1][1] = 2;
                inicio[1][2] = 6;
                inicio[2][0] = 7;
                inicio[2][1] = 5;
                inicio[2][2] = 8;

                bt1.setText("1");
                bt2.setText("0");
                bt2.setBackground(Color.red);
                bt3.setText("3");
                bt4.setText("4");
                bt5.setText("2");
                bt6.setText("6");
                bt7.setText("7");
                bt8.setText("5");
                bt9.setText("8");
            }

            case 3 -> {
                inicio[0][0] = 4;
                inicio[0][1] = 1;
                inicio[0][2] = 3;
                inicio[1][0] = 0;
                inicio[1][1] = 2;
                inicio[1][2] = 6;
                inicio[2][0] = 7;
                inicio[2][1] = 5;
                inicio[2][2] = 8;

                bt1.setText("4");
                bt2.setText("1");
                bt3.setText("3");
                bt4.setText("0");
                bt4.setBackground(Color.red);
                bt5.setText("2");
                bt6.setText("6");
                bt7.setText("7");
                bt8.setText("5");
                bt9.setText("8");
            }

            case 4 -> {
                inicio[0][0] = 4;
                inicio[0][1] = 1;
                inicio[0][2] = 3;
                inicio[1][0] = 2;
                inicio[1][1] = 6;
                inicio[1][2] = 8;
                inicio[2][0] = 7;
                inicio[2][1] = 5;
                inicio[2][2] = 0;

                bt1.setText("4");
                bt2.setText("1");
                bt3.setText("3");
                bt4.setText("2");
                bt5.setText("6");
                bt6.setText("8");
                bt7.setText("7");
                bt8.setText("5");
                bt9.setText("0");
                bt9.setBackground(Color.red);
            }

            case 5 -> {
                inicio[0][0] = 4;
                inicio[0][1] = 1;
                inicio[0][2] = 3;
                inicio[1][0] = 2;
                inicio[1][1] = 6;
                inicio[1][2] = 8;
                inicio[2][0] = 7;
                inicio[2][1] = 5;
                inicio[2][2] = 0;

                bt1.setText("4");
                bt2.setText("1");
                bt3.setText("3");
                bt4.setText("2");
                bt5.setText("6");
                bt6.setText("8");
                bt7.setText("7");
                bt8.setText("5");
                bt9.setText("0");
                bt9.setBackground(Color.red);
            }

            case 6 -> {
                inicio[0][0] = 6;
                inicio[0][1] = 0;
                inicio[0][2] = 1;
                inicio[1][0] = 2;
                inicio[1][1] = 7;
                inicio[1][2] = 3;
                inicio[2][0] = 4;
                inicio[2][1] = 5;
                inicio[2][2] = 8;

                bt1.setText("6");
                bt2.setText("0");
                bt2.setBackground(Color.red);
                bt3.setText("1");
                bt4.setText("2");
                bt5.setText("7");
                bt6.setText("3");
                bt7.setText("4");
                bt8.setText("5");
                bt9.setText("8");
            }

        }

        estado.setEstado(inicio);
    }

    public void ganhou() {
        
        if (Arrays.deepEquals(estado.getEstado(), solucao)) {
            JOptionPane.showMessageDialog(null, "Parabéns você resolveu o Puzzle!");
            gerarJogo();
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

        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt1MouseClicked(evt);
            }
        });
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        bt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt2MouseClicked(evt);
            }
        });

        bt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt3MouseClicked(evt);
            }
        });

        bt4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt4MouseClicked(evt);
            }
        });

        bt5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt5MouseClicked(evt);
            }
        });

        bt6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt6MouseClicked(evt);
            }
        });

        bt7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt7MouseClicked(evt);
            }
        });

        bt8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt8MouseClicked(evt);
            }
        });

        bt9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt6, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt9, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt1MouseClicked
        inicio = estado.getEstado();
        if ("0".equals(bt4.getText())) {
            int btn4 = inicio[1][0];
            int btn1 = inicio[0][0];

            inicio[0][0] = btn4;
            inicio[1][0] = btn1;

            bt4.setText(Integer.toString(btn1));
            bt1.setText(Integer.toString(btn4));
            bt1.setBackground(Color.red);
            bt4.setBackground(Color.getHSBColor(240, 240, 240));
        }

        if ("0".equals(bt2.getText())) {
            int btn2 = inicio[0][1];
            int btn1 = inicio[0][0];

            inicio[0][0] = btn2;
            inicio[0][1] = btn1;

            bt2.setText(Integer.toString(btn1));
            bt1.setText(Integer.toString(btn2));
            bt1.setBackground(Color.red);
            bt2.setBackground(Color.getHSBColor(240, 240, 240));
        }
        estado.setEstado(inicio);

        ganhou();
    }//GEN-LAST:event_bt1MouseClicked

    private void bt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt2MouseClicked
        inicio = estado.getEstado();
        if ("0".equals(bt5.getText())) {
            int btn5 = inicio[1][1];
            int btn2 = inicio[0][1];

            inicio[0][1] = btn5;
            inicio[1][1] = btn2;

            bt5.setText(Integer.toString(btn2));
            bt2.setText(Integer.toString(btn5));
            bt2.setBackground(Color.red);
            bt5.setBackground(Color.getHSBColor(240, 240, 240));
        }

        if ("0".equals(bt3.getText())) {
            int btn3 = inicio[0][2];
            int btn2 = inicio[0][1];

            inicio[0][1] = btn3;
            inicio[0][2] = btn2;

            bt3.setText(Integer.toString(btn2));
            bt2.setText(Integer.toString(btn3));
            bt2.setBackground(Color.red);
            bt3.setBackground(Color.getHSBColor(240, 240, 240));
        }

        if ("0".equals(bt1.getText())) {
            int btn1 = inicio[0][0];
            int btn2 = inicio[0][1];

            inicio[0][0] = btn2;
            inicio[0][1] = btn1;

            bt1.setText(Integer.toString(btn2));
            bt2.setText(Integer.toString(btn1));
            bt2.setBackground(Color.red);
            bt1.setBackground(Color.getHSBColor(240, 240, 240));
        }
        estado.setEstado(inicio);

        ganhou();
    }//GEN-LAST:event_bt2MouseClicked

    private void bt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt3MouseClicked
        inicio = estado.getEstado();
        if ("0".equals(bt6.getText())) {
            int btn3 = inicio[0][2];
            int btn6 = inicio[1][2];

            inicio[0][2] = btn6;
            inicio[1][2] = btn3;

            bt6.setText(Integer.toString(btn3));
            bt3.setText(Integer.toString(btn6));
            bt3.setBackground(Color.red);
            bt6.setBackground(Color.getHSBColor(240, 240, 240));
        }

        if ("0".equals(bt2.getText())) {
            int btn3 = inicio[0][2];
            int btn2 = inicio[0][1];

            inicio[0][1] = btn3;
            inicio[0][2] = btn2;

            bt2.setText(Integer.toString(btn3));
            bt3.setText(Integer.toString(btn2));
            bt3.setBackground(Color.red);
            bt2.setBackground(Color.getHSBColor(240, 240, 240));
        }
    }//GEN-LAST:event_bt3MouseClicked

    private void bt4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt4MouseClicked
        inicio = estado.getEstado();
        if ("0".equals(bt7.getText())) {
            int btn4 = inicio[1][0];
            int btn7 = inicio[2][0];

            inicio[2][0] = btn4;
            inicio[1][0] = btn7;

            bt7.setText(Integer.toString(btn4));
            bt4.setText(Integer.toString(btn7));
            bt4.setBackground(Color.red);
            bt7.setBackground(Color.getHSBColor(240, 240, 240));
        }

        if ("0".equals(bt1.getText())) {
            int btn4 = inicio[1][0];
            int btn1 = inicio[0][0];

            inicio[1][0] = btn1;
            inicio[0][0] = btn4;

            bt1.setText(Integer.toString(btn4));
            bt4.setText(Integer.toString(btn1));
            bt4.setBackground(Color.red);
            bt1.setBackground(Color.getHSBColor(240, 240, 240));
        }

        if ("0".equals(bt5.getText())) {
            int btn4 = inicio[1][0];
            int btn5 = inicio[1][1];

            inicio[1][0] = btn5;
            inicio[1][1] = btn4;

            bt5.setText(Integer.toString(btn4));
            bt4.setText(Integer.toString(btn5));
            bt4.setBackground(Color.red);
            bt5.setBackground(Color.getHSBColor(240, 240, 240));
        }
        estado.setEstado(inicio);

        ganhou();
    }//GEN-LAST:event_bt4MouseClicked

    private void bt5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt5MouseClicked
        inicio = estado.getEstado();
        if ("0".equals(bt8.getText())) {
            int btn5 = inicio[1][1];
            int btn8 = inicio[2][1];

            inicio[2][1] = btn5;
            inicio[1][1] = btn8;

            bt8.setText(Integer.toString(btn5));
            bt5.setText(Integer.toString(btn8));
            bt5.setBackground(Color.red);
            bt8.setBackground(Color.getHSBColor(240, 240, 240));
        }

        if ("0".equals(bt4.getText())) {
            int btn5 = inicio[1][1];
            int btn4 = inicio[1][0];

            inicio[1][0] = btn5;
            inicio[1][1] = btn4;

            bt4.setText(Integer.toString(btn5));
            bt5.setText(Integer.toString(btn4));
            bt5.setBackground(Color.red);
            bt4.setBackground(Color.getHSBColor(240, 240, 240));
        }

        if ("0".equals(bt2.getText())) {
            int btn5 = inicio[1][1];
            int btn2 = inicio[0][1];

            inicio[0][1] = btn5;
            inicio[1][1] = btn2;

            bt2.setText(Integer.toString(btn5));
            bt5.setText(Integer.toString(btn2));
            bt5.setBackground(Color.red);
            bt2.setBackground(Color.getHSBColor(240, 240, 240));
        }

        if ("0".equals(bt6.getText())) {
            int btn5 = inicio[1][1];
            int btn6 = inicio[1][2];

            inicio[1][1] = btn6;
            inicio[1][2] = btn5;

            bt6.setText(Integer.toString(btn5));
            bt5.setText(Integer.toString(btn6));
            bt5.setBackground(Color.red);
            bt6.setBackground(Color.getHSBColor(240, 240, 240));
        }
        estado.setEstado(inicio);

        ganhou();
    }//GEN-LAST:event_bt5MouseClicked

    private void bt6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt6MouseClicked
        inicio = estado.getEstado();
        if ("0".equals(bt9.getText())) {
            int btn6 = inicio[1][2];
            int btn9 = inicio[2][2];

            inicio[2][2] = btn6;
            inicio[1][2] = btn9;

            bt9.setText(Integer.toString(btn6));
            bt6.setText(Integer.toString(btn9));
            bt6.setBackground(Color.red);
            bt9.setBackground(Color.getHSBColor(240, 240, 240));
        }

        if ("0".equals(bt5.getText())) {
            int btn6 = inicio[1][2];
            int btn5 = inicio[1][1];

            inicio[1][1] = btn6;
            inicio[1][2] = btn5;

            bt5.setText(Integer.toString(btn6));
            bt6.setText(Integer.toString(btn5));
            bt6.setBackground(Color.red);
            bt5.setBackground(Color.getHSBColor(240, 240, 240));
        }

        if ("0".equals(bt3.getText())) {
            int btn6 = inicio[1][2];
            int btn3 = inicio[0][2];

            inicio[0][2] = btn6;
            inicio[1][2] = btn3;

            bt3.setText(Integer.toString(btn6));
            bt6.setText(Integer.toString(btn3));
            bt6.setBackground(Color.red);
            bt3.setBackground(Color.getHSBColor(240, 240, 240));
        }
        estado.setEstado(inicio);

        ganhou();
    }//GEN-LAST:event_bt6MouseClicked

    private void bt7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt7MouseClicked
        inicio = estado.getEstado();
        if ("0".equals(bt8.getText())) {
            int btn8 = inicio[2][1];
            int btn7 = inicio[2][0];

            inicio[2][0] = btn8;
            inicio[2][1] = btn7;

            bt8.setText(Integer.toString(btn7));
            bt7.setText(Integer.toString(btn8));
            bt7.setBackground(Color.red);
            bt8.setBackground(Color.getHSBColor(240, 240, 240));
        }

        if ("0".equals(bt4.getText())) {
            int btn4 = inicio[1][0];
            int btn7 = inicio[2][0];

            inicio[2][0] = btn4;
            inicio[1][0] = btn7;

            bt4.setText(Integer.toString(btn7));
            bt7.setText(Integer.toString(btn4));
            bt7.setBackground(Color.red);
            bt4.setBackground(Color.getHSBColor(240, 240, 240));
        }
    }//GEN-LAST:event_bt7MouseClicked

    private void bt8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt8MouseClicked
        inicio = estado.getEstado();
        if ("0".equals(bt9.getText())) {
            int btn8 = inicio[2][1];
            int btn9 = inicio[2][2];

            inicio[2][1] = btn9;
            inicio[2][2] = btn8;

            bt9.setText(Integer.toString(btn8));
            bt8.setText(Integer.toString(btn9));
            bt8.setBackground(Color.red);
            bt9.setBackground(Color.getHSBColor(240, 240, 240));
        }
        if ("0".equals(bt5.getText())) {
            int btn5 = inicio[1][1];
            int btn8 = inicio[2][1];

            inicio[1][1] = btn8;
            inicio[2][1] = btn5;

            bt5.setText(Integer.toString(btn8));
            bt8.setText(Integer.toString(btn5));
            bt8.setBackground(Color.red);
            bt5.setBackground(Color.getHSBColor(240, 240, 240));
        }

        if ("0".equals(bt7.getText())) {
            int btn7 = inicio[2][0];
            int btn8 = inicio[2][1];

            inicio[2][0] = btn8;
            inicio[2][1] = btn7;

            bt7.setText(Integer.toString(btn8));
            bt8.setText(Integer.toString(btn7));
            bt8.setBackground(Color.red);
            bt7.setBackground(Color.getHSBColor(240, 240, 240));
        }
        estado.setEstado(inicio);

        ganhou();
    }//GEN-LAST:event_bt8MouseClicked

    private void bt9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt9MouseClicked
        inicio = estado.getEstado();
        if ("0".equals(bt6.getText())) {
            int btn6 = inicio[1][2];
            int btn9 = inicio[2][2];

            inicio[2][2] = btn6;
            inicio[1][2] = btn9;

            bt6.setText(Integer.toString(btn9));
            bt9.setText(Integer.toString(btn6));
            bt9.setBackground(Color.red);
            bt6.setBackground(Color.getHSBColor(240, 240, 240));
        }

        if ("0".equals(bt8.getText())) {
            int btn8 = inicio[2][1];
            int btn9 = inicio[2][2];

            inicio[2][2] = btn8;
            inicio[2][1] = btn9;

            bt8.setText(Integer.toString(btn9));
            bt9.setText(Integer.toString(btn8));
            bt9.setBackground(Color.red);
            bt8.setBackground(Color.getHSBColor(240, 240, 240));
        }
        estado.setEstado(inicio);

        ganhou();
    }//GEN-LAST:event_bt9MouseClicked

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
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaJogo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    // End of variables declaration//GEN-END:variables
}
