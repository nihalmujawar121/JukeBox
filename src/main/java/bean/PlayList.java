package bean;

import java.util.Objects;

public class PlayList
{

    private int playlistId;
    private String listName;



    public PlayList( int playlistId, String listName)
    {

        this.playlistId = playlistId;
        this.listName = listName;

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

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }


    @Override
    public String toString() {
        return "PlayList{" +
                "playlistId=" + playlistId +
                ", playlistName='" + listName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayList playList = (PlayList) o;
        return playlistId == playList.playlistId && Objects.equals(listName, playList.listName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playlistId, listName);
    }
}
