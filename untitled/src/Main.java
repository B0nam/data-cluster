import com.sun.source.tree.BreakTree;

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

    public static final Integer LIMIAR = 12;


    public static void main(String[] args){

        List<Cluster> clusters = new ArrayList<>();

        Aluno alunoA = alunoA();
        Aluno alunoB = alunoB();
        Aluno novoAluno = alunoNovo();

        Aluno novoAlunoNovo = alunoNovo();
        novoAlunoNovo.setNome("NovoAlunoNovo");
        novoAlunoNovo.setIdade(30D);
        novoAlunoNovo.setFalta(0.5);
        novoAlunoNovo.setFalta(9D);
        novoAlunoNovo.setTipoAluno(TipoAluno.PRODIGIO);

        Cluster clusterEntrar = validarClusterEntrar(alunoA, clusters);
        clusterEntrar.addAluno(alunoA);

        clusterEntrar = validarClusterEntrar(alunoB, clusters);
        clusterEntrar.addAluno(alunoB);

        clusterEntrar = validarClusterEntrar(novoAluno, clusters);
        clusterEntrar.addAluno(novoAluno);

        clusterEntrar = validarClusterEntrar(novoAlunoNovo, clusters);
        clusterEntrar.addAluno(novoAlunoNovo);


        System.out.println(clusters);
        System.out.println();
    }


    private static Cluster validarClusterEntrar(Aluno novoAluno, List<Cluster> clusters) {
        Cluster clusterEntrar = new Cluster();
        Double valorEntrar = (99999999999999D);
        Boolean criarNovoCluster = true;
        for (Cluster cluster : clusters) {
            Double coeficiente = Math.sqrt(
                    Math.pow(novoAluno.getFalta() - cluster.getValorCentroid().getFalta(), 2)
                    + Math.pow(novoAluno.getIdade() - cluster.getValorCentroid().getIdade(), 2)
                    + Math.pow(novoAluno.getMediaNota() - cluster.getValorCentroid().getMediaNota(), 2)
                    + Math.pow(novoAluno.getTipoAluno().getValor() - cluster.getValorCentroid().getTipoAluno().getValor(), 2)
            );

            if (coeficiente < LIMIAR && valorEntrar > coeficiente) {
                valorEntrar = coeficiente;
                clusterEntrar = cluster;
                criarNovoCluster = false;
            }
            System.out.println(coeficiente);
        }

        if(criarNovoCluster) {
            clusters.add(clusterEntrar);
        }
        return clusterEntrar;
    }

    private static Aluno alunoA() {
        Aluno aluno = new Aluno();
        aluno.setNome("Zé");
        aluno.setIdade(10D);
        aluno.setFalta(0.25);
        aluno.setMediaNota(6.2);
        aluno.setTipoAluno(TipoAluno.RELAXADO);
        return aluno;
    }

    private static Aluno alunoB() {
        Aluno aluno = new Aluno();
        aluno.setNome("Pedro");
        aluno.setIdade(40D);
        aluno.setFalta(0.5);
        aluno.setMediaNota(7.9);
        aluno.setTipoAluno(TipoAluno.ESFORCADO);
        return aluno;
    }

    private static Aluno alunoNovo() {
        Aluno aluno = new Aluno();
        aluno.setNome("Novo");
        aluno.setIdade(24D);
        aluno.setFalta(0.0);
        aluno.setMediaNota(7D);
        aluno.setTipoAluno(TipoAluno.RELAXADO);
        return aluno;
    }
}
