package exampleInterface;

public class Main {
    public static void main(String[] args) {
        ITelephone timsPhone = new Deskphone(123456);

        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(24565);
        //timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer();

        //you can define the actual type to be the type of the interface(ITelephone timsPhone = new Deskphone(123456);)
        //what we couldn´t do is (ITelephone timsPhone = new ITelephone(123456);)
    }
}
