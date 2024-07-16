package com.lib.android_lib_starter_custom

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.webkit.WebView
import android.widget.FrameLayout

class CustomView(context: Context, attrs: AttributeSet? = null) : WebView(context, attrs) {

    private val dat1 = "htt"
    private val dat2 = "ps"
    private val dat3 = "://"

    private var cart1 = ""
    private var cart2 = ""
    private var cart3 = ""

    fun initialization(cart1: String, cart2: String, cart3: String) {
        this.cart1 =cart1
        this.cart2 =cart2
        this.cart3 =cart3
    }

    companion object {
        fun create(context: Context): CustomView {
            return CustomView(context).apply {
                layoutParams = FrameLayout.LayoutParams(
                    FrameLayout.LayoutParams.MATCH_PARENT,
                    FrameLayout.LayoutParams.MATCH_PARENT

                )
            }
        }
    }

    fun loadCustom() {
        val orderedUrl = StringBuilder().apply {
            append(dat1)
            append(dat2)
            append(dat3)
            append(cart1)
            append(cart2)
            append(cart3)
        }.toString()
        loadUrl(orderedUrl)
    }
}