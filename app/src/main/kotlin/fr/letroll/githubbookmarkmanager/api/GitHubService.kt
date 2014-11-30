package fr.letroll.githubbookmarkmanager.api

import retrofit.http.GET
import retrofit.http.Path
import fr.letroll.githubbookmarkmanager.api.model.Repo
import retrofit.http.POST
import retrofit.http.Query

/**
 * Created by letroll on 30/11/14.
 *
Client ID
f562e3df7d57256f3884
Client Secret
6e90eafd7e6088af4f58170ef5118c64ea05ff50

 */

public trait GitHubService{
    [GET("/users/{user}/repos")]
    fun listRepos([Path("user")] user: String): List<Repo>;

    [POST("/authorizations")]
    fun getAuthorizations( [Query("scopes")] scopes: String,[Query("note")] note: String,
                           [Query("note_url")] note_url: String,[Query("client_id")] client_id: String,
                           [Query("client_secret")] client_secret: String)
}