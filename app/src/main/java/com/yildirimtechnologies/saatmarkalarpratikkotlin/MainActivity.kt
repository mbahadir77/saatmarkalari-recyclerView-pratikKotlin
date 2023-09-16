package com.yildirimtechnologies.saatmarkalarpratikkotlin

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.yildirimtechnologies.saatmarkalarpratikkotlin.databinding.ActivityDetayBinding
import com.yildirimtechnologies.saatmarkalarpratikkotlin.databinding.ActivityMainBinding
//val secilisaat : saatbilgisi? = null
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var saatarraylist : ArrayList<saatbilgisi>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        saatarraylist = ArrayList<saatbilgisi>()


        //Veri
        val metalsaat = saatbilgisi("Metal Saat",2500,R.drawable.metalsaat)
        val sarisaat = saatbilgisi("Sarı Saat",3000,R.drawable.sarisaat)
        val siyahsaat = saatbilgisi("Akıllı Saat",5000,R.drawable.siyahsaat)
        //bitmap örneği
        //val metalsaatbitmap = BitmapFactory.decodeResource(resources,R.drawable.metalsaat)

        saatarraylist.add(metalsaat)
        saatarraylist.add(sarisaat)
        saatarraylist.add(siyahsaat)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val saatadapter = saatAdaptor(saatarraylist)
        binding.recyclerView.adapter = saatadapter

    }
}