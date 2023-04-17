package dao;


import bean.Song;
import util.Connectors;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class AllDaos extends Connectors {



    public ArrayList<Song> getResultSet()
    {
        Connection con = getConnection();
        ArrayList<Song> list = new ArrayList<>();


        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.printf ("%-7s\t%-25s\t%-15s\t%-20s\t%7s\t%14s\n", "SONG ID",  "SONG NAME", "DURATION", "ARTIST NAME", "ALBUM NAME", "GENRE");
        System.out.println("------------------------------------------------------------------------------------------------------------");
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from Songs");
            while (rs.next()) {
                Song s = new Song();

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
            e.printStackTrace();
        }

        return list;
    }

//    public List<PlayList> getResultSet1()
//    {
//        Connection con = getConnection();
//        List<PlayList> list = new ArrayList<>();
//                System.out.println("------------------------------------------------------------------------------------------------");
//                System.out.printf ("%-5s\t%-25s\t%-15s\n", "PLAYLIST ID", "PLAYLIST NAME");
//        try {
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery("Select * from PlayList");
//            while (rs.next()) {
//                PlayList s = new PlayList();
//                s.setPlaylistId(rs.getInt(1));
//                s.setPlaylistName(rs.getString(2));
//
//
//                list.add(s);
//
//                System.out.printf ("%-5s\t%-25s\t%-15s\n", rs.getInt(1),rs.getString(2));
//                System.out.println("-------------------------------------------------------------------------------------------------");
//
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return list;
//    }
//
//    public List<SongsList> getResultSet2() {
//        Connection con = getConnection();
//        List<SongsList> list = new ArrayList<>();
//        System.out.println("------------------------------------------------------------------------------------------------");
//        System.out.printf ("%-5s\t%-25s\t%-15s\n", "LIST ID", "SONG ID", "PLAYLIST ID");
//        try {
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery("Select * from SongsList");
//            while (rs.next()) {
//                SongsList s = new SongsList();
//                s.setListId(rs.getInt(1));
//                s.setSongId(rs.getInt(2));
//                s.setPlayListId(rs.getInt(3));
//
//                list.add(s);
//                System.out.printf ("%-5s\t%-25s\t%-15s\n", rs.getInt(1),rs.getInt(2),rs.getInt(3));
//                System.out.println("----------------------------------------------------------------------------------------------");
//
//            }
//        } catch (SQLException exception) {
//            exception.printStackTrace();
//        }
//        return list;
//    }

}