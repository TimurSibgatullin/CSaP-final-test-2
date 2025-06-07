package itis.grp403.TimurSibgatullin;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class HistoryWriter {
    public static boolean writeGames(List<Game> games) {
        try (FileOutputStream fos = new FileOutputStream("games.hst");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(games);
            oos.flush();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
