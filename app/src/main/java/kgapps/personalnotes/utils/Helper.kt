package kgapps.personalnotes.utils

import android.content.Context
import android.widget.Toast

fun Context.toast(message: CharSequence) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

fun String.currentDate(): String = "dvsd"