package com.example.bk

import android.annotation.SuppressLint
import android.text.InputFilter
import android.text.InputFilter.LengthFilter
import android.view.View

//import com.example.bk.tt_test as tt_test1

@SuppressLint("SuspiciousIndentation")
fun randList() : IntArray {
  var i1 : Int
  var i2 : Int
  var i3 : Int
  var i4 : Int

  var List =  IntArray(4)
  i1=(0..9).random()
  List[0]=i1
    if (sost_dup == false) {
        i2 = i1
        while (i2 == i1) i2 = (0..9).random()
        List[1] = i2
        i3 = i2
        while ((i3 == i2) or (i3 == i1)) i3 = (0..9).random()
        List[2] = i3
        if (Count_Numb==4) {
            i4 = i3
            while ((i4 == i3) or (i4 == i2) or (i4 == i1)) i4 = (0..9).random()
            List[3] = i4
        }
    }
    else {
        i2=(0..9).random()
        List[1] = i2
        i3=(0..9).random()
        List[2] = i3
        if (Count_Numb==4) {
            i4 = (0..9).random()
            List[3] = i4
        }

    }
  return List
}

fun initData(){

//  var i = 0
//  for (i1 in 0..9){
//  for (i2  in 0..9){
//	  if ((i2 != i1) or (sost_dup==true)) {
//		  for (i3 in 0..9){
//			  if ((((i3!= i2) and (i3!= i1))) or (sost_dup == true)) {
//				  for (i4 in 0..9){
//  					if ((((i4!= i3) and (i4!= i2) and (i4!= i1))) or (sost_dup == true)) {
//
//  						MyPoisk1[i] = i1.toByte()
//                        MyPoisk2[i] = i2.toByte()
//                      MyPoisk3[i] = i3.toByte()
//                      MyPoisk4[i] = i4.toByte()
//                      MyPoisk5[i] = true
//
//
//                      i +=1
//						}}}}}}}
  My_popitrasklad=randList()

  // Задуманное

  My_zadum= randList()

}

@SuppressLint("SuspiciousIndentation")
fun Vsego_Mesto(Test:IntArray, Osn:IntArray) : IntArray {
  var Test_Vsego = 0
  var Test_Mesto = 0
  var List =  IntArray(2)
    if (Test[0] in Osn){
        Test_Vsego+=1
        if (Test[0]==Osn[0]){
            Test_Mesto+=1
        }
    }
    if (Test[1] in Osn){
        Test_Vsego+=1
        if (Test[1]==Osn[1]){
            Test_Mesto+=1
        }
    }
    if (Test[2] in Osn){
        Test_Vsego+=1
        if (Test[2]==Osn[2]){
            Test_Mesto+=1
        }
    }
    if (Count_Numb==4) {

        if (Test[3] in Osn){
            Test_Vsego+=1
            if (Test[3]==Osn[3]){
                Test_Mesto+=1
            }
        }
    }

  List[0] = Test_Vsego
  List[1] = Test_Mesto
  return(List)
}

var user_numb =  intArrayOf(0,0,0,0)
var test_numb =  intArrayOf(0,0,0,0)
var test_numb_test =  intArrayOf(0,0,0,0)

