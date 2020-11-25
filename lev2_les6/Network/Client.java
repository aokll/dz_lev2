package Network;

import com.sun.deploy.util.BlackList;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class Client {
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;

    public Client() {
        try {
            System.out.println("Подключено");
            socket = new Socket("localhost", 8888);
            System.out.println(socket);
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            AtomicBoolean isDrop = new AtomicBoolean(false);
            new Thread(() -> {
                try {
                    while (true) {
                        String incomingMessage = in.readUTF();
                        if (incomingMessage.contains("cmd Exit")) {
                            System.out.println(incomingMessage);
                            System.out.println("Нажмите ENTER");
                            isDrop.set(true);
                            break;
                        }
                        System.out.println(incomingMessage);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

            Scanner scanner = new Scanner(System.in);
            while (true) {
                if (isDrop.get()) {
                    System.out.println("Closing...");
                    break;
                }
                System.out.println("please");
                out.writeUTF(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        serv.Client socket = new serv.Client();
    }
}