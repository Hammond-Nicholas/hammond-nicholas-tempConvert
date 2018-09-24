/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addintegers;

/**
 *
 * @author nrham
 */
import java.util.Scanner;

public class AddIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n1, n2, sum;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter your first integer value: ");
        n1 = keyboard.nextDouble();
        
        System.out.println("Enter your second integer value: ");
        n2 = keyboard.nextDouble();
        
        sum = n1 + n2;
        System.out.println("The sum of your two numbers is " + sum);
    }
    
}
