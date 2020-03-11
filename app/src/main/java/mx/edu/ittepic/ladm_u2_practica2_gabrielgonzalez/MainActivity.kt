package mx.edu.ittepic.ladm_u2_practica2_gabrielgonzalez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var lienzo : Lienzo ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lienzo = Lienzo(this)
        setContentView(lienzo!!)
        Hilo(this).start()
    }
}
