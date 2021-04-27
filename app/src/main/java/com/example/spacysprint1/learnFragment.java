package com.example.spacysprint1;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link learnFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class learnFragment extends Fragment {



//    MeowBottomNavigation MeowBottomNavigationview;
    Animation ast;
    private CardView cardView;
    private  TextView text;
    private ImageView imageView;
    private TextView textView;
  

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_learn, container, false);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        //initialize your view here for use view.findViewById("your view id")
        cardView = (CardView) getView().findViewById(R.id.card1);
        ast = AnimationUtils.loadAnimation(getActivity(),R.anim.astro);
        imageView = (ImageView) getView().findViewById(R.id.astro2);
        imageView.setAnimation(ast);
//        MeowBottomNavigationview = (MeowBottomNavigation) getView().findViewById(R.id.bottom_navigation);
//        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) MeowBottomNavigationview.getLayoutParams();
//        layoutParams.setBehavior(new ScrollHandler());

        textView =  (TextView) getView().findViewById(R.id.mess);
        text =  (TextView) getView().findViewById(R.id.mesa);
        textView.setVisibility(View.INVISIBLE);
        textView.postDelayed(new Runnable() {
            @Override
            public void run() {
               AlphaAnimation alphaAnimation = new AlphaAnimation(0,1);
                alphaAnimation.setDuration(700);
                textView.startAnimation(alphaAnimation);
                textView.setVisibility(View.VISIBLE);
            }
        },4200);
        textView.postDelayed(new Runnable() {
            @Override
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1,0);
                alphaAnimation.setDuration(700);
                textView.startAnimation(alphaAnimation);
                textView.setVisibility(View.INVISIBLE);

            }

        },7500);
        text.setVisibility(View.INVISIBLE);
        boolean b = text.postDelayed(new Runnable() {
            @Override
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0, 1);
                alphaAnimation.setDuration(700);
                text.startAnimation(alphaAnimation);
                text.setVisibility(View.VISIBLE);
            }
        }, 8500);
        cardView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getActivity(), ANQ.class);
              startActivity(intent);

            }
        });


    }




}