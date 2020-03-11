package com.example.lezato

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail_activity.*

class ResepDetailActivity : AppCompatActivity (){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)

        var intentThatStartedThisActivity = getIntent()

        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)){
            var nama=intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            var daerah=intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_COMPONENT_NAME)
            var isiresep=intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SPLIT_NAME)
            var fotoresep=intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_REFERRER).toInt()
            textView4.text = nama
            textView5.text = daerah
            textView6.text = isiresep
            imageView2.setImageResource(fotoresep)

        }

    }
}