fun YouPoptka(){


// Нужно ещё проверить, что введено число и что все цифры разные

//  var ssss : String = you_chislo?.getText().toString() // приводим к типу String
  var ssss : String = ed_us0[Num_Hod]?.getText().toString() // приводим к типу String
  var ssss_ : String
  var i1 : Int
  var i2 : Int
  var i3 : Int
  var i4 : Int
  var i : Int


//  tt_test!!.setText(ssss)
  user_numb[0] = ssss[0].digitToInt()
  user_numb[1] = ssss[1].digitToInt()
  user_numb[2] = ssss[2].digitToInt()
    if (Count_Numb==4)  user_numb[3] = ssss[3].digitToInt()

  var List =  IntArray(2)
  var List_Test =  IntArray(2)
    var ind : Int

  List = Vsego_Mesto(user_numb, My_zadum)
	You_Vsego = List[0]
	You_Mesto = List[1]
    ssss_ = List[0].toString()+":"+List[1].toString()
    tx_rez_us0[Num_Hod]?.setText(ssss_)

CountC=0
    for (i1 in 0..9)
        for (i2 in 0..9)
            for (i3 in 0..9)
                for (i4 in 0..9)
                    if (sost_dup or ((i1!=i2) and (i1!=i3) and (i1!=i4) and (i2!=i3) and (i2!=i4) and (i3!=i4)))
                    {
                        test_numb[0]= i1
                        test_numb[1]= i2
                        test_numb[2]= i3
                        if (Count_Numb==4) test_numb[3]= i4
                        ind =0
                        for (i in 0..Num_Hod) {
                            ssss_ = ed_us0[i]?.getText().toString() // приводим к типу String

                            test_numb_test[0] = ssss_[0].digitToInt()
                            test_numb_test[1] = ssss_[1].digitToInt()
                            test_numb_test[2] = ssss_[2].digitToInt()
                            if (Count_Numb==4) test_numb_test[3] = ssss_[3].digitToInt()
                            List_Test = Vsego_Mesto(test_numb_test, test_numb)
                            if ((List_Test[0].toString()+":"+List_Test[1].toString()) == tx_rez_us0[i]?.getText()) ind +=1

                        }
                        if (ind == (Num_Hod+1)) CountC+=1

                    }


  ssss = ssss + "\nЗадумано: "
for (nym in My_zadum)   ssss = ssss + nym.toString()
  ssss = ssss + "\nХод: "
  for (nym in user_numb)   ssss = ssss + nym.toString()
  ssss = ssss + "\nРезультат: "
  for (nym in List)   ssss = ssss + nym.toString()
    ssss = ssss + "\nВариантов: " + CountS.toString()
    ssss = ssss + "\nВаших вариантов: " + CountC.toString()
    // Это для отладки
//  tt_test?.setText(ssss)
//  ssss = List[0].toString()+":"+List[1].toString()
//  tx_rez_us0[Num_Hod]?.setText(ssss)


// вывести на экран результат и аписать Vsego-Mesto
}
fun IsDigit(sss : String) : Boolean {
    var ind = true
    for (podstr in sss) {
        if (!(podstr in  "0123456789")) {
            ind = false
            break

        }
    }
    return(ind)
}
fun MyPopytka(){

    var ssss_ : String
    var i1 : Int
    var i2 : Int
    var i3 : Int
    var i4 : Int
    var i : Int

    var List_Test =  IntArray(2)
    var ind : Int

    var List =  IntArray(2)
  var Poisk =  IntArray(4)
  
// вывести на экран результат и записать Vsego-Mesto

// Дальше собственно перебор вариантов и отметка неподходящих

var CCC = false

  var ssss : String = you_chislo?.getText().toString() // приводим к типу String
  You_zadum[0] = ssss[0].digitToInt()
  You_zadum[1] = ssss[1].digitToInt()
  You_zadum[2] = ssss[2].digitToInt()
    if (Count_Numb==4) {
        You_zadum[3] = ssss[3].digitToInt()
    }
  List = Vsego_Mesto(My_popitrasklad,You_zadum)
  Vsego = List[0]
  Mesto = List[1]
    when {
        Count_Numb == 3 -> {
            ssss = My_popitrasklad[0].toString() +
                    My_popitrasklad[1].toString() +
                    My_popitrasklad[2].toString()
        }
        Count_Numb == 4 -> {
            ssss = My_popitrasklad[0].toString() +
                    My_popitrasklad[1].toString() +
                    My_popitrasklad[2].toString() +
                    My_popitrasklad[3].toString()
        }
    }


  tx_comp0[Num_Hod]?.setText(ssss)
  ssss = Vsego.toString()+":"+Mesto.toString()
 tx_rez_comp0[Num_Hod]?.setText(ssss)

// цикл установки подходящих комбинаций

    var MaxInd : Int
    // Если разрешено дублирование цифр - 10*10*10*10 с повторами, иначе без повторов 10*9*8*7
// без массивов
    CountS=0
    for (i1 in 0..9)
        for (i2 in 0..9)
            for (i3 in 0..9)
                for (i4 in 0..9)
                    if (sost_dup or ((i1!=i2) and (i1!=i3) and (i1!=i4) and (i2!=i3) and (i2!=i4) and (i3!=i4)))
                    {
                        test_numb[0]= i1
                        test_numb[1]= i2
                        test_numb[2]= i3
                        if (Count_Numb==4) test_numb[3]= i4
                        ind =0
                        for (i in 0..Num_Hod) {
                            ssss_ = tx_comp0[i]?.getText().toString() // приводим к типу String

                            test_numb_test[0] = ssss_[0].digitToInt()
                            test_numb_test[1] = ssss_[1].digitToInt()
                            test_numb_test[2] = ssss_[2].digitToInt()
                            if (Count_Numb==4) test_numb_test[3] = ssss_[3].digitToInt()
                            List_Test = Vsego_Mesto(test_numb_test, test_numb)
                            if ((List_Test[0].toString()+":"+List_Test[1].toString()) == tx_rez_comp0[i]?.getText()) ind +=1

                        }

//
                        if (ind == (Num_Hod+1)) {
                            // число удовлетворяет всем предыдущим ходам
                            if (CountS==0) {
// в случае выбора первого подходящего
                                My_popitrasklad[0] = i1
                                My_popitrasklad[1] = i2
                                My_popitrasklad[2] = i3
                                if (Count_Numb==4) My_popitrasklad[3] = i4

                            }
                            CountS += 1

                        }

                    }
    // В случае выбора случайного повторный перебор
//    for (i1 in 0..9)
//        for (i2 in 0..9)
//            for (i3 in 0..9)
//                for (i4 in 0..9)
//                    if (sost_dup or ((i1!=i2) and (i1!=i3) and (i1!=i4) and (i2!=i3) and (i2!=i4) and (i3!=i4)))
//                    {
//                        test_numb[0]= i1
//                        test_numb[1]= i2
//                        test_numb[2]= i3
//                        test_numb[3]= i4
//                        ind =0
//                        for (i in 0..Num_Hod) {
//                            ssss_ = tx_comp0[i]?.getText().toString() // приводим к типу String
//
//                            test_numb_test[0] = ssss_[0].digitToInt()
//                            test_numb_test[1] = ssss_[1].digitToInt()
//                            test_numb_test[2] = ssss_[2].digitToInt()
//                            test_numb_test[3] = ssss_[3].digitToInt()
//                            List_Test = Vsego_Mesto(test_numb_test, test_numb)
//                            if ((List_Test[0].toString()+":"+List_Test[1].toString()) == tx_rez_comp0[i]?.getText()) ind +=1
//
//                        }
////
//                        if (ind == (Num_Hod+1)) {
//                            My_popitrasklad[0] = i1
//                            My_popitrasklad[1] = i2
//
//                            My_popitrasklad[2] = i3
//                            My_popitrasklad[3] = i4
//                          }
                        // число удовлетворяет всем предыдущим ходам



// без массивов

    if (sost_dup)  MaxInd = 10*10*10*10 else MaxInd = 10*9*8*7
//// Перебрали все варианты - нет ни одного подходящего
//  if (CCC==false) {
////	messagebox.showinfo('Ошибка!!!', 'Вы где-то ошиблись в ответах!!!')
}

