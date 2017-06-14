package com.seanapps.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by ginge on 7/06/2017.
 */

public class AdminSignInFragment extends Fragment {
    //private static final String TAG ="Tab1Fragment";

    EditText adminNameInput;
    EditText adminPasswordInput;
    Button adminSignInButton;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.admin_sign_in_fragment,container,false);

        adminNameInput = (EditText) view.findViewById(R.id.visitorNumberInput);
        adminPasswordInput = (EditText) view.findViewById(R.id.adminPasswordInput);
        adminSignInButton = (Button) view.findViewById(R.id.adminSignInButton);

        adminSignInButton.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        adminSignIn();
                    }
                }
        );




        return view;
    }

    public void adminSignIn(){
        //This is where we need to search the database for the admins details
        //If they are correct they will go to the admin page
        //If they cant be found it will call another method to display a pop up box saying the info is incorect could not be found
    }
}
