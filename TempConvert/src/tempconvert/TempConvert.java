/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconvert;

import java.util.Scanner;

/**
 *
 * @author nrham
 */
public class TempConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double tempc, tempf;
        Scanner keyboard = new Scanner(System.in);
        
        // Promt for Celsius input
        System.out.println("Enter temperature in degrees Celsius: ");
        
        // Get Celsius input from keyboard
        tempc = keyboard.nextDouble();
       
        // Calculate Fahrenheit
        tempf = (9.0 / 5.0) * tempc + 32;
        
        // Output Fahrenheit
        System.out.println("Your temperature is " + tempf + " degrees Fahrenheit");
                
    }
    
}
