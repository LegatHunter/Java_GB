// Дано четное число N (>0) и строки c1 и c2, которые следует учитывать как 1 символ.
// Написать метод, который вернет строку длины N*2, которая
// состоит из чередующихся последовательностей c1 и c2, начиная с c1.

package org.seminars.seminar2;

public class task1 {
    public static void main(String[] args) {
        System.out.println(getRepeatStr(3));
    }

    public static String getRepeatStr(int n) {
        String c1 = "c1";
        String c2 = "c2";
        return (c1 + c2).repeat(n);
    }

}


// Напишите метод, который сжимает строку.
// Пример: aaaabbbcdd → a4b3cd2

package org.seminars.seminar2;


import java.util.ArrayList;
import java.util.List;


public class task2 {
    public static void main(String[] args) {
        System.out.println(reduceStr("aaaabbbcdd"));
        System.out.println(reduceStr("aaaabbbcddaaabbb"));
    }

    public static String reduceStr(String str) {
        String[] arr = str.split("");
        // char[] chars = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        List<String> tmp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                tmp.add(arr[i]);
            } else {
                if (arr[i].equals(arr[i - 1])) {
                    tmp.add(arr[i]);
                } else {
                    stringBuilder.append(arr[i - 1]).append(tmp.size());
                    tmp.clear();
                    tmp.add(arr[i]);
                }
            }
            if (i == arr.length - 1) {
                stringBuilder.append(tmp.get(0)).append(tmp.size());
            }
        }
        return stringBuilder.toString();
    }
}


//    public static void reduce(String arg) {
//        int count = 1;
//        String[] arr = arg.split("");
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < arr.length; i++) {
//            if (i == 0) {
//                result.append(arr[i]);
//                continue;
//            }
//
//            if (arr[i].equals(arr[i - 1])) {
//                count ++;
//            } else if (!(arr[i].equals(arr[i - 1])) && count != 1){
//                result.append(count).append(arr[i]);
//                count = 1;
//            } else {
//                result.append(arr[i]);
//            }
//        }
//        if (count != 1) {
//            result.append(count);
//        }
//        System.out.println(result);
//    }


// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает boolean значение)

package org.seminars.seminar2;

public class task3 {
    public static void main(String[] args) {
        System.out.println(isPolindrom("aba"));
        System.out.println(isPolindrom("abb"));
    }

    public static boolean isPolindrom(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        String revered = stringBuilder.reverse().toString();
        return str.equals(revered);
    }
}


//Напишите метод, который вернет содержимое текущей папки в виде массива строк.
//Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
//Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения,
// оно должно записаться в лог-файл.

package org.seminars.seminar2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task5 {
    static Logger logger = Log.log((Task5.class.getName()));
    public static void main(String[] args) {
        // System.out.println(Arrays.toString(getFileStr(".")));
        write(".");

    }

    public static String[] getFileStr(String path) {
        File dir1 = new File(path);
        if (dir1.isFile()) {
            throw new RuntimeException("Это не папка");
        } else {
            return dir1.list();
        }
    }

    public static void write(String path) {
        try (FileWriter in = new FileWriter("task5.txt", true)){
            String[] data = getFileStr(path);
            for (String s: data){
                in.append(s).append("\n");
                in.flush();
            }
            throw new IOException();
        } catch (IOException e) {
            logger.log(Level.INFO, "ошибка");
        }
    }
}


