package devarthur.com.myportfoolio.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import devarthur.com.myportfoolio.R;


public class contactFragment extends Fragment {


    public contactFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View contactView = inflater.inflate(R.layout.fragment_contact, container, false);
        return contactView; 
    }

}
