package fr.letroll.githubbookmarkmanager.api

import com.squareup.okhttp.OkHttpClient
import retrofit.client.OkClient
import retrofit.client.Response
import retrofit.client.Header
import retrofit.client.Request
import android.util.Log

/**
 * Created by letroll on 07/12/14.
 */

open public class InterceptingOkClient(client: OkHttpClient) : OkClient() {

    public override fun execute(request: Request): Response {
        val response: Response = super.execute(request);

        for (header: Header in response.getHeaders()) {
            if(header.toString().contains("Link:")) {
                Log.e("header", header.toString())
                break;
            }
        }

        return response;
    }
}