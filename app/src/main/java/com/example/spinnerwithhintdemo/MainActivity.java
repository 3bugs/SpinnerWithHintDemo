package com.example.spinnerwithhintdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Spinner;

import com.example.spinnerwithhintdemo.adapter.SpinnerWithHintArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);

        //--------------------------------------------------------------------------------
        // อะแดปเตอร์ 1 กำหนดข้อมูลแบบอาร์เรย์
        String[] itemArray = new String[] {
                "ข้อมูล1",
                "ข้อมูล2",
                "ข้อมูล3",
                "ข้อมูล4",
                "ข้อมูล5",
                "ข้อความ Hint", // ข้อมูลสุดท้ายจะกลายเป็น hint ซึ่งแสดงออกมาตอนที่ user ยังไม่ได้เลือกตัวเลือกใดๆใน Spinner
        };
        SpinnerWithHintArrayAdapter adapter1 = new SpinnerWithHintArrayAdapter(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                itemArray
        );
        spinner1.setAdapter(adapter1);
        spinner1.setSelection(adapter1.getCount());

        //--------------------------------------------------------------------------------
        // อะแดปเตอร์ 2 กำหนดข้อมูลแบบ ArrayList
        ArrayList<String> items = new ArrayList<>();
        items.add("ข้อมูล1");
        items.add("ข้อมูล2");
        items.add("ข้อมูล3");
        items.add("ข้อความ Hint"); // ข้อมูลสุดท้ายจะกลายเป็น hint ซึ่งแสดงออกมาตอนที่ user ยังไม่ได้เลือกตัวเลือกใดๆใน Spinner
        SpinnerWithHintArrayAdapter adapter2 = new SpinnerWithHintArrayAdapter(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                items
        );
        spinner2.setAdapter(adapter2);
        spinner2.setSelection(adapter2.getCount());
    }
}
