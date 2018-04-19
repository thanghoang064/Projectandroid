package com.example.thanghoang.seachhotel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.firebase.client.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView mListView;
    private KhachSanListAdapter adapter;
    private List<KhachSan> mKhachSanList ;
    public static DatabaseReference def;
    Firebase myFB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.dsKhachSan);
        mKhachSanList = new ArrayList<>();
        adapter = new KhachSanListAdapter(getApplicationContext(),mKhachSanList);
        mListView.setAdapter(adapter);
        Firebase.setAndroidContext(this);
        if(!FirebaseApp.getApps(this).isEmpty()) {
            FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        }

        myFB = new Firebase("https://khachsanseach.firebaseio.com/KhachSan");
        def = FirebaseDatabase.getInstance().getReference();
        def.child("KhachSan").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                HashMap t = (HashMap) dataSnapshot.getValue();
                Log.d("dfdf",t.toString());
                mKhachSanList.add(new KhachSan(t.get("TenKhachSan").toString(),t.get("DiaChi").toString(),Float.parseFloat(t.get("Gia").toString())));
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

     //   mKhachSanList.add(new KhachSan("Hoàng yến","125 Man thiện",450000));


    }
}
