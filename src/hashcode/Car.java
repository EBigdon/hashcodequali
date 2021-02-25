package hashcode;

import java.awt.*;


public class Car extends cityPlan{
    Car(String[] pPath, int pNumberOfStreets, String[] pStreetsToPass) {
        super(pPath, pNumberOfStreets, pStreetsToPass);
    }

    void Car(Point target, Point current){

    }

    void driveStr(Street s){
        while (Point == false)
        {
            try {
                this.wait(1000);
            } catch (InterruptedException e) {
            }
        }
        try {
            this.wait(s.time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while(!s.queue.get(0).equals(this)){
            try {
                this.wait(1000);
            } catch (InterruptedException e) {
            }
        }
        currentTL = s.goesTo;
        goesOn();
    }

    boolean goesOn(){
        if(currentTL == targetTL){
            return false;
        }
        else {
            return true;
        }
    }
}
