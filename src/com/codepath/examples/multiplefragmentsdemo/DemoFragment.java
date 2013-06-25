package com.codepath.examples.multiplefragmentsdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DemoFragment extends Fragment {
	int index = 0;
	
	public static DemoFragment newInstance(int index) {
		DemoFragment fragment = new DemoFragment();
		fragment.setIndex(index);
		return fragment;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_demo, null, false);
		TextView tvFragmentName = (TextView) view.findViewById(R.id.tvFragmentName);
		tvFragmentName.setText("This is Fragment " + index);
		return view;
	}
	
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		 getView();
	}

}
