/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractioninjava;

/**
 *
 * @author Abdul Moiz Chishti
 */
public class Animal extends LivingOrgans {
    
    @Override
    public void rest(){
        System.out.println("Animal sleeps 8 hours a day"); 
   }
    @Override 
    public void food(){
    System.out.println("Animal eats 3 times  a day");
    }
    @Override 
    public void breath(){
    System.out.println("Animal breaths maximun time a day");
    }
    
}
