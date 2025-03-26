import java.util.ArrayList;
import java.util.List;

public class Cargo {

    private String nome;
    private List<Funcionario> funcionarios;

    public Cargo(String nome) {
        this.nome = nome;
        funcionarios = new ArrayList<Funcionario>();
    }

    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
