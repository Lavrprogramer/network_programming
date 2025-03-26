import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.lang.Math;

//  1-3 2-2

public class lab3 {

    public static void main(String[] args) 
    {
      Scanner scanner = new Scanner(System.in);

      boolean programCycle=true;
     while (programCycle) {

      menu();
      int item = scanner.nextInt();
      switch (item) {
        case 1:
          double[] values = inputsystem(scanner);
          calculateTask1(values);
          break;

        case 2:
         calculateTask2(scanner);
          break;

        case 3:
          programCycle = false;
          break;
      
        default:
          break;
     } 
    }
    scanner.close();

  /*   double[] test = new double[]{7,12,2,5,4,2,12,54,1,76,8,9,120};
    getMaxElementInfo(test);
    getMinElementInfo(test); */    
    }

  public static void menu(){
      System.out.println("Вибір програми:");
      System.out.println("1: Завдання №1");
      System.out.println("2: Завдання №2");
      System.out.println("3: Exit");      
    }
 
   public static double[] calculateTask1(double[] values){

    // a[k do l] h =h 
    double w = values[0];
    double q = values[1];
    double k = values[2];
    double l = values[3];
    double h = values[4];
    int n = (int)((l-k)/h)+1;
    if(n==0){n = 1;}
    if(n<0){n=n*(-1);}
    double results[] = new double[n];
    int i=0;
      for(double a=k; a<=l ;a+=h)
      {   
        double x = a*Math.sin(w*q);
        results[i]= x; 
        i++;
        System.out.println(i);
        System.out.println("x = "+x+" ; "+"a ="+a);     
      }
      System.out.println("Завершення цикулу");
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

   public static  double[]  calculateTask2(Scanner scanner){ 
    System.out.println("Введіть а:"); 
    double a = scanner.nextDouble();
    System.out.println("Введіть b:"); 
    double b = scanner.nextDouble();
    double x,y,Z;
    int i=0;
    double resultsZ[] = new double[11];
    double resultsx[] = new double[11];

    for (x=0 ; x<=10;x=x+2)
    {
      y = Math.pow(x, 5)+b*x+Math.pow(b, 3);
      Z=Math.pow(x, 5)+a*y+Math.pow(b, 3);
      resultsZ[i]= Z;
      resultsx[i]= x;
      i++;
      System.out.println("_y=_"+y+"_z=_"+Z+"_x="+x);
        
   //  System.out.printf("%d + %d",y,z);

    }
    int elementsNumber=getMaxElementInfo(resultsZ);
    System.out.println("Zmax ="+resultsZ[elementsNumber]+"___X ="+resultsx[elementsNumber]);

    return null;
 }

  public static int getMaxElementInfo(double[] elements)
 {
    int elementsNumber=0;
    double maxElement=elements[0];

    for(int i=1;i< elements.length;i++ ){
      if(elements[i]>maxElement){
        maxElement=elements[i];
        elementsNumber=i;
      }
    }
 //   System.out.println("getMaxElementInf - Max ="+ maxElement);
    return elementsNumber;
  }

  public static int getMinElementInfo(double[] elements)
  {
    int elementsNumber=0;
    double minElement=elements[0];

    for(int i=1;i< elements.length;i++ ){
      if(elements[i]<minElement){
        minElement=elements[i];
        elementsNumber=i;
      }
    }
    System.out.println("getMinElementInf - Min ="+ minElement);
    return elementsNumber;
  }
    
   }

    
