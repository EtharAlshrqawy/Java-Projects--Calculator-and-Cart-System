/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;
import java.util.Scanner;



/**
 *
 * @author Ethar
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creat scanner
        Scanner scanner = new Scanner (System.in);
        
        
        System.out.println("Enter two numbers (n1,n2)");
        
        //read user input
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Select operator (*,/,%,+,-):");
        char Op = scanner.next().charAt(0);
        
        
        
        switch(Op){
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            default: 
                System.out.println("you enter a wrong operator");
            }
        
        
        
        
    }
    
}
