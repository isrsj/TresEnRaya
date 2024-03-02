/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tresenraya;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author compi
 */
class HiloSocket implements Runnable {

    private Socket socket;

    public HiloSocket(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            InputStream in = socket.getInputStream();

            OutputStream out = socket.getOutputStream();

            Scanner scan = new Scanner(in);
            PrintWriter pw = new PrintWriter(out, true);
            pw.println("Hola");
            
            while (scan.hasNextLine()) {
                String comando = scan.nextLine();
                if (comando.equalsIgnoreCase("adios")) {
                    break;
                }
            }
            scan.close();
            pw.close();
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(HiloSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
