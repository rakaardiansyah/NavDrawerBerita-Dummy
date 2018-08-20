package id.co.blogspot.infogabut.applepisi;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Raka on 8/13/2018.
 */

public class Programstudi_Adapter extends RecyclerView.Adapter<Programstudi_Adapter.ViewHolder> {

    List<ProgramStudiModel> datas = new ArrayList<>();
    Context context;

    public Programstudi_Adapter(List<ProgramStudiModel> datas, Context context) {
        this.datas = datas;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.programstudi_adapter, parent, false);

        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        ProgramStudiModel model = datas.get(position);

        holder.getTvJudulProdi().setText(model.getCardName());

//        holder.likeImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                int id = (int) R.drawable.ic_like;
//                if (holder.likeImage.getTag() != null) {
//                    id = (int) holder.likeImage.getTag();
//                }
//                if (id == R.drawable.ic_like) {
//
//                    holder.likeImage.setTag(R.drawable.ic_liked);
//                    holder.likeImage.setImageResource(R.drawable.ic_liked);
//
//                    Toast.makeText(context, holder.tvJudulProdi.getText() + " added to favourites", Toast.LENGTH_SHORT).show();
//                } else {
//
//                    holder.likeImage.setTag(R.drawable.ic_like);
//                    holder.likeImage.setImageResource(R.drawable.ic_like);
//                    Toast.makeText(context, holder.tvJudulProdi.getText() + " removed from favourites", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

//        holder.shareImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Uri imageUri = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +
//                        "://" + context.getResources().getResourcePackageName(holder.ivProdi.getId())
//                        + '/' + "drawable" + '/' + context.getResources().getResourceEntryName((int) holder.ivProdi.getTag()));
//
//                Intent shareIntent = new Intent();
//                shareIntent.setAction(Intent.ACTION_SEND);
//                shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
//                shareIntent.setType("image/jpeg");
//                startActivity(Intent.createChooser(shareIntent, context.getResources().getText(R.string.send_to)));
//            }
//        });

        Glide.with(context)
                .load(model.getImageResourceId())
                .into(holder.getIvProdi());
    }

    private void startActivity(Intent chooser) {
    }

    @Override
    public int getItemCount() {
        if (datas == null) {
            return 0;
        }

        return datas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvJudulProdi;
        private ImageView ivProdi;
//        private ImageView likeImage;
//        private ImageView shareImage;

        public ViewHolder(View itemView) {
            super(itemView);

            tvJudulProdi = (TextView) itemView.findViewById(R.id.titleTextView);
            ivProdi = (ImageView) itemView.findViewById(R.id.coverImageView);
//            likeImage = (ImageView) itemView.findViewById(R.id.likeImageView);
//            shareImage = (ImageView) itemView.findViewById(R.id.shareImageView);
        }

        public TextView getTvJudulProdi() {
            return tvJudulProdi;
        }

//        public ImageView getLikeImage() {
//            return likeImage;
//        }

        public ImageView getIvProdi() {
            return ivProdi;
        }

//        public ImageView getShareImage() {
//            return shareImage;
//        }
    }
}