public class Matricula {
    private int matricula;
    private String nome;
    private boolean ativo;
    private String cargo;
    private int salario;

    public Matricula(int matricula, String nome, String cargo, int salario){
        this.matricula=matricula;
        this.nome=nome;
        this.cargo=cargo;
        this.salario=salario;
    }

    public void Show(){
        if(Verify()) {
            System.out.println("Pode trabalhar");
            System.out.println("Nome do Funcionário: " + nome);
            System.out.println("Matrícula: " + matricula);
            System.out.println("Ativo: " + ativo);
            System.out.println("Cargo: "+cargo);
            System.out.println("Salário: "+salario);
            bonusVerify();

        }
        else {
            System.out.println("Não pode trabalhar");
            System.out.println("Nome do Funcionário: "+nome);
            System.out.println("Matrícula: "+matricula);
            System.out.println("Cargo: "+cargo);
            System.out.println("Salário: "+salario);
            System.out.println("Ativo: "+ativo);

        }
    }

    public boolean Verify(){
        if(String.valueOf(matricula).length()==6){
            return ativo = true;
        }
        else{
            return ativo = false;
        }
    }
    public void bonusVerify(){
        if (salario < 5000){
            System.out.println("Pode receber um bônus.");
        }
        else{
            System.out.println("Não pode receber um bônus.");
        }
    }
}
