package com.yildirimtechnologies.saatmarkalarpratikkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yildirimtechnologies.saatmarkalarpratikkotlin.databinding.ActivityDetayBinding

class DetayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetayBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        val selectedsaatbilgisi = intent.getSerializableExtra("saatbilgisi") as saatbilgisi

        binding.isimView.text = selectedsaatbilgisi.isim
        binding.fiyatView.text = selectedsaatbilgisi.fiyat.toString()
        binding.imageView.setImageResource(selectedsaatbilgisi.renk)




    }
}