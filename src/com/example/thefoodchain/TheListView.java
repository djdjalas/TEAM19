package com.example.thefoodchain;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class TheListView extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_targets);

		final ListView lv = (ListView) findViewById(R.id.listView1);

		final ArrayList<ListViewItem> list = new ArrayList<ListViewItem>();

		list.add(new ListViewItem("1", "2002"));
		list.add(new ListViewItem("1", "2002"));
		list.add(new ListViewItem("1", "2002"));
		list.add(new ListViewItem("1", "2002"));
		list.add(new ListViewItem("1", "2002"));
		list.add(new ListViewItem("1", "2002"));
		list.add(new ListViewItem("1", "2002"));
		list.add(new ListViewItem("1", "2002"));

		ArrayList<String> countriesArrayList = new ArrayList<String>();

		for (ListViewItem t : list) {

			countriesArrayList.add(t.toString());
		}

		ArrayAdapter<String> array_adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, countriesArrayList);

		lv.setAdapter(array_adapter);

		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {

				Toast t = Toast.makeText(TheListView.this, "Hello",
						Toast.LENGTH_LONG);
				t.show();

			}
		});

		CustomListViewAdapter adapter = new CustomListViewAdapter(this, list);
		lv.setAdapter(adapter);

	}

}
