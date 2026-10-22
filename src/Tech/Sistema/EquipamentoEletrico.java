package Tech.Sistema;

public class EquipamentoEletrico extends Equipamento implements ManutencaoPreventiva {
    private static final double TAXA_OPERACAO = 15.00;

    public EquipamentoEletrico(String codigo, String descricao, double valorDiaria, Categoria categoria) throws ValorDiariaInvalidoException {
        super(codigo, descricao, valorDiaria, categoria);
    }

    @Override
    public void agendarManutencao() {
        System.out.println("Manutenção preventiva agendada para: " + getDescricao());
    }

    @Override
    public double valorTotal(int dias) {
        double seguro = getValorDiaria()* getCategoria().getPercentual();
        double total = (getValorDiaria() * dias) + seguro;
        return total + TAXA_OPERACAO;
    }
}
