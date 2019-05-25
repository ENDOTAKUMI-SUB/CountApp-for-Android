package com.endo_takumi.mvp_original_001

import android.content.Context

class MainPresenter(val context: Context, val mainView: MainContract.View) : MainContract.Presenter {
    // Count
    var count = 0

    // Initialize
    init {
        // Call once to display the initial value (0)
        mainView.redraw(count)
    }

    // Count up
    override fun add() {
        count++
        mainView.redraw(count)
    }

    // Count down
    override fun remove() {
        count--
        mainView.redraw(count)
    }
}