package net.babycat.live.model;

import com.opensource.svgaplayer.SVGAImageView;

/* JADX INFO: loaded from: classes4.dex */
public class SvgaListBean {
    public SVGAImageView imageView;
    public String name;

    public SvgaListBean(String str, SVGAImageView sVGAImageView) {
        this.name = str;
        this.imageView = sVGAImageView;
    }

    public SVGAImageView getImageView() {
        return this.imageView;
    }

    public String getName() {
        return this.name;
    }

    public void setImageView(SVGAImageView sVGAImageView) {
        this.imageView = sVGAImageView;
    }

    public void setName(String str) {
        this.name = str;
    }
}
