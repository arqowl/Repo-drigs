package Composition.PC;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);

        Case theCase =  new Case("220B","Dell" , "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        thePC.powerUp();




        /*thePC.getMonitor().drawPixelAt(1500, 1200, "RED");
        //Acessando o atributo da classe monitor através do get e invocando a função de monitor.

        thePC.getMotherboard().loadProgram("Windows 1.0");
        //Acessando o atributo da classe motherboard através do get e invocando função loadProgram().

        thePC.getTheCase().pressPowerButton();
        //Acessando o atributo da classe Case através do get e invocando função pressPowerButton().

        //Estamos acessando os objetos das classes que definimos como atributos na PC e usando seus métodos.
        (Isso se os métodos get forem public)
        */




    }
}
