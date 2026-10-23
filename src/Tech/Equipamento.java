package Tech;

import java.time.LocalDate;

public abstract class Equipamento {
    private final String codigo;
    private String descricao;
    private  final double valorDiaria;
    private Categoria categoria;
    private final LocalDate dataCadastro;
    private static int contadorEquipamento = 0;

    public Equipamento(String codigo, String descricao, double valorDiaria, Categoria categoria) throws ValorDiariaInvalidoException {
        this.codigo = codigo;
        this.descricao = descricao;
        if (valorDiaria <= 0) {
            throw new ValorDiariaInvalidoException(" O valor da diária deve ser maior que zero.   ");
        }
        this.valorDiaria = valorDiaria;
        this.categoria = categoria;
        this.dataCadastro = LocalDate.now();
        contadorEquipamento++;
    }

    public abstract double valorTotal(int dias);

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public static int getContadorEquipamento() {
        return contadorEquipamento;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    @Override
    public String toString() {
        return "Equipamento{" +
                "codigo='" + codigo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valorDiaria=" + valorDiaria +
                ", categoria=" + categoria +
                ", dataCadastro=" + dataCadastro +
                '}';
    }
}
