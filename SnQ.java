/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snq;

import javafx.scene.Node;


/**
 * 
 * @author Emoney
 */
public class SnQ {
    
    public class Stack{   
         Node head;
          
         //constructor
    Stack()
    {
        this.head = null;
    }
    //get method for head
    public Node getHead()  
    {
        return this.head;
    }
    public void setHead(Node newHead)
    {
        this.head = newHead;
    }

    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
