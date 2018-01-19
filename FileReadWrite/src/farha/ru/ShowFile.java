package farha.ru;
import java.io.*;
public class ShowFile {
	
	public static void main(String[] args) {
        
		try {

            FileInputStream fin = new FileInputStream("farha.txt") ;
            int character;

            while ((character = fin.read()) != -1) {
                System.out.print((char) character);
            
            }
            
            fin.close();

        } catch (IOException e) {
            e.printStackTrace();
        
        }
    }
}
