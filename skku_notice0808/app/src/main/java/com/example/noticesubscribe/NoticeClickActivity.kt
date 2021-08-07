package com.example.noticesubscribe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import com.example.noticesubscribe.databinding.ActivityKeywordEditBinding
import com.example.noticesubscribe.databinding.ActivityNoticeClickBinding

class NoticeClickActivity : AppCompatActivity() {

    private var noticeClickBinding: ActivityNoticeClickBinding? = null
    private val binding get() = noticeClickBinding!!


    //intent를 keywordadapter.kt로부터 전달받기 위한 코드 - 0808작성
    val titleOfaNotice = intent?.getStringExtra("title")
//    val dateOfaNotice = intent.getStringExtra("data")
//    val visitedOfaNotice = intent.getStringExtra("visited")
//    val linkOfaNotice = intent.getStringExtra("link")
//    val contentOfaNotice = intent.getStringExtra("content")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        noticeClickBinding = ActivityNoticeClickBinding.inflate(layoutInflater)
        binding.NoticeTitle.text = titleOfaNotice
        //차후에 내용 받아오면 이거 지우면 된다
        //binding.NoticeContent = contentOfaNotice
        setContentView(binding.root)

    }


}