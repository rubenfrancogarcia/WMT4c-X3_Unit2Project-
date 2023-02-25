package garcia.ruben;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    CreateFile(){
        try{
            File salesData = new File("salesData.txt"); 
            if(salesData.createNewFile()){
                System.out.println("File created")
            }else{
                System.out.println("File already exists");
            }
        }catch(IOException e){
            System.out.println("an error occurred");
        }
    }
}
