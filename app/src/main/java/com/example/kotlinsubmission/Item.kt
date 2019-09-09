package com.example.kotlinsubmission

import java.io.Serializable
import java.sql.Array

data class Item(var judul: String = "", var shipClass: String = "", var detail: String = "", var image : kotlin.Array<Int> = emptyArray(), var flag : Int = 0) : Serializable