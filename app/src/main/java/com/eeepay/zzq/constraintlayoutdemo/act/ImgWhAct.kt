package com.eeepay.zzq.constraintlayoutdemo.act

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eeepay.zzq.constraintlayoutdemo.R

/**
 * 描述：组件宽度撑满屏幕，高度按「宽度x固定比例」计算。
   这样的布局，在以往的布局方式下，都需要通过动态计算后修改高度来实现，
   但是通过ConstraintLayout，则可以直接在XML中实现。
 * 作者：zhuangzeqin
 * 时间: 2021/2/2-10:27
 * 邮箱：zzq@eeepay.cn
 * 备注:
 */
class ImgWhAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imgwh)
    }
}