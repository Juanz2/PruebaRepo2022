package co.uniquindio.edu.servidor;

import co.uniquindio.edu.conexion.Conexion;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Servidor  extends Conexion {

    public Servidor () throws IOException {super("servidor");}

    public void iniciarServidor () throws IOException {

        System.out.println("------------ Esperando -------");

        socket = serverSocket.accept();
        System.out.println("------------ El Cliente se encuentra en linea -------");
        salidaCliente = new DataOutputStream(socket.getOutputStream());
        salidaCliente.writeUTF("Se recibe la petición y se acepta");
        BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        while((mensajeServidor = entrada.readLine()) !=null){
            System.out.println(mensajeServidor);
        }
        System.out.println("-------- Fin de la conexión ------");
    }

}
