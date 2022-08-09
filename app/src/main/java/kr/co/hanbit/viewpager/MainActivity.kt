package kr.co.hanbit.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import kr.co.hanbit.viewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        /* 프래그먼트와 어댑터를 MainAct에서 연결하기 */
        val fragmentList = listOf(FragmentA(), FragmentB(), FragmentC(), FragmentD())
        val adapter = FragmentAdapter(this) //parameter: supportFragmentManger
        adapter.fragmentList = fragmentList
        binding.viewPager.adapter = adapter //레이아웃의 viewPager를 import하고 어댑터 적용

        /* 탭 레이아웃 적용하기 */
        val tabTitles = listOf<String>("A", "B", "C", "D") //메뉴명으로 사용할 이름
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position -> //TabLayoutMediator를 사용해서 TabLayout과 뷰페이저 연결
            tab.text = tabTitles[position]
        }.attach()
    }
}