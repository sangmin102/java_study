package ch03;

public class sec11 {
    public static void main(String[] args) {
        int score = 70;

        /*char grade;


        if (score > 90)
            grade = 'A';
        else
            grade = 'B';*/

        char grade = (score > 90) ? 'A' : (score>80) ? 'B' : 'C';

        System.out.println(score + "정은 " + grade + "등급입니다.");
    }
}
