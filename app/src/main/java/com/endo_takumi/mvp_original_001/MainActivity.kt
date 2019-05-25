package com.endo_takumi.mvp_original_001

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.View {
    // Definition
    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create the presenter
        presenter = MainPresenter(this, this)

        // When the add button is pressed
        addButton.setOnClickListener {
            presenter.add()
        }

        // When the remove button is pressed
        removeButton.setOnClickListener {
            presenter.remove()
        }
    }

    // Update the screen
    override fun redraw(count: Int) {
        countTextView.text = count.toString()
    }
}
