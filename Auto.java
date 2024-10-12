
package clases;

public class Auto extends Vehiculo {
    private String tipoCombustible;

    public Auto(String idVehiculo, String marca, String modelo, int año, double costoDiario, String tipoCombustible) {
        super(idVehiculo, marca, modelo, año, costoDiario);
        this.tipoCombustible = tipoCombustible;
    }

    // Getters y setters
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
}
