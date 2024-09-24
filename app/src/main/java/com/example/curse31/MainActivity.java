package com.example.curse31;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.lang.annotation.Annotation;
public class MainActivity extends AppCompatActivity {
    private Button fistAnimation;
    private Button SecondAnimation;
    @Override    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button firstAni = findViewById(R.id.fistAnimation);
        Button SecondAni = findViewById(R.id.SecondAnimation);
        firstAni.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity1.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slider_1, R.anim.slider_3);            }
        });
        SecondAni.setOnClickListener(new View.OnClickListener()
        {
            @Override
        public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slider_2, R.anim.slider_4);
        }
        });
    }
}