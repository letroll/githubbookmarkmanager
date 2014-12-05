package fr.letroll.githubbookmarkmanager.api.model

/**
 * Created by jquievreux on 05/12/14.
 */

public data class RepoAuthorization {
    public var id: kotlin.Int = -1

    public var url: String = ""

    public var app: App = App()

    public var token: String = ""

    public var note: String = ""

    public var note_url: String = ""

    public var created_at: String = ""

    public var updated_at: String = ""

    public var scopes: kotlin.List<String> = kotlin.List<String>

}