package proyectounibanco.test;

import proyectounibanco.Model.Banco;
import proyectounibanco.Model.Cliente;

public class main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("ambrosio", "jimenez", "128475134", "calle56","sdfgksjgh@xd.com");


        System.out.println("el nombre del cliente es " + cliente.getNombre());
        System.out.println("el apellido del cliente es: " + cliente.getApellido());
        System.out.println("la cedula del cliente es " + cliente.getCedula());
    }
}
