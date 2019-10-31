package com.example.android_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var N1= this.Number1.text
        var N2= this.Number2.text

        button_plus.setOnClickListener {
            var sum_result = N1.toString().toDouble() + N2.toString().toDouble()
            result_view.text = Editable.Factory.getInstance().newEditable(sum_result.toString());
        }

        button_minus.setOnClickListener {
            var result = N1.toString().toDouble() - N2.toString().toDouble()
            result_view.text = Editable.Factory.getInstance().newEditable(result.toString());
        }

        button_multiply.setOnClickListener {
            var result = N1.toString().toDouble() * N2.toString().toDouble()
            result_view.text = Editable.Factory.getInstance().newEditable(result.toString());
        }

        button_divide.setOnClickListener {
            var result = N1.toString().toDouble() / N2.toString().toDouble()
            result_view.text = Editable.Factory.getInstance().newEditable(result.toString());
        }
    }
}
