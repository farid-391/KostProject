package com.example.kostcoba2.owner;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.kostcoba2.dorm.DormAdapter;
import com.example.kostcoba2.dorm.DormModel;
import com.example.kostcoba2.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MyDormPage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyDormPage extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MyDormPage() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MyDormPage.
     */
    // TODO: Rename and change types and number of parameters
    public static MyDormPage newInstance(String param1, String param2) {
        MyDormPage fragment = new MyDormPage();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_dorm_page, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        final ListView listViewdorm = (ListView)view.findViewById(R.id.listViewDorm);
//
//        final ArrayList<DormModel> listDorm = new ArrayList<>();
//        listDorm.add(new DormModel("Kost1", "Banguntapan, Bantul", R.drawable.kost1));
//        listDorm.add(new DormModel("Kost2", "Yogyakarta", R.drawable.kost1));
//        listDorm.add(new DormModel("Kost3", "Jakarta Utara", R.drawable.kost1));
//        listDorm.add(new DormModel("Kost4", "Jakarta Selatan", R.drawable.kost1));
//
//        final DormAdapter dormAdapter = new DormAdapter(listDorm, getActivity());
//        listViewdorm.setAdapter(dormAdapter);
//        listViewdorm.setOnItemClickListener((parent, view1, position, id) -> {
////            switch (position){
////                case 0:
////                    break;
////                case 1:
////                    break;
////            }
//        });



//        listViewdorm.setAdapter(dormAdapter);
//        listViewdorm.setOnItemClickListener((arg0, arg1, arg2, arg3) -> {
//            //final String selection = daftar[arg2];
//            final CharSequence[] dialogitem = {"Lihat Kos", "Update Kos", "Hapus kos"};
//            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//            builder.setTitle("Pilihan");
//            builder.setItems(dialogitem, (dialog, item) -> {
//                switch(item){
//                    case 0 :
////                            Intent i = new Intent(getActivity(), LihatActivity.class);
////                            i.putExtra("nama", selection);
////                            startActivity(i);
//                        break;
//                    case 1 :
////                            Intent in = new Intent(getApplicationContext(), EditActivity.class);
////                            in.putExtra("nama", selection);
////                            startActivity(in);
//                        break;
//                    case 2 :
////                            SQLiteDatabase db = dbcenter.getWritableDatabase();
////                            db.execSQL("delete from orderan where nama = '"+selection+"'");
////                            Toast.makeText(getApplicationContext(), "Berhasil Hapus", Toast.LENGTH_LONG).show();
////                            RefreshList();
//                        break;
//                }
//            });
//            builder.create().show();
//        });
//        ((ArrayAdapter)listViewdorm.getAdapter()).notifyDataSetInvalidated();
    }
}