package kr.co.hanbit.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    var fragmentList = listOf<Fragment> () //화면에 표시해줄 아이템의 목록
    override fun getItemCount(): Int {
        //TODO("Not yet implemented")
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        //TODO("Not yet implemented")
        return fragmentList.get(position) //해당 pos에 있는 프래그먼트 1개를 리턴
    }

}