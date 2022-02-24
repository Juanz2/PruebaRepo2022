package co.uniquindio.edu.principal;

import co.uniquindio.edu.cliente.Cliente;

import java.io.IOException;

public class MainCliente {

    public static void main(String[] args) {
        try {
            Cliente cliente = new Cliente();
            System.out.println("----------- Iniciando Cliente  --------");
            cliente.iniciarCliente();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
