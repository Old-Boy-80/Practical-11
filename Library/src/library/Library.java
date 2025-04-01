/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library;

/**
 *
 * @author Asus
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HardcoverBook hardcoverBook = new HardcoverBook("Leather", 218, "The Great Gatsby", "F. Scott Fitzgerald", 1925);
        System.out.println(hardcoverBook);

        System.out.println("\n---\n");

        // Create PaperbackBook object (Level 3)
        PaperbackBook paperbackBook = new PaperbackBook("Glossy", 328, "1984", "George Orwell", 1949);
        System.out.println(paperbackBook);

        System.out.println("\n---\n");

        // Create EBook object (Level 2)
//        EBook eBook = new EBook(3, "PDF", "Digital Fortress", "Dan Brown", 1998);
//        System.out.println(eBook);

        System.out.println("\n---\n");

        // Create AudioBook object (Level 3)
//        AudioBook audioBook = new AudioBook(15, 10, "MP3", "The Hobbit", "J.R.R. Tolkien", 1937, 15.0);
//        System.out.println(audioBook);
    }
    
}
