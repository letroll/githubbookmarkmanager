package fr.letroll.githubbookmarkmanager

import android.os.Bundle
import android.widget.Button
import android.widget.AutoCompleteTextView
import android.widget.EditText
import fr.letroll.githubbookmarkmanager.api.GithubApi
import fr.letroll.kotlinandroidlib.findView
import fr.letroll.githubbookmarkmanager.api.model.Repo
import retrofit.client.Response
import retrofit.RetrofitError
import retrofit.Callback

/**
 * Created by jquievreux on 26/11/14.
 */

open class MainActivity : BaseActivity() {
    override val contentViewId: Int=R.layout.activity_login

//    var login
//    var pass: EditText()

    override fun onCreate(savedInstanceState: Bundle?) {
        super<BaseActivity>.onCreate(savedInstanceState)
        setContentView(contentViewId);

        val githubApi: GithubApi = GithubApi()
        val login = findView<AutoCompleteTextView>(R.id.email)
        val pass = findView<EditText>(R.id.password)
        val email_sign_in_button = findView<Button>(R.id.email_sign_in_button)
        email_sign_in_button.setOnClickListener {

            val cal = object : Callback<List<Repo>> {
                override fun success(list: List<Repo>?, response: Response?) {
                    if (list == null) {
                        toast("list:null")
                    } else
                        toast(list.get(0).cloneUrl)
                }

                override fun failure(error: RetrofitError?) {
                    if (error == null) {
                        toast("error:null")
                    } else
                        toast("error:" + error.getMessage())
                }

            }

            githubApi.getService().listRepos("letroll", cal)
        }

//        val i = Intent(this, javaClass<LoginActivity>())
//        startActivity(i)
//        Github github = RtGithub()
    }
}