package by.teachmeskills.novik.lesson7.homework.register;

public abstract class Documentt implements Printable {

    private int documentNumber;
    private String documentDate;

    public Documentt(int documentNumber, String documentDate) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(String documentDate) {
        this.documentDate = documentDate;
    }
}
