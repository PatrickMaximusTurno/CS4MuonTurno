/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1_exercise2;
import java.util.Scanner;
/**
 *
 * @author MUON
 */
public class Q1_Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        int guesses;
        String response; 
        Scanner sc = new Scanner(System.in);
       
        do{System.out.println("Welcome to Higher or Lower! What will you do?");
        switch(response){
            case "Start game":
                     for(int remaining = guesses; remaining>0; remaining--1){ 
             (int) Math.floor(Math.random()*10) + 1;
              System.out.println();
             
            };
                    break;
            case "Change settings":
                    
                    break;
            case "End Application":
                    
                    break;
            default:
        }
        response =  sc.nextLine();
        
       
        

    }while();
    }
    }
