package itis.grp403.TimurSibgatullin;

import java.io.Serializable;
import java.util.Arrays;

public class Questions implements Serializable {
    private String question1;
    private String[] response1;
    private int goodResponseIndex1;

    private String question2;
    private String[] response2;
    private int goodResponseIndex2;

    private String question3;
    private String[] response3;
    private int goodResponseIndex3;

    public Questions(String question1, String[] response1, int goodResponseIndex1, String question2, String[] response2, int goodResponseIndex2, String question3, String[] response3, int goodResponseIndex3) {
        this.question1 = question1;
        this.response1 = response1;
        this.goodResponseIndex1 = goodResponseIndex1;
        this.question2 = question2;
        this.response2 = response2;
        this.goodResponseIndex2 = goodResponseIndex2;
        this.question3 = question3;
        this.response3 = response3;
        this.goodResponseIndex3 = goodResponseIndex3;
    }

    public Questions() {
    }

    public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public String[] getResponse1() {
        return response1;
    }

    public void setResponse1(String[] response1) {
        this.response1 = response1;
    }

    public int getGoodResponseIndex1() {
        return goodResponseIndex1;
    }

    public void setGoodResponseIndex1(int goodResponseIndex1) {
        this.goodResponseIndex1 = goodResponseIndex1;
    }

    public String getQuestion2() {
        return question2;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2;
    }

    public String[] getResponse2() {
        return response2;
    }

    public void setResponse2(String[] response2) {
        this.response2 = response2;
    }

    public int getGoodResponseIndex2() {
        return goodResponseIndex2;
    }

    public void setGoodResponseIndex2(int goodResponseIndex2) {
        this.goodResponseIndex2 = goodResponseIndex2;
    }

    public String getQuestion3() {
        return question3;
    }

    public void setQuestion3(String question3) {
        this.question3 = question3;
    }

    public String[] getResponse3() {
        return response3;
    }

    public void setResponse3(String[] response3) {
        this.response3 = response3;
    }

    public int getGoodResponseIndex3() {
        return goodResponseIndex3;
    }

    public void setGoodResponseIndex3(int goodResponseIndex3) {
        this.goodResponseIndex3 = goodResponseIndex3;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "question1='" + question1 + '\'' +
                ", response1=" + Arrays.toString(response1) +
                ", goodResponseIndex1=" + goodResponseIndex1 +
                ", question2='" + question2 + '\'' +
                ", response2=" + Arrays.toString(response2) +
                ", goodResponseIndex2=" + goodResponseIndex2 +
                ", question3='" + question3 + '\'' +
                ", response3=" + Arrays.toString(response3) +
                ", goodResponseIndex3=" + goodResponseIndex3 +
                '}';
    }
}
