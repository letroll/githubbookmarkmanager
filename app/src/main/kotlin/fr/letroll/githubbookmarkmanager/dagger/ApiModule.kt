package fr.letroll.githubbookmarkmanager.dagger

import dagger.Module
import dagger.Provides
import fr.letroll.githubbookmarkmanager.data.api.GitHubService
import retrofit.Endpoint
import retrofit.Endpoints
import retrofit.RestAdapter

/**
 * Created by jquievreux on 31/07/15.
 */

Module
public class ApiModule {


    public val PRODUCTION_API_URL:String = "https://api.github.com"

    Provides
    @AppScope
    fun provideEndpoint(): Endpoint {
        return Endpoints.newFixedEndpoint(PRODUCTION_API_URL)
    }


    Provides
    @AppScope
    fun provideGitHubService(restAdapter: RestAdapter): GitHubService {
        return restAdapter.create(javaClass<GitHubService>())
    }


}