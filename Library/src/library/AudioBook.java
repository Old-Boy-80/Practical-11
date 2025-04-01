/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

/**
 *
 * @author Asus
 */
public class AudioBook extends Ebook {
    private double audioDUration;

    public AudioBook(double audioDUration, int fileSize, String format, String title, String author, int publicationYear) {
        super(fileSize, format, title, author, publicationYear);
        this.audioDUration = audioDUration;
    }

    public double getAudioDUration() {
        return audioDUration;
    }

    public void setAudioDUration(double audioDUration) {
        this.audioDUration = audioDUration;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAudio Duration: " + audioDUration;
    }
    
}
