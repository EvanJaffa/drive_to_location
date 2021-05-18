package com.example.drivetomsu;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mapButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapButton = findViewById(R.id.map_button);
        mapButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Uri mapsIntentURI = Uri.parse("google.navigation:q=Montclair+State+University,+Montclair+New+Jersey");
        Intent mapsIntent = new Intent(Intent.ACTION_VIEW,mapsIntentURI);
        mapsIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapsIntent);
    }

}