/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BallywaterClinic;

/**
 *
 * @author Jameskawala
 */
public class PQElement {
    private int key;
    private Patients element;
    
    public PQElement(int priority, Patients e){
        key = priority;
        element = e;
        
    }
   
    public int getKey() {
        return key;
    }
    
    public void setKey(int val) {
        key = val;
    }
    
    public Patients getElement() {
        return element;
    }
    
    public void setElement (Patients e) {
        element = e;
    }
    
    public String printPatients() {
        String msg;
        msg = " name = "+element.getName()+ ""+ " Age = "+element.getAge()+ "" + " symptoms = "+element.getSymptoms();
    return msg;
    }
}
