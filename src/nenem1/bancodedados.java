package nenem1;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 * @autor Jairo Chaves
 */
public class bancodedados {
    Connection conexaobd;
    Statement comandosdobd;
    ResultSet retorna;
    
    public bancodedados() throws ClassNotFoundException{
        
            Class.forName("com.mysql.jdbc.Driver");
        try {
            conexaobd=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/bdenem", "root", "bancodedados");
            comandosdobd=conexaobd.createStatement();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro na conexão com o banco de dados");
        }
           
               
        } 
        
    public void nomesalunos(String n){
        try {
            comandosdobd.executeUpdate("insert into nomes values('"+n+"');");
        } catch (SQLException ex) {
            Logger.getLogger(bancodedados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void cadastrodenotas(String nome,String turma,String a,String b,String c,String d) throws SQLException{
         
        comandosdobd.executeUpdate("insert into notas values('"+nome+"','"+turma+"','"+a+"','"+b+"','"+c+"','"+d+"');");
          
    }
    public boolean alunoExiste(String nome) throws SQLException{
     boolean resposta=false;
     retorna=comandosdobd.executeQuery("select * from notas where nome='"+nome+"';");
     if(retorna.next()){
         resposta=true;
     
     } 
    
    
     return resposta;
    }
  
       
       
   
            
    
}
