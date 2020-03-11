package mx.edu.ittepic.ladm_u2_practica2_gabrielgonzalez

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.view.MotionEvent

class Burbujas(){


    var x = 0f
    var y = 0f
    var radio = 0f
    var incX = 8
    var incDosX = 3
    var incDosY = 3
    var incY = 8

    constructor(x:Int, y:Int, radio:Int) : this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.radio = radio.toFloat()

    }

    fun pintar(c: Canvas, p: Paint){

        c.drawCircle(x+radio,y+radio,radio,p)

    }

    fun rebote(ancho:Int, alto:Int){
        if(radio<=120){
            x+=incX
            if(x<=-10 || x>=ancho){
                incX *= -1
            }
            y +=incY
            if(y<=-10 || y>=alto){
                incY *= -1
            }
        }
        else{
            x+=incDosX
            if(x<=-10 || x>=ancho){
                incDosX *= -1
            }
            y +=incDosY
            if(y<=-10 || y>=alto){
                incDosY *= -1
            }
        }

    }

}