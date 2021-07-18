package com.sssakib.datepicker

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.DatePicker
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH) + 1



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        dateTV.setText("Your age is: " + day + "/" + month + "/" + year)

        datePickBTN.setOnClickListener {
            val dpkr = DatePickerDialog(this, DatePickerDialog.OnDateSetListener
            { datePicker: DatePicker, year: Int, month: Int, day: Int ->

                dateTV.setText("Your age is: " + day + "/" + month + "/" + year)
            }, year, month, day
            )
            // set maximum date to be selected as today
            dpkr.datePicker.minDate = calendar.timeInMillis
            dpkr.show()

        }
    }
}