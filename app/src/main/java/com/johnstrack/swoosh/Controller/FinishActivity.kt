package com.johnstrack.swoosh.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.johnstrack.swoosh.R
import com.johnstrack.swoosh.Utilities.EXTRA_LEAGUE
import com.johnstrack.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "Looking for $league $skill league near you... "
    }
}