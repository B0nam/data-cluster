import java.math.BigDecimal;
import java.util.List;

public class Mediator {
    private List<Cluster> clusters;

    public Mediator(List<Cluster> clusters){
        this.clusters = clusters;
    }

    public void addAlunoOnCluster(Aluno aluno) {
        BigDecimal menorCoeficiente = BigDecimal.valueOf(999999999);
        Cluster menorCluster = new Cluster();

        for (Cluster cluster : clusters) {
            BigDecimal coeficienteCluster = calculateCoeficient(cluster, aluno);
            if (coeficienteCluster.compareTo(menorCoeficiente) < 0) {
                menorCoeficiente = coeficienteCluster;
                menorCluster = cluster;
            }
        }

        menorCluster.addAluno(aluno);
    }

    private BigDecimal calculateCoeficient(Cluster cluster, Aluno aluno) {
        return BigDecimal.valueOf(0);
    }
}
