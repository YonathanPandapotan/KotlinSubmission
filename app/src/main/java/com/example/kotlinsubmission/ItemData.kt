package com.example.kotlinsubmission

object ItemData{
    private val nama = arrayOf(
        "Kongou",
        "Nagato",
        "Bismarck",
        "Scharnhorst",
        "Warspite",
        "Gangut",
        "Bismarck",
        "Midway",
        "Furutaka",
        "Gajah Mada"
    )

    private val shipClass = arrayOf(
        "Kongou-Class Fast Battleship",
        "Nagato-Class Battleship",
        "Bismarck-Class Battleship",
        "Scharnhorst-Class BattleCruiser",
        "Queen-Elizabeth Battleship",
        "Gangut-Class BattleCruiser",
        "Gangut-Class BattleCruiser",
        "Gangut-Class BattleCruiser",
        "Gangut-Class BattleCruiser",
        "Gangut-Class BattleCruiser"
    )

    private val desc = arrayOf(
        "Kongou, yang berarti \"Berlian yang tidak dapat dihancurkan\", merupakan kapal perang Angkatan Laut Kekaisaran Jepang (IJN) selama perang dunia pertama dan kedua. Dia merupakan kapal pertama dari Kongou class dan menjadi salah satu kapal perang dengan persenjataan paling berat pada saat dibangun. Meskipun merupakan kapal jepang, tetapi Kongou di design oleh George Thurston, seorang insinyur angkatan laut asal Inggris, dan juga dibangun di Inggris pada tahun 1911.\n" +
                "\n" +
                "Kongou sempat mengalami 2 rekonstruksi besar-besaran. Yang pertama terjadi pada tahun 1929, dimana Angkatan Laut Jepang memilih untuk mengubah dirinya menjadi Kapal Perang. Selain memperkuat tubuhnya, rekonstruksi ini juga meningkatkan kecepatan serta daya serang kapal. Kemudian pada tahun 1935, bangunan bagian atas Kongou diubah secara keseluruhan, kecepatan semakin di tingkatkan dan juga dipasang peluncur untuk pesawat terbang. Alhasil, Kongou digolongkan menjadi Kapal Perang Cepat.\n" +
                "\n" +
                "Selamat perang pasifik di perang dunia ke-2, Kongou mampu memainkan banyak perang. Dirinya berhasil mengamankan berbagai pendaratan pantai pada daerah Malaysia dan Indonesia pada tahun 1942, yang kemudian dilanjutkan dengan bertarung melawan pasukan Amerika pada Peperangan Midway dan selama Operasi Militer di Guadalcanal. Selama tahun 1943, Kongou ditugaskan pada daerah Kepulauan Caroline, Pangkalan Laut Kure, Pangkalan Laut Sasebo dan di Kabupaten Lingga. Kongou juga sempat ikut pada pertarungan membalas serangan udara Amerika pada markas Militer Jepang di sepanjang Samudra Pasifik. Kongou juga berpartisipasi pada Peperangan di Laut Philipina dan Peperangan di Teluk Leyte. Pada 21 November 1944, Kongou akhirnya tenggelam akibat torpedo yang berasal dari kapal selam asal amerika USS Sealion ketika sedang melewati Selat Formosa.",
        "Nagato merupakan kapal perang yang dibangun untuk Angkatan Laut Kekaisaran Jepang. Selesai pada tahun 1920, dia langsung ditugaskan untuk membawa kebutuhan untuk korban gempa Kanto pada tahun 1923. Nagato kemudian mengalami renovasi selama tahun 1934-1936 yang meningkatkan armor dan peralatan mesin serta superstructure yang dibangun ulang. Nagato sempat mengikuti perang Sino-Jepang kedua pada tahun 1937 dan merupakan flagship Admiram Yamamoto Isoroku pada penyerangan Pearl Harbor. Tetapi Nagato hanya bertugas untuk mengawal kapal yang mundur dan tidak berpartisipasi pada penyerangannya.\n" +
                "\n" +
                "Selain paritispasinya pada Peperangan Midway Juni 1942, yang mana dia juga tidak ikut bertarung. Nagato menghabiskan sebagian besar 2 tahun pertama perang Pasifik di perairan Jepang. Dirinya sempat dipindahkan ke Truk pada pertengahan tahun 1943, tetapi tidak mengikuti pertempuran apapun hingga Pertemurang di Lautan Philipina, dimana dia diserang oleh pesawat tempur Amerika. Nagato tidak pernah menembak meriam utamanya terhadap kapal lawan hingga Pertemuran di teluk Leyte pada bulan Oktober. Dia mengalami kerusakan ringan pada pertempuran dan pulang ke jepang pada bulan berikutnya. Pada masanya, pihak Jepang sudah mulai kekurangan bahan bakar dan memutuskan untuk tidak memperbaikinya sepenuhnya. Nagato mengalami perubahan menjadi penangkal serangan udara tetap dan ditugaskan untuk menjaga pesisir pantai. Dia diserang pada Juli 1945 sebagai bagian dari Operasi Militer Amerika untuk menghancurkan sisa-sisa Kapal Induk Angkatan Laut Jepang, tetapi hanya mengalami kerusakan ringan dan menjadi satu-satunya Kapal Perang Jepang yang selamat dari Perang Dunia ke-2. Pada pertengahan tahun 1946, Nagato di jadikan sebagai alat pengetesan senjata nuklir pada Operasi Crossroads. Dia berhasil selamat dari test pertama dengan kerusakan minim, tetapi tenggelam pada test kedua.",
        "Bismarck merupakan kapal pertama dari Kapal Perang Kelas Bismarck yang dibangun oleh Kriegsmarine Nazi Jerman. Namanya sendiri diambil dari Kaneselir Jerman, Otto von Bismarck, dan dibangun di galangan kapal Blohm & Voss, Hamburg pada Juli 1936. Bismarck dan adik nya Tirpitz merupakan kapal perang terbesar yang pernah dibuat oleh Jerman sekaligus menjadi salah satu kapal terbesar yang pernah dibangun militer Eropa.\n" +
                "\n" +
                "Sepanjang 8 bulan perjalannya menjadi kapal perang di bawah komando Kapten Ernst Lindemann, Bismarck hanya pernah menjalani satu operasi penyerangan yang hanya berjalan selama 8 hari pada Mei 1941. Misi yang berkode Rheinubung tersebut, menugaskan Bismarck beserta dengan Prinz Eugen untuk menerobos masuk ke Lautan Atlantik untuk menyerang konvoi sekutu yang bergerak dari Amerika Utara ke Britania Raya. Kedua kapal sempat beberapa kali terdeteksi ketika melewati lautan Skandinavia, dan angkatan laut Inggris langsung bereaksi dan memblokir rute perjalanan mereka. Pertarungan terjadi pada selat Denmark, mempertemukan antara Bismarck dan Prinz Eugen melawan HMS Hood dan HMS Prince of Wales. HMS Hood hancur berkat serangan kombinasi antara Bismarck dan Prinz Eugen, sedangkan Prince of Wales rusak dan terpaksa mundur. Disisi lain, Bismarck menerima kerusakan yang cukup parah yang memaksa misi mereka harus dibatalkan.\n" +
                "\n" +
                "Hancurnya HMS Hood langsung membuat angkatan laut Inggris melakukan pengejaran besar-besaran terhadap Bismarck. Dua hari setelahnya, ketika sedang menuju tanah jajahan Prancis untuk menjalani perbaikan, Bismarck diserang oleh 16 pesawat torpedo Fairey Swordfish yang berasal dari kapal pengangkut HMS Ark Royal; salah satu pesawat berhasil mengenai alat pengemudi Bismarck. Pada keesokan paginya, Bismarck akhirnya tenggelam dan menewaskan sekitar 2200 orang.",
        "Scharnhorst merupakan kapal perang milih Kriegsmarine Jerman Nazi. Dia merupakan kapal pertama dari kelasnya yang mana hanya terdiri dari dia dan satu adiknya, Gneisenau. Scharnhorst dibuat di galangan kapal Kriegsmarinewerft di Wilhelmshaven; pertama dibuat pada 15 Juni 1935 dan akhirnya diluncurkan 1 tahun dan 4 bulan kemudian pada 3 Oktober 1936. Scharnhorst dipersenjatai dengan 9 x 28 CM meriam. Sebelumnya sempat direncanakan untuk mengganti senjatanya menjad 6 x 38 CM meriam, tetapi rencana tersebut tidak pernah dijalankan.\n" +
                "\n" +
                "Scharnhorst dan Genisenau bekerja bersama pada sebagian besar awal perang dunia ke-2, termasuk pada operasi militer menuju lautan Atlantik untuk merusak konvoi pedangan Inggris. Pada misi pertamanya, Scharnhorst berhasil menenggelamkan kapal bantu HMS Rawalpindi pada pertarungan singkat November 1939 yang lalu. Kemudian Scharnhorst dan Gneisenau juga ikut bergabung pada operasi militer Weserubung pada April - Juni 1940, untuk menginvasi Norwegia. Ketika melakukan operasi militer disekitar Norwegia, kedua kapal bertarung dengan HMS Renown dan menenggelamkan satu kapal induk HMS Glorious beserta dengan pengawalnya Acasta dan Ardent. Pada pertarungan tersebut Scharnhorst berhasil menciptakan salah satu tembakan tepat sasaran terpanjang di sejarah.\n" +
                "\n" +
                "Pada awal 1943, Scharnhorst bergabung dengan salah satu kapal perang kelas Bismarck, Tirpitz di Norwegia untuk menghalang konvoi sekutu ke Uni Soviet. Scharnhorst dan beberapa kapal destroyer pergi ke Norwegia untuk menyerang konvoi, tetapi angkatan laut inggris berhasil mencegat mereka. Pada Pertempuran Tanjung Utara, Kapal Perang Inggris HMS Duke of York beserta dengan pengawalnnya mampu menenggelamkan Scharnhorst. Hanya 36 orang yang dapat di selamatkan dari total 1968.",
        "HMS Warspite merupakan salah satu Kapal Perang Kelas Queen Elizabeth yang dibangun pada awal tahun 1910. Setelah selesai pada tahun 1915, dia langsung ditugaskan untuk bergabung bersama dengan armada utama Angkatan Laut Inggris, Grand Fleet. Selain partisipasi dirinya pada Peperangan Jutland dan Kejadian Pada 19 Agustus, kegiatan Warspite umumnya hanya patroli rutin dan latihan di Laut Utara. Dipertengahan antara Perang Dunia Pertama dan Perang Dunia Kedua, Warspite di tugaskan ke Samudra Atlantic dan Lautan Mediterranean, selain itu dia juga sering bertugas menjadi kapal pemimpin.\n" +
                "\n" +
                "Selama Perang Dunia Kedua, Warspite ikut berpartisipasi pada Operasi Militer Norwegia pada awal tahun 1940 dan kemudian di pindahkan ke Lautan Mediterania untuk bergabung bersama armada melawan Angkatan Laut Kerajaan Italia. Warspite sempat rusak berkat serangan pesawat Jerman pada Peperangan Crete di pertengahan tahun 1941 dan membutuhkan waktu selama 6 belum masa perbaikan di Amerika Serikat. Masa perbaikan selesai sesaat dimulainya perang pasifik di bulan Desember dan Warspite langsung berlayar melewati lautan Pasifik untuk bergabung dengan armada sekutu di Samudra India. Warspite akhirnya pulang kembali kerumah pada pertengahan tahun 1943 untuk membantu dalam operasi militer melawan Italia. Dia mengalami kerusakan berat setelah terkena bom Jerman pada penyerangan di Salerno dan menghabiskan hampir seluruh tahun berikutnya menjalani perbaikan. Warspite sempat membombardir barisan Jerman pada pendaratan di Normandy dan juga di Pulau Walchern pada tahun 1944, meskipun belum sepenuhnya betul. Alhasil Warspite menerima kehormatan tertinggi yang pernah diberikan pada satu kapal tunggal di Angkatan Laut Inggris. Oleh karena ini juga dan beberapa alasan lain, Warspite mendapat panggilan \"Grand Old Lady\" setelah komentar yang dibuat Admiral Andrew Cunningham pada 1943.",
        "Gangut (Гангут) merupakan kapal pertama dari Kapal Perang Kelas-Gangut Angkatan Laut Kekaisaran Rusia yang dibangun sebelum Perang Dunia 1. Namanya diambil dari kemenangan Russia atas Angkatan Laut Swedia pada Pertempuran Gangut tahun 1714. Dirinya selesai dibangun pada musim dingin tahun 1914-1915, tetapi tidak siap bertempur hingga pertengahan 1915. Tugasnya adalah untuk menjaga Teluk Finlandia terhadap jerman, yang mana tidak pernah mencoba menerobos masuk, sehingga Gangut menghabiskan waktunya berlatih dan memberikan perlindungan pada beberapa operasi militer. Kru-nya bergabung dengan pemberontakan Armada Baltic setelah Revolusi Febuari dan bergabung dengan Bolsheviks pada tahun 1918. Gangut sempat di non-atifkan pada 1918 karena kurangnya tenaga kerja dan tidak ditugaskan kembali hingga 1925, yang mana dirinya sudah berganti nama menjadi Oktyabrskaya Revolutsiya (Октябрьская революция: Revolusi Oktober).\n" +
                "\n" +
                "Dirinya mengalami rekonstruksi antara tahun 1931 dan 1934 dengan mesin, kendali tembak baru dan superstruktur yang lebih besar. Selama Pertempurang Musim Dingin dia sempat membombardir barisan artileri di pesisir pantai Finlandia. Persenjataan anti serangan udaranya ditingkatkan pada awal 1941, tepat sebelum Operasi Barbarossa. Dia memberikan bantukan arterli terhadap Jerman pada pengepungan Leningrad meskipun di bom tiga kali dan mengalami perbaikan selama setahun. Setelah di tugaskan kembali setelah perang dunia, Oktyabrskaya Revolutsiya berubah menjadi kapal latihan pada 1954 sebelum akhirnya mulai dibongkar pada tahun 1956.",
        "asd",
        "asd",
        "asd",
        "asd",
        "asd"
    )

