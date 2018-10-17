/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductormorsex;

import java.util.Scanner;

/**
 *
 * @author PERSONAL1
 */
public class TraductorMorseX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scanner=new Scanner(System.in); 
        String palabra=" "; 
        int espacioB=0;
        String deseaY;
        do{
              
            System.out.println("Morse | Texto");
            System.out.println("Elige el tipo de traducción");
            String tipo=scanner.nextLine();
       
            tipo= tipo.toLowerCase();
            
        
            if(tipo.equals("texto")){
                
                String desea;
            
                do{
                    
                
                    System.out.println("Introduce palabra"); 
                    palabra=scanner.nextLine(); 
                    palabra = palabra.toLowerCase();
                              
                    String morse[] = {
                    ".---- ",/**1*/
                    "..--- ",/**2*/
                    "... -- ",/**3*/
                    "....- ",/**4*/
                    "..... ",/**5*/
                    "-.... ",/**6*/
                    "--... ",/**7*/
                    "---.. ",/**8*/
                    "----. ",/**9*/
                    "----- ",/**0*/
                    ".- ",/**A*/
                    "-... ",/**B*/
                    "-.-. ",/**C*/
                    "-.. ",/**D*/
                    ". ",/**E*/
                    "..-. ",/**F*/
                    "--. ",/**G*/
                    ".... ",/**H*/ 
                    ".. ",/**I*/ 
                    ".--- ", /**J*/
                    "-.- ",/**K*/
                    ".-.. ",/**L*/
                    "-- ",/**M*/
                    "-. ",/**N*/
                    "--- ",/**O*/ 
                    ".--. ",/**P*/
                    "--.- ",/**Q*/
                    ".-. ",/**R*/
                    "... ",/**S*/
                    "- ",/**T*/
                    "..- ",/**U*/
                    "...- ",/**V*/
                    ".-- ",/**W*/
                    "-..- ",/**X*/
                    "-.-- ",/**Y*/
                    "--.. ",/**Z*/
                    "  ",/**espacio*/
                }; 
 
        
                String letras = "1234567890abcdefghijklmnopqrstuvwxyz "; 
                int posicion=0; 
                String suma=" "; 
         
                for (int f = 0; f < palabra.length(); f++) { 
                  
                    posicion=letras.indexOf(palabra.charAt(f)); 
                    suma+=morse[posicion];    
                
                } 
                System.out.println(suma);   
                System.out.println("Desea introducir otra palabra? si/no");
                desea=scanner.nextLine();
                desea= desea.toLowerCase();
                }while(desea.equalsIgnoreCase("si"));
        }
        
        if(tipo.equals("morse")){
            String deseaX;
            
            do{
              
                System.out.println("Introduce palabra"); 
                palabra=scanner.nextLine(); 
                palabra = palabra.toLowerCase();
            
                String letrasA = "abcdefghijklmnopqrstuvwxyz1234567890";
	        String morse = " ";
                String letras[] ={
                    
       
                    ".-",/**a*/
                    "-...",/**b*/
                    "-.-.",/**c*/
                    "-..",/**d*/
                    ".",/**e*/
                    "..-.",/**f*/
                    "--.",/**g*/
                    "....",/**h*/
                    "..",/**i*/
                    ".---",/**j*/
                    "-.-",/**k*/
                    ".-..",/**l*/
                    "--",/**m*/
                    "-.",/**n*/
                    "---",/**o*/
                    ".--.",/**p*/
                    "--.-",/**q*/
                    ".-.",/**r*/
                    "...",/**s*/
                    "-",/**t*/
                    "..-",/**u*/
                    "...-",/**v*/
                    ".--",/**w*/
                    "-..-",/**x*/
                    "-.--",/**y*/
                    "--..",/**z*/
                    ".----",/**1*/
                    "..---",/**2*/
                    "...--",/**3*/
                    "....-",/**4*/
                    ".....",/**5*/
                    "-....",/**6*/
                    "--...",/**7*/
                    "---..",/**8*/
                    "----.",/**9*/
                    "-----",/**0*/
                    " "};/**espacio*/
		 		
				
				
		String oracion[] = palabra.split(" ");
		for  (int i = 0; i < oracion.length; i++){
                    
                    for (int j = 0; j < 37; j++){       
                        
                        if (oracion[i].equals(letras[j])) {
                            
                            morse = morse+letrasA.charAt(j);
                        if(palabra.charAt(i) != ' '){
                            espacioB=0;
                        }
                break;
                }else{
                    espacioB=espacioB+1;
                        if(espacioB==3){
                            morse = morse+" ";
                        }
                    }       
                }
            }
                    
		        
                        System.out.println(morse);
                        System.out.println("Desea introducir otra palabra? si/no");
                        deseaX=scanner.nextLine();
                        deseaX= deseaX.toLowerCase();
                        }while(deseaX.equalsIgnoreCase("si"));
        
         
    }
        System.out.println("Desea ingresar otra tipo de texto? si/no");
        deseaY=scanner.nextLine();
        deseaY= deseaY.toLowerCase();
        }while(deseaY.equalsIgnoreCase("si"));
        
        }}