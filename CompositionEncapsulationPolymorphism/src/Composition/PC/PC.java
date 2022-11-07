package Composition.PC;
public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;
    /*This is composition again. we have created a new class called PC, it has a case(theCase variable) which is the
     field we have defined. It has a monitor(the field monitor) and of course it has a motherboard(motherboard field).
     You can see the advantage here, because if you´re using extends to inherit, you can only, in Java, inherit from
     one class at a time. So you could see that we run into difficulties and limitations quite quickly if we´re using
     standard Java inheritance. The PC class comprises of these three other classes(the case, the monitor and the
     motherboard). So the PC is going to have the objects in each instance that we create.
     */


    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        //fancy graphics
        monitor.drawPixelAt(1200, 50, "yellow");
    }

    
}
