package com.itextpdf.kernel.pdf.annot;

import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDictionary;
import com.itextpdf.kernel.pdf.PdfName;

public class PdfCircleAnnotation extends PdfMarkupAnnotation {

    public PdfCircleAnnotation(Rectangle rect) {
        super(rect);
    }

    public PdfCircleAnnotation(PdfDictionary pdfObject) {
        super(pdfObject);
    }

    @Override
    public PdfName getSubtype() {
        return PdfName.Circle;
    }
}