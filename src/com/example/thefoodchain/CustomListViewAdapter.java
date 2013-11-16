package com.example.thefoodchain;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomListViewAdapter extends BaseAdapter{

	LayoutInflater inflater;
	List<ListViewItem> items;

	public CustomListViewAdapter(Activity context, List<ListViewItem> items) {
		
		super();
		this.items = items;
		this.inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
	}

	@Override
	public int getCount() {
		return items.size();
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {

		View vi = convertView;
		
		final ListViewItem item = items.get(position);

		if (convertView == null)
			vi = inflater.inflate(R.layout.activity_listview_row, null);
		
		TextView orderID = (TextView) vi.findViewById(R.id.orderID);
		TextView customerPostCode = (TextView) vi.findViewById(R.id.customerPostCode);
		
		orderID.setText(item.getOrderID());
		customerPostCode.setText(item.getCustomerPostCode());

		return vi;
	}

}
