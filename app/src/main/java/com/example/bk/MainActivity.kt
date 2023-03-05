package com.example.bk

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.text.InputFilter
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


public var ed_us0 = arrayOfNulls<EditText>(9)
public var tx_rez_us0 = arrayOfNulls<TextView>(9)
public var tx_comp0 = arrayOfNulls<TextView>(9)
public var tx_rez_comp0 = arrayOfNulls<TextView>(9)
public var btn0 = arrayOfNulls<TextView>(9)
public var btn1 = arrayOfNulls<TextView>(9)
public var btn2 = arrayOfNulls<TextView>(9)


//public var MyPoisk1 = Array<Byte>(10*10*10*10,{0})
//public var MyPoisk2 = Array<Byte>(10*10*10*10,{0})
//public var MyPoisk3 = Array<Byte>(10*10*10*10,{0})
//public var MyPoisk4 = Array<Byte>(10*10*10*10,{0})
//public var MyPoisk5 = Array<Boolean>(10*10*10*10,{true})

public var My_popitrasklad =  intArrayOf(0,0,0,0)
public var My_zadum = intArrayOf(0,0,0,0)

public var You_popitrasklad =  intArrayOf(0,0,0,0)
public var You_zadum = intArrayOf(0,0,0,0)

public var You_zadum_INT = 0
public var You_Vsego=0
public var You_Mesto=0
public var Mesto=0
public var Vsego=0
public var Num_Hod = 0
public var sost_dup = false
public var sost_numb_user = true
public var sost_trening = false
public var Count_Numb : Int = 4


public var RBT_Count_Numb : Int = 0

public var Int_Count_Numb : Int =0

var Chk_dup : CheckBox? = null
var Chk_numb : CheckBox? = null
var Chk_trening : CheckBox? = null

var Rbg_Count : RadioGroup? = null

public var you_chislo : EditText? = null

public var CountS=10*9*8*7
public var CountC : Int = 0


public var tt_test : TextView? = null
public var  regim : TextView? = null
public var txt_info_dup  : TextView? = null

public   fun EditText.addFilter(filter: InputFilter) {
    filters = if (filters.isNullOrEmpty()) {
        arrayOf(filter)
    } else {
        filters.toMutableList()
            .apply {
                removeAll { it.javaClass == filter.javaClass }
                add(filter)
            }
            .toTypedArray()
    }
}

//    textView.addFilter(InputFilter.LengthFilter(10))

class MainActivity : AppCompatActivity()  {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

//        ed_us0[0] =  findViewById(R.id.ed_us0) as EditText
//        ed_us0[0]?.setText("9999")
        tt_test = findViewById(R.id.tt_test) as TextView
        regim = findViewById(R.id.regim) as TextView

        txt_info_dup = findViewById((R.id.txt_info_dup)) as TextView
//        tt_test!!.setText("Проба")

        you_chislo = findViewById(R.id.you_chislo) as EditText

