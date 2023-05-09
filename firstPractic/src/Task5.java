/*Создайте класс, который описывает вектор (в трёхмерном пространстве).*/
public class Task5 {
    public static void main(String[] args) {
        System.out.println(booleanExpression(false,false,false,false));
    }
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        if(a == b && c == d && b != c && a != d)
            return true;
        else return false;
        // return a & b & c & d;
    }

}
