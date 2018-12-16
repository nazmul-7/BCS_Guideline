package com.example.user.bcs_guideline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class Bangla_Sahitto_Description extends AppCompatActivity {

    private TextView textView,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,
            textView11,textView12,textView13,textView14,textView15,textView16,textView17,textView18,textView19,textView20,
            textView21,textView22,textView23,textView24,textView25,textView26,textView27,textView28,textView29,textView30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla__sahitto__description);
        this.setTitle("Bangla Sahitto Details");

        textView = (TextView) findViewById(R.id.question1);
        textView2 = (TextView) findViewById(R.id.answer1);
        textView3 = (TextView) findViewById(R.id.question2);
        textView4 = (TextView) findViewById(R.id.answer2);
        textView5 = (TextView) findViewById(R.id.question3);
        textView6 = (TextView) findViewById(R.id.answer3);
        textView7 = (TextView) findViewById(R.id.question4);
        textView8 = (TextView) findViewById(R.id.answer4);
        textView9= (TextView) findViewById(R.id.question5);
        textView10 = (TextView) findViewById(R.id.answer5);
        textView11= (TextView) findViewById(R.id.question6);
        textView12= (TextView) findViewById(R.id.answer6);
        textView13= (TextView) findViewById(R.id.question7);
        textView14= (TextView) findViewById(R.id.answer7);
        textView15= (TextView) findViewById(R.id.question8);
        textView16= (TextView) findViewById(R.id.answer8);
        textView17= (TextView) findViewById(R.id.question9);
        textView18= (TextView) findViewById(R.id.answer9);
        textView19= (TextView) findViewById(R.id.question10);
        textView20= (TextView) findViewById(R.id.answer10);
        textView21= (TextView) findViewById(R.id.question11);
        textView22= (TextView) findViewById(R.id.answer11);
        textView23= (TextView) findViewById(R.id.question12);
        textView24= (TextView) findViewById(R.id.answer12);
        textView25= (TextView) findViewById(R.id.question13);
        textView26= (TextView) findViewById(R.id.answer13);
        textView27= (TextView) findViewById(R.id.question14);
        textView28= (TextView) findViewById(R.id.answer14);

        Bundle bundle = getIntent().getExtras();
        String value = bundle.getString("name");

        showData(value);


        //adding back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    private void showData(String value) {
        if(value.equalsIgnoreCase("গীতিকবি ও গীতিকাব্য"))
        {
            textView.setText(R.string.question1);
            textView2.setText(R.string.question2);
            textView3.setText(R.string.question3);
            textView4.setText(R.string.question4);
            textView5.setText(R.string.question5);
            textView6.setText(R.string.question6);
            textView7.setText(R.string.question7);
            textView8.setText(R.string.question8);
            textView9.setText(R.string.question9);
            textView10.setText(R.string.question10);
            textView11.setText(R.string.question11);
            textView12.setText(R.string.question12);
            textView13.setText(R.string.question13);
            textView14.setText(R.string.question14);
            textView15.setText(R.string.question15);
            textView16.setText(R.string.question16);
            textView17.setText(R.string.question17);
            textView18.setText(R.string.question18);
            textView19.setText(R.string.question19);
            textView20.setText(R.string.question20);
            textView21.setText(R.string.question21);
            textView22.setText(R.string.question22);
            textView23.setText(R.string.question23);
            textView24.setText(R.string.question24);
            textView25.setText(R.string.question25);
            textView26.setText(R.string.question26);
            textView27.setText(R.string.question27);
            textView28.setText(R.string.question28);

        }
        else if(value.equalsIgnoreCase("Lalakhal"))
        {
            textView2.setText(R.string.lalakhal1);
            textView.setText(R.string.lalakhal);
        }
       /* else if(value.equalsIgnoreCase("Lokkonchora"))
        {
            textView2.setText(R.string.lokkonchora1);
            imageView.setImageResource(R.drawable.lokkonchora);
            textView.setText(R.string.lokkonchora);
        }
        else if(value.equalsIgnoreCase("Jadukata"))
        {
            textView2.setText(R.string.jadukata1);
            imageView.setImageResource(R.drawable.jadukata);
            textView.setText(R.string.jadukhata);
        }
        else if(value.equalsIgnoreCase("Sathchori National Forest"))
        {
            textView2.setText(R.string.sathchori_national_forest1);
            imageView.setImageResource(R.drawable.sathchori);
            textView.setText(R.string.sathchori_national_forest);
        }
        else if(value.equalsIgnoreCase("Bisnakandi"))
        {
            textView2.setText(R.string.bisnakandi1);
            imageView.setImageResource(R.drawable.bisnakandi);
            textView.setText(R.string.bisnakandi);
        }
        else if(value.equalsIgnoreCase("Jaflong"))
        {
            textView2.setText(R.string.jaflong1);
            imageView.setImageResource(R.drawable.jaflong);
            textView.setText(R.string.jaflong);
        }
        else if(value.equalsIgnoreCase("Lawachera"))
        {
            textView2.setText(R.string.lawachera1);
            imageView.setImageResource(R.drawable.lawachera);
            textView.setText(R.string.lawachera);
        }
        else if(value.equalsIgnoreCase("Bholagong"))
        {
            textView2.setText(R.string.bholagong1);
            imageView.setImageResource(R.drawable.vulaganj);
            textView.setText(R.string.bholagong);
        }
        else if (value.equalsIgnoreCase("Khadimnagar Rain Forest"))
        {
            textView2.setText(R.string.khadimnagar_rain_forest1);
            imageView.setImageResource(R.drawable.khadimnagar);
            textView.setText(R.string.khadimnagar_rain_forest);
        }
        else if (value.equalsIgnoreCase("Ahsan Manzil"))
        {
            // Toast.makeText(getApplicationContext(), ""+value, Toast.LENGTH_SHORT).show();
            textView2.setText(R.string.ahsan_manzil1);
            imageView.setImageResource(R.drawable.ahhsan_manzil);
            textView.setText(R.string.ahsan_manzil);
        }
        else if (value.equalsIgnoreCase("Bahadur Shah Park"))
        {
            textView2.setText(R.string.bahadur_shah_park1);
            imageView.setImageResource(R.drawable.bahadur_saha_park);
            textView.setText(R.string.bahadur_shah_park);
        }
        else if (value.equalsIgnoreCase("Baliati Jamidar bari"))
        {
            textView2.setText(R.string.baliati_jamidar_bari1);
            imageView.setImageResource(R.drawable.bailati);
            textView.setText(R.string.baliati_jamidar_bari);
        }
        else if (value.equalsIgnoreCase("Lalbag Kella"))
        {
            textView2.setText(R.string.lalbag_kella1);
            imageView.setImageResource(R.drawable.lalbag);
            textView.setText(R.string.lalbag_kella);
        }
        else if (value.equalsIgnoreCase("Mohera Jomidar Bari"))
        {
            textView2.setText(R.string.mohera_jomidar_bari1);
            imageView.setImageResource(R.drawable.mohera);
            textView.setText(R.string.mohera_jomidar_bari);
        }
        else if (value.equalsIgnoreCase("Padma Resort"))
        {
            textView2.setText(R.string.padma_resort1);
            imageView.setImageResource(R.drawable.padmaresort);
            textView.setText(R.string.padma_resort);
        }
        else if (value.equalsIgnoreCase("Panam City"))
        {
            textView2.setText(R.string.panam_city1);
            imageView.setImageResource(R.drawable.panama);
            textView.setText(R.string.panam_city);
        }
        else if (value.equalsIgnoreCase("Rose Garden"))
        {
            textView2.setText(R.string.rose_garden1);
            imageView.setImageResource(R.drawable.rosegarden);
            textView.setText(R.string.rose_garden);
        }
        else if (value.equalsIgnoreCase("Sat Gambuj Mosque"))
        {
            textView2.setText(R.string.sat_gambug_mosque1);
            imageView.setImageResource(R.drawable.sat_gombuj_mosjid);
            textView.setText(R.string.sat_gambug_mosque);
        }
        else if (value.equalsIgnoreCase("Chandra Mahal"))
        {
            textView2.setText(R.string.chandra_mahal1);
            imageView.setImageResource(R.drawable.chandra_mahal);
            textView.setText(R.string.chandra_mahal);
        }
        else if (value.equalsIgnoreCase("Khan Jahan Ali"))
        {
            textView2.setText(R.string.khan_jahan_ali1);
            imageView.setImageResource(R.drawable.khan_jahan_ali);
            textView.setText(R.string.khan_jahan_ali);
        }
        else if (value.equalsIgnoreCase("Mongla Bondor"))
        {
            textView2.setText(R.string.mangla_bondor1);
            imageView.setImageResource(R.drawable.mongla_bondor);
            textView.setText(R.string.mangla_bondor);
        }
        else if (value.equalsIgnoreCase("Sizty Dome Mosque"))
        {
            textView2.setText(R.string.sixty_dome_mosjid1);
            imageView.setImageResource(R.drawable.sixty_dome_mosq);
            textView.setText(R.string.sixty_dome_mosjid);
        }
        else if (value.equalsIgnoreCase("Sundor Bon"))
        {
            textView2.setText(R.string.sundor_bon1);
            imageView.setImageResource(R.drawable.sundor_bon);
            textView.setText(R.string.sundor_bon);
        }
        else if (value.equalsIgnoreCase("Aladin Park"))
        {
            textView2.setText(R.string.aladin_park1);
            imageView.setImageResource(R.drawable.park_aladin);
            textView.setText(R.string.aladin_park);
        }
        else if (value.equalsIgnoreCase("Alaexander"))
        {
            textView2.setText(R.string.alexander1);
            imageView.setImageResource(R.drawable.alexander);
            textView.setText(R.string.alexander);
        }
        else if (value.equalsIgnoreCase("Gazni lake"))
        {
            textView2.setText(R.string.gazni_lake1);
            imageView.setImageResource(R.drawable.gazni_lake);
            textView.setText(R.string.gazni_lake);
        }
        else if (value.equalsIgnoreCase("Modhu Tila Park"))
        {
            textView2.setText(R.string.modhu_tila_park1);
            imageView.setImageResource(R.drawable.modhu_tila_park);
            textView.setText(R.string.modhu_tila_park);
        }
        else if (value.equalsIgnoreCase("Muktha Gacha"))
        {
            textView2.setText(R.string.muktha_gacha1);
            imageView.setImageResource(R.drawable.mukthagacha);
            textView.setText(R.string.muktha_gacha);
        }
        else if (value.equalsIgnoreCase("Museum"))
        {
            //textView2.setText(R.string.mus);
            imageView.setImageResource(R.drawable.museum);
            // textView.setText(R.string.sundor_bon);
        }
        else if (value.equalsIgnoreCase("Shohi lodge"))
        {
            textView2.setText(R.string.shoshi_logi1);
            imageView.setImageResource(R.drawable.shoshi_loj);
            textView.setText(R.string.shoshi_logi);
        }
        else if (value.equalsIgnoreCase("Ali Palace"))
        {
            textView2.setText(R.string.ali_place1);
            imageView.setImageResource(R.drawable.ali_place);
            textView.setText(R.string.ali_place);
        }
        else if (value.equalsIgnoreCase("Jagaddala Mahavihara"))
        {
            textView2.setText(R.string.jagaddala_mahavihara1);
            imageView.setImageResource(R.drawable.jagaddal_mahavihara);
            textView.setText(R.string.jagaddala_mahavihara);
        }
        else if (value.equalsIgnoreCase("Mahasthangarh"))
        {
            textView2.setText(R.string.mahasthangarh1);
            imageView.setImageResource(R.drawable.mahasthangarh_museum);
            textView.setText(R.string.mahasthangarh);
        }
        else if (value.equalsIgnoreCase("Nator Rajbari"))
        {
            textView2.setText(R.string.nator_rajbari1);
            imageView.setImageResource(R.drawable.nator_rajbari);
            textView.setText(R.string.nator_rajbari);
        }
        else if (value.equalsIgnoreCase("Puthia Rajbari"))
        {
            textView2.setText(R.string.puthia_rajbari1);
            imageView.setImageResource(R.drawable.puthia_rajbari);
            textView.setText(R.string.puthia_rajbari);
        }
        else if (value.equalsIgnoreCase("Sompura Mohabihar"))
        {
            textView2.setText(R.string.sompura_mohabihar1);
            imageView.setImageResource(R.drawable.somapura_mahavihara);
            textView.setText(R.string.sompura_mohabihar);
        }
        else if (value.equalsIgnoreCase("Uttara Gonovobon"))
        {
            textView2.setText(R.string.uttara_gonovobon1);
            imageView.setImageResource(R.drawable.uttara_ganobhaban);
            textView.setText(R.string.uttara_gonovobon);
        }
        else if (value.equalsIgnoreCase("Varendra Museum"))
        {
            textView2.setText(R.string.varendra_museum1);
            imageView.setImageResource(R.drawable.varendra_museum);
            textView.setText(R.string.varendra_museum);
        }
        else if (value.equalsIgnoreCase("Keramotia Jame Masjid"))
        {
            textView2.setText(R.string.keramotia_jame_masjid1);
            imageView.setImageResource(R.drawable.karamotia_masjid_rangpur);
            textView.setText(R.string.keramotia_jame_masjid);
        }
        else if (value.equalsIgnoreCase("Rangpur Zoo"))
        {
            textView2.setText(R.string.rangpur_zoo1);
            imageView.setImageResource(R.drawable.zoo_image_rangpur);
            textView.setText(R.string.rangpur_zoo);
        }
        else if (value.equalsIgnoreCase("Tajhat Palace"))
        {
            textView2.setText(R.string.tajhat_palace1);
            imageView.setImageResource(R.drawable.tajhat_rajbari_image);
            textView.setText(R.string.tajhat_palace);
        }
        else if (value.equalsIgnoreCase("Town Hall"))
        {
            textView2.setText(R.string.town_hall1);
            imageView.setImageResource(R.drawable.rangpur_town_hall_image);
            textView.setText(R.string.town_hall);
        }
        else if (value.equalsIgnoreCase("Vinnya Jagat Park"))
        {
            textView2.setText(R.string.vinnya_jagat_park1);
            imageView.setImageResource(R.drawable.vinnojogot_image_rangpur);
            textView.setText(R.string.vinnya_jagat_park);
        }
        else if (value.equalsIgnoreCase("Durga Sagor"))
        {
            textView2.setText(R.string.durga_sagor1);
            imageView.setImageResource(R.drawable.durga_sagor_image_barisal);
            textView.setText(R.string.durga_sagor);
        }
        else if (value.equalsIgnoreCase("Guthia Masjid"))
        {
            textView2.setText(R.string.guthia_masji1);
            imageView.setImageResource(R.drawable.guthia_image_barisal);
            textView.setText(R.string.guthia_masji);
        }
        else if (value.equalsIgnoreCase("Jadughar Barisal"))
        {
            textView2.setText(R.string.jadughar_barisal1);
            imageView.setImageResource(R.drawable.jadughar_barisal);
            textView.setText(R.string.jadughar_barisal);
        }
        else if (value.equalsIgnoreCase("karapur Masjid"))
        {
            textView2.setText(R.string.karapur_masjid1);
            imageView.setImageResource(R.drawable.karapur_masjid_barisal);
            textView.setText(R.string.karapur_masjid);
        }
        else if (value.equalsIgnoreCase("Lakhutia Jomidar Bari"))
        {
            textView2.setText(R.string.lakhutia_jomidar_bari1);
            imageView.setImageResource(R.drawable.lakhutia_jomidarbari_barisal);
            textView.setText(R.string.lakhutia_jomidar_bari);
        }
        else if (value.equalsIgnoreCase("karapur Masjid"))
        {
            textView2.setText(R.string.karapur_masjid);
            imageView.setImageResource(R.drawable.karapur_masjid_barisal);
            textView.setText(R.string.karapur_masjid);
        }
        else if (value.equalsIgnoreCase("চিম্বুক পাহাড়"))
        {
            textView2.setText(R.string.chimbuk_pahar1);
            imageView.setImageResource(R.drawable.chimbuk_pahar_image);
            textView.setText(R.string.chimbuk_pahar);
        }
        else if (value.equalsIgnoreCase("ফয়’স লেক"))
        {
            textView2.setText(R.string.foyez_lekh1);
            imageView.setImageResource(R.drawable.foys_lake_beautiful_nature_chittagong_bangladesh);
            textView.setText(R.string.foyez_lekh);
        }
        else if (value.equalsIgnoreCase("মেঘলা"))
        {
            textView2.setText(R.string.megla1);
            imageView.setImageResource(R.drawable.meghla_tourist_image);
            textView.setText(R.string.megla);
        }
        else if (value.equalsIgnoreCase("মহামায়া লেক"))
        {
            textView2.setText(R.string.mohamaya1);
            imageView.setImageResource(R.drawable.mohamaya_lake_image);
            textView.setText(R.string.mohamaya);
        }
        else if (value.equalsIgnoreCase("নীলগিরি"))
        {
            textView2.setText(R.string.nilgiri1);
            imageView.setImageResource(R.drawable.nilgiri_hill_image);
            textView.setText(R.string.nilgiri);
        }
        else if (value.equalsIgnoreCase("পতেঙ্গার"))
        {
            textView2.setText(R.string.potenga1);
            imageView.setImageResource(R.drawable.potenga_chittagong);
            textView.setText(R.string.potenga);
        }
        else if (value.equalsIgnoreCase("প্রান্তিক লেক"))
        {
            textView2.setText(R.string.prantik_lake1);
            imageView.setImageResource(R.drawable.prantik_image);
            textView.setText(R.string.prantik_lake);
        }
        else if (value.equalsIgnoreCase("সীতাকুণ্ড ইকো পার্ক"))
        {
            textView2.setText(R.string.sitakundo1);
            imageView.setImageResource(R.drawable.sitakundo_image_chittagong);
            textView.setText(R.string.sitakundo);
        }
        else if (value.equalsIgnoreCase("ভাটিয়ারী"))
        {
            textView2.setText(R.string.vatihatri1);
            imageView.setImageResource(R.drawable.batiary_chittagong);
            textView.setText(R.string.vatihatri);
        }
        else if (value.equalsIgnoreCase("ওয়ার সিমেট্রি"))
        {
            textView2.setText(R.string.ware_cemetry1);
            imageView.setImageResource(R.drawable.war_cemetery_image_chittagong);
            textView.setText(R.string.ware_cemetry);
        }*/
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==android.R.id.home){

            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
