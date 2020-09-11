package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityConjuctionBinding

class ConjuctionActivity : AppCompatActivity() {


    private lateinit var binding:ActivityConjuctionBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conjuction);
        binding = ActivityConjuctionBinding.inflate(layoutInflater);
        setContentView(binding.root);
        initView();
    }

    private fun initView() {
        binding.buttonSubmit.setOnClickListener {
            checkAnswers();
        }
    }

    private fun checkAnswers() {
        var answersCorrect:Int = 0;

        if (binding.caseOneAnswer.text.toString().toUpperCase() == "T")
            answersCorrect++;
        if (binding.caseTwoAnswer.text.toString().toUpperCase() == "F")
            answersCorrect++;
        if (binding.caseThreeAnswer.text.toString().toUpperCase() == "F")
            answersCorrect++;
        if (binding.caseFourAnswer.text.toString().toUpperCase() == "F")
            answersCorrect++;

        if (answersCorrect == 4)
            Toast.makeText(this, getString(R.string.answers_correct), Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, getString(R.string.answers_wrong, answersCorrect), Toast.LENGTH_LONG).show();

    }

}