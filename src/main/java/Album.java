import java.io.Serializable;
import java.util.Date;

public class Album implements Serializable {
   private int id;
  private  String albumName;
  private String artistName;
  private Date releaseDate;
  private int salesInMillions;
  private String genre;

    public Album() {
    }

    public Album(int id, String albumName, String artistName, Date releaseDate, int salesInMillions, String genre) {
        this.id = id;
        this.albumName = albumName;
        this.artistName = artistName;
        this.releaseDate = releaseDate;
        this.salesInMillions = salesInMillions;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getSalesInMillions() {
        return salesInMillions;
    }

    public void setSalesInMillions(int salesInMillions) {
        this.salesInMillions = salesInMillions;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
