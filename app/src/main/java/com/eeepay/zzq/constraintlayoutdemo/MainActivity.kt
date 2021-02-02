package com.eeepay.zzq.constraintlayoutdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.URLUtil
import com.eeepay.zzq.constraintlayoutdemo.act.ImgWhAct
import com.eeepay.zzq.constraintlayoutdemo.act.N_CountAct
import kotlinx.android.synthetic.main.activity_main.*

/*
  * ================================================
  * 描述：ConstraintLayout使用场景必知必会
  * 作者：zhuangzeqin
  * 时间: 2021/2/2-10:25
  * 邮箱：zzq@eeepay.cn
  * 备注:
  * ================================================
  */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //固定比例视图
        btn_img_wh.setOnClickListener {
            val intent = Intent(this,ImgWhAct::class.java)
            startActivity(intent)
        }
        btn_N_Count.setOnClickListener {
            val intent = Intent(this,N_CountAct::class.java)
            startActivity(intent)
        }
    }
}