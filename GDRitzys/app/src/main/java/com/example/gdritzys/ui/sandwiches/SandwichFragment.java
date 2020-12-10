package com.example.gdritzys.ui.sandwiches;

import android.os.Bundle;
import android.util.Log;
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

public class SandwichFragment extends Fragment {

    private SandwichViewModel SandwichViewModel;
    private NumberPicker picker1;
    private NumberPicker picker2;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SandwichViewModel =
                new ViewModelProvider(this).get(SandwichViewModel.class);
        View root = inflater.inflate(R.layout.fragment_sandwich, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        picker1 = (NumberPicker) root.findViewById(R.id.NumberPickerInput);
        picker2 = (NumberPicker) root.findViewById(R.id.NumberPickerInput0);
        SandwichViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        final String[] options = {"Hamburger","Cheeseburger", "Double Ritz", "Fish Sandwich", "Chicken Grill", "World's Best PB&J" };
        picker1.setMinValue(0);
        picker1.setMaxValue(options.length-1);
        picker1.setDisplayedValues(options);

        final String[] options0 = {"Ketchup","Mustard", "Pickles", "Mayonaisse", "Onions", "Lettuce", "Cheese", "Tomatoes", "Bacon" };
        picker2.setMinValue(0);
        picker2.setMaxValue(options0.length-1);
        picker2.setDisplayedValues(options0);
        /*
        numberInputText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                try {
                    inputNumber = Double.valueOf(numberInputText.getText().toString());
                } catch (NullPointerException | NumberFormatException e) {
                    Log.d("frequency", "Something went wrong" + e);

                }

            }
        });
*/
        return root;
    }
}