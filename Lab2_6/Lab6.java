package Lab2_6;

import java.util.Scanner;

//2. Дано текст, який містить лише цифри і літери. Визначити, скільки
//слів містить більше 6 символів. 

//2. Значенням рядка служить слово з дефісом. Поміняти місцями
//частини слова до і після дефіса. 

public class Lab6 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Lab6_2 Task = new Lab6_2();
        Task.Task2(in);
        String str;
        try {
            str= in.nextLine();       
        } catch (Exception e) {
            str="New ТУт є 2 слова по 5 символів та деякі слова менші та більше";     
        }    
              
        int length=0;
        int world = 0;
        int i=0;
        try {
            for(;i<str.length()-1;){
                int leghtNow=0;           
                while ((str.charAt(i))!=' ' && i<str.length()-1) {
                    i++;
                    System.out.println("i="+i);
                    leghtNow++;  
                }          
                if(leghtNow>length){
                    length=leghtNow;
                }
                world++;
                i++;
                System.out.println("i="+i);
            }
        } 
        catch (Exception e) {
          System.out.println("Error!"+e);
        }
        System.out.println("Найбільше слово = "+ length);
        System.out.println("Кількість слів : "+world);
        //System.out.println("String  : "+str);
        in.close();
        System.out.println("i="+i);
        System.out.println(str.length());
    }    
}
