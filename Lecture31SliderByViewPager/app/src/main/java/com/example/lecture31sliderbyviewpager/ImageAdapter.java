package com.example.lecture31sliderbyviewpager;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

class ImageAdapter extends PagerAdapter {

    Context context;

    public ImageAdapter(Context context) {
        this.context = context;
    }
    int imagess[] = {
            R.drawable.pakistan, R.drawable.turkey,
            R.drawable.canada, R.drawable.netherlands,
            R.drawable.unitedarabemirates, R.drawable.unitedkingdom,
            R.drawable.pakistan, R.drawable.turkey,
            R.drawable.canada, R.drawable.netherlands,
            R.drawable.unitedarabemirates, R.drawable.unitedkingdom,
            R.drawable.pakistan, R.drawable.turkey,
            R.drawable.canada, R.drawable.netherlands,
            R.drawable.unitedarabemirates, R.drawable.unitedkingdom,
    };
    @Override
    public int getCount() {
        return imagess.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView =new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageResource(imagess[position]);
        container.addView(imageView,0);
        return imageView;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((ImageView) object);
    }
}
