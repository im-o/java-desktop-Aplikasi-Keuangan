import java.io.File; 
import java.io.IOException;  

import org.apache.pdfbox.pdmodel.PDDocument; 
import org.apache.pdfbox.pdmodel.PDPage; 
import org.apache.pdfbox.pdmodel.PDPageContentStream; 
import org.apache.pdfbox.pdmodel.font.PDType1Font;  

public class PrintSupport {  
   public static void main(String args[]) throws IOException {     
      
      //Loading an existing document 
      PDDocument doc = PDDocument.load(new File("/icons/jav.pdf")); 

      //Creating a PDF Document 
      PDPage page = doc.getPage(0);       
      PDPageContentStream contentStream = new PDPageContentStream(doc, page); 
      
      //Begin the Content stream 
      contentStream.beginText(); 

      //Setting the font to the Content stream  
      contentStream.setFont( PDType1Font.TIMES_ROMAN, 16 ); 

      //Setting the position for the line 
      contentStream.newLineAtOffset(25, 725 ); 
      String text = "This is an example of adding text to a page in the pdf document. "
              + "we can add as many lines as we want like this using the draw string method "
              + "of the ContentStream class"; 

      //Adding text in the form of string 
      contentStream.showText(text); 

      //Ending the content stream 
      contentStream.endText(); 
      System.out.println("Content added");       

      //Closing the content stream 
      contentStream.close();      

      //Saving the document  
      doc.save(new File("/icons/jav.pdf")); 

      //Closing the document  
      doc.close();  
   }  
} 