package cursevoicelib.wsclient;

import java.net.URI;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.SSLContext;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import cursevoicelib.util.log.Log;

public class Client extends WebSocketClient {

    public Client(URI serverURI) throws NoSuchAlgorithmException, KeyManagementException {
        super(serverURI);
        SSLContext sslContext = null;
        sslContext = SSLContext.getInstance("TLS");
        sslContext.init(null, null, null);
    }

    @Override
    public void onOpen(ServerHandshake handshakedata) {
    }

    @Override
    public void onMessage(String message) {
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
    }

    @Override
    public void onError(Exception ex) {
        Log.warn("Error cated on client", ex);
    }

}
