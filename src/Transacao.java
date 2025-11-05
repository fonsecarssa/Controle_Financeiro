import java.time.LocalDate;
// registros financeiros
public class Transacao {
    private double valor;
    private String descricao;
    private LocalDate data;


    public Transacao(LocalDate data, String descricao, double valor) {
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
    }


    public double getValor() {
        return valor;
    }


}
