package wrapper28;

// обгортка, яка спершу дивиться, чи є інтернет, а потім передає виклик далі
public class ConnectionCheckWrapper implements NetworkService {
    private NetworkService networkService;
    private boolean internetAvailable;

    public ConnectionCheckWrapper(NetworkService networkService, boolean internetAvailable) {
        this.networkService = networkService;
        this.internetAvailable = internetAvailable;
    }

    @Override
    public void checkConnection(String host) {
        if (!internetAvailable) {
            System.out.println("Немає інтернету, до " + host + " не підключаємось");
            return;
        }
        // передаємо виклик у сам сервіс
        networkService.checkConnection(host);
    }
}