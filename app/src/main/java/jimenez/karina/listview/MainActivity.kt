package jimenez.karina.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val opciones = arrayOf("Botones","Imagenes","WebView","Switch","Caja1","Caja2","Caja3","Caja4","Caja5","Caja6")
        val adaptador = ArrayAdapter<String>(this,
            android.R.layout.simple_list_item_1,
            opciones)

        miListView.adapter = adaptador
        miListView.setOnItemClickListener{adapterView, view, i, l ->
            Toast.makeText(this,"$i",Toast.LENGTH_LONG).show()

            var intent = Intent()
            when(i){
                0 -> intent = Intent(this,ActivityBotones::class.java)
                1 -> intent = Intent(this,ImagenesActivity::class.java)
                2 -> intent = Intent(this,WebActivity::class.java)
                3 -> intent = Intent(this,SwitchActivity::class.java)
            }
            startActivity(intent)
        }
    }
}

