package me.undownding.docker.ext

import com.snappydb.DB
import me.undownding.docker.model.Version

/**
 * Created by undownding on 16-4-11.
 */
var DB.defaultServer: Version?
  get()  {
    if (exists("default_server")) {
      return get("default_server", Version::class.java)
    } else {
      return null
    }
  }
  set(value) {
    put("default_server", value)
  }
