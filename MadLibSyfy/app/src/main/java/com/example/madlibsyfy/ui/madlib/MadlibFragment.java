package com.example.madlibsyfy.ui.madlib;

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

public class MadlibFragment extends Fragment {


    //Intitialize the global variables
    private MadlibViewModel galleryViewModel;
    private TextView mFirstName; //instantiating the object it acts like a global variable
    private TextView mLastName;
    private TextView mCity;
    private TextView mSchool;
    private TextView mBrother;
    private TextView mSister;

    private TextView mFirstName1; //instantiating the object it acts like a global variable
    private TextView mLastName1;
    private TextView mCity1;
    private TextView mSchool1;
    private TextView mBrother1;
    private TextView mSister1;

    private TextView mBrother2;
    private TextView mSister2;
    private TextView outText;




    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                new ViewModelProvider(this).get(MadlibViewModel.class);
        View root = inflater.inflate(R.layout.fragment_madlib, container, false);

        //set the variable to what they acually represent on the xml side
        mFirstName = (TextView) root.findViewById(R.id.txtName0);
        mLastName = (TextView) root.findViewById(R.id.txtSup0);
        mCity = (TextView) root.findViewById(R.id.txtnoun0);
        mSchool =  (TextView) root.findViewById(R.id.txtnoun1);
        mBrother =  (TextView) root.findViewById(R.id.txtverb0);
        mSister =  (TextView) root.findViewById(R.id.txtevent);

        mFirstName1 = (TextView) root.findViewById(R.id.txtverb1);
        mLastName1 = (TextView) root.findViewById(R.id.txtverb2);
        mCity1 = (TextView) root.findViewById(R.id.txtweekD);
        mSchool1 =  (TextView) root.findViewById(R.id.txtverb9);
        mBrother1 =  (TextView) root.findViewById(R.id.txtverb4);
        mSister1 =  (TextView) root.findViewById(R.id.txtplace);

        mBrother2 =  (TextView) root.findViewById(R.id.txttimeSpan);
        outText = (TextView) root.findViewById(R.id.txtOutput);

        Button mb = root.findViewById(R.id.btnSubmit);

        mb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Bring in variables to be manipulated by the java code
                String name0 = mFirstName.getText().toString(); //Get text only pulls whats in the text box .ToString converts to a string
                String sup0 = mLastName.getText().toString();
                String noun0 = mCity.getText().toString();
                String noun1 = mSchool.getText().toString();
                String verb0 = mSister.getText().toString();
                String event = mBrother.getText().toString();

                String verb1 = mFirstName.getText().toString(); //Get text only pulls whats in the text box .ToString converts to a string
                String verb2 = mLastName.getText().toString();
                String weekD = mCity.getText().toString();
                String verb3 = mSchool.getText().toString();
                String verb4 = mSister.getText().toString();
                String place = mBrother.getText().toString();

                String timeSpan = mSister.getText().toString();
                String name1 = mBrother.getText().toString();





                //output the result

                outText.setText("It has come to my attention that I love you " +name0+ " that you are the "+sup0+" girl/boy in the "+noun0+". My "+noun1+" starts "+verb0+" a "+event+ " every time you speak.I would like to "+verb1+" if you want to go to the "+verb2+" with me next "+weekD+".If you "+verb3+" please "+verb4+" me at the "+place+" in "+timeSpan+ " I love you "+name1+" and everything about you.");



            }
        });

        return root;
    }


    }

