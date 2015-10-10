
package bol2.pkg11;

import java.util.Scanner;

/**
 *
 * @author julianlinux
 */
public class Bol211 {

  
    public static void main(String[] args) {
        
        
         float sueldo,ventas,km,sueldobruto;
        int dias;
        
        System.out.print("Sueldo: ");
            Scanner dato=new Scanner(System.in);
            sueldo=dato.nextFloat();
            
        System.out.print("Ventas: ");
            ventas=dato.nextFloat();            
        
        System.out.print("Km recorridos : ");
            km=dato.nextFloat();
                    
        System.out.print("Dias de desplazamiento : ");
            dias=dato.nextInt();
        
            sueldobruto=(float) ((ventas*0.05)+(km*2)+sueldo+(dias*30));
            
        System.out.println("Sueldo bruto : "+sueldobruto);
       
    }
    
}
