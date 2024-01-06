import java.awt.*;
public class SomethingIsWrong {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        int RectArea = myRect.height * myRect.width;
        System.out.println("myRect's area is " + RectArea);
    }
}