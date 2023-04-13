package dao;

import bean.PlayList;
import bean.Songs;
import bean.SongsList;
import dbconnection.Connectors;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreatePlayLists extends Connectors {
    public Boolean createPList(String playlistname, int songId) {
        MusicPlayerSystem m = new MusicPlayerSystem();


        boolean insert = false;
        Connection con = getConnection();
        try {
            Statement st = con.createStatement();
            insert = st.execute("insert into PlayList(playlistname,songId) values('" + playlistname + "'," + songId + ");");
        } catch (Exception e) {
            System.out.println(e);

        }
        return insert;
    }
}