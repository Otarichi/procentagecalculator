package e.kochos.percentcalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculate1Click (view: View) {
        val button: Button = view as Button
        if (calculate1EditText1.text.toString().isEmpty() || calculate1EditText2.text.toString().isEmpty()) {
            Toast.makeText(this, "სავალდებულოა ორივე ველის შევსება *", Toast.LENGTH_LONG).show()
            calculate1EditText1.setHint("*")
            calculate1EditText2.setHint("*")
        } else {
            var ricxvi = calculate1EditText1.text.toString().toFloat()
            var procenti = calculate1EditText2.text.toString().toFloat()
            var shedegi = ((ricxvi/100)*procenti).toString()
            result2TextView.text = shedegi
            result3TextView.text = calculate1EditText1.text.toString() + " ის " + calculate1EditText2.text.toString() + "%-ი არის: " + shedegi
        }
    }

    fun calculate2Click (view: View) {
        val button: Button = view as Button
        if (calculate2EditText1.text.toString().isEmpty() || calculate2EditText2.text.isEmpty()) {
            Toast.makeText(this, "სავალდებულოა ორივე ველის შევსება *", Toast.LENGTH_LONG).show()
            calculate2EditText1.setHint("*")
            calculate2EditText2.setHint("*")
        } else {
            var ricxvi1 = calculate2EditText1.text.toString().toFloat()
            var ricxvi2 = calculate2EditText2.text.toString().toFloat()
            var shedegi = ((100/ricxvi1)*ricxvi2).toString()
            result2TextView.text = shedegi + "%"
            result3TextView.text = calculate2EditText2.text.toString() + " ის " +  shedegi + "%-ია " + calculate2EditText1.text.toString()
        }
    }

    fun calculate3Click (view: View) {
        val button: Button = view as Button
        if (calculate3EditText1.text.toString().isEmpty() || calculate3EditText2.text.isEmpty()) {
            Toast.makeText(this, "სავალდებულოა ორივე ველის შევსება *", Toast.LENGTH_LONG).show()
            calculate3EditText1.setHint("*")
            calculate3EditText2.setHint("*")
        } else {
            var procenti = calculate3EditText1.text.toString().toFloat()
            var ricxvi2 = calculate3EditText2.text.toString().toFloat()
            var shedegi = ((procenti / ricxvi2) * 100).toString()
            result2TextView.text = shedegi
            result3TextView.text = calculate3EditText2.text.toString() + "-ი " + calculate3EditText2.text.toString() + "%-ია " + shedegi + "-ის"
        }
    }
}
