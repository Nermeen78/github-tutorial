package com.opensource.ammar.githubtutorial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.net.Uri


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // @todo #1 create a webview and show the blog inside it
    }
    fun ShowonGithub(view: View)
    {
        val url = "https://github.com/ammaratef45/github-tutorial"

        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
}
