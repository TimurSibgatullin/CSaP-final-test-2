package itis.grp403.TimurSibgatullin;

import java.util.Date;

public class Game implements Comparable<Game> {
    private String gamer;
    private Integer rating;
    private Date gameDate;

    public Game(String gamer, Integer rating, Date gameDate) {
        this.gamer = gamer;
        this.rating = rating;
        this.gameDate = gameDate;
    }

    public Game() {
        setRating(0);
    }

    public String getGamer() {
        return gamer;
    }

    public void setGamer(String gamer) {
        this.gamer = gamer;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Date getGameDate() {
        return gameDate;
    }

    public void setGameDate() {
        this.gameDate = new Date();
    }

    @Override
    public int compareTo(Game other) {
        return other.rating.compareTo(this.rating);
    }

    @Override
    public String toString() {
        return "Game{" +
                "gamer='" + gamer + '\'' +
                ", rating=" + rating +
                ", gameDate=" + gameDate +
                '}';
    }
}