package cursevoicelib;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;

import cursevoicelib.exceptions.AuthenticationFailedException;
import cursevoicelib.restapi.RestApi;
import cursevoicelib.restapi.beans.LoginAnswerBean;
import cursevoicelib.util.log.Log;
import cursevoicelib.util.log.SimpleFormatter;

/***
 * API access to the curse client systems
 * 
 * @author AlexMog
 *
 */
public class CurseClient {
    public static final String USERDATA_PATH = System.getProperty("user.home") + File.separator + "curseclientlib" + File.separator;
    private RestApi mApi = new RestApi();
    private String mUsername, mPassword;
    
    public CurseClient(String username, String password) throws SecurityException, IOException {
        this();
        mUsername = username;
        mPassword = password;
    }
    
    public CurseClient() throws SecurityException, IOException {
        File f = new File(USERDATA_PATH + "logs");
        if (!f.exists()) f.mkdirs();
        
        ConsoleHandler ch = new ConsoleHandler();
        ch.setFormatter(new SimpleFormatter());
        FileHandler fh = new FileHandler(USERDATA_PATH + "logs" + File.separator + "%u.%g.log",
                1024 * 1024, 10, false);
        fh.setFormatter(new SimpleFormatter());

        Log.getLogger().getLogger().setUseParentHandlers(false);
        Log.getLogger().getLogger().addHandler(fh);
        Log.getLogger().getLogger().addHandler(ch);
        Log.info("CurseClient initialised.");
    }
    
    public LoginAnswerBean authenticate() throws IOException, URISyntaxException, AuthenticationFailedException {
        return mApi.getLoginAccessor().authenticate(mUsername, mPassword);
    }
}
