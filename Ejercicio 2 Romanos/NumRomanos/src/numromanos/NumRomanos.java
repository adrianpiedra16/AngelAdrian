
package numromanos;

import java.util.Scanner;

/**
 *
 * @author PERSONAL1
 */
public class NumRomanos {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int numeros;
        String letra ="";
        String desea = null;
        
      
            System.out.println("Ingrese el número deseado (1/1000): "); 
            numeros=scanner.nextInt();
     
            if(numeros>1000){
                System.out.println("El número se pasa del limite, intentelo de nuevo");                
                }
            if(numeros<=1000){
                letra = letra +XNumRomanos(numeros)+"\n";
                System.out.println("El número en romano es: "+letra);   
            }
            if(numeros==0){
                System.out.println("El número 0 no existe en romano");
            }
            
            
    }
  
    
    public static String XNumRomanos(int numero){
        
         int i;
         int millar,centena,decena,unidad;
         
        millar=(numero/1000);
        i=numero%1000;
        centena=i/100;
        i=numero%100;
        decena=i/10;
        unidad=numero%10;
        String letra="";
      
        
        switch(millar){
            case 1:
                letra = letra +"M";
                break;
                 }
        
        
        switch(centena){
            case 1:
                letra = letra +"C";
                break;
            case 2:
                letra = letra +"CC";
                break;
            case 3:
                letra = letra +"CCC";
                break;
            case 4:
                letra = letra +"CD";
                break;
            case 5:
                letra = letra +"D";
                break;
            case 6:
                letra = letra +"DC";
                break;
            case 7:
                letra = letra +"DCC";
                break;
            case 8:
                letra = letra +"DCCC";
                break;
            case 9:
                letra = letra +"CM";
                break;
        }
        
        
        switch(decena){
            case 1:
                letra = letra+"X";
                break;
            case 2:
                letra = letra +"XX";
                break;
            case 3:
                letra = letra +"XXX";
                break;
            case 4:
                letra = letra +"XL";
                break;
            case 5:
                letra = letra +"L";
                break;
            case 6:
                letra = letra +"LX";
                break;
            case 7:
                letra = letra +"LXX";
                break;
            case 8:
                letra = letra +"LXXX";
            case 9:
                letra = letra +"XC";
                break;
                }
        
        
        switch(unidad){
            case 1:
                letra = letra +"I";
                break;                
            case 2:
                letra = letra +"II";
                break;                
            case 3:
                letra = letra +"III";
                break;                
            case 4:
                letra = letra +"IV";
                break;                
            case 5:
                letra = letra +"V";
                break;               
            case 6:
                letra = letra +"VI";
                break;
            case 7:
                letra = letra +"VII";
                break;
            case 8:
                letra = letra +"VIII";
                break;
            case 9:
                letra = letra +"IX";
                break;
        }
        
        return letra;
    }
}
