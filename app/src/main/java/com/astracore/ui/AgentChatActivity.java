package com.astracore.ui;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;

public class AgentChatActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        TextView textView = new TextView(this);
        textView.setText("AstraCore: Agent Chat Interface\n\n[Status]: Connecting to Local AI...");
        textView.setTextColor(Color.parseColor("#00FFFF")); // Cyan text
        textView.setTextSize(18f);
        textView.setPadding(50, 100, 50, 50);
        textView.setBackgroundColor(Color.parseColor("#0B0C10")); // Dark background
        
        setContentView(textView);
    }
}
