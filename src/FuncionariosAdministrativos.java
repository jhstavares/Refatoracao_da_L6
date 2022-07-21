public class FuncionariosAdministrativos extends Funcionarios implements  {
    private String funcao;
    private String senioridade;

    private double despesas;

    public void FuncionariosAdm() {
        this.funcao = funcao;
        this.senioridade = senioridade;
    }

    public String getFuncao() {
        return funcao;
    }

    public double getDespesas() {
        return despesas;
    }

    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    public void addAdm(){

        setNome("Jhonatan");
        setCpf("098123567-09");
        setNumRegistro("383");
        setOrgaoLotaçao("BA");
        setFuncao("Atendente");
        setSenioridade("auxiliar");
    }

    private void setNome(String jhonatan) {
    }

    public void status() {
        System.out.println("Coordenador: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Numero de registro: " + this.getNumRegistro());
        System.out.println("Orgão de locação: " + this.getOrgaoLotaçao());
        System.out.println("Função administrativa é: " + this.getFuncao());
        System.out.println("Senioridade: " + this.getSenioridade());

    }

    @Override
    public double salario() {
        setSalario(2700);
        return getSalario();
    }
    public void aumento10() {
        double salario10 = salario() * 0.1;
        salario10 = salario() + salario10;
        System.out.println("O salario era " + salario() + "Agora é " + salario10);
    }
    @Override
    public double calculoreembolso() {
        setDespesas(350);
        System.out.println("O valor do reembolso é de: " + getDespesas());
        return 0;
    }
}

