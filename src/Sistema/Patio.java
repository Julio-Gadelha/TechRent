package Sistema;

import Tech.Equipamento;

import java.util.ArrayList;

public class Patio {

    private ArrayList<Equipamento> equipamentos = new ArrayList<>();

    public void cadastrar(Equipamento equipamento) {
        equipamentos.add(equipamento);
        System.out.println("Equipamento cadastrado com sucesso!");
    }

    public void listar() {
        if (equipamentos.isEmpty() ){
            System.out.println("Nenhum equipamento cadastrado .");
            return;
        }
        for (Equipamento  equipamento : equipamentos) {
            System.out.println(equipamento);
            
        }
    }
    public Equipamento buscarPorCodigo(String codigo) {
        for (Equipamento equipamento : equipamentos) {
            if (equipamento.getCodigo().equalsIgnoreCase(codigo)) {
                return equipamento;
            }
        }
        return null;
    }

}
