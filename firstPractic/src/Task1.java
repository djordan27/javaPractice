/*Задача:

        Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.

        Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].*/
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        maxMinMiddle(array());

    }
    public static int[] array(){
        int [] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 10) ;
        }
        return myArray;
    }
    public static void maxMinMiddle(int[] array){
        int max = array[0];
        int min = max;
        double middle;
        int sum = 0;
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            if (max < array[i]) max = array[i];
            if (min > array[i]) min = array[i];
            if (i == 0) System.out.print(array[i]);
            else System.out.print(", " + array[i]);
        }
        System.out.println("]");
        middle = (double) sum / array.length;

        System.out.println("Ваше максимальное число: " + max + "\nВаше минимальное число: " +
                min + "\nВаше среднее число: " + middle + "\nСумма всех чисел массива: " + sum);
    }
}