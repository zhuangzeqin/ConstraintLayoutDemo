package com.eeepay.zzq.constraintlayoutdemo.act

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eeepay.zzq.constraintlayoutdemo.R
 /*
   * ================================================
   * 描述：常见的N等分布局，例如三等分布局，通常都需要进行动态计算，根据屏幕宽度，减去间距后得到每部分的宽度，
   * 再动态设置给每个元素，而通过ConstraintLayout，则可以直接实现这样的效果
   * 作者：zhuangzeqin
   * 时间: 2021/2/2-10:50
   * 邮箱：zzq@eeepay.cn
   * 备注:
   * ================================================
   */
class N_CountAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_n__count)
    }
}