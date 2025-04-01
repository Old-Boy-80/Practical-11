/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

/**
 *
 * @author Asus
 */
public class PrintedBook extends Book {
    private int pageCount;

    public PrintedBook(int pageCount, String title, String author, int publicationYear) {
        super(title, author, publicationYear);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    
    @Override
    public String toString() {
        return super.toString() + "PrintedBook{" + "pageCount=" + pageCount + '}';
    }
    
}
