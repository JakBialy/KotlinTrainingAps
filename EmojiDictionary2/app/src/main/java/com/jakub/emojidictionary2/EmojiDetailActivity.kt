package com.jakub.emojidictionary2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.jakub.emojidictionary2.R.id.emojiDetailTextView
import kotlinx.android.synthetic.main.activity_emoji_detail.*

class EmojiDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emoji_detail)
    }

    override fun onStart() {
        super.onStart()

        val emoji = intent.extras.getString("emoji")

        emojiDetailTextView.text = emoji
    }
}
