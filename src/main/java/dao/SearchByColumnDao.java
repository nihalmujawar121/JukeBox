package dao;

import bean.Song;
import util.Connectors;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SearchByColumnDao extends Connectors
{
    public void searchByArtist(String Song)
    {

        Connection connection =  getConnection();
        ArrayList<bean.Song> list = new ArrayList<>();
        MusicPlayerSystemDao music = new MusicPlayerSystemDao();
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.printf ("%-10s\t%-25s\t%-15s\t%-20s\t%7s\t%14s\n","SONG ID","SONG NAME","DURATION","ARTIST NAME","ALBUM NAME","GENRE");
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        bean.Song song;
        try
        {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Songs WHERE artistName = '" + Song + "';");

            while (rs.next())
            {
                song = new Song(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
                list.add(song);
                System.out.printf("%-10s\t%-25s\t%-15s\t%-20s\t%7s\t%14s\n", rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6));
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
            }
        }
        catch (Exception e)
        {
           e.printStackTrace();
        }

        music.PlaySong(list);
    }

    public  ArrayList<Song> searchBySong(String Song)
    {
        Connection connection =  getConnection();
        ArrayList<bean.Song> list = new ArrayList<>();
        MusicPlayerSystemDao music=new MusicPlayerSystemDao();
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.printf ("%-10s\t%-25s\t%-15s\t%-20s\t%7s\t%14s\n","SONG ID","SONG NAME","DURATION","ARTIST NAME","ALBUM NAME","GENRE");
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        bean.Song song;
        try
        {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Songs WHERE songName = '" + Song + "';");
            while (rs.next())
            {
                song = new Song(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
                list.add(song);
                System.out.printf("%-10s\t%-25s\t%-15s\t%-20s\t%7s\t%14s\n", rs.getInt(1),rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6));
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        music.PlaySong(list);
        return list;
    }

    public ArrayList<Song> searchByGenre(String Song)
    {
        Connection connection =  getConnection();
        ArrayList<bean.Song> list = new ArrayList<>();
        MusicPlayerSystemDao music=new MusicPlayerSystemDao();
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.printf ("%-10s\t%-25s\t%-15s\t%-20s\t%7s\t%14s\n","SONG ID","SONG NAME","DURATION","ARTIST NAME","ALBUM NAME","GENRE");
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        bean.Song song;
        try
        {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Songs WHERE genre = '"+Song+"';");

            while (rs.next())
            {
                song = new Song(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
                list.add(song);
                System.out.printf("%-10s\t%-25s\t%-15s\t%-20s\t%7s\t%14s\n", rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6));
                System.out.println("-------------------------------------------------------------------------------------------------------------------");

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        music.PlaySong(list);
        return list;
    }


    public void playById(int Song)
    {

        Connection connection =  getConnection();
        ArrayList<bean.Song> list = new ArrayList<>();
        MusicPlayerSystemDao music=new MusicPlayerSystemDao();
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.printf ("%-10s\t%-25s\t%-15s\t%-20s\t%7s\t%14s\n","SONG ID","SONG NAME","DURATION","ARTIST NAME","ALBUM NAME","GENRE");
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        bean.Song song;
        try
        {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Songs WHERE songId = '" + Song + "';");

            while (rs.next())
            {
                song = new Song(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
                list.add(song);
                System.out.printf("%-10s\t%-25s\t%-15s\t%-20s\t%7s\t%14s\n", rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6));
                System.out.println("-------------------------------------------------------------------------------------------------------------------");

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        music.PlaySong(list);
    }

}
