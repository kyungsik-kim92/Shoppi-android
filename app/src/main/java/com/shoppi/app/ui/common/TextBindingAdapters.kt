package com.shoppi.app.ui.common

import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.shoppi.app.R
import java.text.DecimalFormat
import kotlin.math.roundToInt

@BindingAdapter("priceAmount")
fun applyPriceFormat(view: TextView, price: Int) {

    val dicimalFormat = DecimalFormat("#,###")
    view.text = view.context.getString(R.string.unit_discount_currency, dicimalFormat.format(price))
}

@BindingAdapter("priceAmount", "discountRate")
fun applyPriceDiscountRate(view: TextView, price: Int, discountRate: Int) {

    val discountPrice = ((100 - discountRate) / 100.0 * price).roundToInt()
    applyPriceFormat(view, discountPrice)

}
