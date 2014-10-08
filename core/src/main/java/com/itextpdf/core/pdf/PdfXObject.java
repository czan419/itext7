package com.itextpdf.core.pdf;

public class PdfXObject extends PdfObjectWrapper<PdfStream> {

    public PdfXObject(PdfDocument document) {
        this(new PdfStream(document), document);
    }

    public PdfXObject(PdfStream pdfObject, PdfDocument pdfDocument) {
        super(pdfObject, pdfDocument);
    }

    static public PdfXObject makeXObject(PdfStream stream, PdfDocument document) {
        return null;
    }

}
