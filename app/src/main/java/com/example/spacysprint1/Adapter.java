//package com.example.spacysprint1;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.lang.reflect.Constructor;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Adapter extends RecyclerView.Adapter {
//    Context context;
//    ArrayList arrayList,arrayListName;
//
//    public Adapter(Context context, ArrayList arrayList,ArrayList arrayListName) {
//        this.context = context;
//        this.arrayList = arrayList;
//        this.arrayListName=arrayListName;
//    }
//
//    @NonNull
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.display_item,parent,false);
//        ViewHolderClass viewHolderClass=new ViewHolderClass(view);
//        return viewHolderClass;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
//      ViewHolderClass viewHolderClass=(ViewHolderClass)holder;
//      viewHolderClass.imageView.setImageResource(Data.images[position]);
//        viewHolderClass.textView.setText(Data.names[position]);
//      viewHolderClass.itemView.setOnClickListener(new View.OnClickListener() {
//          @Override
//          public void onClick(View v) {
//              Toast.makeText(context,"Itemselected",Toast.LENGTH_LONG).show();
//          }
//      });
//    }
//
//    @Override
//    public int getItemCount() {
//        return 0;
//    }
//    public class ViewHolderClass extends RecyclerView.ViewHolder {
//        ImageView imageView;
//        TextView textView;
//        public ViewHolderClass(@NonNull View itemView) {
//            super(itemView);
//            imageView=(ImageView)itemView.findViewById(R.id.imageView);
//            textView=(TextView)itemView.findViewById(R.id.texView);
//
//        }
//    }
//
//}
//
//
//
