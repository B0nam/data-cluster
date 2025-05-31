import java.util.ArrayList;
import java.util.List;

public class Main {
//    public static void main(String[] args) {
//
//        Cluster clusterA = new Cluster();
//        Cluster clusterB = new Cluster();
//
//        Mediator mediator = new Mediator(List.of(clusterA, clusterB));
//
//        Aluno alunoA = new Aluno();
//        Aluno alunoB = new Aluno();
//
//        mediator.addAlunoOnCluster(alunoA);
//        mediator.addAlunoOnCluster(alunoB);
//    }

    public static void main(String[] args){
        List<Cluster> clusters = new ArrayList<>();

        Cluster clusterA = new Cluster();
        Aluno alunoA = new Aluno();
        clusterA.addAluno(alunoA);

        Cluster clusterB = new Cluster();
        Aluno alunoB = new Aluno();
        clusterA.addAluno(alunoB);

        clusters.addAll(List.of(clusterA, clusterB));

        //adicionei novo elemento
        Aluno novoAluno = new Aluno();

        Double centroidParaEntrar = 9999999999999999D;
        for(Cluster cluster : clusters) {


            Double coeficiente = Math.sqrt(Math.pow(novoAluno.getFalta() - cluster.getAlunos().stream().mapToDouble(Aluno::getFalta).sum(), 2)  +
            Math.pow(novoAluno.getIdade() - cluster.getAlunos().stream().mapToDouble(Aluno::getIdade).sum(), 2) +
            Math.pow(novoAluno.getMediaNota() - cluster.getAlunos().stream().mapToDouble(Aluno::getMediaNota).sum(), 2));

            if(cluster.getValorCentroid() - coeficiente < centroidParaEntrar) {
                centroidParaEntrar = cluster.getValorCentroid();
            }
            t

        }




    }
}
