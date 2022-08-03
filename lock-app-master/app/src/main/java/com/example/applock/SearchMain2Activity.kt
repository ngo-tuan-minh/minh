package com.example.applock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import android.widget.Toast
import com.example.applock.model.AppInfo
import com.example.applock.utils.Constant

class SearchMain2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searchmain)
        val arrayList  = Constant.getApplications(this)
        val searchView = findViewById<SearchView>(R.id.searchView)
        val listView = findViewById<ListView>(R.id.userList)
        val adapter : ArrayAdapter<String> = ArrayAdapter(this , android.R.layout.simple_list_item_1 )
        listView.adapter= adapter
        searchView.setOnQueryTextListener(object :SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                searchView.clearFocus()
                for (item in arrayList ){
                    if (item.appName.contains(query!!)){

                    }else{
                        
                    }
                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {

                return false
            }

        })
    }
}