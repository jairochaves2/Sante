
package nenem2.criadordepdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import javax.swing.JOptionPane;


/**
 *
 * @author Jairo Chaves
 */
public class pdf {

    String hj;
    
    
    public void criarPdfAluno(/*dados =>*/String nome,String turma,String serie,/* campos =>*/String campoch,String campocn,String campolc,String campomt,String campom,String banco)
                                {
//    JOptionPane.showMessageDialog(null, nome+"."+turma+"."+serie);
        
        try {
            
            
            Document documento=new Document(PageSize.A4,65,65,65,65);
            OutputStream local=new FileOutputStream("c://eeep.lgfm.redes.2011/notaenem/pdf/seus_pdf's/"+nome+"_"+turma+"_"+serie+".pdf");
            
            PdfWriter.getInstance(documento, local);
            documento.open();
            
            //imagem nenem
            //Image imagem1= Image.getInstance("c://eeep.lgfm.redes.2011/notaenem/files/IMAGENS/ícone.png");
            //imagem1.scaleAbsolute(30,30);
            //documento.add(imagem1);
            
            Paragraph paragrafo11=new Paragraph("            RELATÓRIO DO "+"S.A.N.T.E",FontFactory.getFont(FontFactory.TIMES,24, Font.BOLD, new CMYKColor(255, 0, 0, 0))); 
            documento.add(paragrafo11);
 
            Paragraph paragrafodeespaço1=new Paragraph("");
            paragrafodeespaço1.setSpacingBefore(20);
            
            Paragraph paragrafodeespaço2=new Paragraph("");
            paragrafodeespaço2.setSpacingBefore(90);
            documento.add(paragrafodeespaço1);
            
            
            
            
            //nome aluno
            Paragraph pNome=new Paragraph("Nome : "+nome,FontFactory.getFont(FontFactory.HELVETICA,14, Font.NORMAL, new CMYKColor(0, 022, 0, 255)));
            documento.add(pNome);
            
            //turma
            Paragraph pTurma=new Paragraph("Turma : "+turma,FontFactory.getFont(FontFactory.HELVETICA,14, Font.NORMAL, new CMYKColor(0, 022, 0, 255)));
            documento.add(pTurma);
            
            //serie
            Paragraph pSerie=new Paragraph("Serie : "+serie,FontFactory.getFont(FontFactory.HELVETICA,14, Font.NORMAL, new CMYKColor(0, 022, 0, 255)));
            documento.add(pSerie);
            
            //espaço
            documento.add(paragrafodeespaço1);
            
            //nota de ch
            Paragraph pCH=new Paragraph("               "+"Nota de Ciencias Humanas :"+campoch,FontFactory.getFont(FontFactory.COURIER,13, Font.BOLD, new CMYKColor(225, 100, 0,100)));
            documento.add(pCH);
            
            //nota de cn
            Paragraph pCN=new Paragraph("              "+"Nota de Ciencias da Natureza :"+campocn,FontFactory.getFont(FontFactory.COURIER,13, Font.BOLD, new CMYKColor(225, 100, 0,100)));
            documento.add(pCN);
            
            //nota lc
            Paragraph pLC=new Paragraph("               "+"Nota de Linguagens e Código :"+campolc,FontFactory.getFont(FontFactory.COURIER,13, Font.BOLD, new CMYKColor(225, 100, 0,100)));
            documento.add(pLC);
            
            //nota matemática
            Paragraph pMT=new Paragraph("                   "+"Nota de Matemática :"+campomt,FontFactory.getFont(FontFactory.COURIER,13, Font.BOLD, new CMYKColor(225, 100, 0,100)));
            documento.add(pMT);
            
            //media
            Paragraph pMedia=new Paragraph("             "+"A Sua Média Sem a Redação foi :"+campom,FontFactory.getFont(FontFactory.COURIER,13, Font.BOLD, new CMYKColor(225, 100, 0,100)));
            documento.add(pMedia);
            
            documento.add(paragrafodeespaço1);
            
            //título
            Paragraph pTitulo=new Paragraph("    Com essa média você entraria nos seguintes cursos da UFC: ", FontFactory.getFont(FontFactory.HELVETICA,15,Font.BOLD));
            
            documento.add(pTitulo);
            documento.add(paragrafodeespaço1);
            
            //TESTE PRÓXIMO
            Paragraph testee=new Paragraph("    "+banco, FontFactory.getFont(FontFactory.HELVETICA,10,Font.NORMAL, new CMYKColor(0, 90, 10, 225)));
            documento.add(testee);
            
            
            //fechando conexões
            documento.close();
            local.close();
            JOptionPane.showMessageDialog(null, "Concluído com sucesso! "+"\n"+"Foi salvo em: "+"c>eeep.lgfm.redes.2011>notaenem>pdf>seus_pdf's","S.A.N.T.E",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na criação do documento, Entre em contato com \no desenvolvedor no seguinte email:\njairochaves2@gmail.com");
            
        }
    
    
    }
    
}
