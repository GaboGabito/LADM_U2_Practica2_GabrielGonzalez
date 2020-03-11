package mx.edu.ittepic.ladm_u2_practica2_gabrielgonzalez

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo(p:MainActivity): View(p){

    var circulop = Burbujas(100,150,80)
    var circulop2 = Burbujas(150,330,90)
    var circulop3 = Burbujas(250,980,100)
    var circulop4 = Burbujas(750,630,110)
    var circulog = Burbujas(600,800,180)
    var circulog2 = Burbujas(200,400,150)
    var circulog3 = Burbujas(500,100,200)
    var circulog4 = Burbujas(700,600,140)

    override fun onDraw(c: Canvas) {//SE EJECUTA CUANDO LA APLICACION SE MUESTRA EN PANTALLA
        super.onDraw(c)
        var paint= Paint()

        c.drawColor(Color.BLACK)

        paint.color= Color.RED
        circulop.pintar(c,paint)
        circulop2.pintar(c,paint)
        circulop3.pintar(c,paint)
        circulop4.pintar(c,paint)

        paint.color=Color.WHITE
        circulog.pintar(c,paint)
        circulog2.pintar(c,paint)
        circulog3.pintar(c,paint)
        circulog4.pintar(c,paint)
    }

    fun animarCirculo(){
        circulop.rebote(width,height)
        circulop2.rebote(width,height)
        circulop3.rebote(width,height)
        circulop4.rebote(width,height)
        circulog.rebote(width,height)
        circulog2.rebote(width,height)
        circulog3.rebote(width,height)
        circulog4.rebote(width,height)
        invalidate()
    }

}