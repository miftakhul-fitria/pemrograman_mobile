package com.example.miftakhul_minggu1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        var nilai = 80

        if(nilai >=90 && nilai <=100)
        {
            Log.i("Nilai Anda", "A")
            tampil.text = "Nilai Anda A"
        }

        else if(nilai >=80 && nilai <= 89)
        {
            Log.i("Nilai Anda", "AB")
            tampil.text = "Nilai Anda AB"
        }

        else if(nilai >=70 && nilai <= 79)
        {
            Log.i("Nilai Anda", "B")
            tampil.text = "Nilai Anda B"
        }

        else if(nilai >=60 && nilai <= 69)
        {
            Log.i("Nilai Anda", "BC")
            tampil.text = "Nilai Anda BC"
        }

        else if (nilai <= 59)
        {
            Log.i("Nilai Anda", "C")
            tampil.text = "Nilai Anda C"
        }
         */

        /*
        for (x in 0..10)
            Log.i("Hasil", "$x")
         */

        /*
        var i = 1
        while (i <= 5)
        {
            Log.i("Line", "$i")
            ++i
        }
         */


        /*var num = 2
            var i = 1

            do {
                Log.i("Hasil", "2 * $i =" + num * i)
                i++
            }while (i < 11)
         */

        /*
        var a = 5
        var b = 7
        penjumlahan(a, b)
         */

        var a = 5
        var b = 6
        var c = 10
        hitung(a, b, c)
    }

    /*
    fun penjumlahan(a:Int, b:Int){
        var c : Int
        c = a + b
        Log.i("Hasil", "$c")
    }
     */

    fun hitung(a:Int, b:Int, c:Int){
        var d : Int
        d = (a * b - 10)/c
        Log.i("Hasil", "$d")
    }
}
