package hashcode;

private static trafficlight currentTL;
private static trafficlight targetTL;

public class Car {
    void Car(){

    }

    void driveStr(Street s){
        while (trafficlight.canDrive().equals(false) && s.queue[0].equals(this))
        {
            try {
                this.wait(1000);
            } catch (InterruptedException e) {
            }
        }
        this.wait(s.time);
        currentTL = s.target;
        check();
    }

    boolean check(){
        if(currentTL == targetTL){
            return false;
        }
        else {
            return true;
        }
    }
}
