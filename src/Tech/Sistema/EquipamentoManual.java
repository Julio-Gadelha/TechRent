package Tech.Sistema;

public class EquipamentoManual  extends Equipamento{

    public EquipamentoManual(String codigo, String descricao, double valorDiaria, Categoria categoria) throws ValorDiariaInvalidoException {
        super(codigo, descricao, valorDiaria, categoria);
    }

    @Override
    public double valorTotal(int dias) {
        double seguro = getValorDiaria()* getCategoria().getPercentual();
        return (getValorDiaria() * dias) + seguro;
    }


}
