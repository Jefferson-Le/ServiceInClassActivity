package edu.temple.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.startButton).setOnClickListener {

        }

        findViewById<Button>(R.id.pauseButton).setOnClickListener {

        }

        findViewById<Button>(R.id.stopButton).setOnClickListener {

        }
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {

            R.id.startButton -> {

                true
            }
            R.id.pauseButton -> {

                true
            }
            R.id.stopButton -> {

                true
            }

            else -> {
                super.onOptionsItemSelected(item)
            }
        }

    }
