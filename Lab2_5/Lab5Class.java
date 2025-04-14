import java.util.Scanner;

public class Lab5Class {

    Scanner in = new Scanner(System.in);

    public void inputSystem(){

        System.out.print("Input n: ");
        int n = in.nextInt();
        System.out.print("Input m: ");
        int m = in.nextInt();
        double[][] K = new double[n][m];
        Result(n, m,K); 

    }    
    private void Result(double n,double m,double[][]K)
    {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                K[i][j] = (Math.random() * 100);
                System.out.printf("%10.2f", K[i][j]);
            }
            System.out.print(" \n");
        }
        in.close();

        double Sum1 = 0, Sum2 = 0;

        for (int i = 0; i < n; i++) { //Сума елементів <7
            for (int j = 0; j < m; j++) {
                if (7 > K [i][j]) {
                    Sum1 = Sum1 + K [i][j];
                }
            }
        }

        for (int i = 0; i < n; i += 2) { //сума елементів >7
            for (int j = 0; j < m; j++) {
                if (7 < K[i][j]) {
                    Sum2 = Sum2 + K[i][j];
                }
            }
        }
        System.out.printf("Значення суми менше 7 = %-10.2f %n Значення суми бiльше 7 = %-10.2f %n", Sum1,Sum2);
        System.out.printf("%s  %-100.2f", "Значення рiзницi",(Sum1-Sum2));
    }
}

   