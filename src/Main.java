
public class Main {
    public static void main(String[] args) {
        NetworkService service = new NetworkServiceImpl();

        // без інтернету
        NetworkService offline = new ConnectionCheckWrapper(service, false);
        offline.checkConnection("lwexample.com");

        // з інтернетом
        NetworkService online = new ConnectionCheckWrapper(service, true);
        online.checkConnection("lwexample.com");
    }
}