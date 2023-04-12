package dao;

import bean.PlayList;
import dbconnection.Connectors;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

public class CreatePlayList extends Connectors
{
    public Boolean createPlayList(int songId,int playlistId)
    {

        boolean insert = false;
        try{
            Connection con= getConnection();
            Statement st= con.createStatement();
            insert=st.execute("insert into SongsList(songId,playlistId) values("+songId+","+playlistId+");");

        }
        catch(Exception e)
        {
            System.out.println(e);

        }
        return insert;
    }
}
