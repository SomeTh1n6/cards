package ru.itmo.memory_cards

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.graphics.DashPathEffect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import ru.itmo.memory_cards.data.Data
import ru.itmo.memory_cards.data.Question

class MainActivity : AppCompatActivity() {

    lateinit var front_anim: AnimatorSet
    lateinit var back_anim: AnimatorSet
    private var questionsList: ArrayList<Question>? = null
    var isFront = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val scale: Float = applicationContext.resources.displayMetrics.density



        front_anim = AnimatorInflater.loadAnimator(applicationContext, R.animator.front_animator) as AnimatorSet
        back_anim = AnimatorInflater.loadAnimator(applicationContext, R.animator.back_animator) as AnimatorSet
        questionsList = Data.getQuestion()

        val card_front: TextView = findViewById(R.id.card_front)
        val card_back: TextView = findViewById(R.id.card_back)
        val nextBtn: Button = findViewById(R.id.next)
        val flipBtn: Button = findViewById(R.id.button_flip)

        card_front.cameraDistance = 8000 * scale
        card_back.cameraDistance = 8000 * scale

        flipBtn.setOnClickListener{
            if (isFront){
                front_anim.setTarget(card_front)
                back_anim.setTarget(card_back)
                front_anim.start()
                back_anim.start()
                isFront = false
            }
            else{
                front_anim.setTarget(card_back)
                back_anim.setTarget(card_front)
                front_anim.start()
                back_anim.start()
                isFront = true
            }
        }

        nextBtn.setOnClickListener{
            val idx: Int = (0..107).random()
            val que: Question = questionsList!![idx]
            card_front.text = que.number
            card_back.text = que.question
        }
    }
}