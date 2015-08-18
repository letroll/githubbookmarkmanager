package fr.letroll.kotlinandroidlib.factory

import fr.letroll.kotlinandroidlib.BuildConfig
import retrofit.RestAdapter

/**
 * Created by jquievreux on 18/08/15.
 */

public open class ApiFactory() {

    public fun getApi(endPoint: String): RestAdapter.Builder {
        return RestAdapter.Builder()
                .setEndpoint(endPoint)
                .setLogLevel(if (BuildConfig.DEBUG) retrofit.RestAdapter.LogLevel.FULL else retrofit.RestAdapter.LogLevel.NONE)
    }

    //    public fun getService(restAdapter:RestAdapter,inter:interface){
    ////        return
    ////        restAdapter.create(javaClass<javaType>())
    //        return restAdapter.create(javaClass<GitHubService>())
    //    }

}