package bean;

import java.util.Objects;

public class Song
{
    private int songId;
    private String songName;
    private String duration;
    private String artistName;
    private String albumName;
    private String genre;
    private String url;

    public Song(int songId, String songName, String duration, String artistName, String albumName, String genre, String url) {
        this.songId = songId;
        this.songName = songName;

        this.duration = duration;
        this.artistName = artistName;
        this.albumName = albumName;
        this.genre = genre;
        this.url = url;
    }
    public Song()
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
        return "Song{" +
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return songId == song.songId && Objects.equals(songName, song.songName) && Objects.equals(duration, song.duration) && Objects.equals(artistName, song.artistName) && Objects.equals(albumName, song.albumName) && Objects.equals(genre, song.genre) && Objects.equals(url, song.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(songId, songName, duration, artistName, albumName, genre, url);
    }
}
