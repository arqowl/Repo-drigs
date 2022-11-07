package exampleInterface;

public class MobilePhone implements ITelephone {
    //a palavra implements força a gente a colocar todos os métodos da interface criada.
    
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    
    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
        
    }
    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Ring ring");
        }else{
            isRinging = false;
        }
        return isRinging;
        
    }
    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Now ringing "+phoneNumber +" mobile phone");
        }else{
            System.out.println("Phone is switched off");
        }
        
        
    }
    @Override
    public boolean isRinging() {
        return isRinging;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered up");
        
    }
    
}

