package com.example.appdzikir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DoaHarianActivity extends AppCompatActivity {
    private DzikirAdapter dzikirAdapter;
    RecyclerView rvMain;
    ArrayList<ModelDzikir>arrayList;
    int count = 0;
    String idDzikir;
    private String[]iddoa = {"doa1",
    "doa2",
    "doa3",
    "doa4",
    "doa5",
    "doa6",
    "doa7",
    "doa8",
    "doa9",
    "doa10",
    "doa11",
    "doa12",
    "doa13",
    "doa14",
    "doa15"};
    private String[]nodoa = {"1. Doa Mau Tidur",
    "2. Doa Bangun Tidur",
    "3. Doa Agar Dimudahkan Rezeki",
    "4. Doa Agar Ditambahkan Ilmu",
    "5. Doa Ketika Turun Hujan",
    "6. Doa Ketika Melihat Hilal",
    "7. Doa Ketika Mau Makan",
    "8. Doa Setelah Makan",
    "9. Doa Taubat Dari Maksiat",
    "10. Doa Agar Diberi Kekuatan,Kesabaran, & Istiqomah",
    "11. Doa Mohon Diberi Ilmu",
    "12. Doa Ketika Kesusahan",
    "13. Doa Mohon Diberi Tempat Yang Baik",
    "14. Doa Tawakal Kepada Allah",
    "15. Doa Berbuka Puasa"};
    private String[]juduldoa = {"بِاسْمِكَ اللَّهُمَّ أَمُوتُ وَأَحْيَا",
    "اَلْحَمْدُ لِلَّهِ الَّذِيْ أَحْيَانَا بَعْدَ مَا أَمَاتَنَا وَإِلَيْهِ النُّشُوْرِ",
    "اللَّهُمَّ إِنِّي أَسْأَلُكَ عِلْمًا نَافِعًا وَرِزْقًا طَيِّبًا وَعَمَلًا مُتَقَبَّلًا",
    "وَقُلْ رَبِّ زِدْنِي عِلْمًا",
    "اللَّهُمَّ صَيِّباً نَافِعاً",
    "اللَّهُ أَكْبَرُ اللَّهُمَّ أَهِلَّهُ عَلَيْنَا بِالْأَمْنِ وَالْإِيْمَانِ وَالسَّلَامَةِ وَالْإِسْلَامِ\n" +
            "\n" +
            "وَالتَّوْفِيْقِ لِمَا تُحِبُّ وَتَرْضَى\n" +
            "\n" +
            "رَبُّنَا وَرَبُّكَ اللَّهُ\n",
    "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيم",
    "الْحَمْدُ لِلَّهِ رَبِّ الْعَالَمِينَ\n",
    "رَبَّنَا ظَلَمْنَا أَنْفُسَنَا وَإِنْ لَّمْ تَغْفِرْ لَنَا وَتَرْحَمْنَا لَنَكُوْنَنَّ مِنَ الْخَاسِرِيْنَ",
    "رَبَّنَا أَفْرِغْ عَلَيْنَا صَبْرًا وَتَوَفَّنَا مُسْلِمِينَ",
    "رَبِّ زِدْنِيْ عِلْمًا\n",
    "لَا إِلَهَ إِلَّا أَنْتَ سُبْحَانَكَ إِنِّيْ كُنْتُ مِنَ الظَّالِمِيْنَ\n",
    "رَبِّ أَنْزِلْنِيْ مُنْزَلًا مُبَارَكًا وَأَنْتَ خَيْرُ الْمُنْزِلِيْنَ\n",
    "حَسْبِيَ اللهُ لَا إِلَـهَ إِلَّا هُوَ عَلَيْهِ تَوَكَّلْتُ  وَهُوَ رَبُّ الْعَرْشِ الْعَظِيْمِ\n",
    "ذَهَبَ الظَّمَـأُ وابْــتَلَّتِ العُرُوْقُ وَثَــبَتَ الْأَجْرُ إِنْ شَاءَ اللهُ\n"};
    private String[]subjuduldoa = {"Doa ini dibaca sebelum tidur.",
    "“Segala puji bagi Allah, yang telah membangunkan kami setelah menidurkan kami dan kepada-Nya lah kami dibangkitkan.”",
    "“Ya Allah, sungguh aku memohon kepada-Mu ilmu yang bermanfaat (bagi diriku dan orang lain), rizki yang halal dan amal yang diterima (di sisi-Mu dan mendapatkan ganjaran yang baik).”",
    "“Dan katakanlah,‘Wahai Rabb-ku, tambahkanlah kepadaku ilmu.” (QS. Thaaha: 114)",
    "“Ya Allah turunkanlah pada kami hujan yang bermanfaat.”",
    "“Allahu Akbar. Ya Allah, jadikanlah hilal itu bagi kami, dengan membawa keamanan dan keimanan, keselamatan dan Islam, dan membawa taufiq yang membimbing kami menuju apa yang\n" +
            "Engkau cintai dan Engkau ridhai. Rabb kami dan Rabb kamu (wahai bulan), adalah Allah.”\n",
    "“Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang.”",
    "“Segala puji bagi Allah, Tuhan semesta alam.”",
    "“Ya Rabb kami, kami telah Menganiaya diri kami sendiri. Dan jika Engkau tidak mengampuni kami dan memberi rahmat kepada kami, niscaya pastilah kami termasuk orang-orang yang merugi.”",
    "“Ya Rabb kami, limpahkanlah kesabaran kepada kami dan wafatkanlah kami dalam Keadaan berserah diri (kepada-Mu)”",
    "“Ya Rabbku, tambahkanlah kepadaku ilmu pengetahuan.”\n",
    "“Tidak ada Tuhan yang berhak disembah selain Engkau. Maha suci Engkau, sesungguhnya aku adalah termasuk orang-orang yang zalim.”\n",
    "“Ya Rabbku, tempatkanlah aku pada tempat yang diberkati, dan Engkau adalah Sebaik-baik yang memberi tempat.”\n",
    "“Cukuplah Allah bagiku, tidak ada Tuhan yang berhak disembah selain Dia. Hanya kepada-Nya aku bertawakkal dan Dia adalah Tuhan yang memiliki ‘Arsy yang agung.”\n",
    "“Telah hilang dahaga, urat-urat telah basah, dan telah diraih pahala, insyaa Allah.”"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa_harian);

        idDzikir = getIntent().getStringExtra("KEYDOA");
        rvMain = findViewById(R.id.rvmain);
        arrayList = new ArrayList<>();
        setDataDoa();
        rvMain.setLayoutManager(new LinearLayoutManager(this));
        rvMain.setHasFixedSize(true);
        dzikirAdapter = new DzikirAdapter(arrayList);
        rvMain.setAdapter(dzikirAdapter);
    }

    private void setDataDoa() {
        for (String iddoa : iddoa){
            arrayList.add(new ModelDzikir(iddoa, nodoa[count], juduldoa[count], subjuduldoa[count]));
            count++;
        }
    }
}
