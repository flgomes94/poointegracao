
package util;

public class Enfermeiro extends Funcionario {
    String lotacao;
    String regime;

    public String getLotacao() {
        return lotacao;
    }

    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }

    @Override
    public String toString() {
        return "Enfermeiro{" + "lotacao=" + lotacao + ", regime=" + regime + '}';
    }
    
    
}
