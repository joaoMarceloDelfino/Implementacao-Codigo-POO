import java.util.Objects;

public class Funcionario extends Pessoa {
    private double salario;
    private Cargo cargo;


    Funcionario(String nome, Cargo cargo) {
        super(nome);
        this.cargo = cargo;
        cargo.addFuncionario(this);
    }


    public double getSalario() {
        return salario;
    }

    public void mudarSalario(double salario) {
        this.salario = salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Double.compare(salario, that.salario) == 0 && Objects.equals(cargo, that.cargo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salario, cargo);
    }
}
