package Lab2_4;
//1
// 4. Задано масив значень A={ai} з 10 елементів. Знайти максимальний і 
// мінімальний елементи, поміняти їх місцями. +

//2
// 2. Видалити з масиву нульові елементи, які містяться в ньому, а від’ємні 
// замінити на їх модуль.


//Перевірити чи змінюєтся масив elements 25 стр.  після операцій 
public class Lab4 {
    public static void main(String[] args)
     {    
        InputSystem input = new InputSystem(); //Створюємо об'єкти для вводу 
        Lab4Cycles cycles = new Lab4Cycles(); // 1 завдання
        ArrayDisplayer display = new ArrayDisplayer();//виводу значень масиву 
        Lab4Cycles2 cycles2 = new Lab4Cycles2();//2 завдання

        double [] elements=input.returnArray(10); //Система введення ,параметр вказує кількість значень які буде введено
        
        System.out.println("Введенi значення :");
        display.printInline(elements); 
        System.out.println("1 завдання :");
        double [] Lab1Array = cycles.GetElementToCalculate(elements);
        display.printInline(Lab1Array);   
        System.out.println("2 завдання :");
        double [] lab2Array =cycles2.SortingAndCleaning(elements);
        display.printInline(lab2Array);             
    }
}