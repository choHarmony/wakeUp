package com.example.heywakeup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 리스트 항목별 divider 생성
        val recyclerView = findViewById<RecyclerView>(R.id.alarmList)
        val dividerItemDecoration =
            DividerItemDecoration(recyclerView.context, LinearLayoutManager(this).orientation)
        recyclerView.addItemDecoration(dividerItemDecoration)
    }

    // 액션버튼 메뉴 액션바에 넣기
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }



}