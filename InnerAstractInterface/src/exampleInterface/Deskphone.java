package exampleInterface;

public class Deskphone implements ITelephone {
    //a palavra implements força a gente a colocar todos os métodos da interface criada.
    
    private int myNumber;
    private boolean isRinging;

    @Override
    public void answer() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public boolean callPhone(int phoneNumber) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public void dial(int phoneNumber) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public boolean isRinging() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public void powerOn() {
        // TODO Auto-generated method stub
        
    }

    
}
