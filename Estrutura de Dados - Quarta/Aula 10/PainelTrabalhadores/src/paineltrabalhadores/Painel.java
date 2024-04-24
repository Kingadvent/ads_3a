/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paineltrabalhadores;

import javax.swing.JOptionPane;

/**
 *
 * @author autologon
 */
public class Painel extends javax.swing.JFrame {

    /**
     * Creates new form Painel
     */
    Pilha pilha = new Pilha();
    public Painel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelNome = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        LabelSalario = new javax.swing.JLabel();
        Salario = new javax.swing.JTextField();
        LabelCargo = new javax.swing.JLabel();
        Cargo = new javax.swing.JTextField();
        BConsulta = new javax.swing.JButton();
        BRetirar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaConsulta = new javax.swing.JTextArea();
        BCadastro = new javax.swing.JButton();
        LabelConsulta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trabalhadores");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        LabelNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelNome.setText("NOME:");

        LabelSalario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelSalario.setText("SALARIO:");

        LabelCargo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelCargo.setText("CARGO:");

        BConsulta.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BConsulta.setText("Consultar");
        BConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta(evt);
            }
        });

        BRetirar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BRetirar.setText("Retirar");
        BRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Retirar(evt);
            }
        });

        areaConsulta.setEditable(false);
        areaConsulta.setColumns(20);
        areaConsulta.setRows(5);
        jScrollPane1.setViewportView(areaConsulta);

        BCadastro.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BCadastro.setText("Cadastrar");
        BCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastro(evt);
            }
        });

        LabelConsulta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelConsulta.setText("CONSULTA:");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel1.setText("PAINEL DOS TRABALHADORES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Salario, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                        .addComponent(Nome)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LabelSalario)
                                .addComponent(LabelCargo))
                            .addGap(296, 296, 296))
                        .addComponent(BRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cargo))
                    .addComponent(LabelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelConsulta)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelConsulta)
                    .addComponent(LabelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(LabelSalario)
                        .addGap(6, 6, 6)
                        .addComponent(Salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(LabelCargo)
                        .addGap(6, 6, 6)
                        .addComponent(Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Retirar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Retirar
        // TODO add your handling code here:
        if (!pilha.isEmpty()) {
            while (!pilha.isEmpty()) {
                Trabalhadores t = (Trabalhadores) pilha.pop();
                JOptionPane.showMessageDialog(null, "Trabalhador "+ t.getNome() +" Removido");
                break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "A fila está vazia!");
        }
    }//GEN-LAST:event_Retirar

    private void Consulta(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta
        // TODO add your handling code here:
        areaConsulta.setText(pilha.toString2());
    }//GEN-LAST:event_Consulta

    private void Cadastro(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastro
        // TODO add your handling code here:
        try {
            String pNome = Nome.getText();
            float pSalario = Float.valueOf(Salario.getText());
            String pCargo = Cargo.getText();

            pilha.push(new Trabalhadores(pNome, pSalario, pCargo));

            Nome.setText("");
            Salario.setText("");
            Cargo.setText("");

            JOptionPane.showMessageDialog(null, "Trabalhador Cadastrado, Bem vindo "+ pNome);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Preencha os dados corretamente!");
        } 
    }//GEN-LAST:event_Cadastro

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
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Painel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCadastro;
    private javax.swing.JButton BConsulta;
    private javax.swing.JButton BRetirar;
    private javax.swing.JTextField Cargo;
    private javax.swing.JLabel LabelCargo;
    private javax.swing.JLabel LabelConsulta;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelSalario;
    private javax.swing.JTextField Nome;
    private javax.swing.JTextField Salario;
    private javax.swing.JTextArea areaConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}