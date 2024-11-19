/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cart;
import java.util.Scanner;

/**
 *
 * @author Ethar
 */
public class Cart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the cart data: ");
        String iteamName = scanner.nextLine();
        int iteamCode = scanner.nextInt();
        double price = scanner.nextDouble();
        int quantity = scanner.nextInt();
        boolean availabilty = true ;
        
        if(quantity==0){
            availabilty=false;
            
        }
        System.out.println(iteamName);
        System.out.println(iteamCode);
        System.out.println(price);
        System.out.println(quantity);
        System.out.println(availabilty);
        
        
        }
    }
    
