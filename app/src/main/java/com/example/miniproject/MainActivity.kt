package com.example.miniproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvCupang: RecyclerView
    private var list: ArrayList<Cupang> = arrayListOf()
    private var title: String = "List Cupang"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)
        rvCupang = findViewById(R.id.rv_cupang)
        rvCupang.setHasFixedSize(true)

        list.addAll(CupangData.listData)
        showRecyclerList()
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
    private fun showSelectedCupang(cupang: Cupang) {
//        Toast.makeText(this, "Kamu memilih " + hero.name, Toast.LENGTH_SHORT).show()
        val moveWithDataIntent = Intent(this@MainActivity, Cupang_view::class.java)
        moveWithDataIntent.putExtra(Cupang_view.EXTRA_NAME, cupang.name)
        moveWithDataIntent.putExtra(Cupang_view.EXTRA_DETAIL, cupang.detail)
        moveWithDataIntent.putExtra(Cupang_view.EXTRA_IMAGE, cupang.photo)
        startActivity(moveWithDataIntent)
    }
    private fun showRecyclerList() {
        rvCupang.layoutManager = LinearLayoutManager(this)
        val listCupangAdapter = ListCupangAdapter(list)
        rvCupang.adapter = listCupangAdapter

        listCupangAdapter.setOnItemClickCallback(object : ListCupangAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Cupang) {
                showSelectedCupang(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.about -> {
                val moveIntent = Intent(this@MainActivity, About::class.java)
                startActivity(moveIntent)
            }

        }
    }
}