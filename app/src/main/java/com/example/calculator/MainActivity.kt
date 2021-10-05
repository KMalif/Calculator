package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        tambahAngka()
        kurangAngka()
        kaliAngka()
        bagiAngka()
    }

    private fun tambahAngka(){
        val a = binding.Angka1.text.toString().toInt()
        val b = binding.Angka2.text.toString().toInt()

        binding.BtnTambah.setOnClickListener {
            val hasil = a + b
            binding.EtHasil.setText(hasil)
        }
    }

    private fun kurangAngka(){
        val a = binding.Angka1.text.toString().toInt()
        val b = binding.Angka2.text.toString().toInt()

        binding.BtnKurang.setOnClickListener {
            val hasil = a - b
            binding.EtHasil.setText(hasil)
        }
    }

    private fun kaliAngka(){
        val a = binding.Angka1.text.toString().toInt()
        val b = binding.Angka2.text.toString().toInt()

        binding.BtnKali.setOnClickListener {
            val hasil = a * b
            binding.EtHasil.setText(hasil)

        }
    }

    private fun bagiAngka(){
        val a = binding.Angka1.text.toString().toDouble()
        val b = binding.Angka2.text.toString().toDouble()

        binding.BtnBagi.setOnClickListener {
            val hasil = a / b
            binding.EtHasil.setText(hasil.toString())
        }

    }
}