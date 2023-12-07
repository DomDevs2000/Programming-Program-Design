
/**
 * Write a description of class Book here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class AudioBook extends Item implements Playable, Authored {
    private String author;
    private String reader;
    private int pages;
    private String platform;

    /**
     * Constructor for objects of class Book
     */
    public AudioBook(String tle, String auth, String read, int pgs, int tme) {
        super(tle, tme);
        author = auth;
        reader = read;
        pages = pgs;
        platform = "PC";
    }

    public String toString() {
        String s = super.toString();
        s = s + "Author:    " + author;
        s = s + "\nReader:    " + reader;
        s = s + "\nPages: " + pages;
        return s;
    }

    public String getMaker() {
        return reader;
    }

    public String getAuthor() {
        return author;
    }

    public boolean hasAuthor() {
        return true;
    }

    public void changePlatform(String plat) {
        platform = plat;
    }

    public boolean canPlayOnPC() {
        boolean playability = false;
        if (platform.equals("PC")) {
            playability = true;
        }
        return playability;
    }

    public void play() {
        System.out.println(getTitle() + "... now playing");
    }

}
