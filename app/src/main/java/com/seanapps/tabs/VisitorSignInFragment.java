package com.seanapps.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class VisitorSignInFragment extends Fragment {
    //private static final String TAG ="Tab1Fragment";

    EditText visitorNumberInput;
    Button visitorNumberSearchButton;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.visitor_sign_in_fragment,container,false);

        visitorNumberInput = (EditText) view.findViewById(R.id.visitorNumberInput);
        visitorNumberSearchButton = (Button) view.findViewById(R.id.visitorNumberSearchButton);

        visitorNumberSearchButton.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        visitorSearchNumber();
                    }
                }
        );



        return view;
    }

    public void visitorSearchNumber(){
        //This is where we need to search the database for the number
        //If it is found it will take the user to the sign in form
        //If it cant be found it will call another method to display a pop up box saying the number could not be found
    }
}
