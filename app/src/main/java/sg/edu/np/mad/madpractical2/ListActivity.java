package sg.edu.np.mad.madpractical2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewDebug;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class ListActivity extends AppCompatActivity {
    ArrayList<Data> myList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        Random random = new Random();
        for (int i = 0; i < 21; i++){
            Integer rName = random.nextInt();
            Integer rDesc = random.nextInt();

            Data d = new Data();
            d.name = "Name" + rName;
            d.description = "Description" + rDesc;

            myList.add(d);
        }
        RecyclerView recyclerView = findViewById(R.id.listImage);
        Adapter myAdapter = new Adapter(ListActivity.this, myList);
        LinearLayoutManager myLayoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(myLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(myAdapter);


    }
}