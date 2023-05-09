/*Дан массив целых чисел и ещё одно целое число.
  Удалите все вхождения этого числа из массива (пропусков быть не должно).*/
public class Task4 {
    public static void main(String[] args) {
        int[] array = {1, 0, 4, 6, 1, 0, 8, 5};
        System.out.print("Ваш начальный массив: ");
        int value = 8;
        int finishArray [] = removeValue(array, value);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\nВаш массив без вхождения числа " + value + ": ");
        for (int i = 0; i < finishArray.length; i++) {
            System.out.print(finishArray[i] + " ");
        }
    }

    public static int[] removeValue(int[] arrayValue, int value) {
        int[] newArray = new int[arrayValue.length];
        int countNewArray = 0;
        for (int i = 0; i < arrayValue.length; i++) {
            if (arrayValue[i] != value) {
                newArray[countNewArray] = arrayValue[i];
                countNewArray++;
            }
        }
        int finishArray[] = new int[countNewArray];
        for (int i = 0; i < countNewArray; i++) {
            finishArray[i] = newArray[i];
        }
        return finishArray;
    }
}


