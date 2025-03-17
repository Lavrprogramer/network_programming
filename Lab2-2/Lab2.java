
import java.util.Scanner;
import java.lang.Math;

public class Lab2 {


    public static void main(String[] args) 
    {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Введіть значення A: ");
                double A = scanner.nextDouble();

                ex1(A);
                
                System.out.print("Введіть значення b: ");
                double b = scanner.nextDouble();
                System.out.print("Введіть значення x: ");
                double x = scanner.nextDouble();
                System.out.print("Введіть значення t: ");
                double t = scanner.nextDouble();

               // ex2_1(b,x,t);

                
                double result = ex2_1(b,x,t);
                System.out.println("Результат 2 завдання 1 прикладу:  p ="+ result);//2 результат

                System.out.print("Введіть значення z: ");
                double z = scanner.nextDouble();
                System.out.print("Введіть значення d: ");
                double d = scanner.nextDouble();
                double result2 = ex2_2(z,d); //3 
                System.out.print("Результат 2 завдання 2 прикладу: х = "+ result2);
                scanner.close();
            }

            public static void ex1(double A) {

   //             System.out.println("Завдання 1" + A);
                double Z1 = Math.cos(A) + Math.sin(A) + Math.cos(3 * A) + Math.sin(3 * A);
                double Z2 = 2 * Math.sqrt(2) * Math.cos(A) * Math.sin((Math.PI / 4)*Math.PI + 2 * A);
                
                  // Вивід результатів1
                System.out.println("Результат 1 завдання 1 прикладу: Z1 = " + Z1);
                System.out.println("Результат 1 завдання 2 прикладу: Z2 = " + Z2);

            }
            public static double ex2_1(double b ,double x,double t){

    //            System.out.println("Завдання 2 " + b + " "+ x +  " "+ t);
                double a = 0.73*t-Math.sin(x);
                
                if(a<0){
                    return 2.45*Math.pow(x,2)+ Math.exp(-x*a);
                }
                else{
                    return (Math.sqrt(a+b))/Math.log(Math.pow(a, 2)+Math.pow(b, 2));
                }

            }

            public static double ex2_2(double z, double d){

                if (d < z / 2) {
                    return 2 * z * d - Math.pow(d, 2); // 2zd - b²
                } else {
                    return Math.pow(z, 2) + Math.pow(d, 2); // z² + b²
                }
                
            }

        }
