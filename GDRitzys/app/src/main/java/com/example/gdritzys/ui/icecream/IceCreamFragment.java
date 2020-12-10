package com.example.gdritzys.ui.icecream;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.gdritzys.R;

public class IceCreamFragment extends Fragment {

    private IceCreamViewModel galleryViewModel;
    private String sandwichOrder;
    private NumberPicker picker1;
    private NumberPicker picker2;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                new ViewModelProvider(this).get(IceCreamViewModel.class);
        View root = inflater.inflate(R.layout.fragment_icecream, container, false);

        picker1 = (NumberPicker) root.findViewById(R.id.NumberPickerInput);
        picker2 = (NumberPicker) root.findViewById(R.id.NumberPickerInput0);

        final String[] options = {"Naturals Straw Berry","Chunky Dory Fudge", "Mint Chocolate Fudge", "Peanut Butter", "O-O-Oreo", "Swiss Chocolate Almond" };
        picker1.setMinValue(0);
        picker1.setMaxValue(options.length-1);
        picker1.setDisplayedValues(options);

        final String[] options0 = {"Single Scoop", "Double Scoop", "Junior Scoop", "Sundae0", "Pint", "Quart", "2.5 Gallons" };
        picker2.setMinValue(0);
        picker2.setMaxValue(options0.length-1);
        picker2.setDisplayedValues(options0);

        return root;
    }
}