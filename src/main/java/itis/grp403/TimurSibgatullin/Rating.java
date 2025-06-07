package itis.grp403.TimurSibgatullin;
import java.util.List;

public class Rating {
    private List<Game> games;

    public Rating(List<Game> games) {
        this.games = games;
    }

    public Rating() {
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}