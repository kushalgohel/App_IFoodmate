package com.example.ifoodmate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.google.gson.internal.bind.ArrayTypeAdapter;

import java.security.KeyStore;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class report_admin extends AppCompatActivity {
    LineChart adminlc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_admin);

    adminlc=(LineChart) findViewById(R.id.line_chart);
        LineDataSet lineDataSet1 = new LineDataSet(report1(), "Trial");
        ArrayList<LineDataSet> reports = new ArrayList<>();
        reports.add(lineDataSet1);

        LineData data = new LineData((ILineDataSet) reports);
        adminlc.setData(data);
        adminlc.invalidate();

    }

    private List<Entry> report1() {
    return report1();
    }

    private ArrayList<Entry> report()
    {
        ArrayList<Entry> report1= new ArrayList<Entry>();
        report1.add(new Entry(0,20));
        report1.add(new Entry(5,10));

        return  report1;
    }
}