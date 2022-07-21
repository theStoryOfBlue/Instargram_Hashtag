package com.example.instargram_hashtag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.taglib.ShowLibrary
import com.example.taglib.WidgetEditTextLib

//import com.example.libsample

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ShowLibrary.lToast(this,"hello")
    }

}