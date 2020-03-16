package com.example.tugasmandiri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONArrayRequestListener
import kotlinx.android.synthetic.main.activity_tambah.*
import org.json.JSONArray

class Tambah : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah)

        btn_add.setOnClickListener {
            var data_namamahasiswa = edt_name.text.toString()
            var data_nomermahasiswa = edt_number.text.toString()
            var data_alamatmahasiswa = edt_address.text.toString()

            postkeserver(data_namamahasiswa, data_nomermahasiswa, data_alamatmahasiswa)

            val intent = Intent(this@Tambah, Menu::class.java)
            startActivity(intent)
        }
    }

    fun postkeserver(data1:String, data2:String, data3:String){
        AndroidNetworking.post("http://192.168.43.190/Semester_4/mahasiswa/proses_tambah_mhs.php")
            .addBodyParameter("nama_mahasiswa", data1)
            .addBodyParameter("nomer_mahasiswa", data2)
            .addBodyParameter("alamat_mahasiswa", data3)
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONArray(object : JSONArrayRequestListener {
                override fun onResponse(response: JSONArray) {
                }

                override fun onError(anError: ANError) {
                }
            })
    }
}
