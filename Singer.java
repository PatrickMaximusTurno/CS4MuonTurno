/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singer;
import java.util.Scanner;
/**
 *
 * @author MUON
 */
public class Singer {
String name;
    int noOfPerformances;
    double earnings;
    Song favSong;   
    
    public Singer(String n, int no, double e, Song s){
        name = n;
       noOfPerformances = no;
       earnings = e;
       favSong = s;
        
    }
   public void performForAudience(){
       //+1 to noOfPerformances and earnings = 100 x (audience #)
       Scanner sc = new Scanner(System.in);
       double audience = sc.nextDouble();
       noOfPerformances++; 
       earnings = 100*audience;
       
       
   }
 public void changeFavSong(){
     
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

    
