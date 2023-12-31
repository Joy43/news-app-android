package com.example.recialview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
ListView listView;
HashMap<String,String>hashMap =new HashMap<>();
ArrayList<HashMap<String,String>>arrayList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =findViewById(R.id.listView);

createTable();






        MyAdapter myAdapter =new MyAdapter();
        listView.setAdapter(myAdapter);
    }
//-------------------------------------------
// -------------------------------------------
private  class  MyAdapter extends BaseAdapter{

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}




//------------------------

//    --------------------

  private  void  createTable(){
        hashMap=new HashMap<>();
        hashMap.put("cat","tech");
        hashMap.put("image_url","https://i.ibb.co/fXP4Wtz/james-mckinven-tpu-Ao8g-Vs58-unsplash.jpg");
        hashMap.put("title","This one of the best laptop company");
        hashMap.put("des","ake the LiveChat tour and discover new ways to grow your business and increase customer satisfaction.");
        arrayList.add(hashMap);

  }


//    ----------------
}