    private val image = arrayOf(
        arrayOf(R.drawable.kongou1, R.drawable.kongou2, R.drawable.kongou3, R.drawable.kongou4),
        arrayOf(R.drawable.nagato1, R.drawable.nagato2, R.drawable.nagato3, R.drawable.nagato4),
        arrayOf(R.drawable.bismarck1, R.drawable.bismarck2, R.drawable.bismarck3),
        arrayOf(R.drawable.bismarck1, R.drawable.bismarck2, R.drawable.bismarck3),
        arrayOf(R.drawable.warspite1, R.drawable.warspite2, R.drawable.warspite3),
        arrayOf(R.drawable.bismarck1, R.drawable.bismarck2, R.drawable.bismarck3),
        arrayOf(R.drawable.bismarck1, R.drawable.bismarck2, R.drawable.bismarck3),
        arrayOf(R.drawable.bismarck1, R.drawable.bismarck2, R.drawable.bismarck3),
        arrayOf(R.drawable.bismarck1, R.drawable.bismarck2, R.drawable.bismarck3),
        arrayOf(R.drawable.bismarck1, R.drawable.bismarck2, R.drawable.bismarck3)
    )

    val data : ArrayList<Item>
        get() {
            var result = ArrayList<Item>()

            for(value in nama.indices){
                var get = Item()
                get.judul = nama[value]
                get.shipClass = shipClass[value]
                get.detail = desc[value]
                get.image = image[value]
                result.add(get)
            }

            return result
        }
}