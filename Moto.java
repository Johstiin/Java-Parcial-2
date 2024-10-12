package clases;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String idVehiculo, String marca, String modelo, int año, double costoDiario, int cilindrada) {
        super(idVehiculo, marca, modelo, año, costoDiario);
        this.cilindrada = cilindrada;
    }

    // Getters y setters
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
