package co.uniquindio.edu.conexion;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Conexion {

    private final int PUERTO = 8539;
    private final String HOST = "localhost";
    protected String mensajeServidor;
    protected ServerSocket serverSocket; //Socket del servidor
    protected Socket socket; // Socket del cliente
    protected DataOutputStream salidaServidor, salidaCliente;

    /**
     * Método contructor de la clase
     *
     * @param tipo
     */
    public Conexion(String tipo) throws IOException {

        if (tipo.equalsIgnoreCase("Servidor")) {
            serverSocket = new ServerSocket(PUERTO);
            socket = new Socket();
        } else {
            socket = new Socket(HOST, PUERTO);
        }
    }
}
