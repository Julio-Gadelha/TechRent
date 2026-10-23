package Sistema;


import Tech.Categoria;
import Tech.Equipamento;
import Tech.EquipamentoEletrico;
import Tech.EquipamentoManual;
import Tech.ValorDiariaInvalidoException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patio patio = new Patio();

        int opcao = -1;

        while (opcao != 5) {
            System.out.println("\n===== TECHRENT =====\n" +
                    "1 - Cadastrar equipamento elétrico\n" +
                    "2 - Cadastrar equipamento manual\n" +
                    "3 - Listar equipamentos\n" +
                    "4 - Calcular valor de uma locação\n" +
                    "5 - Sair\n" +
                    "Escolha uma opção:");

            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                case 2:
                    try {
                        System.out.print("Código: ");
                        String codigo = sc.nextLine();

                        System.out.print("Descrição: ");
                        String descricao = sc.nextLine();

                        System.out.print("Valor da diária: ");
                        double diaria = Double.parseDouble(sc.nextLine());

                        System.out.print("Categoria (LEVE, MEDIO, PESADO): ");
                        Categoria categoria = Categoria.valueOf(sc.nextLine().toUpperCase());

                        Equipamento equipamento;
                        if (opcao == 1) {
                            equipamento = new EquipamentoEletrico(codigo, descricao, diaria, categoria);
                        } else {
                            equipamento = new EquipamentoManual(codigo, descricao, diaria, categoria);
                        }
                        patio.cadastrar(equipamento);

                    } catch (ValorDiariaInvalidoException e) {
                        System.out.println("Erro: " + e.getMessage());
                    } finally {
                        System.out.println("Tentativa de cadastro finalizada.");
                    }
                    break;

                case 3:
                    patio.listar();
                    break;

                case 4:
                    System.out.print("Código do equipamento: ");
                    Equipamento encontrado = patio.buscarPorCodigo(sc.nextLine());

                    if (encontrado == null) {
                        System.out.println("Equipamento não encontrado.");
                    } else {
                        System.out.print("Quantos dias de locação? ");
                        int dias = Integer.parseInt(sc.nextLine());
                        System.out.println("Valor total: R$ " + String.format("%.2f", encontrado.valorTotal(dias)));
                    }
                    break;

                case 5:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}