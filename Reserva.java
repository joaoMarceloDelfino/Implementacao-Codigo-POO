import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.List;

public class Reserva {
    private String dataEntrada;
    private String dataSaida;
    private Hospede[] hospedes;
    private List<Veiculo> veiculos;
    private Quarto quarto;


    public Reserva() {
        veiculos = new ArrayList<Veiculo>();
    }

    public void addVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void removerVeiculo(Veiculo veiculo) {
        veiculos.remove(veiculo);
    }

    public void checkin(Hospede[] hospedes, Quarto quarto, String dataEntrada) {
        this.hospedes = hospedes;
        this.dataEntrada = dataEntrada;
        this.quarto = quarto;
        for (Hospede hospede : hospedes) {
            hospede.addReserva(this);
        }
        dataSaida = "";
        quarto.addReserva(this);
    }

    public void checkOut(String dataSaida) {

        this.dataSaida = dataSaida;
        quarto.retirarReserva(this);
        for (Hospede hospede : hospedes) {
            hospede.removerReserva(this);
        }
    }

    public void cancelar() {
        for (Hospede hospede : hospedes) {
            hospede.removerReserva(this);
        }
        hospedes = null;
        dataEntrada = "";
        quarto.retirarReserva(this);
        quarto = null;
        dataSaida = "";
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Hospede[] getHospedes() {
        return hospedes;
    }

    public void setHospedes(Hospede[] hospedes) {
        this.hospedes = hospedes;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return Objects.equals(dataEntrada, reserva.dataEntrada) && Objects.equals(dataSaida, reserva.dataSaida) && Objects.deepEquals(hospedes, reserva.hospedes) && Objects.equals(quarto, reserva.quarto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataEntrada, dataSaida, Arrays.hashCode(hospedes), quarto);
    }
}
