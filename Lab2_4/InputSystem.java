package Lab2_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputSystem {

    Scanner scanner = new Scanner(System.in);
    
    public double [] returnArray(int number)
    {
        double [] input = new double[number];
            for(int i=0;i<number;i++)
            {
                while (true){
                try{
                    System.out.print("Введiть значення : "+ (i+1) +" ");
                    input[i] = scanner.nextDouble();
                    break;
                    }
                catch(InputMismatchException e){
                    System.out.println("Помилка введення!!!");
                    scanner.next();
                    }
                }     
            }
    System.out.println("Finish");
    scanner.close();
    return input;
    }
}
