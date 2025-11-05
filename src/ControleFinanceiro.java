import java.util.ArrayList;
import java.util.List;

public class ControleFinanceiro {
    private double saldoAtual;
    private List<Transacao> listaTransacoes;

    public ControleFinanceiro(double saldoAtual){
        this.saldoAtual = saldoAtual;
        this.listaTransacoes = new ArrayList<>();
    }

    public boolean adicionarGasto(Gastos gastos) {
        if (verificarSaldo(gastos.getValor())) {

            this.saldoAtual -= gastos.getValor();
            this.listaTransacoes.add(gastos);
            System.out.println("Você realizou uma transferência  de R$" + gastos.getValor());
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public void adicionarReceita(Receita receita){
        this.saldoAtual += receita.getValor();
        this.listaTransacoes.add(receita);

        String tipoReceita = receita.getFonteReceita();
        System.out.println("Transação " + tipoReceita.toUpperCase() + " adicionada com sucesso.");
    }

    public double getSaldoAtual(){

        return saldoAtual;
    }


    public List<Transacao> getListaTransacoes(){
        return listaTransacoes;
    }
    public boolean verificarSaldo(double valor) {
        return saldoAtual >= valor;
    }
}
