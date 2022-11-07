package inheritance.what;

public class ContaBancaria {

    private String nome;
    private int numeroDaConta;
    private String senha;
    private double saldoConta;
   

    public ContaBancaria(String nome, int numeroDaConta, String senha, double saldoConta){
        this.nome = nome;
        this.numeroDaConta = numeroDaConta;
        this.senha = senha;
        this.saldoConta = adicionarDinheiro(numeroDaConta);;
    }

    
    public double adicionarDinheiro(double valor) {
        return this.saldoConta += valor;
    }
    
    public void sacarDinheiro(float valor) {
        this.saldoConta = this.saldoConta - valor;
    }
    
    public double saldoFinal() {
        return this.saldoConta;			  
    }


}
