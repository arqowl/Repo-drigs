package exampleInterface;

public interface ITelephone {
    public void powerOn();
    public void dial(int phoneNumber);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();

    // for a class that is going to implement this interface, these are the methods that it has to implement
}
