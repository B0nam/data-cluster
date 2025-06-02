import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final Integer LIMIAR = 6;

    public static void main(String[] args) {

        List<Cluster> clusters = new ArrayList<>();

        Aluno alunoA = alunoA();
        Aluno novoAlunoNovo = novoAlunoNovo();
        Aluno alunoB = alunoB();
        Aluno novoAluno = alunoNovo();
        Aluno novoAlunoNovoNovo = novoAlunoNovoNovo();


        List<Aluno> todosAlunos = new ArrayList<>();

        validarClusterEntrar(alunoA, clusters, todosAlunos);
        todosAlunos.add(alunoA);

        validarClusterEntrar(novoAlunoNovoNovo, clusters, todosAlunos);
        todosAlunos.add(novoAlunoNovoNovo);

        validarClusterEntrar(novoAluno, clusters, todosAlunos);
        todosAlunos.add(novoAluno);

        validarClusterEntrar(alunoB, clusters, todosAlunos);
        todosAlunos.add(alunoB);

        validarClusterEntrar(novoAlunoNovo, clusters, todosAlunos);
        todosAlunos.add(novoAlunoNovo);

        System.out.println(clusters);
        System.out.println();
    }


    private static void validarClusterEntrar(Aluno novoAluno, List<Cluster> clusters, List<Aluno> todosAlunos) {
        Cluster clusterEntrar = new Cluster();
        Double valorEntrar = Double.MAX_VALUE;
        Boolean criarNovoCluster = true;
        for (Cluster cluster : clusters) {
            Double coeficiente = getCoeficiente(novoAluno, cluster);

            if (coeficiente < LIMIAR && valorEntrar > coeficiente) {
                valorEntrar = coeficiente;
                clusterEntrar = cluster;
                criarNovoCluster = false;
            }
        }

        if (clusterEntrar.getAlunos().contains(novoAluno)) {
            return;
        }

        if (criarNovoCluster) {
            clusters.add(clusterEntrar);
            clusterEntrar.addAluno(novoAluno);
            todosAlunos.forEach(aluno -> validarClusterEntrar(aluno, clusters, todosAlunos));
            return;
        }


        clusterEntrar.addAluno(novoAluno);
        todosAlunos.forEach(aluno -> validarClusterEntrar(aluno, clusters, todosAlunos));
    }

    private static double getCoeficiente(Aluno novoAluno, Cluster cluster) {
        return Math.sqrt(
                Math.pow(novoAluno.getFalta() - cluster.getValorCentroid().getFalta(), 2)
                        + Math.pow(novoAluno.getIdade() - cluster.getValorCentroid().getIdade(), 2)
                        + Math.pow(novoAluno.getMediaNota() - cluster.getValorCentroid().getMediaNota(), 2)
                        + Math.pow(novoAluno.getTipoAluno().getValor() - cluster.getValorCentroid().getTipoAluno().getValor(), 2)
        );
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
        aluno.setIdade(37D);
        aluno.setFalta(0.5);
        aluno.setMediaNota(7.9);
        aluno.setTipoAluno(TipoAluno.ESFORCADO);
        return aluno;
    }

    private static Aluno alunoNovo() {
        Aluno aluno = new Aluno();
        aluno.setNome("Novo");
        aluno.setIdade(25D);
        aluno.setFalta(0.5);
        aluno.setMediaNota(7D);
        aluno.setTipoAluno(TipoAluno.ESFORCADO);
        return aluno;
    }

    private static Aluno novoAlunoNovo() {
        Aluno novoAlunoNovo = new Aluno();
        novoAlunoNovo.setNome("NovoAlunoNovo");
        novoAlunoNovo.setIdade(30D);
        novoAlunoNovo.setFalta(0.5);
        novoAlunoNovo.setMediaNota(9D);
        novoAlunoNovo.setTipoAluno(TipoAluno.PRODIGIO);
        return novoAlunoNovo;
    }

    private static Aluno novoAlunoNovoNovo() {
        Aluno novoAlunoNovo = new Aluno();
        novoAlunoNovo.setNome("NovoAlunoNovoNovo");
        novoAlunoNovo.setIdade(42D);
        novoAlunoNovo.setFalta(0.5);
        novoAlunoNovo.setMediaNota(9D);
        novoAlunoNovo.setTipoAluno(TipoAluno.PRODIGIO);
        return novoAlunoNovo;
    }
}