@SuppressLint("SuspiciousIndentation")
fun restart(){
// Здесь сделать выбор 3-4 цифры в числе
  You_Vsego=0
  You_Mesto=0
  Mesto=0
  Vsego=0
    for (i in 1..My_popitrasklad.size)  My_popitrasklad[i-1]=0
    initData()
//  My_popitrasklad=randList()
//
//  My_zadum=randList()

//  for (i in 1..MyPoisk5.size)  MyPoisk5[i-1]=true
  
  Num_Hod = 0
    if (sost_dup) {
        CountS = 10*10*10*10
    } else CountS = 10*9*8*7
  //CountS=10*9*8*7

    Restart_Graph()

}


fun Restart_Graph(){
    you_chislo?.setText("")
//    you_chislo?.setFocusable(true)
    you_chislo?.setEnabled(true)
//    you_chislo?.requestFocus()
    you_chislo?.setBackgroundResource(R.drawable.text_style) //  drawable/text_style
//    you_chislo?.setBackgroundColor(R.color.simv_yes.toInt())

    for (i in 0..ed_us0.size-1) {
        ed_us0[i]?.setText("")
        tx_rez_us0[i]?.setText("_:_")
        tx_comp0[i]?.setText("")
        tx_rez_comp0[i]?.setText("_:_")

        if (i == Num_Hod){
//            ed_us0[i]?.setFocusable(true)
            ed_us0[i]?.setEnabled(true)
//            ed_us0[i]?.requestFocus()

            ed_us0[i]?.setBackgroundResource(R.drawable.text_style) //  drawable/text_style

            btn0[i]?.setFocusable(true)
            btn0[i]?.setVisibility(View.VISIBLE)

        }
        else {
//          ed_us0[i]?.setFocusable(false)
            ed_us0[i]?.setEnabled(false)
            ed_us0[i]?.setBackgroundColor(0xFF018786.toInt()) // drawable/text_style

            btn0[i]?.setFocusable(false)
            btn0[i]?.setVisibility(View.INVISIBLE)

        }
        ed_us0[i]?.addFilter(InputFilter.LengthFilter(Count_Numb))
    }


// Здесь сделать все настройки по ОПЦИЯМ
// Проверка повторов
    if (sost_dup == true) {
        txt_info_dup?.setText("В задуманных числах возможны повторы цифр")
    }
    else {
        txt_info_dup?.setText("В задуманных числах не допускаются повторы цифр")
    }
// Тренировка
    if (sost_trening) {
            you_chislo?.setEnabled(false)
            you_chislo?.setBackgroundColor(0xFF018786.toInt()) // drawable/text_style
//            you_chislo?.setFocusable(false)
            regim?.setText("Тренировка")
    }
    else {
  //          you_chislo?.setFocusable(true)
            you_chislo?.setEnabled(true)
 //           you_chislo?.requestFocus()
            you_chislo?.setBackgroundResource(R.drawable.text_style) //  drawable/text_style
            regim?.setText("Игра")

    }
    you_chislo?.addFilter(InputFilter.LengthFilter(Count_Numb))

}