package com.example.taglib

import android.content.Context
import android.view.View
import android.widget.Toast
import com.example.taglib.databinding.WidgetEditTextLibBinding

class WidgetEditTextLib {

    companion object {
        fun myTag(max: Int, view: View) {}

        fun pureum(context: Context, msg: String) =
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}