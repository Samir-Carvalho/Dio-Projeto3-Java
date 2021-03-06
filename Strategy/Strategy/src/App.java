import java.util.Scanner;
public class App {
    private static Scanner entrada;
    private static Locacao loc;
    public static void main(String[] args) {
        entrada = new Scanner(System.in);
        int op;
        do{
            exibirMenu();
            op = entrada.nextInt();
            executarOpcao(op);
        }while(op != 4);
    }

    private static void exibirMenu() {
        System.out.println("\n#### LOCADORA DE VEICULOS ####");
        System.out.println("1 - Gerar nota para veículo de passeio");
        System.out.println("2 - Gerar nota para veículo de carga");
        System.out.println("3 - Gerar nota para veículo de passageiros");
        System.out.println("4 - Sair\n");
        System.out.print("Escolha uma opcao: ");
    }

    private static void executarOpcao(int op) {
        switch(op){
            case 1:
                gerarNotaPasseio();
                break;
            case 2:
                gerarNotaCarga();
                break;
            case 3:
                gerarNotaPassageiros();
                break;
            case 4:
                break;
            default:
                System.out.println("Opcao invalida!");
        }
    }
    
    private static double lerValor(){
        System.out.print("Entre com o valor da diaria: ");
        return entrada.nextDouble();
    }
    
    private static int lerQtdDias(){
        System.out.print("Entre com a quantidade de dias: ");
        return entrada.nextInt();
    }
    
    private static String lerTipo(){
        entrada.nextLine();
        System.out.print("Entre com o tipo da caminhonete -- CS para cabine simples ou CD para cabine dupla: ");
        return entrada.nextLine();
    }
    
    private static int lerCapacidade(){
        System.out.print("Entre com a capacidade do veículo: ");
        return entrada.nextInt();
    }

    private static void gerarNotaPasseio() {
        loc = new Locacao(new CalculoPorDiaria());
        imprimirNota(loc.calcularValorPagar(lerValor(), lerQtdDias()));
    }

    private static void gerarNotaCarga() {
        loc = new Locacao(new CalculoPorTipo(lerTipo()));
        imprimirNota(loc.calcularValorPagar(lerValor(), lerQtdDias()));
    }

    private static void gerarNotaPassageiros() {
        loc = new Locacao(new CalculoPorCapacidade(lerCapacidade()));
        imprimirNota(loc.calcularValorPagar(lerValor(), lerQtdDias()));
    }

    private static void imprimirNota(double valorFinal) {
        System.out.print("\n===================== Nota Fiscal =====================\n");
        System.out.printf("= Valor a ser pago: R$ %7.2f                        =\n", valorFinal);
        System.out.println("=======================================================\n");
    }   
}