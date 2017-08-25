package nenem1;


import inserir.bdUFC;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nenem2.criadordepdf.pdf;
import nenem2.pag6;



/**
 * @author Jairo Chaves
 */
public class PAG2 extends javax.swing.JFrame {

    ResultSet rs;
    int q;
    double f,e,media ,a,b,c,d,g,h,i,j,k,l,m,o,p;
    private String bCarac;
    private String cCarac;
    private String eCarac;
    private String gCarac;
    String valores="";
    String nome;
    String turma;
    String serie;
    String campoch;
    String campocn;
    String campolc;
    String campomt;
    String campom;
    String gg="";
    String Valor="sante123";
    DefaultTableModel modelo;
    
    public PAG2() {
        //construção da tabela    
       initComponents();
       String cabeccalho[]={"",""};
       String daddos[][]={};
       modelo=new DefaultTableModel(daddos,cabeccalho);
       jTable1.setModel(modelo);
       
       //cores das letras respostas
            label_CH.setForeground(new java.awt.Color(255, 255, 255));
            label_CN.setForeground(new java.awt.Color(255, 255, 255));
            label_LC.setForeground(new java.awt.Color(255, 255, 255));
            label_MT.setForeground(new java.awt.Color(255, 255, 255));
       
            //colocar a pagina no centro da tela
            this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        quantidade = new javax.swing.JLayeredPane();
        label_titulo_quantidades = new javax.swing.JLabel();
        label_q_CH = new javax.swing.JLabel();
        label_q_CN = new javax.swing.JLabel();
        label_q_LC = new javax.swing.JLabel();
        label_q_MT = new javax.swing.JLabel();
        campo4 = new javax.swing.JTextField();
        campo3 = new javax.swing.JTextField();
        campo2 = new javax.swing.JTextField();
        campo1 = new javax.swing.JTextField();
        ppr = new javax.swing.JLayeredPane();
        label_CH = new javax.swing.JLabel();
        label_CN = new javax.swing.JLabel();
        label_LC = new javax.swing.JLabel();
        label_MT = new javax.swing.JLabel();
        campo8 = new javax.swing.JTextField();
        campo7 = new javax.swing.JTextField();
        campo6 = new javax.swing.JTextField();
        campo5 = new javax.swing.JTextField();
        label_media = new javax.swing.JLabel();
        campomedia = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        calcular1 = new javax.swing.JButton();
        limpar1 = new javax.swing.JButton();
        consulta_bd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        salvarbd1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tur = new javax.swing.JTextField();
        alu = new javax.swing.JTextField();
        ser = new javax.swing.JComboBox();
        doc = new javax.swing.JButton();
        gerar_relatorio1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        camposao = new javax.swing.JLayeredPane();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        universidade = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        quantidade.setBackground(new java.awt.Color(192, 234, 249));
        quantidade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "QUANTIDADES DE ACERTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N
        quantidade.setOpaque(true);

        label_titulo_quantidades.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_titulo_quantidades.setForeground(new java.awt.Color(255, 51, 0));
        label_titulo_quantidades.setText("DIGITE A QUANTIDADE DE ACERTOS EM CADA PROVA");
        quantidade.add(label_titulo_quantidades);
        label_titulo_quantidades.setBounds(50, 20, 291, 38);

        label_q_CH.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_q_CH.setText("CIENCIAS HUMANAS:");
        quantidade.add(label_q_CH);
        label_q_CH.setBounds(40, 70, 121, 22);

        label_q_CN.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_q_CN.setText("CIENCIAS DA NATUREZA:");
        quantidade.add(label_q_CN);
        label_q_CN.setBounds(20, 100, 150, 14);

        label_q_LC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_q_LC.setText("LINGUAGENS E CÓDIGOS:");
        quantidade.add(label_q_LC);
        label_q_LC.setBounds(10, 130, 160, 14);

        label_q_MT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_q_MT.setText("MATEMÁTICA:");
        quantidade.add(label_q_MT);
        label_q_MT.setBounds(70, 150, 100, 14);
        quantidade.add(campo4);
        campo4.setBounds(180, 150, 120, 30);
        quantidade.add(campo3);
        campo3.setBounds(180, 120, 120, 30);
        quantidade.add(campo2);
        campo2.setBounds(180, 90, 120, 30);
        quantidade.add(campo1);
        campo1.setBounds(180, 60, 120, 30);

        jLayeredPane2.add(quantidade);
        quantidade.setBounds(20, 120, 370, 220);

        ppr.setBackground(new java.awt.Color(255, 255, 255));
        ppr.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RESULTADOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 10), new java.awt.Color(153, 0, 255))); // NOI18N

        label_CH.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_CH.setForeground(new java.awt.Color(255, 255, 255));
        label_CH.setText("CIENCIAS HUMANAS:");
        ppr.add(label_CH);
        label_CH.setBounds(10, 30, 143, 22);

        label_CN.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_CN.setForeground(new java.awt.Color(255, 255, 255));
        label_CN.setText("CIENCIAS DA NATUREZA");
        ppr.add(label_CN);
        label_CN.setBounds(10, 70, 133, 19);

        label_LC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_LC.setForeground(new java.awt.Color(255, 255, 255));
        label_LC.setText("LINGUAGES E CÓDIGOS:");
        ppr.add(label_LC);
        label_LC.setBounds(10, 110, 133, 19);

        label_MT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_MT.setForeground(new java.awt.Color(255, 255, 255));
        label_MT.setText("MATEMÁTICA:");
        ppr.add(label_MT);
        label_MT.setBounds(20, 140, 129, 14);
        ppr.add(campo8);
        campo8.setBounds(170, 140, 180, 30);
        ppr.add(campo7);
        campo7.setBounds(170, 100, 180, 30);
        ppr.add(campo6);
        campo6.setBounds(170, 60, 180, 30);
        ppr.add(campo5);
        campo5.setBounds(170, 20, 180, 30);

        label_media.setBackground(new java.awt.Color(255, 255, 255));
        label_media.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_media.setForeground(new java.awt.Color(255, 255, 255));
        label_media.setText("MEDIA SEM A REDAÇÃO:");
        ppr.add(label_media);
        label_media.setBounds(20, 180, 140, 31);
        ppr.add(campomedia);
        campomedia.setBounds(170, 180, 130, 30);

        jLayeredPane2.add(ppr);
        ppr.setBounds(420, 120, 380, 220);

        jPanel2.setOpaque(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setOpaque(false);

        calcular1.setBackground(new java.awt.Color(204, 238, 235));
        calcular1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem1/calcular2.png"))); // NOI18N
        calcular1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        calcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcular1ActionPerformed(evt);
            }
        });

        limpar1.setBackground(new java.awt.Color(0, 0, 0));
        limpar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem1/LIMPAR2.png"))); // NOI18N
        limpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar1ActionPerformed(evt);
            }
        });

        consulta_bd.setBackground(new java.awt.Color(204, 238, 235));
        consulta_bd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        consulta_bd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem1/botão_de_acesso_ao_banco_de_dados_2.png"))); // NOI18N
        consulta_bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta_bdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calcular1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(limpar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consulta_bd, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(calcular1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consulta_bd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(limpar1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(377, 377, 377))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLayeredPane2.add(jPanel2);
        jPanel2.setBounds(60, 400, 760, 280);

        jTable1.setBackground(new java.awt.Color(227, 246, 227));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(300);
        }

        jLayeredPane2.add(jScrollPane1);
        jScrollPane1.setBounds(840, 350, 410, 280);

        salvarbd1.setBackground(new java.awt.Color(255, 255, 255));
        salvarbd1.setText("Salvar no Banco de Dados");
        salvarbd1.setOpaque(false);
        salvarbd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarbd1ActionPerformed(evt);
            }
        });
        jLayeredPane2.add(salvarbd1);
        salvarbd1.setBounds(850, 470, 170, 50);

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setText("Aluno:");

        jLabel2.setText("Turma:");

        jLabel3.setText("Série:");

        ser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "1º Ano", "2º Ano", "3º Ano" }));

        doc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        doc.setText("Salvar em Documento");
        doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tur)
                        .addComponent(alu, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ser, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(doc)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(alu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doc, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ser)
                        .addComponent(jLabel3)))
                .addGap(19, 19, 19))
        );

        jLayeredPane2.add(jPanel3);
        jPanel3.setBounds(840, 180, 410, 140);

        gerar_relatorio1.setText("gerar relatório");
        gerar_relatorio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerar_relatorio1ActionPerformed(evt);
            }
        });
        jLayeredPane2.add(gerar_relatorio1);
        gerar_relatorio1.setBounds(850, 530, 170, 40);

        jButton2.setText("Créditos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jButton2);
        jButton2.setBounds(1150, 630, 100, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem1/end_primeira_fase.png"))); // NOI18N
        jLayeredPane2.add(jLabel13);
        jLabel13.setBounds(0, 0, 1270, 810);

        camposao.setBackground(new java.awt.Color(51, 51, 51));
        camposao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DADOS DO ALUNO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 153))); // NOI18N
        camposao.setOpaque(true);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("NOME:");
        camposao.add(jLabel11);
        jLabel11.setBounds(20, 20, 60, 14);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CURSO:");
        camposao.add(jLabel12);
        jLabel12.setBounds(20, 70, 60, 14);

        jTextField2.setEnabled(false);
        camposao.add(jTextField2);
        jTextField2.setBounds(90, 60, 256, 30);

        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        camposao.add(jTextField1);
        jTextField1.setBounds(90, 20, 256, 30);

        jLayeredPane2.add(camposao);
        camposao.setBounds(1230, 10, 20, 10);

        universidade.setColumns(20);
        universidade.setRows(5);
        jScrollPane2.setViewportView(universidade);

        jLayeredPane2.add(jScrollPane2);
        jScrollPane2.setBounds(1250, 10, 20, 20);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nenem1/INICIAR_simulado-.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jButton1);
        jButton1.setBounds(940, 650, 41, 29);

        jMenu1.setText("Arquivos");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Exemplo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Limpar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("calcular");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Verificar ");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Exemplo 45");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_0, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Exemplo 0");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Admin");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Notas De Corte");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1271, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcular1ActionPerformed
        
        //chama a quantidade de acertos dos campos
        bCarac=campo1.getText();//ciencias humanas
        cCarac=campo2.getText();//ciencias da natureza
        eCarac=campo3.getText();//linguagem e codigos
        gCarac=campo4.getText();//matemática
        p=4;   
        
                                                //inicio da parte dos cálculos
        
        //se os campos estiverem vazios vai mostrar a mensagem de erro
        if ((bCarac.equals(""))||(cCarac.equals(""))||(eCarac.equals(""))||(gCarac.equals(""))) {
            JOptionPane.showMessageDialog(null, "Preencha Todos os Campos!");
              
        }
        
        
        //se os campos estiverem preenchidos ele vai fazer o calculo.
        else{
            // transforma as strings em inteiro
            
        b=Integer.parseInt(bCarac);//ciencias humanas
        c=Integer.parseInt(cCarac);//ciencias da natureza    
        e=Integer.parseInt(eCarac);//linguagem e codigos    
        g=Integer.parseInt(gCarac);//matemática 
        
         if((b>45)||(c>45)||(e>45)||(g>45)){
    JOptionPane.showMessageDialog(null, "Número Máximo de Questões Excedido!\n O Número Máximo é 45!\n Atualize os Campos de Texto!","S.A.N.T.E",0);
        
        }    
         else{
        
        
        //faz o cálculo
            
            a= b*12.528+301.1;//nota ciencias da natureza 12,528 *ciencias humanas
            d= c*12.882+295.6;//Ciências Humanas 12,882 *ciencias da natureza
            f= e*11.615+295.2;//Linguagens, Códigos 11.615 *linguagem e codigos
            h=g*15.066+277.2;//matemática 15.066  *matemática
            
            //transforma o conteudo da variável "a" em real com apenas dois numeros depois da virgula
       BigDecimal b1=new BigDecimal(a);    
           
           
                 b1=b1.setScale(2,BigDecimal.ROUND_DOWN);    
           
                 //transforma o conteudo da variável "d" em real com apenas dois numeros depois da virgula              
      BigDecimal b2=new BigDecimal(d);
               
            
                b2=b2.setScale(2,BigDecimal.ROUND_DOWN);  
      
         //transforma o conteudo da variável "f" em real com apenas dois numeros depois da virgula         
      BigDecimal b3=new BigDecimal(f);    
         
              
                  b3=b3.setScale(2,BigDecimal.ROUND_DOWN);
                  
        //transforma o conteudo da variável "h" em real com apenas dois numeros depois da virgula                  
       BigDecimal b4=new BigDecimal(h);    
            
                  b4=b4.setScale(2,BigDecimal.ROUND_DOWN);
      //end    
            
          //insere os valores nos campos de resultado
            campo5.setText(""+b1);
            campo6.setText(""+b2);
            campo7.setText(""+b3);
            campo8.setText(""+b4);
           
            //calcula a média sem redação
            media=(a+d+f+h)/p;
            //transforma a média em real com apenas duas casas decimais após a virgula
            BigDecimal Média_decimal=new BigDecimal(media);    
          Média_decimal=Média_decimal.setScale(2,BigDecimal.ROUND_DOWN);
          
          //insere o resultado da média no campo média
            campomedia.setText(""+Média_decimal);
           //fim da parte lógica
       //................................................................................................     
            //jinício ada iparte rgráfica o
            
     //troca de cores dos painéis 
            ppr.setBackground(new java.awt.Color(192,234,249));
            ppr.setOpaque(true);
            quantidade.setBackground(new java.awt.Color(255, 255, 255));
                    //label painel resultado
            label_CH.setForeground(new java.awt.Color(0, 0, 0));
            label_CN.setForeground(new java.awt.Color(0, 0, 0));
            label_LC.setForeground(new java.awt.Color(0, 0, 0));
            label_MT.setForeground(new java.awt.Color(0, 0, 0));
            label_media.setForeground(new java.awt.Color(0, 0, 0));
            
                    //label painel de quantidade de dados
            label_q_CH.setForeground(new java.awt.Color(255,255,255));
            label_q_CN.setForeground(new java.awt.Color(255,255,255));
            label_q_LC.setForeground(new java.awt.Color(255,255,255));
            label_q_MT.setForeground(new java.awt.Color(255,255,255));
            label_titulo_quantidades.setForeground(new java.awt.Color(255,255,255));
            modelo.setRowCount(0); 
            //fim parte gráfica

            
            //fórmula utilisada na escola
            
            /*
            * simulado escola
            a=b*9.665+295.6;//nota ciencias da natureza 12,528
            d=c*12.484+303.1;//Ciências Humanas 12,882
            f=e*10.454+295.2;//Linguagens, Códigos 11.615
            h=g*15.066+277.2;//matemática 15.066
            */
                 
         }   
                 
        }
    }//GEN-LAST:event_calcular1ActionPerformed

    private void limpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar1ActionPerformed
        //limpar os campos de entrada e saída de dados
            jTextField1.setText("");
            jTextField2.setText("");
            campo1.setText("");
            campo2.setText("");
            campo3.setText("");
            campo4.setText("");
            campo5.setText("");
            campo6.setText("");
            campo7.setText("");
            campo8.setText("");
            campomedia.setText("");
            tur.setText("");
            alu.setText("");
            
            //fim
            
        //universidade.setText("");
        
        ppr.setBackground(new java.awt.Color(255, 255, 255));
        quantidade.setBackground(new java.awt.Color(192,234,249));
        camposao.setBackground(new java.awt.Color(51, 51, 51));
            //fim
      
        
        //limpar as letras resultados
            label_CH.setForeground(new java.awt.Color(255, 255, 255));
            label_CN.setForeground(new java.awt.Color(255, 255, 255));
            label_LC.setForeground(new java.awt.Color(255, 255, 255));
            label_MT.setForeground(new java.awt.Color(255, 255, 255));
            label_media.setForeground(new java.awt.Color(255, 255, 255));

            label_q_CH.setForeground(new java.awt.Color(0, 0, 0));
            label_q_CN.setForeground(new java.awt.Color(0, 0, 0));
            label_q_LC.setForeground(new java.awt.Color(0, 0, 0));
            label_q_MT.setForeground(new java.awt.Color(0, 0, 0));
            label_titulo_quantidades.setForeground(new java.awt.Color(255,51,0));
            
            
            //fim
            
            //limpar os dados que foram mostrados na tabela
            modelo.setRowCount(0);         
    }//GEN-LAST:event_limpar1ActionPerformed

    private void gerar_relatorio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerar_relatorio1ActionPerformed
        
    }//GEN-LAST:event_gerar_relatorio1ActionPerformed
      //não será utilizado
    private void salvarbd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarbd1ActionPerformed
