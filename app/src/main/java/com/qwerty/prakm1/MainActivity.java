package com.qwerty.prakm1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edtpanjang;
    private EditText edtlebar;
    private EditText edtluas;
    private Button btnHitungLuas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtluas = findViewById(R.id.isiluas);
        edtlebar = findViewById(R.id.isilebar);
        edtpanjang = findViewById(R.id.isipanjang);
    }

    public void hitung(View view) {
        String isijang = edtpanjang.getText().toString();
        String isibar = edtlebar.getText().toString();
        Integer hasilluas = Integer.valueOf(isijang)*Integer.valueOf(isibar);
        edtluas.setText(String.valueOf(hasilluas));
    }
}