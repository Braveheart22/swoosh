package com.johnstrack.swoosh.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.johnstrack.swoosh.Model.Player
import com.johnstrack.swoosh.R
import com.johnstrack.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesText.text = "Looking for a ${player.league} ${player.skill} league near you... "
    }
}