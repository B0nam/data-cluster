import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cluster clusterA = new Cluster();
        Cluster clusterB = new Cluster();

        Mediator mediator = new Mediator(List.of(clusterA, clusterB));

        Aluno alunoA = new Aluno();
        Aluno alunoB = new Aluno();

        mediator.addAlunoOnCluster(alunoA);
        mediator.addAlunoOnCluster(alunoB);
    }
}
