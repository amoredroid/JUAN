package com.juanation.juanation

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.profile.*

class ReccuringDonationFragment: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)

        imgBtn_urgentNeeds.setOnClickListener{
            val intent = Intent(this, UrgentNeedsFragment::class.java)
            startActivity(intent)
        }

        imgBtn_fastDonation.setOnClickListener{
            val intent = Intent(this, FastDonationFragment::class.java)
            startActivity(intent)
        }

        imgBtn_reccurDonation.setOnClickListener{
            val intent = Intent(this, ReccuringDonationFragment::class.java)
            startActivity(intent)
        }

        imgBtn_userProfile.setOnClickListener{
            val intent = Intent(this, ProfileFragment::class.java)
            startActivity(intent)
        }

    }
}