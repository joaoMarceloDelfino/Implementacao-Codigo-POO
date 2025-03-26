
import java.util.ArrayList;
import java.util.List;


public class Hotel {

    private String nome;
    private List<Quarto> quartos;

    public Hotel(String nome) {
        this.nome = nome;
        this.quartos = new ArrayList<Quarto>();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void addQuartos(Quarto quarto) {
        quartos.add(quarto);
    }

}