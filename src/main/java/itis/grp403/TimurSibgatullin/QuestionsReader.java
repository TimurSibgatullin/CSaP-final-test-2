package itis.grp403.TimurSibgatullin;

import java.io.*;

public class QuestionsReader {
    public static Questions readQuestions(){
        try (FileInputStream fis = new FileInputStream("questions.qst");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Questions questions = (Questions) ois.readObject();
            return questions;
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
