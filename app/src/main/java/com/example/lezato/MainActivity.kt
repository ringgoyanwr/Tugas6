package com.example.lezato

import android.content.ClipData
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = createResepData()
        rc.layoutManager = LinearLayoutManager( this )
        rc.setHasFixedSize(true)
        rc.adapter = ResepAdapter(testData, { resepItem : ResepData -> resepItemClicked(resepItem) })
    }
    private fun resepItemClicked(resepItem: ResepData){
        val showDetailActivityIntent = Intent( this,ResepDetailActivity::class.java )
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, resepItem.jenis_makanan.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_COMPONENT_NAME, resepItem.asal_makanan.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_SPLIT_NAME, resepItem.resep_makanan.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_REFERRER, resepItem.foto_makanan.toString())
        startActivity(showDetailActivityIntent)
    }
    private fun createResepData() : List<ResepData> {
       val partList = ArrayList<ResepData>()
        partList.add(ResepData("Gado-Gado","Surabaya","Bahan:\n" +
                "- 1/4 kol iris tipis, rebus\n" +
                "- 10 helai kacang panjang potong-potong, rebus\n" +
                "- 1 genggam toge, rebus\n" +
                "- 1 buah timun potong-potong\n" +
                "- 1 buah tahu kotak goreng\n" +
                "- Tomat\n" +
                "- Kentang rebus\n" +
                "- Telur rebus\n" +
                "- Daun selada\n" +
                "- Lontong\n" +
                "- Emping melinjo\n" +
                "- Bawang goreng untuk taburan\n" +
                "\n" +
                "Bahan saus:\n" +
                "- 100 gr kacang tanah\n" +
                "- 4 buah bawang putih\n" +
                "- 5 buah cabai kriting\n" +
                "- 100 gr gula merah sisir\n" +
                "- 4 sdm gula pasir\n" +
                "- 1 sdt air asam jawa\n" +
                "- 1/2 sdt garam (sesuai selera)\n" +
                "- Terasi secukupnya\n" +
                "- 1/2 buah kentang rebus potong kasar\n" +
                "- 750 ml santan sedang\n" +
                "- 2 sdm tepung beras cairkan bersama sedikit air\n" +
                "- Kecap manis secukupnya.\n" +
                "\n" +
                "Cara membuat:\n" +
                "- Goreng kacang tanah dan bawang putih hingga kecokelatan. Angkat.\n" +
                "- Haluskan semua bahan saus dengan chopper hingga benar-benar halus kecuali santan dan kecap manis.\n" +
                "- Masukkan bahan saus di panci, tambahkan santan aduk-aduk hingga rata.\n" +
                "- Masak hingga hampir mendidih sambil terus diaduk.\n" +
                "- Kentalkan dengan tepung beras yang sudah dicairkan, tambahkan kecap manis.\n" +
                "- Aduk hingga mendidih. Angkat.\n" +
                "- Tata sayuran yang sudah dipotong-potong, telur, tahu, dan lontong di piring.\n" +
                "- Siram dengan saus kacang. Taburi bawang goreng dan emping melinjo. Sajikan.\n",R.drawable.gado))
        partList.add(ResepData("Tahu Telur","Malang","Bahan-Bahan\n" +
                "2 blok tahu putih, potong dadu\n" +
                "3 butir telur ayam, kocok lepas\n" +
                "1/2 sdt garam\n" +
                "\n" +
                "Bumbu Kacang\n" +
                "3 siung bawang putih, goreng\n" +
                "5 buah cabai rawit\n" +
                "4 sdm kacang tanah goreng\n" +
                "2 sdm air asam jawa\n" +
                "4 sdm kecap manis\n" +
                "garam dan gula secukupnya\n" +
                "air matang secukupnya\n" +
                "\n" +
                "Bahan Pelangkap\n" +
                "taoge, direndam air panas\n" +
                "daun seledri, cincang kasar\n" +
                "bawang goreng\n" +
                "bawang daun, cincang kasar\n" +
                "kacang tanah goreng\n" +
                "\n" +
                "Cara Membuat\n" +
                "1. Kocok lepas telur, tambahkan garam aduk rata.\n" +
                "2. Masukkan tahu dalam kocokan telur, bagi jadi 3 bagian. Goreng dengan api sedang. Sisihkan.\n" +
                "3. Ulek bawang putih, cabai rawit, dan kacang tanah goreng. Tambahkan air asam jawa, kecap manis, sedikit garam dan gula secukupnya. Tambahkan air sesuai dengan kekentalan yang diinginkan.\n" +
                "4. Sajikan tahu telur dengan saus kacang dan bahan pelengkap lainnya.\n" +
                "\n" +
                "Selamat mencoba, ladies!\n",R.drawable.tahu))
        partList.add(ResepData("Rujak Cingur","Surabaya","Bahan:\n" +
                "300 gram tahu cina\n" +
                "300 gram tempe\n" +
                "200 gram kangkung, dipotong-potong, direbus\n" +
                "100 gram taoge, direbus\n" +
                "100 gram kacang panjang, dipotong-potong\n" +
                "300 gram cingur\n" +
                "1 buah ketimun, dipotong-potong\n" +
                "100 gram nanas, dipotong-potong\n" +
                "200 gram mangga mengkal, dipotong-potong\n" +
                "200 gram bengkuang, diiris-iris\n" +
                "2 buah lontong, dipotong-potong\n" +
                "Bahan Bumbu:\n" +
                "2 buah pisang batu mentah, dipotong-potong\n" +
                "16 buah cabai rawit\n" +
                "6 sendok makan kacang tanah goreng\n" +
                "10 sendok makan petis\n" +
                "8 sendok makan air asam dari 4 sendok teh asam jawa dan 8 sendok makan air\n" +
                "125 ml air\n" +
                "10 sendok teh gula merah\n" +
                "12 butir bawang putih utuh, digoreng\n" +
                "1 sendok makan garam\n" +
                "Cara Membuat Rujak Cingur:\n" +
                "1. Lumuri tahu cina dan tempe dengan 1 sendok teh garam. Goreng sampai matang. Sisihkan.\n" +
                "2. Rebus cingur bersama 2 lembar daun salam, dan 1 sendok teh garam dalam 1.500 ml air sampai empuk. Sisihkan.\n" +
                "3. Uleg 1/2 potong buah pisang batu diatas cobek. Tambahkan 4 buah cabai rawit, 1 1/2 sendok makan kacang tanah, 2 1/2 sendok teh gula merah, 3 siung bawang putih goreng, dan 1/2 sendok teh garam untuk setiap porsinya. Ulek sampai setengah halus.\n" +
                "4. Masukkan 2 1/2 sendok makan petis dan 2 sendok makan air asam. Ulek rata. Tambahkan 30 ml air setiap porsinya. Ulek sampai halus. \n" +
                "5. Iris-iris tahu, tempe, nanas, cingur, ketimun, mangga, dan bengkuang.\n" +
                "6. Masukkan kangkung, kacang panjang, dan taoge. Iris lontong.\n" +
                "7. Aduk-aduk. Sajikan dengan taburan bawang goreng dan kerupuk putih.\n" +
                "\n",R.drawable.rujak))
        partList.add(ResepData("Semanggi","Surabaya","Bahan-Bahan:\n" +
                "•\t200 gram daun semanggi\n" +
                "•\t200 gram kerupuk puli yang telah digoreng\n" +
                "•\t100 gram taoge \n" +
                "Bahan Bumbu:\n" +
                "•\t100 gram kacang tanah yang telah digoreng\n" +
                "•\t100 gram ubi yang telah direbus\n" +
                "•\t40 gram gula merah halus\n" +
                "•\t4 siung bawang merah yang telah disangrai\n" +
                "•\t2 siung bawang putih yang telah disangrai\n" +
                "•\t2 ruas kencur\n" +
                "•\tpetis secukupnya\n" +
                "\n" +
                "Cara Pembuatan:\n" +
                "1.\tRebus taoge dan semanggi\n" +
                "Siapkan panci yang sudah diisi air, lalu didihkan terlebih dahulu. Masukkan taoge dan daun semanggi ke dalam panci, biarkan sampai matang. Setelah matang, segera keluarkan dari panci dan tiriskan. Biarkan beberapa menit, supaya airnya tidak tersisa.\n" +
                "2.\tBikin Bumbunya\n" +
                "Untuk bumbunya, kamu harus menghaluskan gula merah, bawang putih, dan merah. Kemudian sisihkan.Barulah haluskan ubi dan kacang tanah. Masukkan campuran gula merah dan ubi ke dalam mangkuk kecil. Tambahkan kencur, air, petis, dan taburan garam, lalu aduk sampai merata. \n" +
                "3.\tSemanggi Siap Disajikan\n" +
                "\n" +
                "Jangan lupa untuk penyajiaannya kamu harus siapkan piring. Bisa juga menggunakan piring rotan dilapisi daun pisang biar semakin terasa nuansa tradisionalnya.\n" +
                "Di atas piring, letakkan daun semanggi dan taoge. Barulah siram dengan bumbu halus yang sudah disiapkan. Jangan lupa lengkapi dengan kerupuk, semanggi khas Surabaya siap disajikan!\n" +
                "Gampang banget, kan? Jadi gak perlu nunggu penjual semanggi lewat dulu, deh!\n",R.drawable.semanggi))
        partList.add(ResepData("Soto Ayam","Lamongan","Bahan\n" +
                " \n" +
                "•\t1 ekor (900 gram) ayam, belah 4 bagian\n" +
                "•\t2 liter air \n" +
                "•\t2 cm jahe\n" +
                "•\t3 batang serai, memarkan\n" +
                "•\t1 1/2 sendok makan garam \n" +
                "•\t1/8 sendok teh merica bubuk \n" +
                "•\t1 sendok makan gula pasir \n" +
                "•\t10 lembar daun jeruk, buang tulang daunnya\n" +
                "•\t2 sendok makan minyak untuk menumis \n" +
                "•\tMinyak untuk menggoreng \n" +
                "Bumbu Halus:\n" +
                " \n" +
                "•\t5 butir kemiri, sangrai\n" +
                "•\t3 cm kunyit, bakar\n" +
                "•\t10 butir bawang merah \n" +
                "•\t6 siung bawang putih \n" +
                " \n" +
                "Bahan Pelengkap:\n" +
                " \n" +
                "•\t50 gram soun, rendam sampai mekar\n" +
                "•\t2 batang seledri, cincang kasar\n" +
                "•\t2 buah tomat, potong-potong\n" +
                "•\t3 butir telur rebus \n" +
                "•\t2 sendok makan bawang merah goreng \n" +
                "•\t100 gram taoge \n" +
                "•\t100 gram kol, iris halus\n" +
                "•\t3 sendok makan KECAP MANIS BANGO\n" +
                " \n" +
                "Bahan Sambal:\n" +
                " \n" +
                "•\t12 buah cabai rawit merah \n" +
                "•\t4 buah cabai merah \n" +
                "•\t3 siung bawang putih \n" +
                "•\t1/4 sendok teh garam \n" +
                " \n" +
                "Cara Memasak\n" +
                " \n" +
                "•\tRebus air dan ayam bersama jahe sampai ayam matang.\n" +
                "•\tPanaskan minyak. Tumis bumbu halus dan serai sampai harum. Tuang ke dalam rebusan ayam.Masukkan garam, merica bubuk, dan gula pasir. Masak sampai matang. Angkat, keluarkan ayamnya. \n" +
                "•\tGoreng ayam di dalam minyak panas sampai kecokelatan. Suwir-suwir.\n" +
                "•\tSambal, rebus cabai rawit, cabai merah, dan bawang putih sampai layu. Angkat. Tambahkan garam. Haluskan.\n" +
                "•\tSajikan kuah soto bersama ayam suwir, pelengkap, dan sambal. \n" +
                "\n",R.drawable.sotolamongan))
        return partList
    }
}
