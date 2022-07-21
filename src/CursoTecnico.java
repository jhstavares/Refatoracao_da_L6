public class CursoTecnico {
    public static void main(String[] args) {
        Professores professores = new Professores();
        professores.addProfessor();
        professores.status();
        professores.exibirCalculos();
        System.out.println("-----------------------------");
        Coordenadores coordenadores = new Coordenadores();
        coordenadores.addCordenador();
        coordenadores.status();
        coordenadores.exibirCalculos();
        System.out.println("-----------------------------");
        FuncionariosAdministrativos fAdm = new FuncionariosAdministrativos();
        fAdm.addAdm();
        fAdm.status();
        fAdm.aumento10();
        fAdm.calculoreembolso();
        System.out.println("-----------------------------");
         Estagiario = new Estagiario();
        Estagiario.addEstagiario();
        Estagiario.status();
        Estagiario.exibirCalculos();
    }
}

