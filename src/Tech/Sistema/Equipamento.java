package Tech.Sistema;

public  abstract  class Equipamento {
    private  final String codigo;
    private String  descricao;
    private double valorDiaria;

    public Equipamento(String codigo, String descricao, double valorDiaria) throws  ValorErradoException {
        this.codigo = codigo;
        this.descricao = descricao;
        if ( valorDiaria <= 0){
            throw  new ValorErradoException(" Valor inválido: não pode ser vazio  e nem menor ou igual  0 ");
        }
        this.valorDiaria = valorDiaria;
    }


    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    @Override
    public String toString() {
        return "Equipamento{" +
                "codigo='" + codigo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valorDiaria=" + valorDiaria +
                '}';
    }
}
