import java.util.Scanner;

public class Coordenadores extends Funcionarios implements  {
    public String orgaoLotacao;

    public String nome;
    double salarioBase;

    String cpf;

    String numRegistro;

    String reajusteFunc;

    private int professoresSupervisionados;

    public Coordenadores(String nome, String cpf, String numRegistro, String orgaoLotacao, double salarioBase) {
        super(nome, cpf, numRegistro, orgaoLotacao, salarioBase);
    }

    public int getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(int professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }

    public void aumentarSalarioFunc() {

        double salaioBase ;(salarioBase / 100) * 5;

        double salarioFunc = Double.parseDouble(salarioBase + reajusteFunc);
        System.out.println(" Teu salario atual é: R$ " + salarioBase);
        System.out.println("Você teve um reajuste de 5% sobre o teu salario atual.");
        System.out.println("O valor do rejuste é de R$ " + reajusteFunc);
        System.out.println("O valor total do salario e de R$ " + salarioFunc);

        public void adicionarProfessor () {
            System.out.println("Quantidade máxima de Professores Supervisionados por cada Coordenador => 10");
            System.out.println("\nQual a quantidade de professores você supervisiona?");
            Scanner input = new Scanner(System.in);
            professoresSupervisionados = input.nextInt();

            if (professoresSupervisionados < 10) {
                System.out.println("\nVocê gostaria de adicionar professor a algum ser supervisionado por você? 1 - S / 2 - N: ");
                int qtdProfAdic = input.nextInt();

                switch (qtdProfAdic) {
                    case 1:
                        System.out.println(" quantos professores são fixados para a equipe máxima permitida (10 coordenada): ");
                        int qtdAdic = input.nextInt();
                        int profSupervAtualizados = qtdAdic + professoresSupervisionados;
                        System.out.println("Quantidade de professores supervisionados por esse coordenador é de: " + profSupervAtualizados + " PROFESSORES");
                        break;
                }
            }
        }else{
            System.out.println("Seu time já atingiu o limite de quantidade total de Professores Supervionados (10 por Coordenador) e não poderá ser adicionado mais nenhum à sua equipe!");
        }
    }

    public void addCordenador() {
    }

    public void status() {
    }

    public void exibirCalculos() {
    }
}
