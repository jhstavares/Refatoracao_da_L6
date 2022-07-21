public abstract class Funcionarios implements Reembolso{

    private String nome;
    private String cpf;
    private String numRegistro;
    private String orgaoLotaçao;
    private double salario;

    public Funcionarios() {
        this.nome = nome;
        this.cpf = cpf;
        this.numRegistro = numRegistro;
        this.orgaoLotaçao = orgaoLotaçao;

}
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNumRegistro() {
        return numRegistro;
    }
    public void setNumRegistro(String numRegistro) {
        this.numRegistro = numRegistro;
    }
    public String getOrgaoLotaçao() {
        return orgaoLotaçao;
    }
    public void setOrgaoLotaçao(String orgaoLotaçao) {
        this.orgaoLotaçao = orgaoLotaçao;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }



}
