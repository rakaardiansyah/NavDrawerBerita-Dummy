package id.co.blogspot.infogabut.applepisi;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Raka on 8/12/2018.
 */

public class ProgramStudiFragment extends Fragment {


    RecyclerView recyclerview;
    RecyclerView.LayoutManager mLayoutManager;
    String ProgramStudi[] = {"Akuntansi", "Administrasi Perkantoran", "Multimedia", "Animasi", "Teknik Komputer dan Jaringan", "Rekayasa Perangkat Lunak", "Pemasaran"};
    List<ProgramStudiModel> datas = new ArrayList<>();
    Programstudi_Adapter programStudiAdapter;

//    public ProgramStudiFragment() {
//        // Required empty public constructor
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_fasilitas, container, false);
        recyclerview = view.findViewById(R.id.recyclerView);
        recyclerview.setHasFixedSize(true);

        mLayoutManager  = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        recyclerview.setLayoutManager(mLayoutManager);
        programStudiAdapter = new Programstudi_Adapter(datas, getActivity());
        recyclerview.setAdapter(programStudiAdapter);

        populateData();

        return view ;
    }

    private void populateData() {
        int i = 0;
        while (i < ProgramStudi.length-1){
            datas.add(new ProgramStudiModel(ProgramStudi[i], R.drawable.camera));
            i++;
        }

        programStudiAdapter.notifyDataSetChanged();
    }
}
