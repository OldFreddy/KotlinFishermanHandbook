package com.oldfredddy.kotlinfishermanhandbook

import MyAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_layout.*
import kotlinx.android.synthetic.main.main_content.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nav_view.setNavigationItemSelectedListener (this)

        var list = ArrayList<ListItem>()

        list.add(ListItem(R.drawable.som,"Сом","чварчрпчаптчапт чапрапр ыарпчапрча"))
        list.add(ListItem(R.drawable.nalim,"Налим","чварчрпчаптчапт чапрапр ыарпчапрча"))
        list.add(ListItem(R.drawable.shuca,"Щука","чварчрпчаптчапт чапрапр ыарпчапрча"))
        list.add(ListItem(R.drawable.caras,"Карась","чварчрпчаптчапт чапрапр ыарпчапрча"))
        list.add(ListItem(R.drawable.som,"Карась","чварчрпчаптчапт чапрапр ыарпчапрча"))
        rcView.hasFixedSize()
        rcView.layoutManager = LinearLayoutManager(this)
        rcView.adapter = MyAdapter(list,this)


    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.id_fish -> Toast.makeText(this, "РЫБЫ", Toast.LENGTH_SHORT).show()
            R.id.id_na -> Toast.makeText(this, "Наживки", Toast.LENGTH_SHORT).show()
            R.id.id_sna -> Toast.makeText(this, "Снасти", Toast.LENGTH_SHORT).show()
            R.id.id_history -> Toast.makeText(this, "Истории", Toast.LENGTH_SHORT).show()
        }




        return true
    }
}