/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctorclinic;

import java.util.*;

/**
 *
 * @author Eamon
 */
public class myQueue implements QueueInterface {

    private ArrayList<Patient> theQueue;

    public myQueue() {
        theQueue = new ArrayList<Patient>();
    }

    public void enqueue(Object newItem) {
        theQueue.add((Patient) newItem);
    }

    public Object dequeue() {
        if (!theQueue.isEmpty()) {
            return theQueue.remove(0);
        }
        else {
            return null;
        }
    }

    public int size(){
        return theQueue.size();
    }
    
    public boolean isEmpty(){
        return theQueue.isEmpty();
    }
    
    public Object frontElement(){
        if(!theQueue.isEmpty()){
            return theQueue.size();
        }
        else{
            return null;
        }
    }
    
    
}
