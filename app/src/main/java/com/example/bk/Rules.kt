package com.example.bk

//import android.R
import android.annotation.SuppressLint
import android.graphics.text.LineBreaker.JUSTIFICATION_MODE_INTER_WORD
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Rules : AppCompatActivity() {

    public var btn_play : Button? = null
    public var btn_ret : Button? = null
    public var txt_rules : TextView? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rules)
        btn_play = findViewById(R.id.btn_play) as Button // Результат компа
        btn_play = findViewById(R.id.btn_ret) as Button // Результат компа
        txt_rules = findViewById(R.id.txt_rules) as TextView // Результат компа

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        txt_rules!!.justificationMode = JUSTIFICATION_MODE_INTER_WORD
    }
//    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//        textView.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
    }

    fun Click(view: View) {
        when (view.getId()) {
            R.id.btn_ret ->      // кнопка ОК
                finish()

//                tvOut.setText("Нажата кнопка ОК")
            R.id.btn_play ->      // кнопка Cancel
                finish()
        }
    }
}