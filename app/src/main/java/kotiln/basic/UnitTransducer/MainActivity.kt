package kotiln.basic.UnitTransducer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import kotiln.basic.UnitTransducer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val outputTextView = binding.outputTextView
        val outputUnitTextView = binding.outputTextView
        val inputEditText = binding.inputEditText
        val inputUnitEditTextView = binding.inputUnitTextView

        var inputNumber : Int = 0

        inputEditText.addTextChangedListener { text->
            inputNumber = text.toString().toInt()
        }
    }
}