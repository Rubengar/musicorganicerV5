/**
 * Store the details of a music track,
 * such as the artist, title, and file name.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class Track
{
    // The artist.
    private String artist;
    // The track's title.
    private String title;
    // Where the track is stored.
    private String filename;
    //Contador
    private int playCount;
    //guarda el a�o de la cancion
    private int year;
    
    /**
     * Constructor for objects of class Track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    public Track(String artist, String title, String filename, int a�o)
    {
        setDetails(artist, title, filename, year);
        playCount = 0;
    }
    
    /**
     * Constructor for objects of class Track.
     * It is assumed that the file name cannot be
     * decoded to extract artist and title details.
     * @param filename The track file. 
     */
    public Track(String filename)
    {
        setDetails("unknown", "unknown", filename,0);
    }
    
    /**
     * Return the artist.
     * @return The artist.
     */
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * Return the title.
     * @return The title.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Return the file name.
     * @return The file name.
     */
    public String getFilename()
    {
        return filename;
    }
    public int getYear()
    {
        return year;
    }
    public void changeYear(int nuevoYear)
    {
        year = nuevoYear;
    }
        
    /**
     * Return details of the track: artist, title and file name.
     * @return The track's details.
     */
    public String getDetails()
    {
        return artist + ": " + title + "  (file: " + filename + ")"+ year;
    }
    
    /**
     * Set details of the track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    private void setDetails(String artist, String title, String filename, int year )
    {
        this.artist = artist;
        this.title = title;
        this.filename = filename;
        this.year = year;
    }
    /**
     * Metodo que resetea el contador
     */
    public void resetCount()
    {
        playCount = 0;
    }
    /**
     * Metodo que incrementa el contador
     */
    public void sumCount()
    {
        playCount++;
    }
    public int getPlayCount()
    {
     return playCount;
    
    }
    
}
