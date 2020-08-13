/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

import java.util.Scanner;

/**
 * Question for Final Exam Part D.
 * Manufactures a Car of a given type based on the purchase orders.
 * @author Sivagama Srinivasan
 */
public class CarView 
{
public static CarManufactureLocation Brampton = CarManufactureLocation.getInstance();//we only ever want one 
   // of these. The Car manufacture unit is located only in one location Brampton 
   //and all cars are manufactured in the same location.
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Car shop");
        System.out.println("What kind of Car do you want?");
        System.out.println("Please enter exactly BMW or Volvo");
       
        // write the code to create Cars based on user request.
        /*write code to take input 
         what Car is required 
        then create that car */
        
        System.out.println("how many cars would you like?");
        int numofcars = sc.nextInt();
        Brampton.numofcars=numofcars;
        //
        {
            System.out.println("Great job, here is your order for " + numofcars + " cars");
            
        }
    //
        {
            System.out.println("Enter a valid Car type");
        }
        
    }//end main    
}
    

