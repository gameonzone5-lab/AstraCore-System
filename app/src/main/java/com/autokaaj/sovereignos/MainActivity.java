package com.autokaaj.sovereignos;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText("SOVEREIGN OS\n\nCore AI Layer: Initialized\nTerminal: Ready");
        textView.setTextColor(Color.parseColor("#00FF00"));
        textView.setTextSize(18f);
        textView.setPadding(50, 100, 50, 50);
        textView.setBackgroundColor(Color.parseColor("#0B0C10"));
        setContentView(textView);
    }
}
