public class Main {
    public static void main(String [] args){
        MySocketServer server = new MySocketServer();
        server.start();
        System.out.println("server started on adress "+ server.getAddress());
    }
}
