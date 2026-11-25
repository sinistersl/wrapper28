//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package wrapper28;

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