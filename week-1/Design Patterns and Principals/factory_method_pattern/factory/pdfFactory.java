package factory;

import document.Document;
import document.PdfDocument;

public class pdfFactory extends DocumentFactory {

    public Document createDocument() {
        return new PdfDocument();
    }
}