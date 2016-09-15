package edu.upc.eetac.dsa;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Figure [] ll = new Figure[4];
        ll[0] = new Square(10);
        ll[1] = new Triangle(4,3);
        ll[2] = new Rectangle(10,7);
        ll[3] = new Circle(10);
        double sum=0;
        Arrays.sort(ll, new Comparator<Figure>() {
            public int compare(Figure o1, Figure o2) {
                return (int) (o1.area() - o2.area());
            }
        });
        for (Figure f:ll){
            sum=sum+f.area();
            System.out.println("The " + f.type() + "'s area is " + f.area());
        }
        System.out.println();
        System.out.println("The sum of areas is " + sum);
    }
}
