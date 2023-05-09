package task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vector {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Добрый день создайте векторы, для этого введите их количество: ");
        int valueOfVector = scanner.nextInt();
        VectorConstructor [] vectorConstructors = Vector.saveVector(valueOfVector);
        Vector vector = new Vector();
        while (true) {
            vector.printDekstop();
            vector.myPrint(vectorConstructors);
            for (VectorConstructor vectorConstructor : vectorConstructors) vectorConstructor.printVector();
        }
    }

    //метод, вычисляющий скалярное произведение
    public int dotProduct(VectorConstructor num1, VectorConstructor num2) {
        return num1.getX() * num2.getX() + num1.getY() * num2.getY() + num1.getZ() * num2.getZ();
    }

    //метод, вычисляющий векторное произведение с другим вектором:
    public List<Integer> twoVectorMultiply(VectorConstructor num1, VectorConstructor num2) {
        List<Integer> array = new ArrayList<>();
        array.add(num1.getY() * num2.getZ() - num1.getZ() * num2.getY());
        System.out.println(num1.getY() + " * " + num2.getZ() + " - " + num1.getZ() + " * " + num2.getY());
        System.out.println(array);
        array.add(num1.getZ() * num2.getX() - num1.getX() * num2.getZ());
        array.add(num1.getX() * num2.getY() - num1.getY() * num2.getX());
        return array;
    }

    //    метод, вычисляющий угол между векторами (или косинус угла):
//    косинус угла между векторами равен скалярному произведению векторов,
//    деленному на произведение модулей (длин) векторов:
    public double vectorCos(int dotProductCos, double vectorLongA, double vectorLongB) {
        return dotProductCos / Math.abs(vectorLongA * vectorLongB);
    }

    //метод для суммы:
    public VectorConstructor sum(VectorConstructor num1, VectorConstructor num2) {
        return new VectorConstructor(num1.getX() + num2.getX(),
                num1.getY() + num2.getY(), num1.getZ() + num2.getZ());
    }

    //метод для разности:
    public VectorConstructor difference(VectorConstructor num1, VectorConstructor num2) {
        return new VectorConstructor(num1.getX() - num2.getX(),
                num1.getY() - num2.getY(), num1.getZ() - num2.getZ());
    }

    public static VectorConstructor[] generateVector(int n) {
        VectorConstructor[] vectors = new VectorConstructor[n];
        for (int i = 0; i < n; i++) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);
            int z = (int) (Math.random() * 10);
            vectors[i] = new VectorConstructor(x, y, z);
        }
        return vectors;
    }
    public  double vectorLong(VectorConstructor num){
        double multiply = num.getX() * num.getX() + num.getY() * num.getY() + num.getZ() * num.getZ();
        return Math.abs(multiply);
    }
    public static VectorConstructor[] saveVector(int count){
        VectorConstructor[] vectors = Vector.generateVector(count);
        System.out.println("Ваши векторы: ");
        for (VectorConstructor vector : vectors) {
            vector.printVector();
        }
        return vectors;
    }

    public void myPrint(VectorConstructor[] vectorConstructor) {
        VectorConstructor[] vectorConstructors = new VectorConstructor[1];
        int num1, num2;
        int value = vectorConstructor.length - 1;
        int valueOfMyPrint = scanner.nextInt();
        switch (valueOfMyPrint) {
            case 1 -> {
                System.out.println("Введите номера двух векторов от 0 до " + value);
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();
                System.out.println(dotProduct(vectorConstructor[num1], vectorConstructor[num2]));
            }
            case 2 -> {
                System.out.println("Введите номер вектора до" + value);
                num1 = scanner.nextInt();
                System.out.println(vectorLong(vectorConstructor[num1]));
            }
            case 3 -> {
                System.out.println("Введите номера двух векторов от 0 до " + value);
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();
                System.out.println(twoVectorMultiply(vectorConstructor[num1], vectorConstructor[num2]));
            }
            case 4 -> {
                System.out.println("Введите номера двух векторов от 0 до " + value);
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();
                System.out.println(vectorCos(dotProduct(vectorConstructor[num1], vectorConstructor[num2]), vectorLong(vectorConstructor[num1]), vectorLong(vectorConstructor[num2])));
            }
            case 5 -> {
                System.out.println("Введите номера двух векторов от 0 до " + value);
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();
                vectorConstructors[0] = sum(vectorConstructor[num1], vectorConstructor[num2]);
                vectorConstructors[0].printVector();
            }
            case 6 -> {
                System.out.println("Введите номера двух векторов от 0 до " + value);
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();
                vectorConstructors[0] = difference(vectorConstructor[num1], vectorConstructor[num2]);
                vectorConstructors[0].printVector();
            }
            case 7 -> System.exit(0);
        }
    }
    public void printDekstop(){
        System.out.println("""
                Вы можете произвести вычесления:
                1.Вычеслить скалярное произведение двух векторов введите выбираемые векторы:
                2.Вычеслить длинну вектора выберите вектор:
                3.Вычеслить произведение двух веторов, введите номера векторов:
                4.Вычеслить косинус двух векторов:
                5.Вычеслить сумму двух векторов
                6.Вычесить разность двух векторов
                7.Выйти из программы""");
    }
}
