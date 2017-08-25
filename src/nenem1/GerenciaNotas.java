package nenem1;


import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jairo Chaves
 */
public class GerenciaNotas 
{
    public static void main(String args[])
    {
        NotasDAO notas = new NotasDAO();
        
        System.out.println("ID: "+notas.getId());
        System.out.println("Nome: "+notas.getNome());
        
    }
    
}
