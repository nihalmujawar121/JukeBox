package dao;

import bean.PlayList;
import bean.Songs;
import bean.SongsList;
import dbconnection.Connectors;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllDaos extends Connectors {
    Scanner sc = new Scanner(System.in);


    public ArrayList<Songs> getResultSet()
    {
        Connection con = getConnection();
        ArrayList<Songs> list = new ArrayList<>();


        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.printf ("%-7s\t%-25s\t%-15s\t%-20s\t%7s\t%14s\n", "SONG ID",  "SONG NAME", "DURATION", "ARTIST NAME", "ALBUM NAME", "GENRE");
        System.out.println("------------------------------------------------------------------------------------------------------------");
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from Songs");
            while (rs.next()) {
                Songs s = new Songs();

                s.setSongId(rs.getInt(1));
                s.setSongName(rs.getString(2));
                s.setDuration(rs.getString(3));
                s.setArtistName(rs.getString(4));
                s.setAlbumName(rs.getString(5));
                s.setGenre(rs.getString(6));
                s.setUrl(rs.getString(7));
                list.add(s);

                System.out.printf("%-5s\t%-25s\t%-15s\t%-20s\t%7s\t%14s\n", rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6));
                System.out.println("------------------------------------------------------------------------------------------------------------");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }

    public List<PlayList> getResultSet1() {
        Connection con = getConnection();
        List<PlayList> list = new ArrayList<>();
                System.out.println("------------------------------------------------------------------------------------------------");
                System.out.printf ("%-5s\t%-25s\t%-15s\n", "PLAYLIST ID", "PLAYLIST NAME");
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from PlayList");
            while (rs.next()) {
                PlayList s = new PlayList();
                s.setPlaylistId(rs.getInt(1));
                s.setPlaylistName(rs.getString(2));


                list.add(s);
                System.out.printf ("%-5s\t%-25s\t%-15s\n", rs.getInt(1),rs.getString(2));
                System.out.println("-------------------------------------------------------------------------------------------------");

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public List<SongsList> getResultSet2() {
        Connection con = getConnection();
        List<SongsList> list = new ArrayList<>();
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.printf ("%-5s\t%-25s\t%-15s\n", "LIST ID", "SONG ID", "PLAYLIST ID");
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from SongsList");
            while (rs.next()) {
                SongsList s = new SongsList();
                s.setListId(rs.getInt(1));
                s.setSongId(rs.getInt(2));
                s.setPlayListId(rs.getInt(3));

                list.add(s);
                System.out.printf ("%-5s\t%-25s\t%-15s\n", rs.getInt(1),rs.getInt(2),rs.getInt(3));
                System.out.println("----------------------------------------------------------------------------------------------");

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
//    public List<PlayList> getAllDetails() throws SQLException
//    {
//        Connection con=getConnection();
//        List<PlayList>list = new ArrayList<>();
//        String sql = "SELECT * FROM PlayList";
//        //Statement object is used to execute SQL statement
//        Statement stmt = con.createStatement();
//
//        //ResultSet returns a table representing database.
//        ResultSet rs = stmt.executeQuery(sql);
//
//        while (rs.next()){
//            int playlistId = rs.getInt(1);
//            String playlist_Name = rs.getString(2);
//
//            //Now Playlist object is calling the Parameterized Constructor and storing the values in the list
//            PlayList plays = new PlayList(playlistId,playlist_Name);
//            list.add(plays);
//        }
//        return list;

   // }

//    public int insertValues()
//    {
//
//        int res=0;
//        Connection con=getConnection();
//        try
//        {
//            Statement st= con.createStatement();
//
//            res=st.executeUpdate("Insert into Songs Values(12,'Hossana','00:05:31','A R Rehman','Ek Deewana Tha','Romance','src/main/resources/Hossana.wav');");
//        }
//        catch (SQLException e)
//        {
//            System.out.println(e);
//        }
//        return res;
//    }

//    public void deleteStudentData()
//    {
//        Connection con = getConnection();
//        try
//        {
//            Statement s= con.createStatement();
//            s.executeUpdate("delete from Songs where songId = 2 ;");
//
//        }
//        catch (SQLException e)
//        {
//            System.out.println(e);
//        }
//    }
//
//    public void updateStudentData()
//    {
//        Connection con = getConnection();
//        try
//        {
//            Statement s= con.createStatement();
//            s.executeUpdate("Update  Songs set songName ='Let Me Love' where songName = 'Chikeny Chameli' ;");
//
//        }
//        catch (SQLException e)
//        {
//            System.out.println(e);
//        }
//    }

    


}