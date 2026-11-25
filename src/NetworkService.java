package wrapper28;

// спільний інтерфейс, щоб звичайний сервіс і обгортка працювали однаково
public interface NetworkService {
    void checkConnection(String host);
}
