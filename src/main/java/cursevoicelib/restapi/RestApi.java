package cursevoicelib.restapi;

import cursevoicelib.restapi.accessors.LoginAccessor;

public class RestApi {
    private static final String SESSIONS_URL = "https://sessions-v1.curseapp.net/",
            CONTACTS_URL = "https://contacts-v1.curseapp.net/",
            REPORTING_URL = "https://reporting-v1.curseapp.net/",
            GIVEAWAYS_URL = "https://giveaways-v1.curseapp.net/",
            GROUPS_URL = "https://groups-v1.curseapp.net/",
            SYNC_URL = "https://sync-v1.curseapp.net/",
            POOL_URL = "https://polls-v1.curseapp.net/",
            CONVERSATION_URL = "https://conversations-v1.curseapp.net/";
    private ApiRequester mRequester = new ApiRequester();
    private final LoginAccessor mLoginAccessor = new LoginAccessor(mRequester);
    
    public boolean isAuthenticated() {
        return mLoginAccessor.isAuthenticated();
    }
    
    public void clearCookies() {
        mRequester.clearCookies();
    }
    
    public LoginAccessor getLoginAccessor() {
        return mLoginAccessor;
    }
}
