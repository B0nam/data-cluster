public class Aluno {

//    private HashMap<String, String> atributos;
//
//    public HashMap<String, String> getAtributos() {
//        return atributos;
//    }
//

    private String nome;
    private Double idade;
    private Double falta;
    private Double mediaNota;
    private TipoAluno tipoAluno;

    private Double coeficient;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

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

    public Double getCoeficient() {
        return coeficient;
    }

    public void setCoeficient(Double coeficient) {
        this.coeficient = coeficient;
    }

    public TipoAluno getTipoAluno() {
        return tipoAluno;
    }

    public void setTipoAluno(TipoAluno tipoAluno) {
        this.tipoAluno = tipoAluno;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "idade=" + idade +
                ", falta=" + falta +
                ", mediaNota=" + mediaNota +
                ", tipoAluno=" + tipoAluno +
                '}';
    }
}
