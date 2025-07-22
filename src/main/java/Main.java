public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, This is my first HTTP Server in Java");
    }
    try{
        ServerSocket serverSocket = new ServerSocket(4221);

        serverSocket.setReuseAddress(true);
    }catch(IOException e){
        System.out.println("Error: " + e.getMessage());
    }
}