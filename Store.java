/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1_exercsie5;

import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
       
      int earnings = 0;
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
    
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void addItem(Item i){
    // add Item i to store's itemList
    storeList.add(Item);
    
  }
  public void filterType(String type){
    System.out.println("Food: ");
    for(String food: "food"){
        System.out.print(food + ", ");
    }
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
     System.out.println("Cheap: ");
    for(double c: maxCost)
        if(maxCost <= 500){
        System.out.print(maxCost + ", ");
    }
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
     System.out.println("Expensive: ");
    for(double e: minCost){
        if(minCost >= 1000){
        System.out.print(minCost + ", ");
        }
    }
  }
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    

  }
}
