public class NetworkServiceImpl implements NetworkService {

    @Override
    public void checkConnection(String host) {
        System.out.println("Підключаємось до " + host);
    }
}
