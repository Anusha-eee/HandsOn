package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class DocumentFactoryTest {
    @Test
    public void testWordDocumentCreation() {
        DocumentFactory factory = new WordDocumentFactory();
        Document doc = factory.createDocument();
        assertNotNull(doc);
        assertTrue(doc instanceof WordDocument);
    }
    @Test
    public void testPdfDocumentCreation() {
        DocumentFactory factory = new PdfDocumentFactory();
        Document doc = factory.createDocument();
        assertNotNull(doc);
        assertTrue(doc instanceof PdfDocument);
    }
    @Test
    public void testExcelDocumentCreation() {
        DocumentFactory factory = new ExcelDocumentFactory();
        Document doc = factory.createDocument();
        assertNotNull(doc);
        assertTrue(doc instanceof ExcelDocument);
    }
}
