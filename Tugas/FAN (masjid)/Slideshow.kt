package com.example.fan1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONArrayRequestListener
import com.androidnetworking.interfaces.JSONObjectRequestListener
import kotlinx.android.synthetic.main.activity_identitas.*
import kotlinx.android.synthetic.main.activity_slideshow.*
import org.json.JSONArray
import org.json.JSONObject

class Slideshow : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slideshow)

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val users = ArrayList<User>()

        AndroidNetworking.get("http://192.168.43.190/Semester_4/cobarepo-master/slideshow_json.php")
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONObject(object : JSONObjectRequestListener {
                override fun onResponse(response: JSONObject) {
                    Log.e("_kotlinResponse", response.toString())

                    val jsonArray = response.getJSONArray("result")
                    for (i in 0 until jsonArray.length()) {
                        val jsonObject = jsonArray.getJSONObject(i)
                        Log.e("_kotlinTitle", jsonObject.optString("judul_slideshow"))
                        Log.e("_kotlinTitle", jsonObject.optString("url_slideshow"))

                        // txt1.setText(jsonObject.optString("judul_slideshow"))
                        var isi1 = jsonObject.optString("judul_slideshow").toString()
                        var isi2 = jsonObject.optString("url_slideshow").toString()

                        users.add(User("$isi1", "$isi2"))


                    }
                    val adapter = CustomAdapter(users)
                    recyclerView.adapter = adapter

                }

                override fun onError(anError: ANError) {
                    Log.i("_err", anError.toString())
                }
            })

    }
}

//        getdariserver()
//
//        val context = this
//
//        btnUpdateSlideshow.setOnClickListener {
//            var data_judulslideshow = editJudulSlideshow.text.toString()
//            var data_isislideshow = editIsiSlideshow.text.toString()
//
//            postkeserver(data_judulslideshow, data_isislideshow)
//
//            val intent = Intent(context, Utama::class.java)
//            startActivity(intent)
//        }
//    }
//
//    fun getdariserver(){
//        AndroidNetworking.get("http://tugas-android1.000webhostapp.com/slideshow_json.php")
//            .setPriority(Priority.MEDIUM)
//            .build()
//            .getAsJSONObject(object : JSONObjectRequestListener {
//                override fun onResponse(response: JSONObject) {
//                    Log.e("_kotlinResponse", response.toString())
//
//                    //Parsing (ambil datanya)
//                    val jsonArray = response.getJSONArray("result")
//                    for (i in 0 until jsonArray.length()){
//                        val jsonObject = jsonArray.getJSONObject(i)
//                        Log.e("_kotlinTitle", jsonObject.optString("judul_slideshow"))
//                        Log.e("_kotlinTitle", jsonObject.optString("url_slideshow"))
//
//                        //ambil dari JSON yg tagnya judul_slideshow lalu dimasukkan judulSlideshow
//                        judulSlideshow.setText(jsonObject.optString("judul_slideshow"))
//                        url.setText(jsonObject.optString("url_slideshow"))
//                    }
//                }
//
//                override fun onError(anError: ANError?) {
//                    Log.i("_err", anError.toString())
//                }
//            })
//    }
//
//    fun postkeserver(data1:String, data2:String)
//    {
//        AndroidNetworking.post("http://tugas-android1.000webhostapp.com/proses-slideshow.php")
//            .addBodyParameter("judul_slideshow", data1)
//            .addBodyParameter("url_slideshow", data2)
//            .setPriority(Priority.MEDIUM)
//            .build()
//            .getAsJSONArray(object : JSONArrayRequestListener {
//                override fun onResponse(response: JSONArray) {
//                }
//
//                override fun onError(anError: ANError) {
//                }
//            })
//    }
//}