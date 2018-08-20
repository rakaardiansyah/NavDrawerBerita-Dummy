package id.co.blogspot.infogabut.applepisi;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Raka on 8/13/2018.
 */

public class GridAdapterFasilitas extends RecyclerView.Adapter<GridAdapterFasilitas.ViewHolder> {

    List<EndangeredItem> mItems;

    public GridAdapterFasilitas() {
        super();
        mItems = new ArrayList<EndangeredItem>();
        EndangeredItem nama = new EndangeredItem();
        nama.setName("Lab. Perakitan PC");
        nama.setThumbnail(R.drawable.camera);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Mushola");
        nama.setThumbnail(R.drawable.camera);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Lapangan Basket");
        nama.setThumbnail(R.drawable.camera);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Studio Band");
        nama.setThumbnail(R.drawable.camera);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("ATM");
        nama.setThumbnail(R.drawable.camera);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Auditorium");
        nama.setThumbnail(R.drawable.camera);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Cafe");
        nama.setThumbnail(R.drawable.camera);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Studio Radio");
        nama.setThumbnail(R.drawable.camera);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Pendopo");
        nama.setThumbnail(R.drawable.camera);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Ruang Serba Guna");
        nama.setThumbnail(R.drawable.camera);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Lab. Mengetik");
        nama.setThumbnail(R.drawable.camera);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Lab. Bahasa");
        nama.setThumbnail(R.drawable.camera);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Lab. Komputer");
        nama.setThumbnail(R.drawable.camera);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Ruang Kelas");
        nama.setThumbnail(R.drawable.camera);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Perpustakaan");
        nama.setThumbnail(R.drawable.camera);
        mItems.add(nama);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.fasilitas_gridview, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        EndangeredItem nature = mItems.get(i);
        viewHolder.tvspecies.setText(nature.getName());
        viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());
    }

    @Override
    public int getItemCount() {

        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder  {


        public ImageView imgThumbnail;
        public TextView tvspecies;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);
            tvspecies = (TextView)itemView.findViewById(R.id.status);

        }
    }
}
