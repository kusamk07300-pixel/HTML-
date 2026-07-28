package net.babycat.live.platform.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes3.dex */
public class Topbar extends RelativeLayout {
    private int background;
    private int btnLeftImageId;
    private ImageView imgs_righrt;
    private ImageView imgs_righrt_right;
    private RelativeLayout layout;
    private ImageView leftImg;
    private LinearLayout leftLayouot;
    private TopbarLeftClickListener leftListener;
    private TopbarMiddleClickListener middleListener;
    private TopbarRightClickListener rightListener;
    private String rightText;
    private int rightTextColor;
    private float rightTextSize;
    private View tab_bold;
    private String title;
    private int titleTextColor;
    private float titleTextSize;
    private RelativeLayout tvRight;
    private TextView tvTitle;
    private TextView tv_bc;

    public interface TopbarLeftClickListener {
        void leftClick();
    }

    public interface TopbarMiddleClickListener {
        void middleClick();
    }

    public interface TopbarRightClickListener {
        void rightClick();
    }

    public Topbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.common_titlebar, this);
        this.layout = (RelativeLayout) findViewById(R.id.common_back);
        this.leftImg = (ImageView) findViewById(R.id.common_img_left);
        this.imgs_righrt = (ImageView) findViewById(R.id.imgs_righrt);
        this.imgs_righrt_right = (ImageView) findViewById(R.id.imgs_righrt_right);
        this.leftLayouot = (LinearLayout) findViewById(R.id.left_layout);
        this.tvTitle = (TextView) findViewById(R.id.common_tv_title);
        this.tv_bc = (TextView) findViewById(R.id.tv_bc);
        this.tvRight = (RelativeLayout) findViewById(R.id.common_tv_right);
        this.tab_bold = findViewById(R.id.tab_bold);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, net.babycat.live.R.styleable.Topbar);
        this.titleTextColor = typedArrayObtainStyledAttributes.getColor(6, -16777216);
        this.background = typedArrayObtainStyledAttributes.getColor(0, -1);
        this.title = typedArrayObtainStyledAttributes.getString(5);
        this.titleTextSize = typedArrayObtainStyledAttributes.getDimension(7, 0.0f);
        this.btnLeftImageId = typedArrayObtainStyledAttributes.getResourceId(1, R.mipmap.icon_back);
        this.rightText = typedArrayObtainStyledAttributes.getString(2);
        this.rightTextColor = typedArrayObtainStyledAttributes.getColor(3, -16777216);
        this.rightTextSize = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        this.tvTitle.setOnClickListener(new View.OnClickListener() { // from class: net.babycat.live.platform.widget.view.Topbar.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Topbar.this.middleListener != null) {
                    Topbar.this.middleListener.middleClick();
                }
            }
        });
        this.leftImg.setImageResource(this.btnLeftImageId);
        this.leftLayouot.setOnClickListener(new View.OnClickListener() { // from class: net.babycat.live.platform.widget.view.Topbar.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Topbar.this.leftListener != null) {
                    Topbar.this.leftListener.leftClick();
                }
            }
        });
        this.layout.setBackgroundColor(this.background);
        this.tvTitle.setText(this.title);
        this.tvTitle.setTextColor(this.titleTextColor);
        this.tvTitle.setTextSize(0, this.titleTextSize);
        this.tvRight.setOnClickListener(new View.OnClickListener() { // from class: net.babycat.live.platform.widget.view.Topbar.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Topbar.this.rightListener != null) {
                    Topbar.this.rightListener.rightClick();
                }
            }
        });
    }

    public void setBg(int i10) {
        this.layout.setBackgroundColor(i10);
    }

    public void setLayoutBackground(int i10) {
        this.layout.setBackgroundColor(i10);
    }

    public void setLeftImage(int i10) {
        this.leftImg.setImageResource(i10);
    }

    public void setOnTopbarLeftClickListener(TopbarLeftClickListener topbarLeftClickListener) {
        this.leftListener = topbarLeftClickListener;
    }

    public void setOnTopbarMiddleClickListener(TopbarMiddleClickListener topbarMiddleClickListener) {
        this.middleListener = topbarMiddleClickListener;
    }

    public void setOnTopbarRightClickListener(TopbarRightClickListener topbarRightClickListener) {
        this.rightListener = topbarRightClickListener;
    }

    public void setRightGOne() {
        this.tvRight.setVisibility(8);
    }

    public void setRightImgGOne() {
        this.imgs_righrt.setVisibility(8);
    }

    public void setRightRightImage(int i10) {
        this.imgs_righrt_right.setImageResource(i10);
    }

    public void setRightText(String str) {
        this.tv_bc.setText(str);
    }

    public void setRightTextBackground(int i10) {
        this.tv_bc.setBackgroundResource(i10);
    }

    public void setRightTextSize(float f10) {
        this.tv_bc.setTextSize(f10);
    }

    public void setRightTextTextColor(int i10) {
        this.tv_bc.setTextColor(i10);
    }

    public void setRightTxtVisible() {
        this.tv_bc.setVisibility(0);
    }

    public void setRightVisible() {
        this.tvRight.setVisibility(0);
    }

    public void setRigtImage(int i10) {
        this.imgs_righrt.setImageResource(i10);
    }

    public void setTabBoldGone() {
        this.tab_bold.setVisibility(8);
    }

    public void setTabBoldVISIBLE() {
        this.tab_bold.setVisibility(0);
    }

    public void setTextTextColor(int i10) {
        this.tvTitle.setTextColor(i10);
    }

    public void setTitleText(String str) {
        this.tvTitle.setText(str);
    }

    public void setTitleTextColor(int i10) {
        this.tvTitle.setTextColor(i10);
    }

    public void setTopBarWhite() {
        this.layout.setBackgroundColor(Color.argb(0, 255, 255, 255));
        this.tab_bold.setVisibility(8);
        this.leftImg.setImageResource(R.mipmap.live_return);
        this.tvTitle.setTextColor(-1);
    }

    public void setTransparent() {
        this.layout.setBackgroundColor(Color.argb(0, 255, 255, 255));
    }

    public void setleftImg(int i10) {
        this.leftImg.setImageResource(i10);
    }

    public void setleftImgGone() {
        this.leftImg.setVisibility(8);
    }
}
