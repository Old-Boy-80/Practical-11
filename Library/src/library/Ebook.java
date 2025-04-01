/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

/**
 *
 * @author Asus
 */
public class Ebook extends Book {
    private int fileSize;
    private String format;

    public Ebook(int fileSize, String format, String title, String author, int publicationYear) {
        super(title, author, publicationYear);
        this.fileSize = fileSize;
        this.format = format;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFile Size: " + fileSize + " MB\nFormat: " + format;
    }
    
    
}
