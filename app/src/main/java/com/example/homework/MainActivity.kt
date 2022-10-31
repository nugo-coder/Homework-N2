package com.example.homework


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.homework.R

class MainActivity : AppCompatActivity() {

    private lateinit var resultTextview: TextView

    private var operand: 0.0

    private var operation: ""




    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextview = findViewById(R.id.textView4)
    }
    fun numberClick (clickedView: View){
        if (clickedView is TextView) {
            var text = resultTextview.text.toString()
            val number = clickedView.text.toString()
            if (text == "0"){
                text = ""
            }
            val result = text + number

            resultTextview.text= result


        }
    }


    fun operationClick(clickedView: View){
        if (clickedView is TextView)
            operand = resultTextview.text.toString().toDouble()


        resultTextView.text = ""

            }

    fun  equalsClick(clickedView: View){
        val secOperand = resultTextview.text.toString().toDouble()


        when(operation){
            "+" -> resultTextview.text = (operand+secOperand).toString()
            "-" -> resultTextview.text = (operand-secOperand).toString()
            "*" -> resultTextview.text = (operand*secOperand).toString()
            "/" -> resultTextview.text = (operand/secOperand).toString()
        }
    }

}
