package serching;

import bean.Songs;
import dao.MusicPlayerSystem;
import dbconnection.Connectors;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SearchByColumn extends Connectors
{


    public ArrayList<Songs> searchByArtist(String Song)
    {

        Connection con =  getConnection();
        ArrayList<Songs> list = new ArrayList<>();
        MusicPlayerSystem m=new MusicPlayerSystem();
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.printf ("%-10s\t%-25s\t%-15s\t%-20s\t%7s\t%14s\n","SONG ID","SONG NAME","DURATION","ARTIST NAME","ALBUM NAME","GENRE");
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        Songs s = null;
        try
        {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Songs WHERE artistName = '" + Song + "';");

            while (rs.next())
            {
                s = new Songs(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
                list.add(s);
                System.out.printf("%-10s\t%-25s\t%-15s\t%-20s\t%7s\t%14s\n", rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6));
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        m.PlaySong(list);
        return list;
    }

    public  ArrayList<Songs> searchBySong(String Song)
    {
        Connection con =  getConnection();
        ArrayList<Songs> list = new ArrayList<>();
        MusicPlayerSystem m=new MusicPlayerSystem();
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.printf ("%-10s\t%-25s\t%-15s\t%-20s\t%7s\t%14s\n","SONG ID","SONG NAME","DURATION","ARTIST NAME","ALBUM NAME","GENRE");
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        Songs s = null;
        try
        {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Songs WHERE songName = '" + Song + "';");
            while (rs.next())
            {
                s = new Songs(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
                list.add(s);
                System.out.printf("%-10s\t%-25s\t%-15s\t%-20s\t%7s\t%14s\n", rs.getInt(1),rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6));
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        m.PlaySong(list);
        return list;
    }

    public ArrayList<Songs> searchByGenre(String Song)
    {
        Connection con =  getConnection();
        ArrayList<Songs> list = new ArrayList<>();
        MusicPlayerSystem m=new MusicPlayerSystem();
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.printf ("%-10s\t%-25s\t%-15s\t%-20s\t%7s\t%14s\n","SONG ID","SONG NAME","DURATION","ARTIST NAME","ALBUM NAME","GENRE");
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        Songs s = null;
        try
        {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Songs WHERE genre = '"+Song+"';");

            while (rs.next())
            {
                s = new Songs(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
                list.add(s);
                System.out.printf("%-10s\t%-25s\t%-15s\t%-20s\t%7s\t%14s\n", rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6));
                System.out.println("-------------------------------------------------------------------------------------------------------------------");

            }
        }catch (Exception e)
        {
            System.out.println(e);
        }
        m.PlaySong(list);
        return list;
    }


    public ArrayList<Songs> playById(int Song)
    {

        Connection con =  getConnection();
        ArrayList<Songs> list = new ArrayList<>();
        MusicPlayerSystem m=new MusicPlayerSystem();
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.printf ("%-10s\t%-25s\t%-15s\t%-20s\t%7s\t%14s\n","SONG ID","SONG NAME","DURATION","ARTIST NAME","ALBUM NAME","GENRE");
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        Songs s = null;
        try
        {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Songs WHERE songId = '" + Song + "';");

            while (rs.next())
            {
                s = new Songs(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
                list.add(s);
                System.out.printf("%-10s\t%-25s\t%-15s\t%-20s\t%7s\t%14s\n", rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6));
                System.out.println("-------------------------------------------------------------------------------------------------------------------");

            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        m.PlaySong(list);
        return list;
    }

}
