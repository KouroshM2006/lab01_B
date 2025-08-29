/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02;

/**
 *
 * @author 2440557
 */
public class FinalExam extends GradedActivity {

    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public FinalExam(int questions, int missed) {
        this.numQuestions = questions;
        this.numMissed = missed;
        this.pointsEach = 100.0 / (double) questions;
        setScore(100.0 - (double) (missed * pointsEach));
    }

    public double getPointsEach() {
        return this.pointsEach;
    }

    public int getNumMissed() {
        return this.numMissed;
    }

}
