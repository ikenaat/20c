/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author meow
 */

import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


          ItemManager list = new ItemManager();

          Scanner kenneth = new Scanner(System.in);



                   while(true){
         System.out.println("1. Entrance");
          System.out.println("2. Insert");
          System.out.println("3. Display");
          System.out.println("4. Updated");
          System.out.println("5. find items");
          System.out.println("6. Deleted all items");
           System.out.println("7. Leave");

           String scan = d  .nextLine();


           if( scan.equals("1")) {
               System.out.println("Welcome to System");
                String Items = kenneth.nextLine();


           }else if( scan.equals("2")) {
               System.out.println("What is the item that you would like to Insert?");
                String Items = kenneth.nextLine();
                System.out.println();
                list.insertItem( Items);
                     System.out.println();


           } else if( scan.equals("3")){

                     list.displayItems();
                        System.out.println();

                if( scan.equals("4")) {
               System.out.println("What would you like to update?");
            int item = Integer.parseInt(kenneth.nextLine());

                     System.out.println(" And what is the replacement item? ");
                     String repItem = kenneth.nextLine();
                     list.updateItem(item, repItem);
                      System.out.println();

                       } else if( scan.equals("5")){

                     System.out.println("What is that you want to find? ");
                     String item = kenneth.nextLine();
                     list.findItem(item);
                        System.out.println();



                 } else if( scan.equals("6")){

                    System.out.println("What item would you like to be delete?");
                    list.displayItems();
                     int  index = Integer.parseInt(kenneth.nextLine()) ;
                     list.deleteItem(index);
                     System.out.println();



                 } else if( scan.equals("7")){

                     System.out.println("Tenks 4 ebreting bossing ");
                    break;


                 } else {
                     System.out.println("Cge Bye");


                 }



                 }


                   }
    }
}