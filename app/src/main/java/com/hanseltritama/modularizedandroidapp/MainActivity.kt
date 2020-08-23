package com.hanseltritama.modularizedandroidapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hanseltritama.account.AccountActivity
import com.hanseltritama.marketplace.MarketplaceActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvMainActivity.text = MarketplaceActivity.marketplaceString + "\n" + AccountActivity.accountString

    }
}
