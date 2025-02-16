import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Змішали m1 грамів розчину, що містить p1 % солі з m2 грамами
//розчину, що містить p2 % солі. Вивести загальну масу розчину та
//відсотковий вміст солі в ньому. 

public class App2 {
    public static void main(String[] args) throws IOException
{ 
    BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

    System.out.println("маса розчину 1:");
float m1 = Float.parseFloat(reader.readLine());
System.out.println("% солі:");
float p1 = Float.parseFloat(reader.readLine());
System.out.println("маса розчину 2:");
float m2 = Float.parseFloat(reader.readLine());
System.out.println("% солі:");
float p2 = Float.parseFloat(reader.readLine());
float m = m1 + m2; float mp = (p1*m1/100)+(p2*m2/100); float s = (mp/m)*100;
System.out.println("Маса розчину:" + m + "г.");
System.out.println("% солі в новому розчині" + s + "%"); 

}
}