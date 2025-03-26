import java.util.ArrayList;
import java.util.List;
public class Hospede extends Pessoa {
    private String endereco;
    private String documento;
    private List<Reserva> reservas;

    Hospede(String endereco, String documento, String nome){
        super(nome);
        this.endereco=endereco;
        this.documento=documento;
        reservas=new ArrayList<Reserva>();
    }
    public void addReserva(Reserva reserva){
        reservas.add(reserva);
    }
    public void removerReserva(Reserva reserva){
        reservas.remove(reserva);
    }
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}
