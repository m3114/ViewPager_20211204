package com.neppplus.viewpager_20211204.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.viewpager_20211204.fragments.AddressFragment
import com.neppplus.viewpager_20211204.fragments.AgeFragment
import com.neppplus.viewpager_20211204.fragments.NameFregment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {

        return when(position){
            0 -> "이름"
            1 -> "거주지"
            else -> "나이"
        }


    }

    override fun getCount() = 3



    override fun getItem(position: Int): Fragment {

        return when(position){
            0 -> NameFregment(        )
            1 -> AddressFragment()
            else -> AgeFragment()
        }


    }

}

