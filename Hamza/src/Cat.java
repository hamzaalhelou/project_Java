/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M
 */
public class Cat extends Animal implements Pet {
 private String name;
    public Cat(int legs ,String name ) {
        super(legs);
        this.name=name;
    }

   

    
    public String getName() {
       return name;
    }

    
    public String setName(String name) {
         return name;
    }

    public void play() {
    }
    public void eat(){
        super.eat();
    }

    
    public String setName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
