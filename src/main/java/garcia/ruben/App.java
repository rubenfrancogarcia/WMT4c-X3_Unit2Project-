package garcia.ruben;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<>(); 
        Cupcake cupcake = new Cupcake(); 
        RedVelvet redVelvet = new RedVelvet(); 
        Chocolate chocolate = new Chocolate();
        System.out.println( "We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing.");
        Scanner input = new Scanner(System.in); 
        System.out.println("We are deciding on the price for our standard cupcake. Here is the description"); 
        cupcake.type();
        System.out.println("How much would you like to charge for the cupcake?(Input a numerical number taken to 2 decimal places)");
        String priceText = input.nextLine();  
        Double price = Double.parseDouble(priceText);
        cupcake.setPrice(price);
        cupcakeMenu.add(cupcake);
        System.out.println("How much would you like to charge for the red velvet cupcake?(Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();  
        price = Double.parseDouble(priceText);
        redVelvet.setPrice(price);
        cupcakeMenu.add(redVelvet); 
        System.out.println("How much would you like to charge for the chocolate cupcake?(Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();  
        price = Double.parseDouble(priceText);
        chocolate.setPrice(price);
        cupcakeMenu.add(chocolate);
        ArrayList<Drink> drinkMenu = new ArrayList<>(); 
        Drink water = new Drink();
        Drink soda = new Soda();
        Drink milk = new Milk();
        System.out.println( "We are in the middle of creating the drink menu. We currently have three drinks on the menu but we need to decide on pricing.");
        System.out.println("We are deciding on the price for our standard drink. Here is the description"); 
        water.type();
        System.out.println("How much would you like to charge for the drinik?(Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();  
        price = Double.parseDouble(priceText);
        water.setPrice(price);
        drinkMenu.add(water);
        System.out.println("How much would you like to charge for the soda?(Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();  
        price = Double.parseDouble(priceText);
        soda.setPrice(price);
        drinkMenu.add(soda); 
        System.out.println("How much would you like to charge for the milk?(Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();  
        price = Double.parseDouble(priceText);
        milk.setPrice(price);
        drinkMenu.add(milk); 
        new Order(cupcakeMenu, drinkMenu); 

    }

    public class Cupcake{
        double price; 
        
        public void setPrice(double price){
            this.price = price; 
        }

        public double getPrice(){
            return price; 
        }

        public void type()
        {
            System.out.println("A basic, generic cupcake, with vanilla frosting");
        }
    }

    public class RedVelvet extends Cupcake{
        public void type(){
            System.out.println("A red velvet based cupcake, with cream cheese frosting"); 
        }
    }

    public class Chocolate extends Cupcake {
        public void type(){
            System.out.println("A chocolate based cupcake, with chocolate frosting"); 
        }
    }

    public class Drink{
        double price; 
        public void setPrice(double price){
            this.price = price; 
        }

        public double getPrice(){
            return price; 
        }

        public void type(){
            System.out.println("The type is a generic drink"); 
        }
    }

    public class Soda extends Drink{
        public void type(){
            System.out.println("I am a soda drink"); 
        }
    }

    public class Milk extends Drink{
        public void type(){
            System.out.println("I am a milk drink"); 
        }
    }
}
