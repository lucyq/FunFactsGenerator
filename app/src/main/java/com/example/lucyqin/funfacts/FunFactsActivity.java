package com.example.lucyqin.funfacts;

import android.graphics.Color;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    // Declare View Variables
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private FactBook mFactBook = new FactBook();
    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;
    private ColorWheel mColorWheel = new ColorWheel();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button)findViewById(R.id.factButton);
        mRelativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                    // Button was clicked, update fact TextView with new fact
                    mFactTextView.setText(mFactBook.getFact());

                    int c = mColorWheel.getColor();
                    mRelativeLayout.setBackgroundColor(c);
                    mShowFactButton.setTextColor(c);

                 }
        };
        mShowFactButton.setOnClickListener(listener);

        //Toast.makeText(FunFactsActivity.this, "Yay a toast to you!", Toast.LENGTH_SHORT).show();

        Log.d(TAG, "Logging from oncreatemethod");
    }
}



