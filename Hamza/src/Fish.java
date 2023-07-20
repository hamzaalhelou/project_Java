/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M
 */
public class Fish extends Animal implements Pet {
   private String name;
    public Fish(int legs) {
        super(legs);
    }

    
    public String getName() {
       return name;
    }

 

    
    public void play() {

    }

    
    public String setName(String name) {
        return name;
      
    }

   
    public String setName() {
       return name;
    
    }


    
}
