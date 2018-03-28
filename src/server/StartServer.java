package server;

public class StartServer {

    private int port;
    Server server;



    public StartServer(int port) {
        this.port = port;
        new Server(port);
    }

    public static void main (String[] args)
    {
        int port;

        if(args.length != 1)
        {
            System.out.println("Usage: java -jar program.jar [port]");
            System.exit(1);
        }

        port = Integer.parseInt(args[0]);
        new StartServer(port);
    }

}
