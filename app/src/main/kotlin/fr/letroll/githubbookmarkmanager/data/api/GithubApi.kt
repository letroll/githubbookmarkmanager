package fr.letroll.githubbookmarkmanager.data.api

import retrofit.RestAdapter
import retrofit.client.OkClient
import com.squareup.okhttp.OkHttpClient
import fr.letroll.githubbookmarkmanager.Constant

/**
 * Created by letroll on 30/11/14.
 */

public open class GithubApi : Constant() {
    public fun getService(): GitHubService {
        val restAdapter: RestAdapter = RestAdapter.Builder()
                .setEndpoint(API_URL)
                .setClient(OkClient(OkHttpClient()))
                .setRequestInterceptor (ApiRequestInterceptor("letroll", "soulriver59"))
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build()

        val service: GitHubService = restAdapter.create(javaClass<GitHubService>())
        return service
    }
}