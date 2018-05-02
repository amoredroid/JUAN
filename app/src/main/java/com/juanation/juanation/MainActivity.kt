package com.juanation.juanation

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.signup.*
import kotlinx.android.synthetic.main.profile.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        tV_signup.setOnClickListener{
            val intent = Intent(this, RegistrationFragment::class.java)
            startActivity(intent)
        }

        btn_sign_in.setOnClickListener{
            val intent = Intent(this, UrgentNeedsFragment::class.java)
            startActivity(intent)
        }

        btn_sign_up2.setOnClickListener{
            val intent = Intent(this, ProfileFragment::class.java)
            startActivity(intent)
        }

    }
}
