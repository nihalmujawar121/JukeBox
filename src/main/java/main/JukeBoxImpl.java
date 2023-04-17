package main;

import bean.Song;
import dao.AllDaos;
import dao.CreatePlayLists;
import dao.MusicPlayerSystem;
import dao.SearchByColumn;

import java.util.ArrayList;

import java.util.Scanner;

public class JukeBoxImpl
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        AllDaos dao = new AllDaos();
        MusicPlayerSystem music = new MusicPlayerSystem();
        CreatePlayLists create=new CreatePlayLists();

        ArrayList<Song> song;


        SearchByColumn search= new SearchByColumn();

        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("*+++++++++++++***************************PRESENTED-BY-NIHAL+++++++++++++++*******************************!");
        System.out.println("*+++++++++++++*****************************J-U-K-E-B-O-X+++++++++++++++++********************************!");
        System.out.println("---------------------------------------------------------------------------------------------------------");


        int choice;
        try {
             do {
                 System.out.println("""
                         1.Display Playlist & Play Songs\s
                         2.Search Songs
                         3.Create PlayList
                         4.Exit""");
                int option = scanner.nextInt();
                switch (option)
                {
                    case 1:
                        song = dao.getResultSet();

                        System.out.println("Enter Song Id Which You Want to Play");
                        int id=scanner.nextInt();
                        search.playById(id);

                        music.PlaySong(song);

                        break;



                    case 2:
                              System.out.println("""
                                      1. for Search By Genre\s
                                      2. for Search By Artist
                                      3. for Search By Song Name""");
                                int option1=scanner.nextInt();
                                switch (option1)
                                {
                                    case 1:
                                        System.out.println("-----------Genre List-----------");
                                        System.out.println("""
                                                Action Song
                                                Fun Song
                                                Romance
                                                Life Song
                                                Rap Song
                                                Pop Song""");

                                        System.out.println("------Enter Genre Name------");
                                        String genre = scanner1.nextLine();
                                        search.searchByGenre(genre);
                                        break;


                                    case 2:
                                        System.out.println("-----------Artist List-----------");
                                        System.out.println("""
                                                        Justin_Beiber
                                                        Atif Aslam
                                                        Mohammed Irfan
                                                        MC_Stan
                                                        Amit Mishra
                                                        Meet Bros"""
                                                );

                                        System.out.println("------Enter Artist Name------");
                                        String artist = scanner2.nextLine();
                                        search.searchByArtist(artist);
                                        break;

                                    case 3:
                                        System.out.println("-------------Song Names-------------");
                                        System.out.println("""
                                                NATU-NATU
                                                Party Chale On
                                                Adhura Ishq
                                                Ek Din Pyar
                                                Immortals
                                                Let Me Love
                                                Banjaraa-Ek Villain
                                                Galti Se Mistake
                                                Girl I Need You
                                                One Life Baby
                                                Tu Chale
                                                Hossana""");

                                        System.out.println("------Enter Song Name-------");
                                        String songNames = scanner1.nextLine();
                                        search.searchBySong(songNames);
                                        break;

                                    default:
                                        System.out.println("Invalid Option Please Enter Correct Option");
                                        break;
                                }
                                    break;

                        case 3:
                        int songId;
                        System.out.println("Enter Playlist ID's 1 to 6");
                        System.out.println("Enter Playlist Id :");
                        int playlistId = scanner2.nextInt();


                        System.out.println("your playlist is successfully created");
                        do {
                            System.out.println("Enter SongList ID's 1 to 12");
                            System.out.println("enter songId or press 0 to exit" );
                            songId=scanner.nextInt();
                            boolean insert=create.createPList(playlistId,songId);
                            if(!insert)
                            {
                                System.out.println("Song Id Inserted");
                            }
                        } while(songId > 0);
                        break;

                    case 4:
                        System.out.println("----THANK FOR USING JUKEBOX----");
                        break;
                    default:
                        System.out.println("Wrong entered Please enter 1 to 4");
                }
                System.out.println("Main Menu 1, Exit press 0");
                choice = scanner.nextInt();
            }
            while (choice == 1);

        }catch (Exception e)
        {
           e.printStackTrace();
        }
    }
}
