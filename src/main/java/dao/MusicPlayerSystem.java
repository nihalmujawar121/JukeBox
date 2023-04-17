package dao;

import bean.Song;
import util.Connectors;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;


import java.util.*;

public class MusicPlayerSystem extends Connectors
{
    Scanner scanner = new Scanner(System.in);
    public void PlaySong(ArrayList<Song> list)
    {
        for (Song song : list) {
            String response = " ";

            String url = song.getUrl();
            try {
                File path = new File(url);
                if (path.exists()) {

                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(path);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioStream);

                    while (!response.equals("Q")) {
                        System.out.println("P = play, S = Stop, R = Reset, N = Next, Q = Quit ");
                        System.out.print("Enter your choice: ");
                        response = scanner.next();
                        response = response.toUpperCase();
                        switch (response) {

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
                        if (response.equals("Q") || response.equals("q") || response.equals("N") || response.equals("n"))
                            break;

                    }
                    if (response.equals("Q") || response.equals("q"))
                        break;

                }
            } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
                e.printStackTrace();
            }
        }

    }

    }



