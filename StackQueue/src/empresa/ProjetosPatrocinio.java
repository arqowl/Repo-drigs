package empresa;

public class ProjetosPatrocinio {

    private String EmpresaPatrocinadora;
    private String proposta;

    public ProjetosPatrocinio(String empresaPatrocinadora, String proposta) {
        this.EmpresaPatrocinadora = empresaPatrocinadora;
        this.proposta = proposta;
    }

    public String getEmpresaPatrocinadora() {
        return EmpresaPatrocinadora;
    }

    public void setEmpresaPatrocinadora(String empresaPatrocinadora) {
        EmpresaPatrocinadora = empresaPatrocinadora;
    }

    public String getProposta() {
        return proposta;
    }

    public void setProposta(String proposta) {
        this.proposta = proposta;
    }

    @Override
    public String toString() {
        return "[Empresa patrocinadora: " + EmpresaPatrocinadora + ", Proposta: " + proposta + "]";
    }

    

    
    
}
