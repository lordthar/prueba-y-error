package proyectounibanco.Model;

public class Cuenta {
    private String nombreCuenta;
    private double saldo;

    public Cuenta(String nombreCuenta, double saldo) {
        this.nombreCuenta = nombreCuenta;
        this.saldo = saldo;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
