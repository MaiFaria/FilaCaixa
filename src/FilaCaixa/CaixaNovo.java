package FilaCaixa;

import java.util.ArrayList;
import java.util.List;


public class CaixaNovo extends javax.swing.JFrame {
   
    List<Senha> senhas = new ArrayList<Senha>();
    GeradorSenha geradorSenha = new GeradorSenha();
    CaixaService caixaService = new CaixaService(senhas);
    Senha senha = new Senha();

    public CaixaNovo() {
       initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        apresentacao = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        caixa1 = new javax.swing.JButton();
        caixa2 = new javax.swing.JButton();
        caixa3 = new javax.swing.JButton();
        caixa4 = new javax.swing.JButton();
        cliente = new javax.swing.JLabel();
        caixa = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        atendimento = new javax.swing.JLabel();
        comum = new javax.swing.JButton();
        prioritario = new javax.swing.JButton();
        rapido = new javax.swing.JButton();
        suaSenha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        SaidaSenha = new javax.swing.JLabel();
        CaixaSaida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        apresentacao.setBackground(new java.awt.Color(204, 204, 204));
        apresentacao.setFont(new java.awt.Font("Sylfaen", 2, 24)); // NOI18N
        apresentacao.setForeground(new java.awt.Color(153, 153, 153));
        apresentacao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        apresentacao.setText("Painel");
        apresentacao.setToolTipText("");
        apresentacao.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 204, 204)));
        apresentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apresentacaoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        caixa1.setBackground(new java.awt.Color(255, 153, 153));
        caixa1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        caixa1.setForeground(new java.awt.Color(102, 102, 102));
        caixa1.setText("Caixa 1");
        caixa1.setToolTipText("");
        caixa1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        caixa1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        caixa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixa1ActionPerformed(evt);
            }
        });

        caixa2.setBackground(new java.awt.Color(255, 153, 153));
        caixa2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        caixa2.setForeground(new java.awt.Color(102, 102, 102));
        caixa2.setText("Caixa 2");
        caixa2.setToolTipText("");
        caixa2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        caixa2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        caixa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixa2ActionPerformed(evt);
            }
        });

        caixa3.setBackground(new java.awt.Color(255, 153, 153));
        caixa3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        caixa3.setForeground(new java.awt.Color(102, 102, 102));
        caixa3.setText("Caixa 3");
        caixa3.setToolTipText("");
        caixa3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        caixa3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        caixa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixa3ActionPerformed(evt);
            }
        });

        caixa4.setBackground(new java.awt.Color(255, 153, 153));
        caixa4.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        caixa4.setForeground(new java.awt.Color(102, 102, 102));
        caixa4.setText("Caixa 4");
        caixa4.setToolTipText("");
        caixa4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        caixa4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        caixa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixa4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(caixa1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caixa4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caixa3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caixa2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(caixa1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caixa2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caixa3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caixa4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        cliente.setBackground(new java.awt.Color(153, 153, 153));
        cliente.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        cliente.setForeground(new java.awt.Color(153, 153, 153));
        cliente.setText("  Para Clientes  ");
        cliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, java.awt.Color.white));
        cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        caixa.setBackground(new java.awt.Color(153, 153, 153));
        caixa.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        caixa.setForeground(new java.awt.Color(153, 153, 153));
        caixa.setText("  Para Caixas  ");
        caixa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        caixa.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        atendimento.setBackground(new java.awt.Color(153, 153, 153));
        atendimento.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        atendimento.setForeground(new java.awt.Color(153, 153, 153));
        atendimento.setText("Escolha seu tipo de atendimento");

        comum.setBackground(new java.awt.Color(255, 153, 153));
        comum.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        comum.setForeground(new java.awt.Color(102, 102, 102));
        comum.setText("COMUM");
        comum.setToolTipText("");
        comum.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        comum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comumActionPerformed(evt);
            }
        });

        prioritario.setBackground(new java.awt.Color(255, 153, 153));
        prioritario.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        prioritario.setForeground(new java.awt.Color(102, 102, 102));
        prioritario.setText("PRIORITÁRIO");
        prioritario.setToolTipText("");
        prioritario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        prioritario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prioritario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prioritarioActionPerformed(evt);
            }
        });

        rapido.setBackground(new java.awt.Color(255, 153, 153));
        rapido.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        rapido.setForeground(new java.awt.Color(102, 102, 102));
        rapido.setText("RÁPIDO");
        rapido.setToolTipText("");
        rapido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        rapido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rapido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rapidoActionPerformed(evt);
            }
        });

        suaSenha.setBackground(new java.awt.Color(153, 153, 153));
        suaSenha.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        suaSenha.setForeground(new java.awt.Color(153, 153, 153));
        suaSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        suaSenha.setText("Sua senha é:");
        suaSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(atendimento))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(comum, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prioritario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rapido, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(suaSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(atendimento)
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comum, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prioritario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rapido, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(suaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        SaidaSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SaidaSenha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        CaixaSaida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CaixaSaida.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(apresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CaixaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SaidaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(caixa, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(apresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SaidaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CaixaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caixa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prioritarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prioritarioActionPerformed
        senha = this.geradorSenha.gerarSenhaPrioritaria(senhas);
        jLabel1.setText(this.geradorSenha.formatadorMensagem(senha));
    }//GEN-LAST:event_prioritarioActionPerformed

    private void rapidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rapidoActionPerformed
        senha = this.geradorSenha.gerarSenhaRapido(senhas);
        jLabel1.setText(this.geradorSenha.formatadorMensagem(senha));
    }//GEN-LAST:event_rapidoActionPerformed

    private void comumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comumActionPerformed
        senha = this.geradorSenha.gerarSenhaComum(senhas);
        jLabel1.setText(this.geradorSenha.formatadorMensagem(senha));
        
    }//GEN-LAST:event_comumActionPerformed

    private void apresentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apresentacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apresentacaoActionPerformed

    private void caixa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixa1ActionPerformed
        Senha senha = this.caixaService.caixaUm();
        if (!this.caixaService.isNull(senha)) {
            SaidaSenha.setText(this.geradorSenha.formatadorMensagem(senha));
            CaixaSaida.setText("CAIXA 1");
        }
    }//GEN-LAST:event_caixa1ActionPerformed

    private void caixa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixa4ActionPerformed
        Senha senha = this.caixaService.caixaQuatro();
        if (!this.caixaService.isNull(senha)) {
            SaidaSenha.setText(this.geradorSenha.formatadorMensagem(senha));
            CaixaSaida.setText("CAIXA 4");
        }
    }//GEN-LAST:event_caixa4ActionPerformed

    private void caixa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixa3ActionPerformed
        Senha senha = this.caixaService.caixaTres();
        if (!this.caixaService.isNull(senha)) {
            SaidaSenha.setText(this.geradorSenha.formatadorMensagem(senha));
            CaixaSaida.setText("CAIXA 3");
        }
    }//GEN-LAST:event_caixa3ActionPerformed

    private void caixa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixa2ActionPerformed
        Senha senha = this.caixaService.caixaDois();
        if (!this.caixaService.isNull(senha)) {
            SaidaSenha.setText(this.geradorSenha.formatadorMensagem(senha));
            CaixaSaida.setText("CAIXA 2");
        }
    }//GEN-LAST:event_caixa2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new CaixaNovo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CaixaSaida;
    private javax.swing.JLabel SaidaSenha;
    private javax.swing.JTextField apresentacao;
    private javax.swing.JLabel atendimento;
    private javax.swing.JLabel caixa;
    private javax.swing.JButton caixa1;
    private javax.swing.JButton caixa2;
    private javax.swing.JButton caixa3;
    private javax.swing.JButton caixa4;
    private javax.swing.JLabel cliente;
    private javax.swing.JButton comum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton prioritario;
    private javax.swing.JButton rapido;
    private javax.swing.JLabel suaSenha;
    // End of variables declaration//GEN-END:variables
}
