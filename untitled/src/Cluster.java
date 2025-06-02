import java.util.ArrayList;
import java.util.List;

public class Cluster {

    private Aluno valorCentroid = new Aluno();
    private List<Aluno> alunos = new ArrayList<>();

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);

        valorCentroid.setFalta(alunos.stream().mapToDouble(Aluno::getFalta).sum() / alunos.size());
        valorCentroid.setIdade(alunos.stream().mapToDouble(Aluno::getIdade).sum() / alunos.size());
        valorCentroid.setTipoAluno(TipoAluno.fromValor((int) alunos.stream().mapToDouble(a -> a.getTipoAluno().getValor()).sum() / alunos.size()));
        valorCentroid.setMediaNota(alunos.stream().mapToDouble(Aluno::getMediaNota).sum() / alunos.size());
    }

    public void removeAluno(Aluno aluno) {
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Aluno getValorCentroid() {
        return valorCentroid;
    }

    public void setValorCentroid(Aluno valorCentroid) {
        this.valorCentroid = valorCentroid;
    }

    @Override
    public String toString() {
        return "\nCluster{" +
                "valorCentroid=" + valorCentroid +
                ", alunos=" + alunos +
                "}\n";
    }
}
