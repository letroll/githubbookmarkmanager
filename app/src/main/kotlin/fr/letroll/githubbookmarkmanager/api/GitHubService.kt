package fr.letroll.githubbookmarkmanager.api

import fr.letroll.githubbookmarkmanager.data.model.Repo
import retrofit.http.GET
import retrofit.http.Headers
import retrofit.http.Path
import rx.Observable

/**
 * Created by letroll on 30/11/14.
 *
Client ID
f562e3df7d57256f3884
Client Secret
6e90eafd7e6088af4f58170ef5118c64ea05ff50
*/

public interface GitHubService{

    Headers("Content-type: application/json")
    GET("/users/{user}/repos")
    fun listRepos(Path("user") user: String): Observable<List<Repo>>

    Headers("Content-type: application/json")
    GET("/users/{user}/starred")
    fun listStarred(Path("user") user: String): Observable<List<Repo>>

    Headers("Content-type: application/json")
    //    [POST("/authorizations")]
    //    fun getAuthorizations([Query("scopes")] scopes: Array<String>, [Query("note")] note: String,
    //                          [Query("note_url")] note_url: String,[Query("client_id")] client_id: String,
    //                          [Query("client_secret")] client_secret: String, result: Callback<String>)

    Headers("Content-type: application/json")
    GET("/authorizations")
    fun getAuthorizations(): Observable<String>
}