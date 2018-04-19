package com.example.thanghoang.seachhotel;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class KhachSanListAdapter extends BaseAdapter {
    private Context mContext;
    private List<KhachSan> mKhachSanList;

    public KhachSanListAdapter (Context mContext, List<KhachSan> mKhachSanList) {
        this.mContext = mContext;
        this.mKhachSanList = mKhachSanList;
    }

    @Override
    public int getCount() {
        return mKhachSanList.size();
    }

    @Override
    public Object getItem(int i) {
        return mKhachSanList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(mContext,R.layout.listkhachsan,null);
        ImageView Imview = (ImageView) v.findViewById(R.id.imageKhachSan);
        TextView tvTenKhachSan = (TextView)v.findViewById(R.id.txtTenKhachSan);
        TextView tvDiaChi = (TextView)v.findViewById(R.id.txtDiaChi);
        TextView tvGiaTien = (TextView)v.findViewById(R.id.txtGiaTien);
        RatingBar rbDanhGia = (RatingBar)v.findViewById(R.id.rbXepHang);
        tvTenKhachSan.setText(mKhachSanList.get(i).getTenkhachsan());
        tvDiaChi.setText(String.valueOf(mKhachSanList.get(i).getDiaChi()));
        tvGiaTien.setText(String.valueOf(mKhachSanList.get(i).getGiaTien()));
        Imview.setImageResource(R.drawable.khachsan);
        Log.d("nana",String.valueOf(R.drawable.khachsan));
        rbDanhGia.setNumStars(5);
        rbDanhGia.setRating(3);
        //v.setTag(mChuyenXeList.get(i).get);

        return v;

    }
}

