package itis.grp403.TimurSibgatullin;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class QuestionsWriter {
    public static void write() {
        Questions quiz = new Questions(
                "Что делает компилятор?",
                new String[] {
                        "1: Исполняет программу построчно;",
                        "2: Преобразует исходный код в исполняемый файл;",
                        "3: Сохраняет данные в базе данных;"
                },
                1,

                "Какой тип данных в Java используется для хранения целых чисел?",
                new String[] {
                        "1: int;",
                        "2: boolean;",
                        "3: double;"
                },
                0,

                "Что такое IP-адрес?",
                new String[] {
                        "1: Идентификатор пользователя в соцсетях;",
                        "2: Физический адрес устройства;",
                        "3: Уникальный адрес устройства в сети;"
                },
                2
        );
        writeQuestions(quiz);
    }
    public static boolean writeQuestions(Questions questions) {
        try (FileOutputStream fos = new FileOutputStream("questions.qst");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(questions);
            oos.flush();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}