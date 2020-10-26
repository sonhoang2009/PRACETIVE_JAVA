package Pracite.EX2;

import java.lang.reflect.Field;

public class TestFlight {
    public static void main(String[] args) {
        Flight g1 = new Flight(857,"Toronto");
        g1.display();

        Flight g2 =new Flight(-123,"toronto");
        g2.display();
    }
}
