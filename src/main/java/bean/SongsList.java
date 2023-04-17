package bean;

import java.util.Objects;

public class SongsList
{
    private int listId;

    private int id;
    private int playListId;
    public SongsList()
    {

    }



    public int getListId() {
        return listId;
    }

    public void setListId(int listId) {
        this.listId = listId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                ", songId=" + id +
                ", playListId=" + playListId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SongsList songsList = (SongsList) o;
        return listId == songsList.listId && id == songsList.id && playListId == songsList.playListId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(listId, id, playListId);
    }
        
}
