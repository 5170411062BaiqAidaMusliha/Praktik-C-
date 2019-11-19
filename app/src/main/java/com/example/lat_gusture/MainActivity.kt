package com.example.lat_gusture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.DragEvent
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.core.view.GestureDetectorCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener
{
    //var untuk mendeteksi Gesture yang diberi nilai awal yaitu null
    var gDetector: GestureDetectorCompat? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //membuat kelas turunan GestureGetectorCompat
        this.gDetector = GestureDetectorCompat(this, this)

        //mendeteksi ketukkan ganda
        gDetector?.setOnDoubleTapListener(this)
    }

    //mencegah sentuhan/tap dan meneruskannya ke instance GestureGetectorCompat
    override fun onTouchEvent(event: MotionEvent) : Boolean{
        this.gDetector?.onTouchEvent(event)

        //memastikan untuk memanggil implementasi superclass

        return super.onTouchEvent(event)
    }

    //implementasi untuk ketukan kebawah atau onDown
    override fun onDown(event: MotionEvent): Boolean{
        gesture_status.text = "onDown"
        return true
    }

    //implementasi untuk ketukan melempar atau onFlig
    override fun onFling(event1: MotionEvent, event2: MotionEvent, velocityX: Float, velocityY: Float): Boolean{
        gesture_status.text = "onFling"
        return true
    }

    //implementasi ketukan lama atau onLongPress
    override fun onLongPress(event: MotionEvent){
        gesture_status.text = "onLongPress"
    }

    //implementasi untuk melakukan scroll atau onScroll
    override fun onScroll(e1: MotionEvent, e2: MotionEvent, velocityX: Float, velocityY: Float): Boolean{
        gesture_status.text = "onScroll"
        return true
    }

    //implementasi untuk menekan atau onShowPress
    override fun onShowPress(event: MotionEvent){
        gesture_status.text = "onShowPress"
    }

    //implementasi untuk sekali ketuk atau onSingleTapUp
    override fun onSingleTapUp(event: MotionEvent): Boolean{
        gesture_status.text = "onSingleTapUp"
        return true
    }

    //implementasi untuk keetukan berulang 2 kali atau onDouleTap
    override fun onDoubleTap(event: MotionEvent): Boolean{
        gesture_status.text = "onDoubleTap"
        return true
    }

    //implementasi untuk ketukan berulang-ulangatau onDoubleTapEvent
    override fun onDoubleTapEvent(event: MotionEvent): Boolean{
        gesture_status.text = "onDoubleTap"
        return true
    }

    //implementasi untuk satu kali ketukan yang dikonfirmasi atau onSingleTapConfirmed
    override fun onSingleTapConfirmed(event: MotionEvent): Boolean{
        gesture_status.text = "onSingleTapConfirmed"
        return true
    }
}
