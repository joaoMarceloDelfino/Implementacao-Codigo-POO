import java.util.Objects;

public class Veiculo {

    private String placa;
    private String modelo;
    private Reserva reserva;

    public Veiculo(String placa, String modelo, Reserva reserva) {
        this.placa = placa;
        this.modelo = modelo;
        this.reserva=reserva;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return Objects.equals(placa, veiculo.placa) && Objects.equals(modelo, veiculo.modelo) && Objects.equals(reserva, veiculo.reserva);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa, modelo, reserva);
    }
}
