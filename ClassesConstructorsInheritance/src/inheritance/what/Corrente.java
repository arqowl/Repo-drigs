package inheritance.what;

public class Corrente extends ContaBancaria {
    private boolean investment;

    public Corrente(String nome, int numeroDaConta, String senha) {
        super(nome, numeroDaConta, senha);
        this.investment = false;
    }

    



    
}
