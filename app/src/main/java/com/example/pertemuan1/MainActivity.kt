package com.example.pertemuan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.pertemuan1.home.HomeFragment
import com.example.pertemuan1.profile.ProfileFragment
import com.example.pertemuan1.setting.SettingFragment

class MainActivity : AppCompatActivity() {
    private lateinit var btn_home: Button
    private lateinit var btn_profile: Button
    private lateinit var btn_setting: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btn_home = findViewById(R.id.btn_home)
        btn_profile = findViewById(R.id.btn_profile)
        btn_setting = findViewById(R.id.btn_setting)

        btn_profile.setOnClickListener {
            loadFragment(ProfileFragment())
        }
        btn_setting.setOnClickListener {
            loadFragment(SettingFragment())
        }
        btn_home.setOnClickListener {
            loadFragment(HomeFragment())
        }
//        btn_home.setOnClickListener {
//            val intent = Intent(this, HomeActivity::class.java)
//            intent.putExtra("username","Ardian")
//            startActivity(intent)
//        }

    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commitNow()
    }
}