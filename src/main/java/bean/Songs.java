package bean;

public class Songs implements Comparable<Songs>
{
    private int songId;
    private String songName;
    private String duration;
    private String artistName;
    private String albumName;
    private String genre;
    private String url;

    public Songs(int songId, String songName, String duration, String artistName, String albumName, String genre, String url) {
        this.songId = songId;
        this.songName = songName;

        this.duration = duration;
        this.artistName = artistName;
        this.albumName = albumName;
        this.genre = genre;
        this.url = url;
    }
    public Songs()
    {

    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }


    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Songs{" +
                "songId=" + songId +
                ", songName='" + songName + '\'' +
                ", duration='" + duration + '\'' +
                ", artistName='" + artistName + '\'' +
                ", albumName='" + albumName + '\'' +
                ", genre='" + genre + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    @Override
    public int compareTo(Songs o) {
        return this.songName.compareTo(o.getSongName());
    }
}
