import java.util.List;

public class Cluster {

    private Double valorCentroid;
    private List<Aluno> alunos;

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
        this.valorCentroid = alunos.stream().mapToDouble(Aluno::getFalta).sum() / alunos.size()
                + alunos.stream().mapToDouble(Aluno::getIdade).sum() / alunos.size()
                + alunos.stream().mapToDouble(Aluno::getMediaNota).sum() / alunos.size();
    }

    public void removeAluno(Aluno aluno) {
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Double getValorCentroid() {
        return valorCentroid;
    }

    public void setValorCentroid(Double valorCentroid) {
        this.valorCentroid = valorCentroid;
    }
}
