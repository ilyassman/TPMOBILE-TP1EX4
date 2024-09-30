package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private TextView fullname,email,phone,adresse,ville;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        fullname=findViewById(R.id.nom);
        adresse=findViewById(R.id.adresse);
        phone=findViewById(R.id.phone);
        email=findViewById(R.id.email);
        ville=findViewById(R.id.ville);
        fullname.setText(fullname.getText()+this.getIntent().getStringExtra("fullname"));
        adresse.setText(adresse.getText()+this.getIntent().getStringExtra("adresse"));
        phone.setText(phone.getText()+this.getIntent().getStringExtra("phone"));
        email.setText(email.getText()+this.getIntent().getStringExtra("email"));
        ville.setText(ville.getText()+this.getIntent().getStringExtra("ville"));

    }
}