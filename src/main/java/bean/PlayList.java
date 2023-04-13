package bean;

public class PlayList
{

    private int playlistId;
    private String playlistName;



    public PlayList( int playlistId, String playlistName)
    {

        this.playlistId = playlistId;
        this.playlistName = playlistName;

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


    @Override
    public String toString() {
        return "PlayList{" +
                "playlistId=" + playlistId +
                ", playlistName='" + playlistName + '\'' +
                '}';
    }
}
