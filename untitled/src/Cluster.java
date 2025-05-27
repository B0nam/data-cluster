import java.math.BigDecimal;
import java.util.List;

public class Cluster {
    private BigDecimal valorCentroid;
    private List<Aluno> alunos;

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removeAluno(Aluno aluno) {
    }
}
