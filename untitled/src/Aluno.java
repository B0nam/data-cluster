import java.math.BigDecimal;
import java.util.HashMap;

public class Aluno {

//    private HashMap<String, String> atributos;

    private Double idade;
    private Double falta;
    private Double mediaNota;

    private Double coeficient;
//
//    public HashMap<String, String> getAtributos() {
//        return atributos;
//    }
//

    public Double getIdade() {
        return idade;
    }

    public void setIdade(Double idade) {
        this.idade = idade;
    }

    public Double getFalta() {
        return falta;
    }

    public void setFalta(Double falta) {
        this.falta = falta;
    }

    public Double getMediaNota() {
        return mediaNota;
    }

    public void setMediaNota(Double mediaNota) {
        this.mediaNota = mediaNota;
    }
//    public void setAtributos(HashMap<String, String> atributos) {
//        this.atributos = atributos;
//    }

    public Double getCoeficient() {
        return coeficient;
    }

    public void setCoeficient(Double coeficient) {
        this.coeficient = coeficient;
    }


}
