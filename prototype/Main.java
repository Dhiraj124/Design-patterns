package dhiraj.design.prototype;

public class Main {
    public static void main(String[] args) {

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.3.4");
        networkConnection.loadVeryImportantData();

        System.out.println(networkConnection);

        try {
            NetworkConnection networkConnection2 = (NetworkConnection)networkConnection.clone();
            System.out.println(networkConnection2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}