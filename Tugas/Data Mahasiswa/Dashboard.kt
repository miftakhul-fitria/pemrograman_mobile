package com.example.tugasmandiri

import android.annotation.SuppressLint
import android.content.Context
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
import com.androidnetworking.interfaces.JSONObjectRequestListener
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject

class Dashboard : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        add.setOnClickListener {
            startActivity(Intent(this@Dashboard, Tambah::class.java))
        }

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val mhs = ArrayList<Mahasiswa>()

        AndroidNetworking.get("http://192.168.43.190/Semester_4/mahasiswa/data_mhs_json.php")
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONObject(object : JSONObjectRequestListener {
                override fun onResponse(response: JSONObject) {
                    Log.e("_kotlinResponse", response.toString())

                    val jsonArray = response.getJSONArray("result")
                    for (i in 0 until jsonArray.length()) {
                        val jsonObject = jsonArray.getJSONObject(i)
                        Log.e("_kotlinTitle", jsonObject.optString("nama_mahasiswa"))
                        Log.e("_kotlinTitle", jsonObject.optString("nomer_mahasiswa"))
                        Log.e("_kotlinTitle", jsonObject.optString("alamat_mahasiswa"))

                        // txt1.setText(jsonObject.optString("nama_mahasiswa"))
                        var isi1 = jsonObject.optString("nama_mahasiswa").toString()
                        var isi2 = jsonObject.optString("nomer_mahasiswa").toString()
                        var isi3 = jsonObject.optString("alamat_mahasiswa").toString()

                        mhs.add(Mahasiswa("$isi1", "$isi2", "$isi3"))


                    }
                    val adapter = CustomAdapter(mhs)
                    recyclerView.adapter = adapter

                }

                override fun onError(anError: ANError) {
                    Log.i("_err", anError.toString())
                }
            })
    }
}