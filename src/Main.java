import javax.naming.PartialResultException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Ввод значений имени и числа");
        String name_num = scr.nextLine();
        String[] array = new String[2];
        array = name_num.split(" ");

        if (array[1].length() < 2 || array[1].length() > 5)  // проверка числа на больше 2 и меньше или равно 5
        {
            System.out.println("Введите число с количеством знаков от 2 до 5 включительно");
        }
        int parse = Integer.parseInt(array[1]);   // конвертация строки в число
        int sum = Sum(parse);
        Method_print(array[0],sum);

    }
// метод выисления суммы цифр в числе
        public static int Sum(int parse) {
        int sum = 0;
        if (parse < 10) {
            return parse;
        } else {
            sum = sum + parse % 10;
            parse = Sum((parse - sum) / 10);
        }
        sum = sum + parse;
        return sum;
    }

// метод вывода суммы как текст
    static void Method_print(String name, int summ) {
        switch (summ) {
            case 1:
                System.out.println("Hello, " + name + "! " + "Сумма цифр в числе = Один"); break;
            case 2:
                System.out.println("Hello, " + name + "! " + "Сумма цифр в числе = Два"); break;
            case 3:
                System.out.println("Hello, " + name + "! " + "Сумма цифр в числе = Три"); break;
            case 4:
                System.out.println("Hello, " + name + "! " + "Сумма цифр в числе = Четыре"); break;
            case 5:
                System.out.println("Hello, " + name + "! " + "Сумма цифр в числе = Пять"); break;
            case 6:
                System.out.println("Hello, " + name + "! " + "Сумма цифр в числе = six"); break;
            case 7:
                System.out.println("Hello, " + name + "! " + "Сумма цифр в числе = Семь"); break;
            case 8:
                System.out.println("Hello, " + name + "! " + "Сумма цифр в числе = Восемь"); break;
            case 9:
                System.out.println("Hello, " + name + "! " + "Сумма цифр в числе = Девять"); break;
            case 10:
                System.out.println("Hello, " + name + "! " + "Сумма цифр в числе = Десять"); break;
            default:
                System.out.println("ERR");
        }
    }

}








