package devarthur.com.myportfoolio.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import devarthur.com.myportfoolio.R;


public class aboutFragment extends Fragment {


    public aboutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View aboutView = inflater.inflate(R.layout.fragment_about, container, false);
        // Inflate the layout for this fragment
        TextView textViewAbout = aboutView.findViewById(R.id.textViewAbout);
        textViewAbout.setText("Hello Darkness");
        return aboutView;
    }

}
