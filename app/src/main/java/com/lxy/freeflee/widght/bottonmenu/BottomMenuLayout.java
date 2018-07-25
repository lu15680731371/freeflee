package com.lxy.freeflee.widght.bottonmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.airbnb.lottie.LottieAnimationView;
import com.lxy.freeflee.R;

public class BottomMenuLayout extends RelativeLayout implements View.OnClickListener {

    private View view;
    private LinearLayout mLmenuHomePage, mLmenuentErtainment,
            mLmenuentSubscribe, mLmenuentFind, mLmenuentMy;
    private LottieAnimationView mLavMenuHomePage,mLavMenuErtainment,
            mLavMenuSubscribe,mLavMenuFind,mLavMenuMy;

    private boolean isCheckHomePage=true;
    private boolean isCheckErtainment=false;
    private boolean isCheckSubscribe=false;
    private boolean isCheckFind=false;
    private boolean isCheckMy=false;

    private ButtonMenuListener menuListener;
    public BottomMenuLayout(Context context) {
        super(context);
    }

    public BottomMenuLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
        initView();
    }


    public BottomMenuLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
        initView();
    }

    private void init(Context context) {
        view = LayoutInflater.from(context).inflate(R.layout.layout_button_menu, this);
    }

    private void initView() {
        mLmenuHomePage = view.findViewById(R.id.ll_menu_home_page);
        mLmenuentErtainment = view.findViewById(R.id.ll_menu_entertainment);
        mLmenuentSubscribe = view.findViewById(R.id.ll_menu_subscribe);
        mLmenuentFind = view.findViewById(R.id.ll_menu_find);
        mLmenuentMy = view.findViewById(R.id.ll_menu_my);

        mLavMenuHomePage = view.findViewById(R.id.lav_menu_home_page);
        mLavMenuErtainment = view.findViewById(R.id.lav_menu_entertainment);
        mLavMenuSubscribe = view.findViewById(R.id.lav_menu_subscribe);
        mLavMenuFind = view.findViewById(R.id.lav_menu_find);
        mLavMenuMy = view.findViewById(R.id.lav_menu_my);

        mLmenuHomePage.setOnClickListener(this);
        mLmenuentErtainment.setOnClickListener(this);
        mLmenuentSubscribe.setOnClickListener(this);
        mLmenuentFind.setOnClickListener(this);
        mLmenuentMy.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.ll_menu_home_page:
                if (isCheckHomePage){
                    menuListener.onItem(1);
                }else {
                    mLavMenuErtainment.setProgress(0f);
                    mLavMenuErtainment.cancelAnimation();
                    mLavMenuSubscribe.setProgress(0f);
                    mLavMenuSubscribe.cancelAnimation();
                    mLavMenuFind.setProgress(0f);
                    mLavMenuFind.cancelAnimation();
                    mLavMenuMy.setProgress(0f);
                    mLavMenuMy.cancelAnimation();
                    isCheckHomePage=true;
                    isCheckErtainment=false;
                    isCheckSubscribe=false;
                    isCheckFind=false;
                    isCheckMy=false;
                    mLavMenuHomePage.playAnimation();
                }
                break;
            case R.id.ll_menu_entertainment:

                if (isCheckErtainment){
                    menuListener.onItem(2);
                }else {
                    mLavMenuHomePage.setProgress(0f);
                    mLavMenuHomePage.cancelAnimation();
                    mLavMenuSubscribe.setProgress(0f);
                    mLavMenuSubscribe.cancelAnimation();
                    mLavMenuFind.setProgress(0f);
                    mLavMenuFind.cancelAnimation();
                    mLavMenuMy.setProgress(0f);
                    mLavMenuMy.cancelAnimation();
                    isCheckHomePage=false;
                    isCheckErtainment=true;
                    isCheckSubscribe=false;
                    isCheckFind=false;
                    isCheckMy=false;
                    mLavMenuErtainment.playAnimation();
                }
                break;
            case R.id.ll_menu_subscribe:

               if (isCheckSubscribe){
                   menuListener.onItem(3);
               }else {
                   mLavMenuHomePage.setProgress(0f);
                   mLavMenuHomePage.cancelAnimation();
                   mLavMenuErtainment.setProgress(0f);
                   mLavMenuErtainment.cancelAnimation();
                   mLavMenuFind.setProgress(0f);
                   mLavMenuFind.cancelAnimation();
                   mLavMenuMy.setProgress(0f);
                   mLavMenuMy.cancelAnimation();
                   isCheckHomePage=false;
                   isCheckErtainment=false;
                   isCheckSubscribe=true;
                   isCheckFind=false;
                   isCheckMy=false;
                   mLavMenuSubscribe.playAnimation();
               }
                break;
            case R.id.ll_menu_find:

                if (isCheckFind){
                    menuListener.onItem(4);
                }else {
                    mLavMenuHomePage.setProgress(0f);
                    mLavMenuHomePage.cancelAnimation();
                    mLavMenuErtainment.setProgress(0f);
                    mLavMenuErtainment.cancelAnimation();
                    mLavMenuSubscribe.setProgress(0f);
                    mLavMenuSubscribe.cancelAnimation();
                    mLavMenuMy.setProgress(0f);
                    mLavMenuMy.cancelAnimation();
                    isCheckHomePage=false;
                    isCheckErtainment=false;
                    isCheckSubscribe=false;
                    isCheckFind=true;
                    isCheckMy=false;
                    mLavMenuFind.playAnimation();
                }
                break;
            case R.id.ll_menu_my:
               if (isCheckMy){
                   menuListener.onItem(5);
               }else {
                   mLavMenuHomePage.setProgress(0f);
                   mLavMenuHomePage.cancelAnimation();
                   mLavMenuErtainment.setProgress(0f);
                   mLavMenuErtainment.cancelAnimation();
                   mLavMenuSubscribe.setProgress(0f);
                   mLavMenuSubscribe.cancelAnimation();
                   mLavMenuFind.setProgress(0f);
                   mLavMenuFind.cancelAnimation();
                   isCheckHomePage=false;
                   isCheckErtainment=false;
                   isCheckSubscribe=false;
                   isCheckFind=false;
                   isCheckMy=true;
                   mLavMenuMy.playAnimation();
               }
                break;
        }
    }

    public void setOnMenuItemListener(ButtonMenuListener onMenuItemListener){
        this.menuListener=onMenuItemListener;
    }
}
