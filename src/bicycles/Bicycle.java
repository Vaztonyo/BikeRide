package bicycles;

public class Bicycle {

   private int speed;


    public void accelerate() {
        speed += 5;

       // return speed;
    }

    public void brake() {
        speed -= 3;

        //return speed;
    }

    public void stop() {
        speed = 0;
    }

    public int currentSpeed() {
        return speed;
    }
}

