/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

/**
 *
 * @author Asus
 */
public class PaperbackBook extends PrintedBook {
    private String paperQuality;

    public String getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }

    public PaperbackBook(String paperQuality, int pageCount, String title, String author, int publicationYear) {
        super(pageCount, title, author, publicationYear);
        this.paperQuality = paperQuality;
    }

    @Override
    public String toString() {
        return super.toString() + "\npaperQuality: " + paperQuality ;
    }
    
}
