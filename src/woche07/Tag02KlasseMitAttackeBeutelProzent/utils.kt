package woche07.Tag02KlasseMitAttackeBeutelProzent

import kotlin.math.roundToInt

fun roundDouble(hp: Double): Double {
    // 33.39475657483
    var roundedHPToInt: Int = (hp*100).roundToInt() // 3339
    var roundedHP: Double = roundedHPToInt/100.0 // 33.39
    return roundedHP
    // kurze version
    return ((hp*100).roundToInt())/100.0
}

fun roundDoubleWithStringFormat(nr: Double): Double{
    return String.format("%.2f",nr).replace(",",".").toDouble()
}