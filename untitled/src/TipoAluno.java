import java.util.Arrays;

public enum TipoAluno {
    PRODIGIO("Prodígio", 4),
    ESFORCADO("Esforçado", 3),
    RELAXADO("Relaxado", 2),
    NEM_TENTA("Nem Tenta", 1);

    private String descricao;
    private Integer valor;

    TipoAluno(String descricao, Integer valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getValor() {
        return valor;
    }

    public static TipoAluno fromValor(Integer valor) {
        return Arrays.stream(TipoAluno.values()).filter(t -> t.getValor().equals(valor)).findFirst().get();
    }
}
