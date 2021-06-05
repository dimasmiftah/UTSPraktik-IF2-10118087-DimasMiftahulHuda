package me.dimasmiftah.utspraktik_if2_10118087_dimasmiftahulhuda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
    Tanggal pengerjaan: Sabtu, 5 Juni 2021
    NIM: 10118087
    Nama: Dimas Miftahul Huda
    Kelas: IF-2
*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent confirmActivity = new Intent(getApplicationContext(), ConfirmActivity.class);
                startActivity(confirmActivity);
            }
        });
    }
}