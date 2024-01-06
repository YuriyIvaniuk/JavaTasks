public class NumberHolder {
    public int anInt;
    public float aFloat;
    public static void main(String[] args){
        NumberHolder numberHolder = new NumberHolder();
        numberHolder.anInt=16;
        numberHolder.aFloat=1.6f;
        System.out.print("Integer = "+ numberHolder.anInt + "\nFloat= "+ numberHolder.aFloat);
    }
}