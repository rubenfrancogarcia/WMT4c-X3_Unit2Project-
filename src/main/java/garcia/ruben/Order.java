package garcia.ruben;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.time.LocalDate;

import garcia.ruben.App.Cupcake;
import garcia.ruben.App.Drink;

public class Order {
    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu){
        System.out.println("Hello Customer, Would you like to place an order (Y or N)"); 
        Scanner input = new Scanner(System.in); 
        String placeOrder = input.nextLine();
        ArrayList<Object> order = new ArrayList<>();
        if(placeOrder.equalsIgnoreCase("y")){

        } else{
            System.out.println("Have a nice day then");
        }
        order.add(LocalDate.now()); 
        order.add(LocalDate.now()); 
        System.out.println("Here is the menu. \n CUPCAKES"); 
        int itemNumber = 0; 
        for(Cupcake cupCake: cupcakeMenu){
            itemNumber++; 
            System.out.println(itemNumber); 
            cupCake.type(); 
            System.out.println("Price: " + cupCake.getPrice());
            System.out.println(); 
        }
        System.out.println("DRINKS");
        for(int i = 0; i <drinkMenu.size(); i++){
            itemNumber++; 
            System.out.println(itemNumber); 
            drinkMenu.get(i).type();
            System.out.println("Price: "+ drinkMenu.get(i).getPrice());
            System.out.println("Price"); 
        }
        boolean ordering = true; 
        while(ordering){
            System.out.println("What would you like to order? Please use the number associated with each item to order");
            int orderChoice = input.nextInt();
            input.nextLine();
            if(orderChoice == 1){
                order.add(cupcakeMenu.get(1)); 
                System.out.println("Item added to order"); 
            }else if(orderChoice == 2){
                order.add(cupcakeMenu.get(2));
                System.out.println("Item added to order");
            }else if(orderChoice == 3){
                order.add(cupcakeMenu.get(3));
                System.out.println("Item added to order");
            }else if(orderChoice == 4){
                order.add(cupcakeMenu.get(4));
                System.out.println("Item added to order");
            }else if(orderChoice == 5){
                order.add(cupcakeMenu.get(5));
                System.out.println("Item added to order");
            }else if(orderChoice == 6){
                order.add(cupcakeMenu.get(6));
                System.out.println("Item added to order");
            }else{
                System.out.println("Sorry, we don't seem to have that on the menu");
            }
            System.out.println("Would you like to continue ordering (Y/N)");
            placeOrder = input.nextLine();
            if(!placeOrder.equalsIgnoreCase("Y")){
                ordering = false; 
            }

        }
        
    }
}
