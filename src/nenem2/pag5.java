//autor jairo chaves//
package nenem2;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import nenem1.PAG2;


public class pag5 extends javax.swing.JFrame {
ResultSet retornou,retornou2,retornou3,ndequetoes;
    String nome;
    static int  quantasacertou=0, teste=0;
    private int t;
    int notCH,notCN,notLC,notMT;
    int resch,rescn,reslc,resmt;
    int quant;
    private boolean zerouCH=false;
    private boolean zerouCN=false;
    private boolean zerouLC=false;
    private boolean zerouMT=false;
    int tudo;
    
    
    public pag5() {
        initComponents();
        
        bancoDeQuestoes bdq=new bancoDeQuestoes();
        
        retornou=bdq.buscarnome();
        try {
            while(retornou.next()){
                nome=retornou.getString("nome");
        
            
            }retornou.close();
        } catch (SQLException ex) {
            Logger.getLogger(pag5.class.getName()).log(Level.SEVERE, null, ex);
        }
        nome1.setText(nome);
        nome2.setText(nome);
        
        retornou2=bdq.acertouquantas();
        try {
            while (retornou2.next()) {
                quantasacertou=retornou2.getInt("marcada");
            }
            retornou2.close();
        } catch (SQLException ex) {
            Logger.getLogger(pag5.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                certas.setText(""+quantasacertou);
        
                retornou3=bdq.consultaArea();
        try {
            while (retornou3.next()){
                
                notCH=retornou3.getInt("ch");
                notCN=retornou3.getInt("cn");
                notLC=retornou3.getInt("lc");
                notMT=retornou3.getInt("mt");
                
                
            } retornou3.close();
        } catch (SQLException ex) {
            Logger.getLogger(pag5.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("notCH" + notCH + "\nnotCN" + notCN + "\nnotLC" + notLC + "\nnotMT" + notMT);
        ndequetoes=bdq.verificarcadastro();
        try {
            while(ndequetoes.next()){
                quant=ndequetoes.getInt("quandequest");
            } ndequetoes.close();
        } catch (SQLException ex) {
            Logger.getLogger(pag5.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        resch=(int) (notCH*(579.3/quant)+295.6);
        rescn=(int) (notCN*(561.8/quant)+303.1);
        reslc=(int) (notLC*(522.7/quant)+295.2);
        resmt=(int) (notMT*(678/quant)+277.2);

        //       
//        if ((resch==295)&&(rescn==303)&&(reslc==295)&&((resmt==277))) {
//            ch.setText("Sem questõs dessa modalidade no Teste");
//            cn.setText("Sem questõs dessa modalidade no Teste");
//            lc.setText("Sem questõs dessa modalidade no Teste");
//            mt.setText("Sem questõs dessa modalidade no Teste");
//        }
       
        if (resch==295) {
            zerouCH=true;
        }
        if(rescn==303){
            zerouCN=true;
        }
        if(reslc==295){
            zerouLC=true;
        }
        if(resmt==277){
            zerouMT=true;
        }
        
        
        
        ch.setText(""+resch);
        cn.setText(""+rescn);
        lc.setText(""+reslc);
        mt.setText(""+resmt);
       
       
           if(zerouCH==true){
               ch.setText("Sem questõs dessa modalidade no Teste");
           }
           if(zerouCN==true){
               cn.setText("Sem questõs dessa modalidade no Teste");
           }
           if(zerouLC==true){
               lc.setText("Sem questõs dessa modalidade no Teste");
           }
           if(zerouMT==true){
               mt.setText("Sem questõs dessa modalidade no Teste");
           }
        
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ch = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cn = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lc = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        mt = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        nome2 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        certas = new javax.swing.JLabel();
        nome1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setEnabled(false);
        jDesktopPane1.setOpaque(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("NOTAS INDIVIDUAIS"));
        jPanel1.setOpaque(false);

        jLabel7.setText("CIECIAS HUMANAS:");

        ch.setFont(new java.awt.Font("Tekton Pro Ext", 0, 24)); // NOI18N
        ch.setForeground(new java.awt.Color(0, 0, 204));
        ch.setText("jLabel8");

        jLabel9.setText("CIENCIAS DA NATUREZA");

        cn.setFont(new java.awt.Font("Tekton Pro Ext", 0, 24)); // NOI18N
        cn.setForeground(new java.awt.Color(0, 204, 0));
        cn.setText("jLabel10");

        jLabel11.setText("LINGUAGENS E CÓDIGOS");

        lc.setFont(new java.awt.Font("Tekton Pro Ext", 0, 24)); // NOI18N
        lc.setForeground(new java.awt.Color(204, 0, 51));
        lc.setText("jLabel12");

        jLabel13.setText("MATEMÁTICA");

        mt.setFont(new java.awt.Font("Tekton Pro Ext", 0, 24)); // NOI18N
        mt.setText("jLabel14");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel13)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mt)
                            .addComponent(lc)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cn)
                                .addGap(0, 477, Short.MAX_VALUE))
                            .addComponent(ch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cn))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mt)
                    .addComponent(jLabel13))
                .addGap(42, 42, 42))
        );

        jPanel1.setBounds(10, 140, 790, 308);
        jDesktopPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(680, 80, 140, 23);
        jDesktopPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setText("Página Inicial");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(680, 50, 140, 23);
        jDesktopPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        nome2.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        nome2.setText("NOME");

        jLabel27.setText("VOCÊ");

        jLabel2.setText("ACERTOU");

        certas.setText("jLabel3");

        nome1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        nome1.setText("\"NOME\"");

        jLabel1.setText("PARABÉNS ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(certas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nome1))
                .addGap(0, 31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome2)
                    .addComponent(jLabel27)
                    .addComponent(jLabel2)
                    .addComponent(certas))
                .addGap(26, 26, 26))
        );

        jPanel2.setBounds(300, 20, 290, 100);
        jDesktopPane1.add(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton3.setText("INSEIRI QUESTÕES");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.setBounds(680, 20, 140, 23);
        jDesktopPane1.add(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/ENEM--.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setBounds(-20, 0, 950, 790);
        jDesktopPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        JOptionPane.showMessageDialog(null, "Muito Obrigado por Utilizar o S.A.N.T.E","S.A.N.T.E",1);
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PAG2 pg2=new PAG2();
        pg2.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        pag3 pagina=new pag3();
        this.setVisible(false);
        pagina.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(pag5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pag5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pag5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pag5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pag5().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel certas;
    private javax.swing.JLabel ch;
    private javax.swing.JLabel cn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lc;
    private javax.swing.JLabel mt;
    private javax.swing.JLabel nome1;
    private javax.swing.JLabel nome2;
    // End of variables declaration//GEN-END:variables
}
