package com.example.tablayout;

// TabFragment.java

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TabFragment extends Fragment {

    private static final String ARG_TAB_NAME = "tab_name";

    public TabFragment() {
        // Required empty public constructor
    }

    public static TabFragment newInstance(String tabName) {
        TabFragment fragment = new TabFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TAB_NAME, tabName);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab, container, false);
        TextView textView = view.findViewById(R.id.textView);
        if (getArguments() != null) {
            String tabName = getArguments().getString(ARG_TAB_NAME);
            textView.setText(tabName);
        }
        return view;
    }
}
