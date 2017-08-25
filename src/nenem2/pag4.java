
package nenem2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author Jairo Chaves
 */
public class pag4 extends javax.swing.JFrame {

    ResultSet retornandodobanco,rss,aenem;
    String resultado1="";
    String resultado2="";
    String resultado3="";
    String resultado4="";
    String resultado5="";
    String resultado6="";
    String resultado7="";
    String YU=null;
    String areaDoENEM;
    int verificacao=0;
    int itensCerto=0;
    int itensErrado=0;
    int numerodequestoes=0;
    int dobanco;
    int Id=0;
    private int teste=0;
    int nenem; 
    int contadorCH=0;
    int contadorCN=0;
    int contadorLC=0;
    int contadorMT=0;
    
    
    
    public pag4() {
        
        initComponents();
     bancoDeQuestoes bdqqqqq=new bancoDeQuestoes();
        corrigir.setEnabled(false);
        //zera contador das areas
        bdqqqqq.zeraporarea();
        
        //coloca tudo como não visto
        bdqqqqq.naovisto();
      
        //faz com que apenas um botão de radio fique marcado
        ButtonGroup bg=new ButtonGroup();
        bg.add(item_a);
        bg.add(item_b);
        bg.add(item_c);
        bg.add(item_d);
        bg.add(item_e);
        
//acessa o banco e inicia tudo-------------------------------------------------------------------------------------------------------------------------------
        
            bancoDeQuestoes bdq=new bancoDeQuestoes();
        
          
            
            
            retornandodobanco=bdq.enunci();
            
        try{    
        while(retornandodobanco.next()) {       
                
                
                resultado1=retornandodobanco.getString("enunciado");
                resultado2=retornandodobanco.getString("pi");
                resultado3=retornandodobanco.getString("si");
                resultado4=retornandodobanco.getString("ti");
                resultado5=retornandodobanco.getString("qi");
                resultado6=retornandodobanco.getString("qii");
                resultado7=retornandodobanco.getString("certo");            
                Id=retornandodobanco.getInt("id");
                areaDoENEM=retornandodobanco.getString("aenem");
                
                
        }     
        retornandodobanco.close();
        
        } catch (SQLException ex) {
            Logger.getLogger(pag4.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
        
        if(Id==0){
    JOptionPane.showMessageDialog(null, "o Banco de dados não possue nenhuma questão para exibir","S.A.N.T.E",0);
   
    pag3 pagna=new pag3();
   pagna.setVisible(true); 
   this.setVisible(false);
    
    }
    
        else {
        
            //insere o texto e os itens
            area_enunciado.setText(resultado1);
        
            item_a.setText("a) "+resultado2);
        
            item_b.setText("b) "+resultado3);
        
            item_c.setText("c) "+resultado4);
        
            item_d.setText("d) "+resultado5);
        
            item_e.setText("e) "+resultado6);
        
        
        //deixa os icones de certo ou errado vaziu
            certo_ou_errado_a.setIcon(null);
        
            certo_ou_errado_b.setIcon(null);
        
            certo_ou_errado_c.setIcon(null);
        
            certo_ou_errado_d.setIcon(null);
        
            certo_ou_errado_e.setIcon(null);
        
        
            //desabilita o proximo
            proximo.setEnabled(false);
        
        
            //zera o banco de errado e certo
            bancoDeQuestoes bancoapaga=new bancoDeQuestoes();
        //banco errado
        
            bancoapaga.apagarerrado();
        //banco certo
        
            bancoapaga.apagarcerto();
        
        //verificar a quantidade de questoes
        
            bancoDeQuestoes bdqqq=new bancoDeQuestoes();
        
        
            rss=bdqqq.verificarcadastro();

            try {
            
                while(rss.next()){
                
                    dobanco=rss.getInt("quandequest");
            
            
                }
        
            
            } catch (SQLException ex) {
            Logger.getLogger(pag4.class.getName()).log(Level.SEVERE, null, ex);
        
            }
            
        
            numerodequestoes=numerodequestoes+1;
        
            NDQUETÃO.setText(""+numerodequestoes);
        
            
        
            bdq.ja_vi(Id);
            
//                if (areaDoENEM.equals("CIENCIAS HUMANAS")) {
//                   contadorCH++;
//                }
//                else if(areaDoENEM.equals("CIENCIAS DA NATUREZA")){
//                contadorCN++;
//                }
//                else if(areaDoENEM.equals("LINGUAGENS E CÓDIGOS")){
//                contadorLC++;
//                
//                }
//                else if(areaDoENEM.equals("MATEMÁTICA")){
//                contadorMT++;
//                }
        //coloca a pagina no centro
        
            this.setLocationRelativeTo(null);
   }
    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        area_enunciado = new javax.swing.JTextArea();
        painel_itens = new javax.swing.JPanel();
        item_a = new javax.swing.JRadioButton();
        item_b = new javax.swing.JRadioButton();
        item_c = new javax.swing.JRadioButton();
        item_d = new javax.swing.JRadioButton();
        item_e = new javax.swing.JRadioButton();
        certo_ou_errado_a = new javax.swing.JLabel();
        certo_ou_errado_b = new javax.swing.JLabel();
        certo_ou_errado_c = new javax.swing.JLabel();
        certo_ou_errado_d = new javax.swing.JLabel();
        certo_ou_errado_e = new javax.swing.JLabel();
        corrigir = new javax.swing.JButton();
        proximo = new javax.swing.JButton();
        certoerrado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        NDQUETÃO = new javax.swing.JLabel();
        label_imagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setEnabled(false);
        jDesktopPane1.setOpaque(false);

        area_enunciado.setEditable(false);
        area_enunciado.setColumns(20);
        area_enunciado.setRows(5);
        jScrollPane1.setViewportView(area_enunciado);

        jScrollPane1.setBounds(40, 60, 1200, 350);
        jDesktopPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        painel_itens.setBorder(javax.swing.BorderFactory.createTitledBorder("Ítens"));

        item_a.setText("a)");
        item_a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                item_aMouseClicked(evt);
            }
        });
        item_a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                item_aKeyPressed(evt);
            }
        });

        item_b.setText("b)");
        item_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                item_bMouseClicked(evt);
            }
        });

        item_c.setText("c)");
        item_c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                item_cMouseClicked(evt);
            }
        });

        item_d.setText("d)");
        item_d.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                item_dMouseClicked(evt);
            }
        });

        item_e.setText("e)");
        item_e.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                item_eMouseClicked(evt);
            }
        });

        certo_ou_errado_a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/certo.png"))); // NOI18N

        certo_ou_errado_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png"))); // NOI18N

        certo_ou_errado_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png"))); // NOI18N

        certo_ou_errado_d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png"))); // NOI18N

        certo_ou_errado_e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png"))); // NOI18N

        javax.swing.GroupLayout painel_itensLayout = new javax.swing.GroupLayout(painel_itens);
        painel_itens.setLayout(painel_itensLayout);
        painel_itensLayout.setHorizontalGroup(
            painel_itensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_itensLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(painel_itensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(certo_ou_errado_a)
                    .addComponent(certo_ou_errado_b)
                    .addComponent(certo_ou_errado_c)
                    .addComponent(certo_ou_errado_d)
                    .addComponent(certo_ou_errado_e))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_itensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item_e)
                    .addComponent(item_d)
                    .addComponent(item_c)
                    .addComponent(item_b)
                    .addComponent(item_a))
                .addContainerGap(1094, Short.MAX_VALUE))
        );
        painel_itensLayout.setVerticalGroup(
            painel_itensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_itensLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_itensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_itensLayout.createSequentialGroup()
                        .addComponent(item_a)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painel_itensLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(certo_ou_errado_a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_itensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_itensLayout.createSequentialGroup()
                        .addComponent(item_b)
                        .addGap(7, 7, 7)
                        .addComponent(item_c))
                    .addGroup(painel_itensLayout.createSequentialGroup()
                        .addComponent(certo_ou_errado_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)
                        .addComponent(certo_ou_errado_c, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painel_itensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(certo_ou_errado_d, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item_d))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_itensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(certo_ou_errado_e, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item_e))
                .addGap(31, 31, 31))
        );

        painel_itens.setBounds(40, 420, 1200, 210);
        jDesktopPane1.add(painel_itens, javax.swing.JLayeredPane.DEFAULT_LAYER);

        corrigir.setText("Corrigir");
        corrigir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corrigirActionPerformed(evt);
            }
        });
        corrigir.setBounds(310, 630, 180, 50);
        jDesktopPane1.add(corrigir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        proximo.setText("próximo");
        proximo.setEnabled(false);
        proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoActionPerformed(evt);
            }
        });
        proximo.setBounds(610, 630, 160, 50);
        jDesktopPane1.add(proximo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        certoerrado.setFont(new java.awt.Font("Miriam", 1, 14)); // NOI18N
        certoerrado.setBounds(540, 160, 110, 80);
        jDesktopPane1.add(certoerrado, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setText("QUESTÃO:");
        jLabel1.setBounds(20, 14, 60, 20);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        NDQUETÃO.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        NDQUETÃO.setForeground(new java.awt.Color(0, 0, 153));
        NDQUETÃO.setText("jLabel2");
        NDQUETÃO.setBounds(80, 14, 110, 20);
        jDesktopPane1.add(NDQUETÃO, javax.swing.JLayeredPane.DEFAULT_LAYER);

        label_imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/ENEM--.png"))); // NOI18N
        label_imagem.setBounds(-6, -6, 1330, 700);
        jDesktopPane1.add(label_imagem, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1265, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void corrigirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corrigirActionPerformed
     
        //corrigir.setEnabled(true);
        
        
        
        //tem que colocar a opção de se não estiver marcado deve fazer outra coisa não executa
        ////////////////////////////////////////////////////////////////////////////////////
        
        
    
            
        if ((item_a.isSelected())&&(resultado7.equalsIgnoreCase("Primeiro item"))) {
            
            
            certo_ou_errado_a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/certo.png")));
            certo_ou_errado_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            itensCerto++;
            proximo.setEnabled(true);
            corrigir.setEnabled(false);
            certoerrado.setText("você acertou");
              
      bancoDeQuestoes bdq=new bancoDeQuestoes();
        
      bdq.certificadocerto(verificacao);
      
      
                if (areaDoENEM.equals("CIENCIAS HUMANAS")) {
                   contadorCH++;
                }
                else if(areaDoENEM.equals("CIENCIAS DA NATUREZA")){
                contadorCN++;
                }
                else if(areaDoENEM.equals("LINGUAGENS E CÓDIGOS")){
                contadorLC++;
                }
                else if(areaDoENEM.equals("MATEMÁTICA")){
                contadorMT++;
                }
            
        }
        else if(item_b.isSelected()&&(resultado7.equalsIgnoreCase("Segundo item"))){
            certo_ou_errado_a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/certo.png")));
            certo_ou_errado_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            itensCerto=itensCerto+1;
            proximo.setEnabled(true);
            corrigir.setEnabled(false);
            certoerrado.setText("você acertou");
                  bancoDeQuestoes bdq=new bancoDeQuestoes();
                    
                  bdq.certificadocerto(verificacao);

                if (areaDoENEM.equals("CIENCIAS HUMANAS")) {
                   contadorCH++;
                }
                else if(areaDoENEM.equals("CIENCIAS DA NATUREZA")){
                contadorCN++;
                }
                else if(areaDoENEM.equals("LINGUAGENS E CÓDIGOS")){
                contadorLC++;
                }
                else if(areaDoENEM.equals("MATEMÁTICA")){
                contadorMT++;
                }
            
        }
        else if(item_c.isSelected()&&(resultado7.equalsIgnoreCase("Terceiro item"))){
            certo_ou_errado_a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/certo.png")));
            certo_ou_errado_d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            itensCerto++;
            proximo.setEnabled(true);
            corrigir.setEnabled(false);
            certoerrado.setText("voce acertou");
                  bancoDeQuestoes bdq=new bancoDeQuestoes();
                    
                  bdq.certificadocerto(verificacao);
                  if (areaDoENEM.equals("CIENCIAS HUMANAS")) {
                   contadorCH++;
                }
                else if(areaDoENEM.equals("CIENCIAS DA NATUREZA")){
                contadorCN++;
                }
                else if(areaDoENEM.equals("LINGUAGENS E CÓDIGOS")){
                contadorLC++;
                }
                else if(areaDoENEM.equals("MATEMÁTICA")){
                contadorMT++;
                }

        }
        else if(item_d.isSelected()&&(resultado7.equalsIgnoreCase("Quarto item"))){
            certo_ou_errado_a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/certo.png")));
            certo_ou_errado_e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            itensCerto++;
            proximo.setEnabled(true);
            corrigir.setEnabled(false);
            certoerrado.setText("você acertou");
              bancoDeQuestoes bdq=new bancoDeQuestoes();
                 
               bdq.certificadocerto(verificacao);
               if (areaDoENEM.equals("CIENCIAS HUMANAS")) {
                   contadorCH++;
                }
                else if(areaDoENEM.equals("CIENCIAS DA NATUREZA")){
                contadorCN++;
                }
                else if(areaDoENEM.equals("LINGUAGENS E CÓDIGOS")){
                contadorLC++;
                }
                else if(areaDoENEM.equals("MATEMÁTICA")){
                contadorMT++;
                }

        
        
        }
        else if(item_e.isSelected()&&(resultado7.equalsIgnoreCase("Quinto item"))){
            certo_ou_errado_a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/certo.png")));
            itensCerto++;
            proximo.setEnabled(true);
            corrigir.setEnabled(false);
            certoerrado.setText("você acertou");
                  bancoDeQuestoes bdq=new bancoDeQuestoes();
                     
                   bdq.certificadocerto(verificacao);
                 
                if (areaDoENEM.equals("CIENCIAS HUMANAS")) {
                   contadorCH++;
                }
                else if(areaDoENEM.equals("CIENCIAS DA NATUREZA")){
                contadorCN++;
                }
                else if(areaDoENEM.equals("LINGUAGENS E CÓDIGOS")){
                contadorLC++;
                }
                else if(areaDoENEM.equals("MATEMÁTICA")){
                contadorMT++;
                }

            
        }
        
        
        else if (resultado7.equals("Primeiro item")) {
            certo_ou_errado_a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/certo.png")));
            certo_ou_errado_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            itensErrado++;
            proximo.setEnabled(true);
            corrigir.setEnabled(false);
            certoerrado.setText("você errou");
                  bancoDeQuestoes bdq=new bancoDeQuestoes();
                     
                   bdq.certificadoerrado(verificacao);

            
        }
        
        else if (resultado7.equals("Segundo item")) {
            certo_ou_errado_a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/certo.png")));
            certo_ou_errado_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            itensErrado++;
            proximo.setEnabled(true);
            corrigir.setEnabled(false);
            certoerrado.setText("você errou");
            
                  bancoDeQuestoes bdq=new bancoDeQuestoes();
                
                   bdq.certificadoerrado(verificacao);

            
            }
        else if (resultado7.equals("Terceiro item")){
            certo_ou_errado_a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/certo.png")));
            certo_ou_errado_d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            itensErrado++;
            proximo.setEnabled(true);
            corrigir.setEnabled(false);
            certoerrado.setText("você errou");
                  bancoDeQuestoes bdq=new bancoDeQuestoes();
                   
                  bdq.certificadoerrado(verificacao);
            
        }
        else if (resultado7.equals("Quarto item")){
            certo_ou_errado_a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/certo.png")));
            certo_ou_errado_e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            itensErrado++;
            proximo.setEnabled(true);
            corrigir.setEnabled(false);
            certoerrado.setText("você errou");
                  bancoDeQuestoes bdq=new bancoDeQuestoes();
                  
                   bdq.certificadoerrado(verificacao);

        }
        else if (resultado7.equals("Quinto item")){
            certo_ou_errado_a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/errado.png")));
            certo_ou_errado_e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem2/certo.png")));
            itensErrado++;
            proximo.setEnabled(true);
            corrigir.setEnabled(false);
            certoerrado.setText("voce errou");
                  bancoDeQuestoes bdq=new bancoDeQuestoes();
                  bdq.certificadoerrado(verificacao);  
        }
        
        
        else{
      
      
        proximo.setEnabled(false);    
        corrigir.setEnabled(true);
        }
       
              
              
        System.out.println(contadorCH);
        System.out.println(contadorCN);
        System.out.println(contadorLC);
        System.out.println(contadorMT);
    }//GEN-LAST:event_corrigirActionPerformed

    private void proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoActionPerformed
        
        teste=0;
    if (numerodequestoes<=(dobanco-1)) { ///dobanco-1
        certoerrado.setText("");
        numerodequestoes=numerodequestoes+1;
        NDQUETÃO.setText(""+numerodequestoes);
        
        certo_ou_errado_a.setIcon(null);
        certo_ou_errado_b.setIcon(null);
        certo_ou_errado_c.setIcon(null);
        certo_ou_errado_d.setIcon(null);
        certo_ou_errado_e.setIcon(null);    
        
        bancoDeQuestoes bdq=new bancoDeQuestoes();
         bancoDeQuestoes bdq2=new bancoDeQuestoes();
            retornandodobanco=bdq.enunci();
            
        try{    
        while(retornandodobanco.next()) {               
                Id=retornandodobanco.getInt("id");
                resultado1=retornandodobanco.getString("enunciado");
                resultado2=retornandodobanco.getString("pi");
                resultado3=retornandodobanco.getString("si");
                resultado4=retornandodobanco.getString("ti");
                resultado5=retornandodobanco.getString("qi");
                resultado6=retornandodobanco.getString("qii");
                resultado7=retornandodobanco.getString("certo");            
                areaDoENEM=retornandodobanco.getString("aenem");
                //fazer update para visto com o id acima
                bdq2.ja_vi(Id);
                teste=1;
                
        }
        retornandodobanco.close();
        } catch (SQLException ex) {
            Logger.getLogger(pag4.class.getName()).log(Level.SEVERE, null, ex);
        }

                
    if(teste == 0){
    JOptionPane.showMessageDialog(null, "Numero De Questões Insuficiente, Insira Mais Questões e Reinicie o Teste","S.A.N.T.E",0);
    
    pag3 pg3 = new pag3();
    this.setVisible(false);
    pg3.setVisible(true);
    
    }
    else{
        
        area_enunciado.setText(resultado1);
        item_a.setText("a) "+resultado2);
        item_b.setText("b) "+resultado3);
        item_c.setText("c) "+resultado4);
        item_d.setText("d) "+resultado5);
        item_e.setText("e) "+resultado6);
             
        proximo.setEnabled(false);
        corrigir.setEnabled(false);
     
        //chama o ja vistobd
        
    }
                
    
    
    
    }
    
    
    else{
    bancoDeQuestoes bdqqqqq=new bancoDeQuestoes();
    bdqqqqq.naovisto();
    //conta os itens   
    bdqqqqq.certificadocerto(itensCerto);
    //COLOCA AS AREAS
    bdqqqqq.inserirporarea(contadorCH,contadorCN,contadorLC,contadorMT);
    
    JOptionPane.showMessageDialog(null, "Parabéns Você Finalizou o Teste","titulo",1);
            
        
        pag5 pg5=new pag5();
        
        this.setVisible(false);
        
        pg5.setVisible(true);
        }
    
    
    }//GEN-LAST:event_proximoActionPerformed
                
    private void item_aKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_item_aKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_item_aKeyPressed

    private void item_aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_aMouseClicked
        corrigir.setEnabled(true);
    }//GEN-LAST:event_item_aMouseClicked

    private void item_bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_bMouseClicked
        corrigir.setEnabled(true);
    }//GEN-LAST:event_item_bMouseClicked

    private void item_cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_cMouseClicked
        corrigir.setEnabled(true);
    }//GEN-LAST:event_item_cMouseClicked

    private void item_dMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_dMouseClicked
        corrigir.setEnabled(true);
    }//GEN-LAST:event_item_dMouseClicked

    private void item_eMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_eMouseClicked
        corrigir.setEnabled(true);
    }//GEN-LAST:event_item_eMouseClicked

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
            java.util.logging.Logger.getLogger(pag4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pag4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pag4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pag4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pag4().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NDQUETÃO;
    private javax.swing.JTextArea area_enunciado;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel certo_ou_errado_a;
    private javax.swing.JLabel certo_ou_errado_b;
    private javax.swing.JLabel certo_ou_errado_c;
    private javax.swing.JLabel certo_ou_errado_d;
    private javax.swing.JLabel certo_ou_errado_e;
    private javax.swing.JLabel certoerrado;
    private javax.swing.JButton corrigir;
    private javax.swing.JRadioButton item_a;
    private javax.swing.JRadioButton item_b;
    private javax.swing.JRadioButton item_c;
    private javax.swing.JRadioButton item_d;
    private javax.swing.JRadioButton item_e;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_imagem;
    private javax.swing.JPanel painel_itens;
    private javax.swing.JButton proximo;
    // End of variables declaration//GEN-END:variables
}
