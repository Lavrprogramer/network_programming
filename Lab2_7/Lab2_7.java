package Lab2_7;

import java.util.Currency;

/*1 авдання 12 варіант
 Клас, який представляє книгу, з 
методами виведення на екран автора 
книги, назви книги і кількості її 
сторінок

2 завдання 12 варіант

Батьківський клас, що представляє 
книгу, з методами виведення на екран 
автора книги, назви книги і кількості її 
сторінок. Дочірній клас, що 
представляє електронну книгу з 
методами виведення формату і розміру 
файлу. Головний клас з методом main, 
який одним оператором виводить на 
екран всі доступні властивості об'єктів 
обох класів, що представляють 
елементи загального масиву

3 завданян 12 варіант

Абстрактний батьківський клас, що 
представляє валюту, з абстрактним 
методом переведення суми валюти в 
гривні і неабстрактним методом 
виведення назви валюти. Дочірні класи, 
що представляють долар, євро та 
англійський фунт з реалізаціями 
абстрактних методів. Головний клас з 
методом main, що виводить назви 
валют і вартість їх 100 одиниць в 
гривнях для набору валют 
*/

public class Lab2_7 {
    public static void main(String[] args) {

      // Завдання 1: створення книги
        Book book = new Book("Айзек Азімов", "Фундація та Імперія", 350);
        book.showInfo();

        System.out.println("\n---");

        // Завдання 2: електронна книга
        DigitalBook ebook = new DigitalBook("Френк Герберт", "Дюна: Месія", 220, "PDF", 2.7);
        ebook.showFullInfo();

        System.out.println("\n---");
        
        // Завдання 3: валюти
        Dollar dollar = new Dollar(40.0);
        Euro euro = new Euro(43.0);
        Pound pound = new Pound(50.0);

        double amount = 100;

        // долар
        dollar.displayCurrencyName();
        double dollarHryvniaValue = dollar.toHryvnia(amount);
        System.out.println("Вартість " + amount + " " + dollar.getName() + " в гривнях: " + dollarHryvniaValue);
        System.out.println();

        // євро
        euro.displayCurrencyName();
        double euroHryvniaValue = euro.toHryvnia(amount);
        System.out.println("Вартість " + amount + " " + euro.getName() + " в гривнях: " + euroHryvniaValue);
        System.out.println();

        // фунт
        pound.displayCurrencyName();
        double poundHryvniaValue = pound.toHryvnia(amount);
        System.out.println("Вартість " + amount + " " + pound.getName() + " в гривнях: " + poundHryvniaValue);
        
    }
}
