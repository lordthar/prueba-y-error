package proyectounibanco.Model;
    import proyectounibanco.Excepcions.ClienteException;

    import java.util.ArrayList;

public class Banco {
    private String nombre;
    private String nit;



    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private ArrayList<Cuenta> listaCuentas = new ArrayList<>();

    public Banco(String nombre, String nit, ArrayList<Cliente> listaClientes, ArrayList<Cuenta> listaCuentas) {
        this.nombre = nombre;
        this.nit = nit;
        this.listaClientes = listaClientes;
        this.listaCuentas = listaCuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public ArrayList<Cliente> getlistaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Cuenta> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

    //Crud a utilizar

    public boolean crearCliente(String nombre, String apellido, String cedula, String direccion, String email) throws ClienteException {
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setCedula(cedula);
        cliente.setDireccion(direccion);
        cliente.setEmail(email);
        if(existeCliente(cedula) == true){
            throw new ClienteException("god");
        }
        getlistaClientes().add(cliente);
        return true;
    }


    private boolean existeCliente(String cedula) throws ClienteException {
        for (Cliente cliente : listaClientes) {
            if (cliente.getCedula().equals(cedula)) {
                return true;
            }
        }
        return false;
    }

    public boolean actualizarCliente(String nombre, String apellido, String cedula, String direccion, String email) {
        for (Cliente cliente : listaClientes){
            if(cliente.getCedula().equals(cedula)){
                cliente.setNombre(nombre);
                cliente.setApellido(apellido);
                cliente.setDireccion(direccion);
                cliente.setEmail(email);
                return true;
            }
        }
        return false;
    }

    /**
     * metodo para eliminar un producto
     * @param cedula
     * @return
     */
    public boolean eliminarCliente(String cedula) throws ClienteException {

        if(existeCliente(cedula)){
            for (Cliente cliente : listaClientes) {
                if(cliente.getCedula().equals(cedula)){
                    getlistaClientes().remove(cliente);
                    return true;
                }
            }
        }else{
            return false;
        }
        return false;
    }

    /**
     * metodo para buscar un producto
     * @param cedula
     * @return
     * @throws ClienteException
     */
    public Cliente bucarCliente(String cedula) throws ClienteException {
        Cliente clienteEncontrado = null;
        if(existeCliente(cedula)){
            for (Cliente cliente : getlistaClientes()) {
                if(cliente.getCedula().equals(cedula)){
                    clienteEncontrado = cliente;
                    return clienteEncontrado;
                }
            }
        }
        if(clienteEncontrado == null){
            throw new ClienteException("wasa");
        }
        return clienteEncontrado;
    }
}
