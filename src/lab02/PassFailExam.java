/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02;

/**
 *
 * @author 2440557
 */
public class PassFailExam extends PassFailActivity {

    private int numQuestions, numMissed;
    private double pointsEach;

    public PassFailExam(int questions, int missed, double minPassing) {
        super(minPassing);
        this.numQuestions = questions;
        this.numMissed = missed;
        this.pointsEach = 100.0 / (double) questions;
        setScore(100.0 - (double) (missed * pointsEach));
    }

    public double getPointsEach() {
        return this.pointsEach;
    }

    public double getNumMissed() {
        return this.numMissed;
    }
}
