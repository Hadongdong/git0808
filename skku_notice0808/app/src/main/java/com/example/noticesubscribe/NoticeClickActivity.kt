package com.example.noticesubscribe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import com.example.noticesubscribe.databinding.ActivityKeywordEditBinding
import com.example.noticesubscribe.databinding.ActivityNoticeClickBinding

class NoticeClickActivity : AppCompatActivity() {

    private var noticeClickBinding: ActivityNoticeClickBinding? = null
    private val binding get() = noticeClickBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        noticeClickBinding = ActivityNoticeClickBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}