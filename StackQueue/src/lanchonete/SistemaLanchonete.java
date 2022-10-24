package lanchonete;
import br.unicap.ed1.rod.Queue;

public class SistemaLanchonete {

    private Queue<Integer> fila;

    public SistemaLanchonete(){
        this.fila = new Queue();
    }

    public void registrarPedido(Integer numeroPedido){
        fila.enQueue(numeroPedido);
    }

    public int liberarPedido(){
        int pedidoLiberado = fila.deQueue();
        return pedidoLiberado;
    }
 
}
