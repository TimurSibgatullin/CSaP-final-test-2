package itis.grp403.TimurSibgatullin;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class HistoryReader {
    public static List<Game> readGames(){
        try (FileInputStream fis = new FileInputStream("games.hst");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            List<Game> games = (ArrayList<Game>) ois.readObject();
            return games;
        } catch (ClassNotFoundException | IOException e) {
            return new ArrayList<Game>();
        }
    }
}
