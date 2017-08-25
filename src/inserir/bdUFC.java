
package inserir;

import java.sql.*;
import java.util.logging.*;
import javax.swing.*;

/**
 *
 * @author Jairo Chaves
 */
public class bdUFC {
    /*declaração das variáveis */
     
    private Connection conectarbd;
    private Statement comandos;
    private ResultSet retornavalor;
    
    public bdUFC(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                conectarbd=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/bdenem", "root", "bancodedados");
                comandos=conectarbd.createStatement();
                
            } catch (SQLException ex) {
                Logger.getLogger(bdUFC.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "banco de dados não encontrado");
        }
    
    
    }
    //áki é feita  a inserção
    public void inserirbd(String campus,String cursos, String modalidades,float ntdecorte ){
        try {
            comandos.executeUpdate("insert into ufc values('"+campus+"','"+cursos+"','"+modalidades+"',"+ntdecorte+");");
        } catch (SQLException ex) {
            Logger.getLogger(bdUFC.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    //áki  começa a ser feita a consulta
    public ResultSet retornarparaprograma(float media){
        try {
           // retornavalor=comandos.executeQuery("select nomeCurso from ufc;");
           //retornavalor=comandos.executeQuery("select * from ufc where notadeCorte<="+media+";");
           retornavalor=comandos.executeQuery("select * from ufc2 where notadeCorteSC<="+media+";");
        } catch (SQLException ex) {
            Logger.getLogger(bdUFC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return retornavalor;
    
    }
   //áki termina a consulta
    
    public boolean cursoexiste(String nomec, String noec) throws SQLException{
        boolean resposta=false;
        retornavalor=comandos.executeQuery("select * from ufc where nomeCurso='"+nomec+"' and '"+noec+"' ;");
        if (retornavalor.next()){
        resposta=true;
        }
        
        return resposta;
    
    }

    public void inserir_UFC2(int id,String municipio, String curso,int vagas,float primeira,float segunda){
        try {
            comandos.executeUpdate("insert into ufc2 values("+id+",'"+municipio+"','"+curso+"',"+vagas+","+primeira+","+segunda+");");
        } catch (SQLException ex) {
            Logger.getLogger(bdUFC.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }

}
