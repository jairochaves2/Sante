package nenem2;

import javax.swing.JOptionPane;

/**
 *
 * @author Jairo Chaves
 */
public class pag6 extends javax.swing.JFrame {

   public String nom;
   public int quantidade;
   String valorSelecao;
    public pag6() {
        initComponents();
        
        
        bancoDeQuestoes bdqq=new bancoDeQuestoes();
        bdqq.apagarcadastro();
        
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        selecao = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        camponome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setOpaque(false);

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(90, 180, 127, 47);
        jDesktopPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Preencha os campos");
        jLabel3.setBounds(70, 20, 157, 22);
        jDesktopPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("*");
        jLabel4.setBounds(84, 50, 6, 14);
        jDesktopPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("*");
        jLabel5.setBounds(30, 120, 6, 14);
        jDesktopPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        selecao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "________Selecione________", "03", "15", "30", "45", "60", "75", "90" }));
        selecao.setBounds(60, 140, 200, 30);
        jDesktopPane1.add(selecao, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setText("Quantas questões Você deseja responder?");
        jLabel2.setBounds(50, 120, 206, 14);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        camponome.setBounds(77, 80, 160, 30);
        jDesktopPane1.add(camponome, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 1, 11)); // NOI18N
        jLabel1.setText("Qual o seu Nome?");
        jLabel1.setBounds(90, 50, 120, 20);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/Sem Título-4.png"))); // NOI18N
        jLabel6.setBounds(0, -110, 370, 450);
        jDesktopPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        
        
        nom=camponome.getText();
        valorSelecao=""+selecao.getSelectedItem();
        if ((valorSelecao.equals("________Selecione________"))||(nom.equals(""))){
        
        JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        
        }
        else{
        quantidade=Integer.parseInt(valorSelecao);
        bancoDeQuestoes bdq=new bancoDeQuestoes();
        bdq.cadastro(nom, quantidade);
        
        pag4 pg4=new pag4();
        
        this.setVisible(false);
        pg4.setVisible(true);
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(pag6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pag6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pag6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pag6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pag6().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField camponome;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox selecao;
    // End of variables declaration//GEN-END:variables
}
