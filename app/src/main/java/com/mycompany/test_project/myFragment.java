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
        View main_view = inflater.inflate(R.layout.fragment_my, container, false);
        Button sendButton = (Button) main_view.findViewById(R.id.button);
        final EditText enteredText = (EditText) main_view.findViewById(R.id.editText);
        final TextView view_text = (TextView) main_view.findViewById((R.id.textView));

        sendButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                view_text.setText(enteredText.getText().toString());
            }
        });


        return main_view;
        /*return inflater.inflate(R.layout.fragment_my, container, false);*/
    }
}
