package com.example.fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.viewpager.widget.ViewPager
import com.example.fragment.R
import com.example.fragment.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class CommunicationViewModel : ViewModel() {
    private val mName = MutableLiveData<String>()
    val name: LiveData<String>
        get() = mName
    fun setName(name: String) {
        mName.value = name
    }
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewpg = findViewById<ViewPager>(R.id.view_pager)
        val tabs1 = findViewById<TabLayout>(R.id.tabs)
        viewpg.adapter = ViewPagerAdapter( this,
            supportFragmentManager)
        tabs1.setupWithViewPager(viewpg)
    }
}
