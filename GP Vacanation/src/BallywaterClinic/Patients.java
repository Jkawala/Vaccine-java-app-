/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BallywaterClinic;

/**
 *
 * @author Jamesk
 */
public class Patients {
    private String name;
    private int Age;
    private String symptoms;
    public Patients(){
        
        name = new String();
        Age = 0;
        symptoms = new String();
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setSypmtoms(String s){
        symptoms = s;
    }
     
    public void setAge(int i){
        Age = i; 
    }
    
    public String getName(){
        return name;
    }
    
    public String getSymptoms(){
        return symptoms;
    }
    
    public int getAge(){
        return Age;
    }
}
