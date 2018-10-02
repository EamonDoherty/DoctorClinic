/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctorclinic;

/**
 *
 * @author Eamon
 */
public class Patient {
    private String name;
    private String symptom;
    
    public Patient() {
        name = new String();
        symptom = new String();
    }

    public void setName(String n) {
        name = n;
    }

    public void setSymptom(String s) {
        symptom = s;
    }

    public String getName() {
        return name;
    }

    public String getSymptom() {
        return symptom;
    }
    
    
    
    
    
    
}
