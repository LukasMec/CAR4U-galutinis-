package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class Fragment2 extends Fragment {


    private RadioGroup.OnCheckedChangeListener onCheckedChangeListener = (group, checkedId) -> {
        switch (checkedId) {
            case R.id.vyras:
                // Write your code here
                break;
            case R.id.moteris:
                // Write your code here
                break;
            case R.id.kita:
                // Write your code here
                break;
            default:
                break;
        }
    };


    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        EditText amzius = (EditText) view.findViewById(R.id.amzius);
        String Amzius = amzius.getText().toString();

        EditText turimasuma = (EditText) view.findViewById(R.id.turimasuma);
        String Turimasuma = turimasuma.getText().toString();

        RadioGroup radioGroup = view.findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);

        Button btnSubmit = view.findViewById(R.id.button2);
        btnSubmit.setOnClickListener(view1 -> {
            Navigation.findNavController(view).navigate(R.id.action_fragment2_to_nav_fragment3);
        });
    }


}