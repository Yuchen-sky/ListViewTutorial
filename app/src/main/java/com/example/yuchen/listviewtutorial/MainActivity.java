package com.example.yuchen.listviewtutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    protected List<HashMap<String, String>> UnitListArray;
    protected SimpleAdapter MyListAdapter;
    ListView unitList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unitList = this.findViewById(R.id.listview);
        UnitListArray = new ArrayList<HashMap<String, String>>();
        String[] colHEAD = new
                String[]{"CODE", "UNITS", "SEMESTER"};
        int[] dataCell = new int[]{R.id.UnitCode, R.id.UnitName, R.id.Semester};
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("CODE", "FIT5183");
        map.put("UNITS", "Mobile and Distributed Computing");
        map.put("SEMESTER", "Sem 2A 2017");
        UnitListArray.add(map);
        HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put("CODE", "FIT5187");
        map1.put("UNITS", "wire");
        map1.put("SEMESTER", "Sem 2A 2017");
        UnitListArray.add(map1);
        MyListAdapter = new SimpleAdapter(this, UnitListArray, R.layout.list_view, colHEAD, dataCell);
        unitList.setAdapter(MyListAdapter);
    }
}
