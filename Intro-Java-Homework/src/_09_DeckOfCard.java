import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Font;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.*;

import java.io.FileOutputStream;

public class _09_DeckOfCard {

	public static void main(String[] args) {
		Document document = new Document();
		
		try {
			PdfWriter.getInstance(document, new FileOutputStream("Deck-Of-Cards.pdf"));
			
			String[] suits = { "\u2663", "\u2666", "\u2665", "\u2660" };
			String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
					"Q", "K", "A" };	
			
			document.open();
			Paragraph paragraph = new Paragraph();

			PdfPTable table = new PdfPTable(4);
			table.setWidthPercentage(60);
			table.getDefaultCell().setFixedHeight(120);
			table.getDefaultCell().setBorderColor(BaseColor.BLACK);
			table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
            
			BaseFont unicode = BaseFont.createFont("c:/windows/fonts/arialuni.ttf", BaseFont.IDENTITY_H,
					BaseFont.EMBEDDED, true);
			Font black = new Font(unicode, 18, 0, BaseColor.BLACK);
			Font red = new Font(unicode, 18, 0, BaseColor.RED);
			
			String card = "";
			
			for (int i = 0; i < rank.length; i++) {
				for (int j = 0; j < suits.length; j++) {
					card = rank[i] + suits[j];
					
					if (j == 0 || j == 3) {
						table.addCell(new Paragraph(card, black));
					}
					else {
						table.addCell(new Paragraph(card, red));
					}
				}
			}
			document.add(table);
			document.close();
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
