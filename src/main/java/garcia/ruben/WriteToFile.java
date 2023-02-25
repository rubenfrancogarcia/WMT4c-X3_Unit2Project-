package garcia.ruben;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteToFile {
    WriteToFile(ArrayList<Object> order){
        try{
            FileWriter fw = new FileWriter("salesData.txt", true);
            PrintWriter salesWriter = new PrintWriter(fw);  
            for(Object item: order){
                salesWriter.println(item.toString());
            }
            salesWriter.close();
            System.out.println("Successfully wrote to the file");
        }catch(IOException e){
            System.out.println("An error occurred");
        }
    }
}
