package mainImpl;

import bean.Songs;
import dao.AllDaos;
import dao.CreatePlayLists;
import dao.MusicPlayerSystem;
import serching.SearchByColumn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JukeBoxImpl
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        AllDaos dao = new AllDaos();
        MusicPlayerSystem music = new MusicPlayerSystem();
        CreatePlayLists create=new CreatePlayLists();

        ArrayList<Songs> song = new ArrayList<>();


        SearchByColumn search= new SearchByColumn();

        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("*+++++++++++++***************************PRESENTED-BY-NIHAL+++++++++++++++*******************************!");
        System.out.println("*+++++++++++++*****************************J-U-K-E-B-O-X+++++++++++++++++********************************!");
        System.out.println("---------------------------------------------------------------------------------------------------------");


        int choice;
        try {
             do {
                 System.out.println("1.Display Playlist & Play Songs\n" +
                        "2.Create PlayList\n" +
                        "3.Search Songs\n" +
                        "4.Exit");
                int option = sc.nextInt();
                switch (option)
                {
                    case 1:
                        song = dao.getResultSet();
                        System.out.println("Enter Song Id Which You Want to Play");
                        int id=sc.nextInt();
                        search.playById(id);

                        music.PlaySong(song);

                        break;

                    case 2:
                        int songId;
                        System.out.println("Enter Playlist Names :");
                        String playlistName = sc2.nextLine();

//                        System.out.println("Enter Playlist Id");
//                        int playlistId = sc.nextInt();
                        System.out.println("your playlist is successfully created");
                        do {
                            System.out.println("enter songId or press 0 to exit" );
                             songId=sc.nextInt();
                            boolean insert=create.createPList(playlistName,songId);
                            if(!insert)
                            {
                                System.out.println("Song Id Inserted");
                            }
                        } while(songId>0);
                                break;

                    case 3:
                              System.out.println("1. for Search By Genre\n" +
                                                 "2. for Search By Artist\n" +
                                                 "3. for Search By Song Name");
                                int option1=sc.nextInt();
                                switch (option1)
                                {
                                    case 1:
                                        System.out.println("-----------Genre List-----------");
                                        System.out.println("Action Song\n" +
                                                "Fun Song\n" +
                                                "Romance\n" +
                                                "Life Song\n" +
                                                "Rap Song\n" +
                                                "Pop Song");

                                        System.out.println("------Enter Genre Name------");
                                        String genre = sc1.nextLine();
                                        search.searchByGenre(genre);
                                        break;


                                    case 2:
                                        System.out.println("-----------Artist List-----------");
                                        System.out.println("Justin_Beiber\n" +
                                                "Atif Aslam\n" +
                                                "Mohammed Irfan\n" +
                                                "MC_Stan\n" +
                                                "Amit Mishra\n" +
                                                "Meet Bros\n" +
                                                "Arijit Singh\n");

                                        System.out.println("------Enter Artist Name------");
                                        String artist = sc1.nextLine();
                                        search.searchByArtist(artist);
                                        break;

                                    case 3:
                                        System.out.println("-------------Song Names-------------");
                                        System.out.println("NATU-NATU\n" +
                                                "Party Chale On\n" +
                                                "Adhura Ishq\n" +
                                                "Ek Din Pyar\n" +
                                                "Immortals\n" +
                                                "Let Me Love\n" +
                                                "Banjaraa-Ek Villain\n" +
                                                "Galti Se Mistake\n" +
                                                "Girl I Need You\n" +
                                                "One Life Baby\n" +
                                                "Tu Chale\n" +
                                                "Hossana");

                                        System.out.println("------Enter Song Name-------");
                                        String songNames = sc1.nextLine();
                                        search.searchBySong(songNames);
                                        break;

                                    default:
                                        System.out.println("Invalid Option Please Enter Correct Option");
                                }
                                    break;

                    case 4:
                        System.out.println("----THANK FOR USING JUKEBOX----");
                        break;
                    default:
                        System.out.println("Wrong entered Please enter 1 to 4");
                }
                System.out.println("Main Menu 1, Exit press 0");
                choice = sc.nextInt();
            }
            while (choice == 1);

        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
