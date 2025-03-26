import java.util.ArrayList;
import java.util.List;

public class Quarto{

    private int numero;
    private int andar;
    private List<Reserva> reservas;
    Hotel hotel;

    public Quarto(int numero, int andar, Hotel hotel){
        this.andar=andar;
        this.numero=numero;
        reservas=new ArrayList<>();
        this.hotel=hotel;
        hotel.addQuartos(this);
     }
    public void addReserva(Reserva reserva){
        reservas.add(reserva);
    }
    public void retirarReserva(Reserva reserva){
        reservas.remove(reserva);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }


}
