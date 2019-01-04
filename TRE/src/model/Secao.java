package tre.modal;

import java.io.Serializable;
import java.util.List;

public class Secao implements Serializable{
    
    private int numero;
    private List<Candidato> candidatos;
    private List<Eleitor> eleitor;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Candidato> candidatos) {
        this.candidatos = candidatos;
        
        
    }

    public List<Eleitor> getEleitor() {
        return eleitor;
    }

    public void setEleitor(List<Eleitor> eleitor) {
        this.eleitor = eleitor;
    }
    

}
