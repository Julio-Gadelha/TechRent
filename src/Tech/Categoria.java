package Tech;

public enum Categoria {
    LEVE( 0.05),
    MEDIO( 0.10),
    PESADO( 0.20);

     private  final double percentual ;

    Categoria(double percentual) {
        this.percentual = percentual;
    }

    public double getPercentual() {
        return percentual;
    }
}
