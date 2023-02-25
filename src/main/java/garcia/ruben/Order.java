package garcia.ruben;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
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
        for(Object item: order){
            System.out.println(item); 
        }
        double subtotal = 0.0; 
        for(int i =2; i < order.size(); i++){
            if(order.get(i).equals(cupcakeMenu.get(0))){
                cupcakeMenu.get(0).type();
                System.out.println(cupcakeMenu.get(0).getPrice());
                subtotal += cupcakeMenu.get(0).getPrice();
            }else if (order.get(i).equals(cupcakeMenu.get(1))){
                cupcakeMenu.get(1).type();
                System.out.println(cupcakeMenu.get(1).getPrice());
                subtotal += cupcakeMenu.get(1).getPrice();
            }else if (order.get(i).equals(cupcakeMenu.get(2))){
                cupcakeMenu.get(2).type();
                System.out.println(cupcakeMenu.get(2).getPrice());
                subtotal += cupcakeMenu.get(2).getPrice();
            }else if(order.get(i).equals(drinkMenu.get(0))){
                drinkMenu.get(0).type();
                System.out.println(cupcakeMenu.get(0).getPrice());
                subtotal+= drinkMenu.get(0).getPrice();
            }else if(order.get(i).equals(drinkMenu.get(1))){
                drinkMenu.get(1).type();
                System.out.println(cupcakeMenu.get(1).getPrice());
                subtotal+= drinkMenu.get(1).getPrice();
            }else if(order.get(i).equals(drinkMenu.get(2))){
                drinkMenu.get(2).type();
                System.out.println(cupcakeMenu.get(2).getPrice());
                subtotal+= drinkMenu.get(2).getPrice();
            }
        }
        System.out.println("The total is "+ subtotal); 
        new CreateFile();
        new WriteToFile(order); 
    }
}
