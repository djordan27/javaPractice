/*Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
        Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.*/
public class Task3 {
    public static void main(String[] args) {
        boolean simple;
        for (int i = 2; i <= 100 ; i++) {
            simple = true;
            for (int j = 2; j < i; j++) {
                if(i%j == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple) System.out.print(i + " ");
        }
    }
}
