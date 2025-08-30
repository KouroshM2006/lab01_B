/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02;

/**
 *
 * @author 2440557
 */
public class GradedActivity {

    private double score;

    public void setScore(double s) {
        this.score = s;
    }

    public double getScore() {
        return score;
    }

    /**
     * method to return A,B,C,D or F according to the score 
     * @return Grade as char
     */
    public char getGrade() {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
