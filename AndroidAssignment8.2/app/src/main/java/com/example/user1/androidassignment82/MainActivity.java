package com.example.user1.androidassignment82;

/*
This project is an example of listview
to show data in list
 */


// required class imported
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


// class started here
public class MainActivity extends AppCompatActivity {

     // refenrec for list vie and arraylist
    ListView listview;
    private ArrayList<Utilities> mlistData;
    CustomAdaptor customAdaptor;



    @Override

    // oncreat method
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         //Id assigned to list view
        listview= (ListView) findViewById(R.id.listvieww);


       // object of Arraylist
        mlistData=new ArrayList<>();

        //method for set data
        utilitydata();
        // customadaptor class object
        customAdaptor=new CustomAdaptor(getApplicationContext(),mlistData);
          // set adaptor to list view
         listview.setAdapter(customAdaptor);

}


    void utilitydata() {

        for(int i=0; i<10;i++){
            Utilities util=new Utilities();
            util.setNameText1("Name" + i);
            util.setPhonenumbertext2("PhoneNumber" + i);

            mlistData.add(util);


        }

    }

}// class closed
