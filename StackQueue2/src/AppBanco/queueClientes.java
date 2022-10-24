package AppBanco;

import br.unicap.ed1.TAD.Queue;

public class queueClientes {
    private Queue<Integer> listaClientes;

    public queueClientes(){
        this.listaClientes = new Queue(20);
    }

    public void addPasswordToQueue(int password){
        listaClientes.enQueue(password);
    }

    public int callPassword(){
        int passwordCalled = listaClientes.deQueue();
        return passwordCalled;
    }

    public boolean listFull(){
        return listaClientes.isFull();
    }

    public boolean listEmpty(){
        return listaClientes.isEmpty();
    }

}
