/*Реализуйте алгоритм сортировки пузырьком для сортировки массива*/
public class Task2 {
    public static void main(String[] args) {
        int [] array = {2,5,3,4,1,8,7,9,6,10};
        int count = 0;
        int valueOfIndex;
        int sortCount = 0;
        while (count == 0){
            count = 1;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    valueOfIndex = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = valueOfIndex;
                    count = 0;
                }
            }
            sortCount++;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\nКоличество прохождения цикла: " + sortCount);
    }
}
