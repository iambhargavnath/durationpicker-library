package com.iambhargavnath.durationpickerlibrary

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.NumberPicker
import android.widget.TextView

class DurationPickerDialog(
    context: Context,
    private val title: String,
    private val listener: OnDurationSetListener
) : Dialog(context) {

    interface OnDurationSetListener {
        fun onDurationSet(hours: Int, minutes: Int, seconds: Int)
    }

    private lateinit var hoursPicker: NumberPicker
    private lateinit var minutesPicker: NumberPicker
    private lateinit var secondsPicker: NumberPicker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = LayoutInflater.from(context).inflate(R.layout.dialog_duration_picker, null)
        setContentView(view)

        hoursPicker = findViewById(R.id.number_picker_hours)
        minutesPicker = findViewById(R.id.number_picker_minutes)
        secondsPicker = findViewById(R.id.number_picker_seconds)

        window!!.setBackgroundDrawableResource(android.R.color.transparent)

        hoursPicker.minValue = 0
        hoursPicker.maxValue = 23
        minutesPicker.minValue = 0
        minutesPicker.maxValue = 59
        secondsPicker.minValue = 10
        secondsPicker.maxValue = 59

        findViewById<TextView>(R.id.titleText).text = title

        findViewById<TextView>(R.id.button_set).setOnClickListener {
            listener.onDurationSet(
                hoursPicker.value,
                minutesPicker.value,
                secondsPicker.value
            )
            dismiss()
        }
        findViewById<TextView>(R.id.button_cancel).setOnClickListener {
            dismiss()
        }
    }
}
