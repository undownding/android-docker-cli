package me.undownding.docker

import android.app.Application

/**
 * Created by undownding on 16-4-11.
 */
class DockerApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        instance = this;
    }

    companion object {
        lateinit var instance: DockerApplication
    }
}
