package com.example.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.HandlerThread
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fade_in =findViewById<Button>(R.id.fade_in)
        val fade_out =findViewById<Button>(R.id.fade_out)
        val bounce =findViewById<Button>(R.id.bounce)
        val slide_up =findViewById<Button>(R.id.slide_up)
        val slide_down =findViewById<Button>(R.id.slide_down)
        val zoom_in=findViewById<Button>(R.id.zoom_in)
        val zoom_out =findViewById<Button>(R.id.zoom_out)
        val rotate =findViewById<Button>(R.id.rotate)


        val slide_to_right =findViewById<Button>(R.id.slide_to_right)
        val slide_to_left =findViewById<Button>(R.id.slide_to_left)
        val slide_from_left=findViewById<Button>(R.id.slide_from_left)
        val slide_from_right =findViewById<Button>(R.id.slide_from_right)
        val slide_left =findViewById<Button>(R.id.slide_left)
        val slide_right =findViewById<Button>(R.id.slide_right)

        val text = findViewById<TextView>(R.id.textView)

        fade_in.setOnClickListener {

            text.visibility= View.VISIBLE;
            val animationFadeIn = AnimationUtils.loadAnimation(this,R.anim.fade_in)
            text.startAnimation(animationFadeIn)

        }
        fade_out.setOnClickListener {
            val animationFadeOut = AnimationUtils.loadAnimation(this,R.anim.fade_out)
            text.startAnimation(animationFadeOut)
            Handler().postDelayed({
                text.visibility = View.GONE
            }, 1000)
        }
        bounce.setOnClickListener {
            val animationBounce = AnimationUtils.loadAnimation(this,R.anim.bounce)
            text.startAnimation(animationBounce)
        }
        slide_up.setOnClickListener {
            val animationSlideUp = AnimationUtils.loadAnimation(this,R.anim.slide_up)
            text.startAnimation(animationSlideUp)
        }
        slide_down.setOnClickListener {
            val animationSlideDown = AnimationUtils.loadAnimation(this,R.anim.slide_down)
            text.startAnimation(animationSlideDown)
        }
        zoom_in.setOnClickListener {
            val animationZoomIn = AnimationUtils.loadAnimation(this,R.anim.zoom_in)
            text.startAnimation(animationZoomIn)
        }
        zoom_out.setOnClickListener {
            val animationZoomOut = AnimationUtils.loadAnimation(this,R.anim.zoom_out)
            text.startAnimation(animationZoomOut)
        }
        rotate.setOnClickListener {
            val animationRotate = AnimationUtils.loadAnimation(this,R.anim.rotate)
            text.startAnimation(animationRotate)
        }
        slide_to_left.setOnClickListener {
            val animationRotate = AnimationUtils.loadAnimation(this,R.anim.slide_to_left)
            text.startAnimation(animationRotate)
        }
        slide_to_right.setOnClickListener {
            val animationRotate = AnimationUtils.loadAnimation(this,R.anim.slide_to_right)
            text.startAnimation(animationRotate)
        }
        slide_from_left.setOnClickListener {
            val animationRotate = AnimationUtils.loadAnimation(this,R.anim.slide_from_left)
            text.startAnimation(animationRotate)
        }
        slide_from_right.setOnClickListener {
            val animationRotate = AnimationUtils.loadAnimation(this,R.anim.slide_from_right)
            text.startAnimation(animationRotate)
        }
        slide_right.setOnClickListener {
            val animationRotate = AnimationUtils.loadAnimation(this,R.anim.slide_right)
            text.startAnimation(animationRotate)
        }
        slide_left.setOnClickListener {
            val animationRotate = AnimationUtils.loadAnimation(this,R.anim.slide_left)
            text.startAnimation(animationRotate)
        }


    }
}