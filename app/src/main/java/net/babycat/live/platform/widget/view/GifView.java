package net.babycat.live.platform.widget.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import net.babycat.live.R;

/* JADX INFO: loaded from: classes3.dex */
public class GifView extends View {
    private static final int DEFAULT_MOVIE_DURATION = 1000;
    private int mCurrentAnimationTime;
    private float mLeft;
    private int mMeasuredMovieHeight;
    private int mMeasuredMovieWidth;
    private Movie mMovie;
    private long mMovieStart;
    private volatile boolean mPaused;
    private float mScale;
    private float mTop;
    private boolean mVisible;
    protected int progress_gif;
    protected int progress_width;

    public GifView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void drawMovieFrame(Canvas canvas) {
        this.mMovie.setTime(this.mCurrentAnimationTime);
        canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        float f10 = this.mScale;
        canvas.scale(f10, f10);
        Movie movie = this.mMovie;
        float f11 = this.mLeft;
        float f12 = this.mScale;
        movie.draw(canvas, f11 / f12, this.mTop / f12);
        canvas.restore();
    }

    @SuppressLint({"NewApi"})
    private void invalidateView() {
        if (this.mVisible) {
            postInvalidateOnAnimation();
        }
    }

    private void obtainStyledAttributes(AttributeSet attributeSet) {
        setLayerType(1, null);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.GifProgressBar);
        this.progress_gif = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        this.progress_width = (int) typedArrayObtainStyledAttributes.getDimension(1, 10.0f);
        typedArrayObtainStyledAttributes.recycle();
        if (this.progress_gif != -1) {
            this.mMovie = Movie.decodeStream(getResources().openRawResource(this.progress_gif));
        }
    }

    private void updateAnimationTime() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.mMovieStart == 0) {
            this.mMovieStart = jUptimeMillis;
        }
        int iDuration = this.mMovie.duration();
        if (iDuration == 0) {
            iDuration = 1000;
        }
        this.mCurrentAnimationTime = (int) ((jUptimeMillis - this.mMovieStart) % ((long) iDuration));
    }

    public Movie getMovie() {
        return this.mMovie;
    }

    public boolean isPaused() {
        return this.mPaused;
    }

    @Override // android.view.View
    public synchronized void onDraw(Canvas canvas) {
        try {
            if (this.mMovie != null) {
                if (this.mPaused) {
                    drawMovieFrame(canvas);
                } else {
                    updateAnimationTime();
                    drawMovieFrame(canvas);
                    invalidateView();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.mLeft = (getWidth() - this.mMeasuredMovieWidth) / 2.0f;
        this.mTop = (getHeight() - this.mMeasuredMovieHeight) / 2.0f;
        this.mVisible = getVisibility() == 0;
    }

    @Override // android.view.View
    public synchronized void onMeasure(int i10, int i11) {
        try {
            Movie movie = this.mMovie;
            if (movie != null) {
                int iWidth = movie.width();
                int iHeight = this.mMovie.height();
                int size = View.MeasureSpec.getSize(i10);
                float f10 = 1.0f / (iWidth / size);
                this.mScale = f10;
                this.mMeasuredMovieWidth = size;
                int i12 = (int) (iHeight * f10);
                this.mMeasuredMovieHeight = i12;
                setMeasuredDimension(size, i12);
            } else {
                setMeasuredDimension(getSuggestedMinimumWidth(), getSuggestedMinimumHeight());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onScreenStateChanged(int i10) {
        super.onScreenStateChanged(i10);
        this.mVisible = i10 == 1;
        invalidateView();
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        this.mVisible = i10 == 0;
        invalidateView();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.mVisible = i10 == 0;
        invalidateView();
    }

    public void setMovie(Movie movie) {
        this.mMovie = movie;
        requestLayout();
    }

    public void setMovieResource(int i10) {
        this.progress_gif = i10;
        this.mMovie = Movie.decodeStream(getResources().openRawResource(this.progress_gif));
        requestLayout();
    }

    public void setMovieTime(int i10) {
        this.mCurrentAnimationTime = i10;
        invalidate();
    }

    public void setPaused(boolean z10) {
        this.mPaused = z10;
        if (!z10) {
            this.mMovieStart = SystemClock.uptimeMillis() - ((long) this.mCurrentAnimationTime);
        }
        invalidate();
    }

    public GifView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mCurrentAnimationTime = 0;
        this.mVisible = true;
        this.mPaused = false;
        obtainStyledAttributes(attributeSet);
    }
}
