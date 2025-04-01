/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

/**
 *
 * @author Asus
 */
public class HardcoverBook extends PrintedBook {
    private String coverMaterial;

    public HardcoverBook(String coverMaterial, int pageCount, String title, String author, int publicationYear) {
        super(pageCount, title, author, publicationYear);
        this.coverMaterial = coverMaterial;
    }

    public String getCoverMaterial() {
        return coverMaterial;
    }

    public void setCoverMaterial(String coverMaterial) {
        this.coverMaterial = coverMaterial;
    }

    @Override
    public String toString() {
        return super.toString()+"HardcoverBook{" + "coverMaterial=" + coverMaterial + '}';
    }
    
    
}
