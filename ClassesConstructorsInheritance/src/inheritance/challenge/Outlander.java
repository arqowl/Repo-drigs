package inheritance.challenge;



public class Outlander extends Car {
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){
        int newVelocidty = getCurrentVelocity() + rate;

        if(newVelocidty == 0){
            stop();
            changeGear(1);
        }
        else if(newVelocidty > 0 && newVelocidty <= 10){
            changeGear(1);
        }
        else if(newVelocidty > 10 && newVelocidty <= 20){
            changeGear(2);
        }
        else if(newVelocidty > 20 && newVelocidty <= 30){
            changeGear(3);
        }
        else{
            changeGear(4);
        }

        if(newVelocidty > 0){
            changeVelocity(newVelocidty, getCurrentDirection());
        }
    }
}
