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
import java.util.Scanner;

public class AbstractioninJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        int ch=0;
        
      
        
        while(ch <= 3){
       
                System.out.println("-----------------------------------------------------------------------");
        System.out.println("1= Human\n2= Animals\n3= Plants");
        
        System.out.println("Enter your choice");
        
                System.out.print("-----------------------------------------------------------------------");
        ch= sc.nextInt();
        if(ch==1){
        
        Human obj =new Human();
        obj.breath();
        obj.rest();
        obj.food();
            System.out.println();
        }
        
        else if(ch==2){
        Animal obj1=new Animal();
        obj1.breath();
        obj1.food();
        obj1.rest();
            System.out.println("");
        }
        
        else if(ch==3){
        
        Plants obj2=new Plants();
        obj2.breath();
        obj2.food();
        obj2.rest();
            System.out.println("");
        }
        
    }
    }
}
