package com.example.a20190414_java_xml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView contentTextView;
    EditText inputEditText;
    Button okBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d("메인 onCreate테스트","실행이 되는가?");
        Log.e("메인 e로그","되가?");

        contentTextView = (TextView)findViewById(R.id.contentTextView);
        inputEditText = (EditText)findViewById(R.id.inputEditText);
        okBtn = (Button)findViewById(R.id.okBtn);

        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("확인버튼","터치이벤트 발생");
            }
        });





    }
}
