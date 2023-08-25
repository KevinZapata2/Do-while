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
public class aplicacionWlite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.println("Ingrese 1 para inicializar la app");
     int init = sc.nextInt();
     while (init!= 0){
     System.out.println("Selecione una opcion: \n 1 regristrase\n 2 iniciar sesion\n 3 salir");
     
     int opc = sc.nextInt();
         switch (opc) {
             case 1:
             System.out.println("Registro");
             break;
             case 2:
             System.out.println("Inicio de sesion");
             break;
             case 3:
             System.out.println("Salir");
             init = 0;
             break;
             default:
             System.out.println("Ingrese una opcion valida");
     }
     
     
     
     }
     }
    
}
