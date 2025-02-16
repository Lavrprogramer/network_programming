import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
  
    public static void main(String[] args) throws IOException
{ 
 BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

  System.out.println("Як вас звати? ");
  String Name = (reader.readLine()); 

  System.out.println("Привiт" + Name);

  System.out.println("Скiльки вам рокiв ?");
  int Age = Integer.parseInt(reader.readLine());
  int year = 2025 - Age;
  System.out.println("Ти народився в : " + year); 
}
}