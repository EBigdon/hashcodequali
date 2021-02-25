package hashcode;

import java.awt.*;
import java.util.ArrayList;


public class Street extends cityPlan{

    public static Point goesTo;
    public static int time;
    public static ArrayList<Car> queue = new ArrayList();

    Street(int pStartIntersection, int pEndIntersection, String pStreetName, int pL) {
        super(pStartIntersection, pEndIntersection, pStreetName, pL);
    }


    void Street(Point gt,int T){
        goesTo = gt;
    }

    public static void addCarQueue(Car c){
        queue.add(c);
    }
    public static void deleteCarQueue(){
        queue.remove(0);
    }
}