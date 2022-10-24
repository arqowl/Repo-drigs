package empresa;
import br.unicap.ed1.rod.Queue;

public class QueueProjetosPatrocinio {
    private Queue <ProjetosPatrocinio> fila;

    public QueueProjetosPatrocinio(){
        this.fila = new Queue();
    }
    
    public void inserirProjeto(ProjetosPatrocinio projetoNovo){
        fila.enQueue(projetoNovo);
    }

    public ProjetosPatrocinio analisarProjeto(){
        return fila.head();
    }

    public ProjetosPatrocinio liberarProjeto(){
        ProjetosPatrocinio liberado = fila.deQueue();
        return liberado;
    }
}
