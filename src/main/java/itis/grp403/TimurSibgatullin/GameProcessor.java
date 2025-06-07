package itis.grp403.TimurSibgatullin;

import java.util.*;

public class GameProcessor {
    public static void runGame() {
        Questions questions = QuestionsReader.readQuestions();
        List<Game> history = HistoryReader.readGames();
        while (true) {
            Game game = new Game();
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите никнейм: ");
            game.setGamer(sc.nextLine());
            game.setGameDate();
            System.out.println("\n" + questions.getQuestion1() + "\n\nВарианты ответа:");
            for (String i : questions.getResponse1()) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
            int resp = Integer.parseInt(sc.nextLine());
            if (resp == questions.getGoodResponseIndex1()){
                game.setRating(game.getRating() + 1);
            }

            System.out.println("\n" + questions.getQuestion2() + "\n\nВарианты ответа:");
            for (String i : questions.getResponse2()) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
            resp = Integer.parseInt(sc.nextLine());
            if (resp == questions.getGoodResponseIndex2()){
                game.setRating(game.getRating() + 1);
            }

            System.out.println("\n" + questions.getQuestion3() + "\n\nВарианты ответа:");
            for (String i : questions.getResponse3()) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
            resp = Integer.parseInt(sc.nextLine());
            if (resp == questions.getGoodResponseIndex3()){
                game.setRating(game.getRating() + 1);
            }
            System.out.println("\n" + "Ваш рейтинг: " + game.getRating());
            System.out.println(history);
            history.add(game);
            Collections.sort(history);
            HistoryWriter.writeGames(history);
            System.out.println("Enter, чтобы начать новую игру");
            sc.nextLine();
        }
    }
}
