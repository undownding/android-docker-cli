package me.undownding.docker.api

import me.undownding.docker.model.Container
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import rx.Observable

/**
 * Created by undownding on 16-4-8.
 */
interface DockerApi {

    @GET("/containers/json")
    fun getContainers(): Observable<List<Container>>

    @GET("/containers/{id}/json")
    fun getContainerDetail(@Path("id") containerId: String)

    companion object {
        fun newInstance(endpoint: String): DockerApi {
            val retrofit = Retrofit.Builder()
                    .baseUrl(endpoint)
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            return retrofit.create(DockerApi::class.java)
        }
    }
}
