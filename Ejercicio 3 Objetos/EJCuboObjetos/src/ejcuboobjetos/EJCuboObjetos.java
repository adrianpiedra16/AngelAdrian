/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcuboobjetos;

import java.util.Scanner;

/**
 *
 * @author PERSONAL1
 */

public class EJCuboObjetos {

    static Cubo cubo;
    static double conexion;
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        init ();
        lazo ();
        scanner.nextLine();


    }


    private static void lazo(){

        int  opt =mostrarMenu();

        while(opt != 5)
        {
            conexion = calcular(opt ,cubo);

            System.out.println("El valor es " +conexion+ "\n");

            opt = mostrarMenu ();
        }



        init ();
        lazo ();
    }


    private static void init(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor del lado:\t");
        try{
            double lado  = Double.parseDouble( scanner.nextLine());
            cubo = new Cubo(lado);
        }
        catch (NumberFormatException nfe){
            System.out.println ("El valor debe de ser un entero");
            init ();
        }



    }


    public static double calcular( int opt, Cubo cubo){

        double result = 0;
        switch (opt){
            case 1: result =cubo.calcularPerimetro(true); break;
            case 2: result = cubo.calcularArea (); break;
            case 3: result = cubo.calcularVolumen(); break;
            case 4: result = cubo.calcularPerimetro(false); break;
            case 5: init();break;
            case 6: ;System.exit (0);break;

        }
        return result;
    }

    public static int mostrarMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Seleccione el calculo a realizar:\n");
        System.out.print ("1: Perímetro del cuadrado \n");
        System.out.print ("2: calcular el área\n");
        System.out.print ("3: calcular el Volúmen\n");
        System.out.print ("4: calcular el Perímetro cubo\n");
        System.out.print ("5: Nuevo cubo \n");
        System.out.print ("6: Salir \n");

        int gg  = Integer.parseInt( scanner.nextLine());
        return gg;
    }
}
    

