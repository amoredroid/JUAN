package com.juanation.juanation

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.signup.*
import kotlinx.android.synthetic.main.profile.*
import kotlinx.android.synthetic.main.reccuring_donations.*

class RegistrationFragment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        btn_sign_up2.setOnClickListener{
            val intent = Intent(this, ReccuringDonationFragment::class.java)
            startActivity(intent)
        }


    }
}
