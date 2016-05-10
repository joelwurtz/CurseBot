package cursevoicelib.helpers;

import com.google.gson.Gson;

public class GsonHelper {
    public static String toJson(Object o) {
        return new Gson().toJson(o);
    }
    
    public static <T> T fromJson(String json, Class<T> c) {
        return (T)new Gson().fromJson(json, c);
    }
}
