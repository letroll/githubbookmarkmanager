package fr.letroll.githubbookmarkmanager.api.model

/**
 * Created by jquievreux on 05/12/14.
 */

data public class RepoAuthorization(val _id: Int, val _url: String, val _app: App, val _token: String,
                                    val _note: String, val _note_url: String, val _created_at: String,
                                    val _updated_at: String, val _scopes: kotlin.List<String>) {
    var id: Int = _id
    var url: String = _url
    var app: App = _app
    var token: String = _token
    var note: String = _note
    var note_url: String = _note_url
    var created_at: String = _created_at
    var updated_at: String = _updated_at
    var scopes: kotlin.List<String> = _scopes

    override fun toString(): String {
        val sb: StringBuilder = StringBuilder()
        sb.append("(id:")
        sb.append(id)
        sb.append(",app:")
        sb.append(app.toString())
        sb.append(",token:")
        sb.append(token)
        sb.append(")")
        return sb.toString()
    }
}