package mx.tecnm.tepic.ladm_u1_ejrecicio6_arreglopersona

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*


var arregloMain : ArrayList<String> = arrayListOf("","","","","")

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var arregloDisplay : ArrayList<String>
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        asignar.setOnClickListener {
            if(camposVacios()){
                if(posicion.text.toString().isNotBlank()){
                    var nombre = textonombre.text.toString()
                    var domicilio = textodomicilio.text.toString()
                    var telefono = textotelefono.text.toString()
                    var pos = posicion.text.toString().toInt()

                    var persona = "${nombre},${domicilio},${telefono}"
                }else{

                }
            }
        }
        borrar.setOnClickListener {

        }
        mostrar.setOnClickListener {

        }

    }

    private fun camposVacios() : Boolean{
        var msg = ""
        if(textonombre.text.toString().isBlank())
            msg += "\nNombre"
        if(textodomicilio.text.toString().isBlank())
            msg += "\nDomicilio"
        if(textotelefono.text.toString().isBlank())
            msg += "\nTeléfono"
        if(msg.isBlank()) {
            return true
        }else {
            AlertDialog.Builder(this).setTitle("Error").setMessage("Los siguientes campos esta vacíos: ${msg}").setPositiveButton("Aceptar",null).show()
            return false
        }
    }
}