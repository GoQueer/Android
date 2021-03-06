package ca.ualberta.goqueer.network;



import android.content.Context;

import ca.ualberta.goqueer.server.cache_provider.CacheProvider;


/**
 * Created by bamdad on 8/18/16.
 */
public class Singletons {
    public static CacheProvider cacheProvider;
    public static AuthManager authManager;

    public static void make(Context context) {
        Singletons.authManager = new AuthManager(context);
        Singletons.cacheProvider = new CacheProvider(context);
    }
}
