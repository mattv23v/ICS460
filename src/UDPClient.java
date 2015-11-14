
import java.io.*;
import java.net.*;

class UDPClient {
    static int akno=0;
    static int seqno=0;
   static byte[] sendData = new byte[1024];


    public static void main(String args[]) throws Exception {

        try {
            String serverHostname = new String("127.0.0.1");

            if (args.length > 0)
                serverHostname = args[0];


            BufferedReader inFromUser =
                    new BufferedReader(new InputStreamReader(System.in));

            BufferedReader timeOut =
                    new BufferedReader(new InputStreamReader(System.in));

            BufferedReader windowSize =
                    new BufferedReader(new InputStreamReader(System.in));

            DatagramSocket clientSocket = new DatagramSocket();

            InetAddress IPAddress = InetAddress.getByName(serverHostname);
            System.out.println("Attemping to connect to " + IPAddress +
                    ") via UDP port 9876");

            byte[] receiveData = new byte[1024];

            System.out.print("Enter Message: ");
            String sentence = inFromUser.readLine();
            System.out.print("Enter Timeout: ");
            String timeOutString = timeOut.readLine();
            int time = Integer.parseInt(timeOutString);
            System.out.print("Enter Window Size: ");
            String windowSizeString = windowSize.readLine();
            int size = Integer.parseInt(windowSizeString);


            sendData = sentence.getBytes();

            System.out.println("Sending data to " + sendData.length +
                    " bytes to server.");
            DatagramPacket sendPacket =
                    new DatagramPacket(sendData, sendData.length, IPAddress, 9876);

            clientSocket.send(sendPacket);

            DatagramPacket receivePacket =
                    new DatagramPacket(receiveData, receiveData.length);

            System.out.println("Waiting for return packet");
            clientSocket.setSoTimeout(time);

            try {
                clientSocket.receive(receivePacket);
                String modifiedSentence =
                        new String(receivePacket.getData());

                InetAddress returnIPAddress = receivePacket.getAddress();

                int port = receivePacket.getPort();

                System.out.println("From server at: " + returnIPAddress +
                        ":" + port);
                System.out.println("Message: " + modifiedSentence);

            } catch (SocketTimeoutException ste) {
                System.out.println("Timeout Occurred: Packet assumed lost");
            }

            clientSocket.close();
        } catch (UnknownHostException ex) {
            System.err.println(ex);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
        public static void sendPacket(){
            ++akno;
            ++seqno;
            Packet myPacket= new Packet(akno,seqno,sendData);


        }
    }



