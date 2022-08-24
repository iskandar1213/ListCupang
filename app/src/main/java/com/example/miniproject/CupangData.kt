package com.example.miniproject

object CupangData {
    private val cupangNames = arrayOf("Cupang Crown Tail",
        "Cupang Double Tail",
        "Cupang Emas",
//        "Cupang Fancy",
//        "Cupang Halfmoon",
//        "Cupang Hmpk",
//        "Cupang Paradise",
//        "Cupang Sarawak",
//        "Cupang Sawah",
        "Cupang Surga")

    private val cupangDetails = arrayOf("cupang Crown Tail ini juga memiliki ciri khas yang sesuai dengan namanya. Dinamakan Crown Tail atau ‘ekor mahkota’ karena ekornya yang akan membentuk seperti mahkota ketika dibalik. Ikan yang satu ini juga tergolong jenis ikan cupang yang mahal karena cukup langka di pasaran.",
        "Cupang Double Tail yang ekornya bercabang dua ini sangat indah karena siripnya yang lebar. Tapi, ikan ini terkenal sulit dikembangkan, Ruppers. Hal itulah yang membuatnya langka.",
        "Seperti namanya, cupang Emas yang memiliki nama lain Betta unimaculata ini memiliki warna kuning keemas-emasan. Ikan ini banyak ditemukan di sawah, sungai, dan rawa.",
//        "Cupang Fancy terkenal memiliki warna yang cantik. Anda lihat saja kombinasi warna pada tubuh, sirip, dan ekornya. Cocok nih sebagai jenis ikan cupang hias.",
//        "Sesuai dengan namanya, ciri khas ikan cupang yang satu ini memiliki sirip dan ekor yang seolah-olah menyatu dan membentuk setengah lingkaran. Sangat indah, bukan?",
//        "Nama ikan cupang ini sendiri berasal dari singkatan hasil perkembangbiakan antara cupang Halfmoon dan Plakat. Ikan ini termasuk dalam jenis ikan cupang aduan dan hias.",
//        "Cupang Paradise banyak ditemukan di daerah persungaian Sumatra, Kalimantan, dan juga Sulawesi. Ciri khas dari ikan ini adalah ekornya yang bercabang.",
//        "Cupang Sarawak adalah jenis yang mudah beradaptasi degan alam. Bahkan, ia dapat hidup pada air bertekanan tinggi. Keren, ya!",
//        "Ikan yang satu ini termasuk dalam jenis ikan liar. Karena jauh dari jangkauan manusia itulah, harga Cupang Sawah tergolong mahal, Ruppers. Jika semakin bagus dan besar, harganya juga otomatis semakin mahal.",
        "Jenis Cupang Surga banyak terdapat di Asia Tenggara seperti beberapa daerah di Indonesia yaitu Sumatra, Jawa, dan Bali. Ikan ini termasuk cupang liar yang saat ini sudah semakin sulit ditemukan sehingga harganya tergolong mahal.")

    private val cupangImages = intArrayOf(R.drawable.cupang_crown_tail,
        R.drawable.cupang_double_tail,
        R.drawable.cupang_emas,
//        R.drawable.cupang_fancy,
//        R.drawable.cupang_halfmoon,
//        R.drawable.cupang_hmpk,
//        R.drawable.cupang_paradise,
//        R.drawable.cupang_sarawak,
//        R.drawable.cupang_sawah,
        R.drawable.cupang_surga)

    val listData: ArrayList<Cupang>
        get() {
            val list = arrayListOf<Cupang>()
            for (position in cupangNames.indices) {
                val cupang = Cupang()
                cupang.name = cupangNames[position]
                cupang.detail = cupangDetails[position]
                cupang.photo = cupangImages[position]
                list.add(cupang)
            }
            return list
        }
}