package com.example.myration;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ChatFragment extends Fragment {

/*    EditText seta,adda;
    Button addaa,setaa;
    int ina1,ina2;
    TextView currA;

    public static final String SHARED_PREFS ="sharedPrefs";
    public static final String stock ="addstock";
    public String current;
    public String temp;//only for checking value of string is'nt 0
*/

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_chat, container, false);
 /*      adda=(EditText)rootView.findViewById(R.id.addstockA);
        addaa=(Button) rootView.findViewById(R.id.addA1);
        seta=(EditText)rootView.findViewById(R.id.setA);
        setaa=(Button) rootView.findViewById(R.id.setA1);
        currA=(TextView)rootView.findViewById(R.id.stockvalueA);

        addaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp=adda.getText().toString();
                int value=0;
                if(!"".equals(temp)){
                    value=Integer.parseInt(adda.getText().toString());
                }
                ina1=value;
                saveDataadd();
            }

        });
        setaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp=seta.getText().toString();
                int value=0;
                if(!"".equals(temp)){
                    value=Integer.parseInt(seta.getText().toString());
                }
                ina2=value;
                saveDataset();
            }
        });
        loadData();
        updateViews();

  */
        return rootView;
    }

    /*
public void saveDataadd(){
        SharedPreferences sharedPreferences= getActivity().getSharedPreferences(SHARED_PREFS, 0);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putInt(stock,ina1);
        editor.apply();
}
public void saveDataset(){
    SharedPreferences sharedPreferences= getActivity().getSharedPreferences(SHARED_PREFS, 0);
    SharedPreferences.Editor editor=sharedPreferences.edit();
    editor.putInt(stock,ina2);

    editor.apply();
    Toast.makeText(getActivity().getApplicationContext(),"Your Message", Toast.LENGTH_LONG).show();
}
public void loadData(){
    SharedPreferences sharedPreferences=getActivity().getSharedPreferences(SHARED_PREFS,0);
    current=sharedPreferences.getString(stock,"0");
    }
public void updateViews(){
        currA.setText(current);
}

     */
}
