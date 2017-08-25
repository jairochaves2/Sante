
package nenem2;

import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;



public class bancoDeQuestoes {
    private Connection fazerConexao;
    private Statement comandosdobd;
    private ResultSet rs;
    
    /**
     *
     */
    public bancoDeQuestoes(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                fazerConexao=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/bdenem","root","bancodedados");
                comandosdobd=fazerConexao.createStatement();
                
                
            } catch (SQLException ex) {
                Logger.getLogger(bancoDeQuestoes.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "erro com o banco de dados entre em contato com o desenvolvedor email:jairochaves2@gmail.com");
        }



}
    public void insercaodequestoes(String area,String i1,String i2,String i3,String i4,String i5,String correto,String areaenem,String vnv){
        try {
            comandosdobd.executeUpdate("insert into questoes (enunciado,pi,si,ti,qi,qii,certo,aenem,c_o_e) values('"+area+"','"+i1+"','"+i2+"','"+i3+"','"+i4+"','"+i5+"','"+correto+"','"+areaenem+"','"+vnv+"');");
        } catch (SQLException ex) {
            Logger.getLogger(bancoDeQuestoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
    }
    
    public ResultSet enunci(){
        try {
            rs=comandosdobd.executeQuery("select * from questoes where c_o_e='nao visto' order by rand() limit 1;");
            
        } catch (SQLException ex) {
            Logger.getLogger(bancoDeQuestoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        return rs;
    }
    public void certificadocerto(int certo){
        try { 
            comandosdobd.executeUpdate("insert into certificado (marcada) values("+certo+")");
        } catch (SQLException ex) {
            Logger.getLogger(bancoDeQuestoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }

    public void certificadoerrado(int errado){
        try {
            comandosdobd.executeUpdate("insert into certificadoerrados (errado)values("+errado+")");
        } catch (SQLException ex) {
            Logger.getLogger(bancoDeQuestoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    public void apagarerrado(){
        try {
            comandosdobd.executeUpdate("delete from certificadoerrados;");
            comandosdobd.executeUpdate("alter table certificadoerrados auto_increment = 1;");
        } catch (SQLException ex) {
            Logger.getLogger(bancoDeQuestoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    public void apagarcerto(){
        try {
            comandosdobd.executeUpdate("delete from certificado;");  
            comandosdobd.executeUpdate("alter table certificado auto_increment = 1;");
        } catch (SQLException ex) {
            Logger.getLogger(bancoDeQuestoes.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    public void cadastro(String nome,int ndq)  {
        try {
            comandosdobd.executeUpdate("insert into cadastro (nome,quandequest) values('"+nome+"',"+ndq+");");
        } catch (SQLException ex) {
            Logger.getLogger(bancoDeQuestoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public void apagarcadastro(){
        try {
            comandosdobd.executeUpdate("delete from cadastro");
            comandosdobd.executeUpdate("alter table cadastro auto_increment = 1;");
            
        } catch (SQLException ex) {
            Logger.getLogger(bancoDeQuestoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ResultSet verificarcadastro(){
        try {
            rs=comandosdobd.executeQuery("select quandequest from cadastro");
        } catch (SQLException ex) {
            Logger.getLogger(bancoDeQuestoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    
    
    
    }
    public void ja_vi(int pegaid){
        try {
            comandosdobd.executeUpdate("update questoes set c_o_e='visto' where id="+pegaid+";");
        } catch (SQLException ex) {
            Logger.getLogger(bancoDeQuestoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
    }
    public void naovisto(){
        try {
            comandosdobd.executeUpdate("update questoes set c_o_e='nao visto';");
        } catch (SQLException ex) {
            Logger.getLogger(bancoDeQuestoes.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    public ResultSet buscarnome(){
        try {
            rs=comandosdobd.executeQuery("select nome from cadastro;");
        } catch (SQLException ex) {
            Logger.getLogger(bancoDeQuestoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return rs;
    }

    public ResultSet acertouquantas(){
        try {
            rs=comandosdobd.executeQuery("select marcada from certificado;");
        } catch (SQLException ex) {
            Logger.getLogger(bancoDeQuestoes.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    return rs;
    }
    public void inserirporarea(int ch,int cn,int lc,int mt){
        try {   
            comandosdobd.executeUpdate("insert into contador (ch,cn,lc,mt)values("+ch+","+cn+","+lc+","+mt+");");
        } catch (SQLException ex) {
            Logger.getLogger(bancoDeQuestoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void zeraporarea(){
        try {
            comandosdobd.executeUpdate("delete from contador;");
            comandosdobd.executeUpdate("alter table contador auto_increment = 1;");
          
        } catch (SQLException ex) {
            Logger.getLogger(bancoDeQuestoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public ResultSet consultaArea(){
        try {
            rs=comandosdobd.executeQuery("select * from contador;");
        } catch (SQLException ex) {
            Logger.getLogger(bancoDeQuestoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public void apagaquestoes(){
        try {
            comandosdobd.executeUpdate("delete from questoes;");
        } catch (SQLException ex) {
            Logger.getLogger(bancoDeQuestoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
