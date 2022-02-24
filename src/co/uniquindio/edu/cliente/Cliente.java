package co.uniquindio.edu.cliente;

import co.uniquindio.edu.conexion.Conexion;

import java.io.DataOutputStream;
import java.io.IOException;

public class Cliente extends Conexion {

    public Cliente() throws IOException {
        super("cliente");
    }

    /**
     *
     * @throws IOException
     */
    public void iniciarCliente() throws IOException {

        salidaServidor = new DataOutputStream(socket.getOutputStream());
        for (int i = 0; i < 5; i++) {
            salidaServidor.writeUTF("Este es el mensaje # " + (i + 1) + "\n");
        }
        socket.close();

    }
}
