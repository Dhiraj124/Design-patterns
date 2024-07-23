package dhiraj.design.observer;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel();
        Subscriber dhiru = new Subscriber("Dhiraj");
        Subscriber phiru = new Subscriber("phiraj");
        channel.subscribe(dhiru);
        channel.subscribe(phiru);
        channel.notifyChanges();
    }
}
