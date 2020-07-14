package kr.co.korearental.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener {
            //가장 중요한 코드 부분
            // FragmentManager를 사용해서 어떤 대상에 대해 추가(beginTransaction)을 해주는것인데요
            //FrameLayout의 Id를 view로 주었으니 view를 불러오고, OneFragment()로 추가해주는거에요!
            //그리고 버튼을 총 3개를 줬었죠?
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, OneFragment())
                .commit()
        }
        btn2.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, TwoFragment())
                .commit()
        }
        btn3.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, ThreeFragment())
                .commit()
        }
    }
}