package co.uniquindio.edu.principal;

import co.uniquindio.edu.servidor.Servidor;

import java.io.IOException;

public class MainServidor {

    public static void main(String[] args) {

        try {
            Servidor servidor = new Servidor();
            System.out.println("--------Se incia el servidor---------");
            servidor.iniciarServidor();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
