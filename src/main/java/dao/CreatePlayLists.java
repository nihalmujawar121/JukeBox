package dao;


import util.Connectors;

import java.sql.*;




public class CreatePlayLists extends Connectors


{
    public Boolean createPList(int playlistId, int songId) {


        boolean insert = false;
        Connection connection = getConnection();
        try {
            Statement st = connection.createStatement();
            insert = st.execute("insert into SongsList(songId,playlistId) values('" + songId + "'," + playlistId + ");");
        }
        catch (Exception exception)
        {
            exception.printStackTrace();

        }
        return insert;
    }
}