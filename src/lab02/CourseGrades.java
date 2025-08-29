/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02;

/**
 *
 * @author kouro
 */
public class CourseGrades implements Analyzable {
    GradedActivity[] grades = new GradedActivity[4];
    int NUM_GRADES = 4;

    public CourseGrades() {
    }
    
    /**
     * to set the Lab object of the grades array at index 0
     * @param aLab given GradedActivity object
     */
    public void setLab(GradedActivity aLab) {
        grades[0] = aLab;
    }
    
    /**
     * to set the PassFailExam object of the grades array at index 1
     * @param aPassFailExam given PassFailExam object
     */
    public void setPassFailExam(PassFailExam aPassFailExam) {
        grades[1] = aPassFailExam;
    }
    
    /**
     * to set the Essay object of the grades array at index 2
     * @param anEssay given Essay object
     */
    public void setEssay(Essay anEssay) {
        grades[2] = anEssay;
    }
    
    /**
     * to set the FinalExam object of the grades array at index 3
     * @param aFinalExam given FinalExam object
     */
    public void setFinalExam(FinalExam aFinalExam) {
        grades[3] = aFinalExam;
    }
    
    @Override
    /**
     * to return 
     */
    public double getAverage() {
        double sum = 0;
        for (GradedActivity obj : grades) {
            sum += obj.getScore();
        }
        
        return sum/4;
    }
    
    @Override
    public GradedActivity getHighest() {
        GradedActivity highest = grades[0];
        
        for (GradedActivity obj : grades) {
            if (obj.getScore() > highest.getScore()) {
                highest = obj;
            }
        }
        return highest;
    }
    
    @Override
    public GradedActivity getLowest() {
        GradedActivity lowest = grades[0];
        
        for (GradedActivity obj : grades) {
            if (obj.getScore() < lowest.getScore()) {
                lowest = obj;
            }
        }
        return lowest;
    }
    
    @Override
    public String toString() {
        return "Lab Score: " + grades[0].getScore() + "\tGrade: " + grades[0].getGrade() +
                "\nPass/Fail Exam Score: " + grades[1].getScore() + "\tGrade: " + grades[1].getGrade() +
                "\nEssay Score: " + grades[2].getScore() + "\tGrade: " + grades[2].getGrade() +
                "\nFinal Exam Score: " + grades[3].getScore() + " Grade: " + grades[3].getGrade();
    }
    
    
    
    
}
