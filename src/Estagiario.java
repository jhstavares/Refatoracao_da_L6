public class Estagiario extends Funcionarios {

    private String Condicao;
    private double despesas;

    public Estagiario(){
        super();
        this.Condicao = Condicao;
        this.despesas = despesas;

    }

    public void addEstagiario(){
        this.setNome("Mattheus");
        this.setCpf("321654678-2");
        this.setNumRegistro("09871");
        this.setOrganoLotacao("RJ");
        this. setCondicao("Bolsa");

        }

    public static void status() {
        System.out.println("Nome do estagiario: " + getNome());
        System.out.println("CPF do estagiario: " + getCpf());
        System.out.println("Registro do estagiario: " + getNumRegistro());
        System.out.println("Estado do estagiario: " + getOrganoLotacao());
        System.out.println("Condição do estagiario: " + getCondicao());
    }

    public double calculoreembolso(){
        setdespesas(1000);
        return getDespesas();
    }

    public static void exibirCalculos(){
        System.out.println("O valor do rembolso é? : " + calculoreembolso());
    }

    public double getDespesas() {
        return despesas;
    }

    public void setdespesas(double despesas){
        this.despesas = despesas;

    }

    public String getCondicao(){
        return condicao;

    }

    public void setCondicao(String condicao){
        this.condicao = condicao;
    }
}