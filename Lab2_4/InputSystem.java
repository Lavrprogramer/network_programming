package Lab2_4;

import java.util.Scanner;

public class InputSystem {
    Scanner scanner = new Scanner(System.in);

    public double [] returnArray(int number){


        double [] input = new double[number];

        for(int i=0;i<number;i++){
            System.out.print("Введiть значення : "+ i +" ");
            input[i] = scanner.nextDouble();
        }
        scanner.close();
        return input;
    }
    
}
