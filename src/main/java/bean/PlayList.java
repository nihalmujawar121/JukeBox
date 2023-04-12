package bean;

public class PlayList
{

    private int playlistId;
    private String playlistName;
    private String creationDate;


    public PlayList( int playlistId, String playlistName, String creationDate)
    {

        this.playlistId = playlistId;
        this.playlistName = playlistName;
        this.creationDate = creationDate;
    }

    public PlayList()
    {

    }

    public int getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(int playlistId) {
        this.playlistId = playlistId;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString()
    {
        return "PlayList{" +
                "playlistId=" + playlistId +
                ", playlistName='" + playlistName + '\'' +
                ", creationDate='" + creationDate + '\'' +
                '}';
    }
}
