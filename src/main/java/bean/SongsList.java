package bean;

public class SongsList
{
    private int listId;

    private int songId;
    private int playListId;
    public SongsList()
    {

    }

    public SongsList(int listId, int songId, int playListId) {
        this.listId = listId;
        this.songId = songId;
        this.playListId = playListId;
    }

    public int getListId() {
        return listId;
    }

    public void setListId(int listId) {
        this.listId = listId;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public int getPlayListId() {
        return playListId;
    }

    public void setPlayListId(int playListId) {
        this.playListId = playListId;
    }

    @Override
    public String toString() {
        return "SongsList{" +
                "listId=" + listId +
                ", songId=" + songId +
                ", playListId=" + playListId +
                '}';
    }
}
