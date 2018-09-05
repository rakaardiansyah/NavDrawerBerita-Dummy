package id.co.blogspot.infogabut.applepisi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Raka on 8/18/2018.
 */

public class BeritalokerActivity extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    private List<MyList_beritaLoker> list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.beritaloker, container, false);
        recyclerView = view.findViewById(R.id.recyclerView2);
        recyclerView.setHasFixedSize(true);
        layoutManager  = new GridLayoutManager(getActivity(),1);
        recyclerView.setLayoutManager(layoutManager);
        list = new ArrayList<>();
        loadRecyclerViewItem();
        return view;
    }
    private void loadRecyclerViewItem() {
        for (int i = 1; i <= 5; i++) {
            MyList_beritaLoker myList = new MyList_beritaLoker(
                    "Judul Loker " + i,
                    "berikut adalah deskripsi loker yang akan di isi, dan ini hanyalah sebuah " +
                            "contoh saja untuk mendeskripsikan kalimat yang kana saya tulis"
            );
            list.add(myList);
        }

        adapter = new CustomAdapter_beritaLoker(list, this);
        recyclerView.setAdapter(adapter);
    }
}