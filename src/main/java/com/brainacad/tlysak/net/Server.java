package com.brainacad.tlysak.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by tymur on 7/25/16.
 */
public class Server {
    public static void main(String[] ar)    {
        int port = 8834;
        try {
            ServerSocket ss = new ServerSocket(port);
            System.out.println("Waiting for a client...");
            Socket socket = ss.accept();

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            String line = null;
            while(true) {
                line = in.readUTF();
                System.out.println("Requst info: " + line);
                out.writeUTF(line);
                out.flush();

            }
        } catch(Exception x) { x.printStackTrace(); }
    }
}
