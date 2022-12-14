package com.uide.rutadelcafe

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.VideoView

var videoView: VideoView? = null
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        videoView = findViewById<View>(R.id.v_intro) as VideoView?

        videoView!!.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.intro))

        videoView!!.requestFocus()
        videoView!!.start()


        videoView!!.setOnCompletionListener {

            val intent1 = Intent(this, home::class.java)
            startActivity(intent1)

        }
    }
}