package Lab2_6;

import java.util.Scanner;


//2. Дано текст, який містить лише цифри і літери. Визначити, скільки
//слів містить більше 6 символів. 

//2. Значенням рядка служить слово з дефісом. Поміняти місцями
//частини слова до і після дефіса. 

public class Lab6 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        System.out.println("1 Завдання");
        try {
            System.out.println("Введiть рядок:");
            str= in.nextLine();       
        } catch (Exception e) {
            str="1789 – Fletcher Christian, the acting lieutenant on board the Royal Navy ship Bounty, led a mutiny against the commander William Bligh in the South Pacific.";     
        }        
        int length=0;int world = 0;int longerThan6Words = 0;int i=0;
        try {
            for(;i<str.length()-1;){
                int leghtNow=0;           
                while ((str.charAt(i))!=' ' && i<str.length()-1) {
                    i++;
                    leghtNow++;  
                }          
                if(leghtNow>length){
                    length=leghtNow;
                }
                if(leghtNow>6){
                    longerThan6Words++;
                }
                world++;
                i++;
            }
        } 
        catch (Exception e) {
          System.out.println("Error!"+e);
        }
        System.out.println("Найбiльше слово = "+ length);
        System.out.println("Кiлькiсть слiв : "+world);
        System.out.println("слiв в яких бiльше 6 символiв : "+longerThan6Words);
        Lab6_2 Task = new Lab6_2();
        Task.Task2(in);
        in.close();
    }    
}
