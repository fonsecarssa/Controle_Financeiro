import java.time.LocalDate;
import java.util.Scanner;
// saida de dinheiro do sistema
public class Gastos extends Transacao{
    private String categoriaGasto;

    public Gastos(double valor, String descricao, LocalDate data, String categoriaGasto) {
        super(data, descricao, valor);
        this.categoriaGasto = categoriaGasto;

    }


    public double valor(){
        return getValor();
    }




}