        fun init_Graph(){

            ed_us0[0] =  findViewById(R.id.ed_us0) as EditText //Число - попытка пользователя
            ed_us0[1] =  findViewById(R.id.ed_us1) as EditText //Число - попытка пользователя
            ed_us0[2] =  findViewById(R.id.ed_us2) as EditText //Число - попытка пользователя
            ed_us0[3] =  findViewById(R.id.ed_us3) as EditText //Число - попытка пользователя
            ed_us0[4] =  findViewById(R.id.ed_us4) as EditText //Число - попытка пользователя
            ed_us0[5] =  findViewById(R.id.ed_us5) as EditText //Число - попытка пользователя
            ed_us0[6] =  findViewById(R.id.ed_us6) as EditText //Число - попытка пользователя
            ed_us0[7] =  findViewById(R.id.ed_us7) as EditText //Число - попытка пользователя
            ed_us0[8] =  findViewById(R.id.ed_us8) as EditText //Число - попытка пользователя

            tx_rez_us0[0] = findViewById(R.id.tx_rez_us0) as TextView // Результат пользователя
            tx_rez_us0[1] = findViewById(R.id.tx_rez_us1) as TextView // Результат пользователя
            tx_rez_us0[2] = findViewById(R.id.tx_rez_us2) as TextView // Результат пользователя
            tx_rez_us0[3] = findViewById(R.id.tx_rez_us3) as TextView // Результат пользователя
            tx_rez_us0[4] = findViewById(R.id.tx_rez_us4) as TextView // Результат пользователя
            tx_rez_us0[5] = findViewById(R.id.tx_rez_us5) as TextView // Результат пользователя
            tx_rez_us0[6] = findViewById(R.id.tx_rez_us6) as TextView // Результат пользователя
            tx_rez_us0[7] = findViewById(R.id.tx_rez_us7) as TextView // Результат пользователя
            tx_rez_us0[8] = findViewById(R.id.tx_rez_us8) as TextView // Результат пользователя

            tx_comp0[0] = findViewById(R.id.tx_comp0) as TextView // Число - попытка компа
            tx_comp0[1] = findViewById(R.id.tx_comp1) as TextView // Число - попытка компа
            tx_comp0[2] = findViewById(R.id.tx_comp2) as TextView // Число - попытка компа
            tx_comp0[3] = findViewById(R.id.tx_comp3) as TextView // Число - попытка компа
            tx_comp0[4] = findViewById(R.id.tx_comp4) as TextView // Число - попытка компа
            tx_comp0[5] = findViewById(R.id.tx_comp5) as TextView // Число - попытка компа
            tx_comp0[6] = findViewById(R.id.tx_comp6) as TextView // Число - попытка компа
            tx_comp0[7] = findViewById(R.id.tx_comp7) as TextView // Число - попытка компа
            tx_comp0[8] = findViewById(R.id.tx_comp8) as TextView // Число - попытка компа

            tx_rez_comp0[0] = findViewById(R.id.tx_rez_comp0) as TextView // Результат компа
            tx_rez_comp0[1] = findViewById(R.id.tx_rez_comp1) as TextView // Результат компа
            tx_rez_comp0[2] = findViewById(R.id.tx_rez_comp2) as TextView // Результат компа
            tx_rez_comp0[3] = findViewById(R.id.tx_rez_comp3) as TextView // Результат компа
            tx_rez_comp0[4] = findViewById(R.id.tx_rez_comp4) as TextView // Результат компа
            tx_rez_comp0[5] = findViewById(R.id.tx_rez_comp5) as TextView // Результат компа
            tx_rez_comp0[6] = findViewById(R.id.tx_rez_comp6) as TextView // Результат компа
            tx_rez_comp0[7] = findViewById(R.id.tx_rez_comp7) as TextView // Результат компа
            tx_rez_comp0[8] = findViewById(R.id.tx_rez_comp8) as TextView // Результат компа

            btn0[0] = findViewById(R.id.btn1) as Button // Результат компа
            btn0[1] = findViewById(R.id.btn2) as Button // Результат компа
            btn0[2] = findViewById(R.id.btn3) as Button // Результат компа
            btn0[3] = findViewById(R.id.btn4) as Button // Результат компа
            btn0[4] = findViewById(R.id.btn5) as Button // Результат компа
            btn0[5] = findViewById(R.id.btn6) as Button // Результат компа
            btn0[6] = findViewById(R.id.btn7) as Button // Результат компа
            btn0[7] = findViewById(R.id.btn8) as Button // Результат компа
            btn0[8] = findViewById(R.id.btn9) as Button // Результат компа

            Restart_Graph()
        }

