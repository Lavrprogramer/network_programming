
import java.util.Scanner;
import java.lang.Math;

//  1-3 2-2

public class lab3 {

      public static void main(String[] args) 
    {
      Scanner scanner = new Scanner(System.in);
      

      //визиваемо функцію зчитування ,приймаємо значення та передаємо їх в функцію обрухунку 

      double[] values = inputsystem(scanner);
      double z = values[0];
      double d = values[1];

      System.out.println(z + "wtwtwtw" + d);

      calculation(values);
      
      
      scanner.close();
    }

   public static double[] calculation(double[] values){

    // a[k do l] h =h 
    double w = values[0];
    double q = values[1];
    double k = values[2];
    double l = values[3];
    double h = values[4];
    double x=k;
    double a;
    int n = (int)((l-k)/h)+1;
    System.out.println("Н до обробки "+n);
    if(n==0){
      n = 1;
    }
    if(n<0){
      n=n*(-1);
    }
    System.out.println("Н після обробки"+n);
    double results[] = new double[n];

    int i=0;

    System.out.print("значення k: "+ k);
    System.out.print("начення l: " + l);
    System.out.print("начення l: " + h);
      
      for(x=x; x<=l ;x=x+h)
      { 
        a= x;  
        System.out.println(a+ "= a ");    
        double r = a*Math.sin(w*q);
        results[i]= r; 
        System.out.println("Масив = "+results[i]);
        System.out.println("х = "+r);
        i++;
        System.out.println(i);     
      }

      System.out.println("Завершення цикулу");
      System.out.println(results[0]);
      System.out.println(results[5]);

      System.out.println(i); 

      return results;
    }

    public static double[] inputsystem(Scanner scanner){

      System.out.print("Введіть значення w: ");
      double w = scanner.nextDouble();
      System.out.print("Введіть значення q: ");
      double q = scanner.nextDouble();
      System.out.print("Введіть значення k: ");
      double k = scanner.nextDouble();
      System.out.print("Введіть значення l: ");
      double l = scanner.nextDouble();
      System.out.print("Введіть значення h: ");
      double h = scanner.nextDouble();
      double[] input = {w,q,k,l,h};
      return input;
    }

 //  public static  double[] inputsystem2 (Scanner scanner){
 //   return 
 //  }
    
   }

    
