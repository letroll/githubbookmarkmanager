package fr.letroll.githubbookmarkmanager.api

import fr.letroll.githubbookmarkmanager.Constant
import fr.letroll.kotlinandroidlib.factory.ApiFactory
import retrofit.RestAdapter

/**
 * Created by letroll on 30/11/14.
 */

public open class GithubApi : Constant() {
    private var user: String = "letroll"
    private var pass: String = "soulriver59"
//    private var token: String = ""

//    public fun setBasicAuth(_user: String, _pass: String) {
//        user = _user
//        pass = _pass
//    }
//
//    public fun setTokenAuth(_token: String) {
//        user = ""
//        pass = ""
//        token = _token
//    }

    public fun getService(): GitHubService {
        val restAdapterBuilder: RestAdapter.Builder = ApiFactory().getApi(API_URL).setRequestInterceptor (ApiRequestInterceptor(user, pass));
        //        val restAdapterBuilder: RestAdapter.Builder = ApiFactory().getApi(API_URL).setRequestInterceptor (ApiRequestInterceptor(token, ""));

//        Log.e("getservice", "token:" + token)

        restAdapterBuilder.setClient(InterceptingOkClient())

        val service: GitHubService = restAdapterBuilder.build().create(javaClass<GitHubService>())
        return service
    }

}