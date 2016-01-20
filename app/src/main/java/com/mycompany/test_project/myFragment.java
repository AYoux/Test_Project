package com.mycompany.test_project;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by AY on 1/20/2016.
 */
public class myFragment extends Fragment {

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View main_view = inflater.inflate(R.id.main_fragment, container);
        Button sendButton = (Button) main_view.findViewById(R.id.button);

        sendButton.setOnClickListener(new View.onClickListener(){
            public void onClick(View v){

            }
        });

        EditText enteredText =  (EditText) main_view.findViewById(R.id.editText);
        TextView view_text = new TextView(getContext());
        view_text.setText(enteredText.getText().toString());
        return main_view;
    }
}
