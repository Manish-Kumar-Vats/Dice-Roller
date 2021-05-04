package `in`.test.diceroller

import `in`.test.diceroller.databinding.ActivityMainBinding
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.diceOne.setOnClickListener { showHideDice(1) }
        binding.diceTwo.setOnClickListener { showHideDice(2) }
        binding.rollButton.setOnClickListener { rollDice() }

    }

    private fun showHideDice(noOfDice: Int) {
        if (noOfDice == 1) {
            binding.diceTwoImageview.visibility = View.GONE
        } else if (noOfDice == 2) {
            binding.diceTwoImageview.visibility = View.VISIBLE
        }
    }

    private fun rollDice() {
        val randomNo1 = Random.nextInt(6) + 1
        val randomNo2 = Random.nextInt(6) + 1
        when (randomNo1) {
            1 -> {
                binding.diceOneImageview.setImageResource(R.drawable.dice_1)
            }
            2 -> {
                binding.diceOneImageview.setImageResource(R.drawable.dice_2)
            }
            3 -> {
                binding.diceOneImageview.setImageResource(R.drawable.dice_3)
            }
            4 -> {
                binding.diceOneImageview.setImageResource(R.drawable.dice_4)
            }
            5 -> {
                binding.diceOneImageview.setImageResource(R.drawable.dice_5)
            }
            6 -> {
                binding.diceOneImageview.setImageResource(R.drawable.dice_6)
            }
        }
        when (randomNo2) {
            1 -> {
                binding.diceTwoImageview.setImageResource(R.drawable.dice_1)
            }
            2 -> {
                binding.diceTwoImageview.setImageResource(R.drawable.dice_2)
            }
            3 -> {
                binding.diceTwoImageview.setImageResource(R.drawable.dice_3)
            }
            4 -> {
                binding.diceTwoImageview.setImageResource(R.drawable.dice_4)
            }
            5 -> {
                binding.diceTwoImageview.setImageResource(R.drawable.dice_5)
            }
            6 -> {
                binding.diceTwoImageview.setImageResource(R.drawable.dice_6)
            }
        }

    }
}