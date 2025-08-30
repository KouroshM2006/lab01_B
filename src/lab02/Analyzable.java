/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lab02;

/**
 *
 * @author kouro
 */
public interface Analyzable {
    
    /**
     * method to get the average of all scores
     * @return average of scores as double
     */
    public double getAverage();
    
    /**
     * method to get the object with the highest score
     * @return GradedActivity with the highest score
     */
    public GradedActivity getHighest();
    
    /**
     * method to get the object with the lower score
     * @return GradedActivity with the lowest score 
     */
    public GradedActivity getLowest();
}
