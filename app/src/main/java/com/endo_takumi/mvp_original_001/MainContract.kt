package com.endo_takumi.mvp_original_001

interface MainContract {
    // General operation of View
    interface View {
        fun redraw(count:Int)
    }

    // Other than that
    interface Presenter {
        fun add()
        fun remove()
    }
}