package com.cookandroid.baseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1;
    
    // 시작하는 메소드
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1, tv2, tv3;
        tv1 = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);

        tv1.setText("안녕하세요?");

        tv2.setTextSize(40);
        tv2.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC);

        tv3.setText("가나다라마바사아자차카타파하");
        tv3.setSingleLine();



//        button1 = (Button) findViewById(R.id.button1);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // 클릭하면 작동할 메소드 여기
//                Toast.makeText(getApplicationContext(), "버튼을 눌렀어요",
//                        Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}