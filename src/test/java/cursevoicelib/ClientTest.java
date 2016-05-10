package cursevoicelib;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Before;
import org.junit.Test;

import cursevoicelib.exceptions.AuthenticationFailedException;

public class ClientTest {
    private static final String username = "TESt", password = "test";
    private CurseClient mClient;
    
    @Before
    public void init() throws SecurityException, IOException, URISyntaxException, AuthenticationFailedException {
        mClient = new CurseClient(username, password);
        mClient.authenticate();
    }
    
    @Test
    public void test() {
        
    }
}
