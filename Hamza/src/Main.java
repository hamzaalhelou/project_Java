/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M
 */
public class Main {
    public static void main(String[] args) {
        
        Spider p1 =new Spider(13);
        Cat p2 = new Cat(4, "Sawsan");
        p2.setName("Sawsan");
        System.out.println("Name Cat :"+p2.getName());
        System.out.println(p2.legs);
        System.out.println("==========================");
        
        
        System.out.println("Leng Spider:"+p1.legs);
    }
    
}
