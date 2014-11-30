package fr.letroll.githubbookmarkmanager.api

import retrofit.RestAdapter

/**
 * Created by letroll on 30/11/14.
 */

public open class GithubApi {

    public fun toto(): String {
        return "toto" : String
    }

    public fun getService(): GitHubService {
        val restAdapter: RestAdapter = RestAdapter.Builder()
                .setEndpoint("https://api.github.com")
                .build();

        val service: GitHubService = restAdapter.create(javaClass<GitHubService>())
        return service
    }
}