/*                                  //não será utilizado
 * 
 * String aluno,turma,n1,n2,n3,n4;
            aluno=jTextField1.getText();
            turma=jTextField2.getText();
            n1=campo5.getText();
            n2=campo6.getText();
            n3=campo7.getText();
            n4=campo8.getText();
            bancodedados bd;
        try {
            bd = new bancodedados();
            try {
                if(bd.alunoExiste(aluno)){
                    JOptionPane.showMessageDialog(null, "aluno já cadastrado com as notas!");
                    
                }else{
                
                     bd.cadastrodenotas(aluno,turma,n1, n2, n3, n4);
                     
                }
            } catch (SQLException ex) {
                Logger.getLogger(PAG2.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PAG2.class.getName()).log(Level.SEVERE, null, ex);
        }
JOptionPane.showMessageDialog(null, "Concluído com Sucesso");     */       
    }//GEN-LAST:event_salvarbd1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       //exemplos de notas
        campo1.setText("25");
        campo2.setText("24");
        campo3.setText("33");
        campo4.setText("40");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
     
        //limpa a tela com atalho 
        this.limpar1ActionPerformed(evt);
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void consulta_bdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta_bdActionPerformed
   
       
        //variáveis
        float programa;
      
      //inserir dados na tabela
        String cabeçalho[]={"Cursos","Notas De Corte"};
        String dados[][]={};
        modelo=new DefaultTableModel(dados,cabeçalho);
         jTable1.setModel(modelo);
        gg="";
     
       
        jTable1.getColumnModel().getColumn(0).setMinWidth(280);         //adicionando o tamanho minimo 300 à coluna 0 que é a primeira
        jTable1.getColumnModel().getColumn(1).setMinWidth(150);         //adicionando o tamanho minimo 100 à coluna 1 que é a segunda
      
      
      //consulta do bd
      
       programa= Float.parseFloat(campomedia.getText());
        bdUFC ufc=new bdUFC();
        
        rs=ufc.retornarparaprograma(programa);
        
        try {
            
       
            while(rs.next()){
                Object da[]={rs.getString("Curso"),rs.getFloat("notaDeCorteSC")
                
                
                };
                gg=gg+rs.getString("Curso")+",  ";
                     
                
                modelo.addRow(da);
                 
//            valores=valores+rs.getString("curso")+"\n"+""+rs.getFloat("notaDecorte")+"\n";
            //valores=valores+rs.getString("curso")+"\n"+""+rs.getFloat("notaDecorte")+"\n";       //pré solução
            }
            
                

//                pdf conexao=new pdf();
//                conexao.criarPdfAluno( null, null, null, null, null, null, null, null, gg);                
            universidade.setText(""+valores);
            
        } catch (SQLException ex) {
            Logger.getLogger(PAG2.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_consulta_bdActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.calcular1ActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    
    //n está sndo utilizado
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.consulta_bdActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        pag6 pg6=new pag6();
//        this.setVisible(false);
//        pg6.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        campo1.setText("45");
        campo2.setText("45");
        campo3.setText("45");
        campo4.setText("45");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        campo1.setText("0");
        campo2.setText("0");
        campo3.setText("0");
        campo4.setText("0");
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docActionPerformed
        nome=alu.getText();
        turma=tur.getText();
        serie=""+ser.getSelectedItem();
        campoch=campo5.getText();
        campocn=campo6.getText();
        campolc=campo7.getText();
        campomt=campo8.getText();
        campom=campomedia.getText();
        pdf manda=new pdf();
        manda.criarPdfAluno(nome,turma,serie,campoch,campocn,campolc,campomt,campom,gg);
    }//GEN-LAST:event_docActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null, "Desenvolvedor: Jairo Chaves\n"+"Equação: Felipe Araújo\n"+"Texto:"+
                " Mirian Sousa\n"+"Apoio Técnico: Leonardo Souza\n"+"Institução: EEEP LUIZ GONZAGA FONSECA MOTA,\n AMONTADA-CE"+".", "S.A.N.T.E", 1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
       Senha abreSenha=new Senha();
       this.setVisible(false);
       abreSenha.setVisible(true);
       
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(PAG2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PAG2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PAG2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PAG2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PAG2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alu;
    private javax.swing.JButton calcular1;
    private javax.swing.JTextField campo1;
    private javax.swing.JTextField campo2;
    private javax.swing.JTextField campo3;
    private javax.swing.JTextField campo4;
    private javax.swing.JTextField campo5;
    private javax.swing.JTextField campo6;
    private javax.swing.JTextField campo7;
    private javax.swing.JTextField campo8;
    private javax.swing.JTextField campomedia;
    private javax.swing.JLayeredPane camposao;
    private javax.swing.JButton consulta_bd;
    private javax.swing.JButton doc;
    private javax.swing.JButton gerar_relatorio1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel label_CH;
    private javax.swing.JLabel label_CN;
    private javax.swing.JLabel label_LC;
    private javax.swing.JLabel label_MT;
    private javax.swing.JLabel label_media;
    private javax.swing.JLabel label_q_CH;
    private javax.swing.JLabel label_q_CN;
    private javax.swing.JLabel label_q_LC;
    private javax.swing.JLabel label_q_MT;
    private javax.swing.JLabel label_titulo_quantidades;
    private javax.swing.JButton limpar1;
    private javax.swing.JLayeredPane ppr;
    private javax.swing.JLayeredPane quantidade;
    private javax.swing.JButton salvarbd1;
    private javax.swing.JComboBox ser;
    private javax.swing.JTextField tur;
    private javax.swing.JTextArea universidade;
    // End of variables declaration//GEN-END:variables
}
