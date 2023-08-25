/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whilec;

import java.util.Scanner;

/**
 *
 * @author 505
 */
public class TrabajoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese mumero");
        
        int num = 0;
        int sum = 0;
        int contador = 0;
        do {
        System.out.println("Preione Y para agregar otro numero \nPresiones N para no agregar mas numero\n ");
        String opc = sc.next();
        switch (opc) {
            case "y":
            System.out.println("Ingrese numero");
            int yes = sc.nextInt();
            sum = + num;
            contador++;
            System.out.println(contador + sum);
            break;
        }
        
        
        
        
        
        }while(num==0 );
            
    }
    
}
