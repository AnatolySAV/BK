package com.example.bk

import android. annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import com.google.android.material.radiobutton.MaterialRadioButton


class ActivitySettings : AppCompatActivity() {

    //    @SuppressLint("SuspiciousIndentation")
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        Chk_dup = findViewById(R.id.Chk_dup) as CheckBox
        Chk_numb = findViewById(R.id.Chk_numb) as CheckBox
        Chk_trening = findViewById(R.id.Chk_trening) as CheckBox
        Rbg_Count = findViewById(R.id.rbg_count) as RadioGroup

        if (sost_dup == true) Chk_dup?.setChecked(true)
        else Chk_dup?.setChecked(false)
        if (sost_numb_user == true) Chk_numb?.setChecked(true)
        else Chk_numb?.setChecked(false)

        if (sost_trening == true) Chk_trening?.setChecked(true)
        else Chk_trening?.setChecked(false)

//            if (Rbg_Count!!.getCheckedRadioButtonId() != -1)
//            RBT_Count_Numb  = Rbg_Count!!.getCheckedRadioButtonId()
        if (RBT_Count_Numb != 0) Rbg_Count!!.check(RBT_Count_Numb)
        else RBT_Count_Numb = Rbg_Count!!.getCheckedRadioButtonId()


    }

    fun onCheckboxClicked(view: View) {
        // Получаем флажок
//        val checkBox : CheckBox = view.getId() as CheckBox
        // Получаем, отмечен ли данный флажок
//        val Check : CheckBox = view.getId() as CheckBox
        sost_dup = Chk_dup?.isChecked!!
//        if (sost_dup == true) {
//            txt_info_dup?.setText("В задуманных числах возможны повторы цифр")
//        } else {
//            txt_info_dup?.setText("В задуманных числах не допускаются повторы цифр")

    }


    fun Click(view: View) {
//        you_chislo.getM
// Нужно установить для всех полей ввода 3 или 4 знака
//        EditText editText = ...;
//        int maxLength = 16;
//        InputFilter[] FilterArray = new InputFilter[1];
//        FilterArray[0] = new InputFilter.LengthFilter(maxLength);
//        editText.setFilters(FilterArray);
        restart()
        finish()
    }

    fun OnClick_Count_Numb(view: View) {
        if (Rbg_Count!!.getCheckedRadioButtonId() != -1)
            RBT_Count_Numb = Rbg_Count!!.getCheckedRadioButtonId()
        Count_Numb = (view as MaterialRadioButton).text.toString().toInt()

    }

    fun Click_Trening(view: View) {
        sost_trening = Chk_trening?.isChecked!!
        if (sost_trening) {
//            you_chislo?.setEnabled(false)
//            you_chislo?.setBackgroundColor(0xFF018786.toInt()) // drawable/text_style
//            you_chislo?.setFocusable(false)
//            you_chislo?.setText("Тренировка")
        } else {
//            you_chislo?.setFocusable(true)
//            you_chislo?.setEnabled(true)
//            you_chislo?.requestFocus()
//            you_chislo?.setBackgroundResource(R.drawable.text_style) //  drawable/text_style

        }
    }

    fun onCHk_Numb_Clicked(view: View) {
        sost_numb_user = Chk_numb?.isChecked!!
        if (sost_numb_user == true) {
//      Открыть поле ввода числа польз и закрыть поля ввода ответа
        } else {
//      Закрыть поле ввода числа польз и открыть поля ввода ответа

        }
    }
}
