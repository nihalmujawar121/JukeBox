package dao;

import bean.Songs;
import dbconnection.Connectors;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.*;

public class MusicPlayerSystem extends Connectors {

    Scanner sc = new Scanner(System.in);




    public Clip PlaySong(List<Songs> al)
    {
        Iterator<Songs> iterator= al.iterator();
        while (iterator.hasNext())
        {
            String response = " ";
            //if (response.equals("Q") || response.equals("q")) break;
            String url=iterator.next().getUrl();
            try
            {
                File path = new File(url);
                if (path.exists()) {

                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(path);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioStream);

                    while (!response.equals("Q"))
                    {
                        System.out.println("P = play, S = Stop, R = Reset, N = Next, Q = Quit ");
                        System.out.print("Enter your choice: ");
                        response = sc.next();
                        response = response.toUpperCase();
                        switch (response)
                        {

                            case ("P"):
                                clip.start();

                                break;

                            case ("S"):
                                clip.stop();
                                break;

                            case ("R"):
                                clip.setMicrosecondPosition(0);
                                break;

                            case ("Q"):
                                clip.stop();
                                break;

                            case ("N"):
                                clip.close();
                                break;

                            default:
                                System.out.println("Not a valid response");



                        }
                        if (response.equals("Q") || response.equals("q")|| response.equals("N") || response.equals("n")) break;

                    }
                    if (response.equals("Q") || response.equals("q"))
                        break;

                }
            }
            catch (UnsupportedAudioFileException e)
            {
                System.out.println(e);
            } catch (LineUnavailableException e)
            {
                System.out.println(e);
            } catch (IOException i)
            {
                System.out.println(i);
            }
        }

        return null;
    }

    }



