package com.example.kotlinsubmission

object ItemData{
    private val nama = arrayOf(
        "Kongou",
        "Nagato",
        "New Mexico",
        "Fletcher",
        "Kirov",
        "Warspite",
        "Bismarck",
        "Midway",
        "Furutaka",
        "Gajah Mada"
    )

    private val desc = arrayOf(
        "asd",
        "asd",
        "asd",
        "asd",
        "asd",
        "asd",
        "asd",
        "asd",
        "asd",
        "asd",
        "asd"
    )

    private val image = arrayOf(
        arrayOf(R.drawable.kongou1, R.drawable.kongou2, R.drawable.kongou3, R.drawable.kongou4),
        arrayOf(R.drawable.kongou1, R.drawable.kongou2, R.drawable.kongou3, R.drawable.kongou4),
        arrayOf(R.drawable.kongou1, R.drawable.kongou2, R.drawable.kongou3, R.drawable.kongou4)
    )

    val data : ArrayList<Item>
        get() {
            var result = ArrayList<Item>()

            for(value in nama.indices){
                var get = Item()
                get.judul = nama[value]
                get.detail = desc[0]
                get.image = image[0]
                result.add(get)
            }

            return result
        }
}