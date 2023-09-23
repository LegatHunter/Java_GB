//Вычислить n-ое треугольного число(сумма чисел от 1 до n).
//        Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.
//        Пример
//        n = 4 -> 10
//        n = 5 -> 15

//class Answer {
//    public int countNTriangle(int n){
//        // Введите свое решение ниже
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//        return sum;
//    }
//}
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Printer{
//    public static void main(String[] args) {
//        int n = 0;
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            n = 4;
//        }
//        else{
//            n = Integer.parseInt(args[0]);
//        }
//
//        // Вывод результата на экран
//        Answer ans = new Answer();
//        int itresume_res = ans.countNTriangle(n);
//        System.out.println(itresume_res);
//    }
//}

//Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.
//        Напишите свой код в методе printPrimeNums класса Answer.
//        Пример
//        1
//        2
//        3
//        5
//        7
//        11
//        ...

//class Answer {
//    public void printPrimeNums(){
//        // Напишите свое решение ниже
//        int n = 1000;
//        for(int i = 1; i <= n; i++) {
//            boolean isPrime = true;
//            for (int j = 2; j <= Math.sqrt(i); j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                System.out.println(i);
//            }
//        }
//    }
//}
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Printer{
//    public static void main(String[] args) {
//
//        Answer ans = new Answer();
//        ans.printPrimeNums();
//    }
//}


//Напишите класс Calculator, который будет выполнять математические операции (+, -, *, /) над двумя числами и возвращать результат. В классе должен быть метод calculate, который принимает оператор и значения аргументов и возвращает результат вычислений.
//
//        При неверно переданном операторе, программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".

//class Calculator {
//    public int calculate(char op, int a, int b) {
//        int result = 0;
//
//        switch (op) {
//            case '+':
//                result = a + b;
//                break;
//            case '-':
//                result = a - b;
//                break;
//            case '*':
//                result = a * b;
//                break;
//            case '/':
//                if (b != 0) {
//                    result = a / b;
//                } else {
//                    System.out.println("Ошибка: деление на ноль");
//                }
//                break;
//            default:
//                System.out.println("Некорректный оператор: '" + op + "'");
//        }
//
//        return result;
//    }
//}
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Printer{
//    public static void main(String[] args) {
//        int a = 0;
//        char op = ' ';
//        int b = 0;
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            a = 3;
//            op = '+';
//            b = 7;
//        } else {
//            a = Integer.parseInt(args[0]);
//            op = args[1].charAt(0);
//            b = Integer.parseInt(args[2]);
//        }
//
//        Calculator calculator = new Calculator();
//        int result = calculator.calculate(op, a, b);
//        System.out.println(result);
//    }
//}

