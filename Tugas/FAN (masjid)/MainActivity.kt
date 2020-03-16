package com.example.fan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONArrayRequestListener
import com.androidnetworking.interfaces.JSONObjectRequestListener
import kotlinx.android.synthetic.main.activity_identitas.*
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONArray
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getdariserver()

        val context = this

        btnUpdateSholat.setOnClickListener {
            var data_shubuh = editShubuh.text.toString()
            var data_dhuhur = editDhuhur.text.toString()
            var data_ashar = editAshar.text.toString()
            var data_maghrib = editMaghrib.text.toString()
            var data_isha = editIsha.text.toString()
            var data_dhuha = editDhuha.text.toString()

            postkeserver(data_shubuh, data_dhuhur, data_ashar, data_maghrib, data_isha, data_dhuha)

            val intent = Intent(context, Utama::class.java)
            startActivity(intent)
        }
    }

    fun getdariserver(){
        AndroidNetworking.get("https://tugas-android1.000webhostapp.com/contoh_jadwal_json.php")
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONObject(object : JSONObjectRequestListener {
                override fun onResponse(response: JSONObject) {
                    Log.e("_kotlinResponse", response.toString())

                    //Parsing (ambil datanya)
                    val jsonArray = response.getJSONArray("result")
                    for (i in 0 until jsonArray.length()){
                        val jsonObject = jsonArray.getJSONObject(i)
                        Log.e("_kotlinTitle", jsonObject.optString("shubuh"))
                        Log.e("_kotlinTitle", jsonObject.optString("dhuhur"))
                        Log.e("_kotlinTitle", jsonObject.optString("ashar"))
                        Log.e("_kotlinTitle", jsonObject.optString("maghrib"))
                        Log.e("_kotlinTitle", jsonObject.optString("isha"))
                        Log.e("_kotlinTitle", jsonObject.optString("dhuha"))

                        //ambil dari JSON yg tagnya subuh lalu dimasukkan txt1
                        txt1.setText(jsonObject.optString("shubuh"))
                        txt2.setText(jsonObject.optString("dhuhur"))
                        txt3.setText(jsonObject.optString("ashar"))
                        txt4.setText(jsonObject.optString("maghrib"))
                        txt5.setText(jsonObject.optString("isha"))
                        txt6.setText(jsonObject.optString("dhuha"))
                    }
                }

                override fun onError(anError: ANError?) {
                    Log.i("_err", anError.toString())
                }
            })
    }

    fun postkeserver(data1:String, data2:String, data3:String, data4:String, data5:String, data6:String)
    {
        AndroidNetworking.post("https://tugas-android1.000webhostapp.com/proses-jadwal.php")
            .addBodyParameter("shubuh", data1)
            .addBodyParameter("dhuhur", data2)
            .addBodyParameter("ashar", data3)
            .addBodyParameter("maghrib", data4)
            .addBodyParameter("isha", data5)
            .addBodyParameter("dhuha", data6)
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