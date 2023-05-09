package task6;

public class VectorConstructor {
    private  int x, y , z;

    public VectorConstructor(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public int getX() { return x; }
    public void setX(int x) { this.x = x;}
    public int getY(){ return y;}
    public void setY(int y) {this.y = y;}
    public int getZ(){return z;}

    public void setZ(int z) { this.z = z;}
    //метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt():
    public void printVector(){
        System.out.println("[" + x + ", " + y + ", " + z + "]");
    }

}
