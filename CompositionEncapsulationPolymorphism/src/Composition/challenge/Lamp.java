package Composition.challenge;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRatng;


    public Lamp(String style, boolean battery, int globRatng) {
        this.style = style;
        this.battery = battery;
        this.globRatng = globRatng;
    }

    public void turnOn(){
        System.out.println("Lamp --> Turning on");
    }

    public String getStyle() {
        return style;
    }


    public boolean isBattery() {
        return battery;
    }


    public int getGlobRatng() {
        return globRatng;
    }

    

    
}
