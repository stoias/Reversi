package com.example.reversi

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        val myView = MyView(this)
        myView.setWillNotDraw(false)
        setContentView(myView)
    }

    internal inner class MyView(context: Context):View(context){
        private  var paint: Paint = Paint()

        private val LineStroleWidth = 20

        init {
        }

        override fun onDraw(canvas: Canvas){
            paint.color = Color.argb(255,255,0,255)
            paint.style = Paint.Style.STROKE
            paint.strokeWidth = 2f

            canvas.drawRect(300f,300f,600f,600f,paint)

        }
    }


}
