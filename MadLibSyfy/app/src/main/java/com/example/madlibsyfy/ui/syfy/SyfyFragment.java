package com.example.madlibsyfy.ui.syfy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.madlibsyfy.R;

public class SyfyFragment extends Fragment {

    //create global variables
    private SyfyViewModel slideshowViewModel;
    private TextView mFirstName; //instantiating the object it acts like a global variable
    private TextView mLastName;
    private TextView mCity;
    private TextView mSchool;
    private TextView mBrother;
    private TextView mSister;
    private TextView outText;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                new ViewModelProvider(this).get(SyfyViewModel.class);
        View root = inflater.inflate(R.layout.fragment_syfy, container, false);
        mFirstName = (TextView) root.findViewById(R.id.txtFirstName);
        mLastName = (TextView) root.findViewById(R.id.txtLastName);
        mCity = (TextView) root.findViewById(R.id.txtCity);
        mSchool =  (TextView) root.findViewById(R.id.txtSchool);
        mBrother =  (TextView) root.findViewById(R.id.txtBrother);
        mSister =  (TextView) root.findViewById(R.id.txtSister);
        outText =(TextView)  root.findViewById(R.id.txtOutput);

        Button mb = root.findViewById(R.id.btnSubmit);

        mb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String first = mFirstName.getText().toString(); //Get text only pulls whats in the text box .ToString converts to a string
                String last = mLastName.getText().toString();
                String city = mCity.getText().toString();
                String school = mSchool.getText().toString();
                String sister = mSister.getText().toString();
                String brother = mBrother.getText().toString();

                int s1 = (int)(Math.random()*first.length());
                int s2 = (int)(Math.random()*last.length());
                int s3 = (int)(Math.random()*city.length());
                int s4 = (int)(Math.random()*school.length());
                int s5 = (int)(Math.random()*sister.length());
                int s6 = (int)(Math.random()*brother.length());

                String scifiFisrt = first.substring(0,s1) + last.substring(s2);
                String scifiLast = city.substring(0, s3) + school.substring(0, s4);
                String scifiHome = brother.substring(0, s5) + sister.substring(0, s6);



                outText.setText(scifiFisrt + " " + scifiLast + " from " + scifiHome);

                //outText.append  in place of outText.setText and it will add the text to the text already in the label

            }
        });


        return root;
    }
}