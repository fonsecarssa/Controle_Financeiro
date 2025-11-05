import java.time.LocalDate;

// entrada de dinheiro no sistema
public class Receita extends Transacao {
    private String fonteReceita;

    public Receita(LocalDate data, String descricao, double valor, String fonteReceita){
        super(data,descricao,valor);
        this.fonteReceita = fonteReceita;
    }

    public void setFonteReceita(String fonteReceita) {
        this.fonteReceita = fonteReceita;
    }

    public String getFonteReceita() {
        return fonteReceita;
    }


}
