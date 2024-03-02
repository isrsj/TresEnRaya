package tresenraya;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author compi
 */
public class Servidor {
    
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(8189);
            
            while (true) {
                
                Socket socket = server.accept();

                HiloSocket hilo = new HiloSocket(socket);
                Thread thread = new Thread(hilo);
                thread.start();

            }
            
        } catch (IOException ex) {
            System.out.println("mala mia");
        }
        
    }
    
}
