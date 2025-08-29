/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02;

/**
 *
 * @author 2440557
 */
public class Essay extends GradedActivity {

    private double grammar;
    private double spelling;
    private double correctLength;
    private double content;

    public void setScore(double gr, double sp, double len, double cnt) {
        if (gr <= 30.0 && sp <= 20.0 && len <= 20.0 && cnt <= 30.0) {
            this.grammar = gr;
            this.spelling = sp;
            this.correctLength = len;
            this.content = cnt;

            setScore(grammar + spelling + correctLength + content);
        } else {
            System.out.println("Error: the score entered for a category surpasses the maximum of points allowed");
        }
    }

    public double getGrammar() {
        return grammar;
    }

    public double getSpelling() {
        return spelling;
    }

    public double getCorrectLength() {
        return correctLength;
    }

    public double getContent() {
        return content;
    }

    public void setGrammar(double g) {
        this.grammar = g;
    }

    public void setSpelling(double s) {
        this.spelling = s;
    }

    public void setCorrectLength(double c) {
        this.correctLength = c;
    }

    public void setContent(double c) {
        this.content = c;
    }

}
