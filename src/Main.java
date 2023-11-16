import com.sun.jdi.IntegerValue;
import com.workintech.model.Point;
import com.workintech.model.Player;
import com.workintech.model.Weapon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scannerPointF_X = new Scanner(System.in);
        System.out.println("scannerPointFirst_X icin deger giriniz:");
        int X1 = Integer.parseInt(String.valueOf(scannerPointF_X.nextLine()));

        Scanner scannerPointF_Y = new Scanner(System.in);
        System.out.println("scannerPointFirst_Y icin deger giriniz:");
        int Y1 = Integer.parseInt(String.valueOf(scannerPointF_Y.nextLine()));

        Point first = new Point(X1,Y1);
        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());

        System.out.println(".......................................");

       Player player1 = new Player("Emre",100,Weapon.SWORD);
        System.out.println(player1);


    }
}