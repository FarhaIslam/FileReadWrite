package farha.ru;
import java.io.*;
public class FileWrite {
	
	public static void main(String[] args) {
		try {
            
            FileWriter writer = new FileWriter("farha.txt", true);
        
            writer.write("Hello World");
            writer.write("\r\n");   
            writer.write("Good Bye!");
            writer.close();
         }
         
         catch (IOException e) {
            
            e.printStackTrace();
        }

	}


		
}


