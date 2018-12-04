package kata5p1;

import SQLQueries.InsertarDatosTabla;
import java.io.IOException;


public class Kata5P1 {

    public static void main(String[] args) {
        try{
            new InsertarDatosTabla().insert("EMAIL", new MailListReader().read("email.txt"));
        }catch(IOException e){
            System.out.println("No such file found");
        }
        
    }
    
}
