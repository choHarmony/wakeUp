package com.example.heywakeup

import android.content.Intent
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

        // main 화면에 툴바 넣기
        setSupportActionBar(R.id.toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }

    private fun setSupportActionBar(toolbar: Int) {
        TODO("Not yet implemented")
    }

    // 액션버튼 메뉴 액션바에 넣기
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item?.itemId) {
            // toolbar 상단 플러스 버튼 누르면 알람 설정 페이지로 이동
            R.id.addNewAlarm -> {
                val intent = Intent(this, set_alarm::class.java)
                startActivity(intent)
                super.onOptionsItemSelected(item)
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


}