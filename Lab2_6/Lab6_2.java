package Lab2_6;

import java.util.Scanner;

public class Lab6_2 {

    public void Task2(Scanner scanner) {
        int world = 1;
        String str = scanner.nextLine();
        String world1 = "";
        String world2 = "";
        System.out.println(str);
        int i = 0;
        while (i < str.length()) {
            while (i < str.length() && str.charAt(i) != '-') {
                switch (world) {
                    case 1:
                        world1 += str.charAt(i);
                        break;
                    case 2:
                        world2 += str.charAt(i);
                        break;
                    default:
                        break;
                }
                i++;
            }
            if (i < str.length() && str.charAt(i) == '-') {
                world++;
                i++;
            }
        }
        System.out.println("i="+i);
        System.out.println("Leght" +str.length());
        System.out.println(world2 + " " + world1);
    }
    
}
