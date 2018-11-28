/*
 * To change this licensenn header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sflores.controlador;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author LAB1-PC
 */
public class Coordinador {
    public static void showMenu(){
        int exit=0;
        do{

            System.out.println("Bienvenidos a netflix viewer");
            System.out.println("selecciona una opcion"
            +"1.-books\n"
            +"2.-Magazine\n"
            +"3.-Movies\n"
            +"4.-Series\n"
            + "\n-----------\n"
            +"5.-Report\n"
            +"6.-Report today\n"
            +"0.-Exit");
            //leer la respuesta usualrio
            Scanner inpunt= new Scanner(System.in);
            int response=inpunt.nextInt();
            switch(response){
                case 0:
                    //salir
                    break;
                case 1:
                 showBooks();
                   
                 //showBooks
                    break;
                case 2:
                    showMagazines();
                    //serie
                    break;
                case 3:
                    showMovies();
                    //showmovies
                    break;
                case 4:
                    showSeries();
                    //salir
                    break;
                case 5:
                    makeReport();
                    
                    //salir
                    break;
                case 6:
                    Date date = new Date();
                    makeReport(new Date());
                    
                    //salir
                    break;
                default:
                    System.out.println("");
                    System.out.println(".....seleciona una opcion");
                    System.out.println("");
                 
                    break;
            }
        }while (exit !=0);
    
       }
     
   private static void showMovies(){
        int exit =0;
                do{
                    System.out.println("");
                    System.out.println("::MOVIES::");
                    System.out.println("");
                }while (exit !=0);
    }
    
    private static void showSeries(){
        int exit =0;
                do{
                    System.out.println("");
                    System.out.println("::SERIES::");
                    System.out.println("");
                }while (exit !=0);
    }
         private static void showChapter(){
        int exit =0;
                do{
                    System.out.println("");
                    System.out.println("::CHAPTERS::");
                    System.out.println("");
                }while (exit !=0);
    }
   private static void showBooks(){
        int exit =0;
                do{
                    System.out.println("");
                    System.out.println("::BOOKS::");
                    System.out.println("");
                }while (exit !=0);
    }
        private static void showMagazines(){
        int exit =0;
                do{
                    System.out.println("");
                    System.out.println("::MAGAZINES::");
                    System.out.println("");
                }while (exit !=0);
    }
 private static void makeReport(){
     
 }   
 private static void makeReport(Date date){
     
 }
}
       