        init_Graph()
        initData()
//        Restart_Graph()

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id: Int = item.getItemId()
        when (id) {
            R.id.action_settings -> {
//                tt_test!!.setText("Меню Настройки")
                val intent = Intent(this, ActivitySettings::class.java)
                startActivity(intent)
                return true
            }
            R.id.rules -> {
//                tt_test!!.setText("Меню ПРАВИЛА")
                val intent = Intent(this, Rules::class.java)
                startActivity(intent)
                return true
            }
            R.id.statistic -> {
//                tt_test!!.setText("Меню СТАТИСТИКА")
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun Click(view: View) {

        var ssss: String
        if (!sost_trening) {
            ssss = you_chislo?.getText().toString() // приводим к типу String

//         tt_test!!.setText(ssss)
        when {
        Count_Numb == 3 -> {
            if ((ssss == "") or (ssss.length < Count_Numb)) {
                val toast = android.widget.Toast.makeText(
                    this,
                    "Введите  корректное своё число",
                    android.widget.Toast.LENGTH_LONG
                )
                toast.show()
                return
            } else if (((ssss[0] == ssss[1]) or (ssss[0] == ssss[2]) or
                        (ssss[1] == ssss[2]) ) and (sost_dup != true)
            ) // повторы и запрет повторов
            {
                val toast = Toast.makeText(this, "Введите  корректное своё число", Toast.LENGTH_LONG)
                toast.show()
                return
            }
        }
        Count_Numb == 4 -> {
            if ((ssss == "") or (ssss.length < Count_Numb)) {
                val toast = android.widget.Toast.makeText(
                    this,
                    "Введите  корректное своё число",
                    android.widget.Toast.LENGTH_LONG
                )
                toast.show()
                return
            } else if (((ssss[0] == ssss[1]) or (ssss[0] == ssss[2]) or (ssss[0] == ssss[3]) or
                        (ssss[1] == ssss[2]) or (ssss[1] == ssss[3]) or (ssss[2] == ssss[3])) and (sost_dup != true)
            ) // повторы и запрет повторов
            {
                val toast = Toast.makeText(this, "Введите  корректное своё число", Toast.LENGTH_LONG)
                toast.show()
                return
            }
        }
    }

}

        ssss = ed_us0[Num_Hod]?.getText().toString() // приводим к типу String
        if ((ssss=="") or (ssss.length < Count_Numb)) {
            val toast =
                Toast.makeText(this, "Введите корректное число(попытка)", Toast.LENGTH_LONG)
            toast.show()
            return
        }
        btn0[Num_Hod]?.setFocusable(false)
        btn0[Num_Hod]?.setVisibility(View.INVISIBLE)

//        ed_us0[Num_Hod]?.setFocusable(false)
        ed_us0[Num_Hod]?.setEnabled(false)
        ed_us0[Num_Hod]?.setBackgroundColor(0xFF018786.toInt())


        // Закрыть текущий ввод пользователя, скрыть кнопку и число
        YouPoptka()
        if (!sost_trening)  MyPopytka()
// Тестовые
        var List =  IntArray(2)

        List = Vsego_Mesto(user_numb, My_zadum)
        ssss = ""
//        ssss = "\nЗадумано: "
//
//        for (nym in My_zadum)   ssss = ssss + nym.toString()
//        ssss = ssss + "\nХод: "
//        for (nym in user_numb)   ssss = ssss + nym.toString()
//        ssss = ssss + "\nРезультат: "
//
//        for (nym in List)   ssss = ssss + nym.toString()

        ssss = ssss + "\nВариантов: " + CountS.toString()
        ssss = ssss + "\nВаших Вариантов: " + CountC.toString()

        tt_test!!.setText(ssss)
// Тестовые

// Проверка окончания  и запрос на повтор

        if ((Mesto == Count_Numb) or (You_Mesto == Count_Numb)) {
            if ((Mesto == Count_Numb) and (You_Mesto == Count_Numb)) {
                val alertDialog: android.app.AlertDialog.Builder = android.app.AlertDialog.Builder(this)
                // Указываем Title
                alertDialog.setCancelable((false))
                alertDialog.setTitle("Ничья")
                // alertDialog.setMessage("Желаете повторить?")
            alertDialog.setMessage("Что дальше?")            // задаем иконку
            // Обработчик на нажатие ДА
//            alertDialog.setPositiveButton(
//                "Выход",
//                DialogInterface.OnClickListener { dialog, which ->
////                    restart()
//                   finish()                   // Код который выполнится после закрытия окна
//                    //Toast.makeText(applicationContext, "Вы нажали ДА", Toast.LENGTH_SHORT).show()
//                })

            // Обработчик на нажатие НЕТ
            alertDialog.setNegativeButton(
                "Повтор",
                DialogInterface.OnClickListener { dialog, which -> // Код который выполнится после закрытия окна
//                        Toast.makeText(applicationContext, "Вы нажали НЕТ", Toast.LENGTH_SHORT).show()
                    //dialog.cancel()
                   restart()
                    dialog.cancel()
//                    return@OnClickListener
                })
            // Обработчик на нажатие нейтраль
            alertDialog.setNeutralButton(
               "Результат",
                 DialogInterface.OnClickListener { dialog, which -> // Код который выполнится после закрытия окна
//                        Toast.makeText(applicationContext, "Вы нажали НЕТ", Toast.LENGTH_SHORT).show()
                    dialog.cancel()
 //                   return@OnClickListener
                })

                // показываем Alert
                alertDialog.show()

            }
            if ((Mesto == Count_Numb) and (You_Mesto != Count_Numb)) {
                val alertDialog: android.app.AlertDialog.Builder = android.app.AlertDialog.Builder(this)
                // Указываем Title
                alertDialog.setCancelable((false))
                alertDialog.setTitle("Вы проиграли, увы.\n Задумано: "
                        + My_zadum[0].toString()+ My_zadum[1].toString()+ My_zadum[2].toString()+ My_zadum[3].toString())
                // alertDialog.setMessage("Желаете повторить?")
            alertDialog.setMessage("Что дальше?")            // задаем иконку
            // Обработчик на нажатие ДА
//            alertDialog.setPositiveButton(
//                "Выход",
//                DialogInterface.OnClickListener { dialog, which ->
////                    restart()
//                  finish()                    // Код который выполнится после закрытия окна
//                    //Toast.makeText(applicationContext, "Вы нажали ДА", Toast.LENGTH_SHORT).show()
//                })

            // Обработчик на нажатие НЕТ
            alertDialog.setNegativeButton(
                "Повтор",
                DialogInterface.OnClickListener { dialog, which -> // Код который выполнится после закрытия окна
//                        Toast.makeText(applicationContext, "Вы нажали НЕТ", Toast.LENGTH_SHORT).show()
                    //dialog.cancel()
                   restart()
                    dialog.cancel()
//                    return@OnClickListener
                })
            // Обработчик на нажатие нейтраль
            alertDialog.setNeutralButton(
               "Результат",
                 DialogInterface.OnClickListener { dialog, which -> // Код который выполнится после закрытия окна
//                        Toast.makeText(applicationContext, "Вы нажали НЕТ", Toast.LENGTH_SHORT).show()
                    dialog.cancel()
 //                   return@OnClickListener
                })

                // показываем Alert
                alertDialog.show()
//                val toast = Toast.makeText(this, "Вы проиграли", Toast.LENGTH_LONG)
//                toast.show()
            }

            if ((Mesto != Count_Numb) and (You_Mesto == Count_Numb)) {
                val alertDialog: android.app.AlertDialog.Builder = android.app.AlertDialog.Builder(this)
                // Указываем Title
                alertDialog.setCancelable((false))
                alertDialog.setTitle("Поздравляю, Вы выиграли!")
                // alertDialog.setMessage("Желаете повторить?")
            alertDialog.setMessage("Что дальше?")            // задаем иконку
            // Обработчик на нажатие ДА
//            alertDialog.setPositiveButton(
//                "Выход",
//                DialogInterface.OnClickListener { dialog, which ->
////                    restart()
//                  finish()                    // Код который выполнится после закрытия окна
//                    //Toast.makeText(applicationContext, "Вы нажали ДА", Toast.LENGTH_SHORT).show()
//                })

            // Обработчик на нажатие НЕТ
            alertDialog.setNegativeButton(
                "Повтор",
                DialogInterface.OnClickListener { dialog, which -> // Код который выполнится после закрытия окна
//                        Toast.makeText(applicationContext, "Вы нажали НЕТ", Toast.LENGTH_SHORT).show()
                    //dialog.cancel()
                   restart()
                    dialog.cancel()
//                    return@OnClickListener
                })
            // Обработчик на нажатие нейтраль
            alertDialog.setNeutralButton(
               "Результат",
                 DialogInterface.OnClickListener { dialog, which -> // Код который выполнится после закрытия окна
//                        Toast.makeText(applicationContext, "Вы нажали НЕТ", Toast.LENGTH_SHORT).show()
                    dialog.cancel()
 //                   return@OnClickListener
                })

                // показываем Alert
                alertDialog.show()
//                val toast = Toast.makeText(this, "Вы выиграли", Toast.LENGTH_LONG)
//                toast.show()

            }
        }
// Здесь пока заглушка на случай нехватки ходов
        Num_Hod+=1

        if ((Num_Hod >=ed_us0.size)  and (Mesto != Count_Numb) and (You_Mesto != Count_Numb)) {
            val alertDialog: android.app.AlertDialog.Builder
            = android.app.AlertDialog.Builder(this)
            // Указываем Title
            alertDialog.setCancelable((false))
            alertDialog.setTitle("Ничья по ходам")
            // alertDialog.setMessage("Желаете повторить?")
            alertDialog.setMessage("Что дальше?")            // задаем иконку
            // Обработчик на нажатие ДА
//            alertDialog.setPositiveButton(
//                "Выход",
//                DialogInterface.OnClickListener { dialog, which ->
////                    restart()
//                   finish()                   // Код который выполнится после закрытия окна
//                    //Toast.makeText(applicationContext, "Вы нажали ДА", Toast.LENGTH_SHORT).show()
//                })

            // Обработчик на нажатие НЕТ
            alertDialog.setNegativeButton(
                "Повтор",
                DialogInterface.OnClickListener { dialog, which -> // Код который выполнится после закрытия окна
//                        Toast.makeText(applicationContext, "Вы нажали НЕТ", Toast.LENGTH_SHORT).show()
                    //dialog.cancel()
                   restart()
                    dialog.cancel()
//                    return@OnClickListener
                })
            // Обработчик на нажатие нейтраль
            alertDialog.setNeutralButton(
               "Результат",
                 DialogInterface.OnClickListener { dialog, which -> // Код который выполнится после закрытия окна
//                        Toast.makeText(applicationContext, "Вы нажали НЕТ", Toast.LENGTH_SHORT).show()

                    dialog.cancel()
                     btn0[Num_Hod]?.setFocusable(false)
                     btn0[Num_Hod]?.setVisibility(View.INVISIBLE)
                     ssss = "\nВариантов: " + CountS.toString()
                     ssss = ssss + "\nВаших Вариантов: " + CountC.toString()
                     ssss = ssss + "\nЗадумано: " + My_zadum[0].toString()+
                             My_zadum[1].toString()+ My_zadum[2].toString() + My_zadum[3].toString()

                     tt_test!!.setText(ssss)
 //                   return@OnClickListener
                })

            // показываем Alert
            alertDialog.show()

         return


        }
        if ((Num_Hod <ed_us0.size) and (Mesto != 4) and (You_Mesto != 4))
        {
        btn0[Num_Hod]?.setFocusable(true)
        btn0[Num_Hod]?.setVisibility(View.VISIBLE)

        ed_us0[Num_Hod]?.setVisibility(View.VISIBLE)
        ed_us0[Num_Hod]?.setFocusable(true)
        ed_us0[Num_Hod]?.setEnabled(true)
        ed_us0[Num_Hod]?.requestFocus()
        ed_us0[Num_Hod]?.setBackgroundResource(R.drawable.text_style)
        }
        else{
            btn0[Num_Hod]?.setFocusable(false)
            btn0[Num_Hod]?.setVisibility(View.INVISIBLE)
            ssss = "\nВариантов: " + CountS.toString()
            ssss = ssss + "\nВаших Вариантов: " + CountC.toString()

            if (Count_Numb==4) {
                ssss = ssss + "\nЗадумано: " + My_zadum[0].toString()+
                        My_zadum[1].toString()+ My_zadum[2].toString() + My_zadum[3].toString()
            }
            else {
                ssss = ssss + "\nЗадумано: " + My_zadum[0].toString()+
                        My_zadum[1].toString()+ My_zadum[2].toString()
            }
            tt_test!!.setText(ssss)
        }

    }

    fun GameRestart(view: View) {
        restart()
    }
}
