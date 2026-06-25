package FactoryMethodPattern;


public class FactoryTest {
	public static void main(String[] args) {
		WordFactory wordFactory=new WordFactory();
		Document word=wordFactory.createDocument();
		word.open();
		
		DocumentFactory pdfFactory = new PdfFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.open();
        
        DocumentFactory excelFactory = new ExcelFactory();
        Document excel = excelFactory.createDocument();
        excel.open();
	}
}
