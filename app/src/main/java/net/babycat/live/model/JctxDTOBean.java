package net.babycat.live.model;

import java.io.Serializable;
import org.litepal.crud.LitePalSupport;

/* JADX INFO: loaded from: classes4.dex */
public class JctxDTOBean extends LitePalSupport implements Serializable {
    private Integer cate_type;
    private Integer endtime;
    private String file_type;
    private String icon;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private Integer f34856id;
    private String name;
    private String url;

    public Integer getCate_type() {
        return this.cate_type;
    }

    public Integer getEndtime() {
        return this.endtime;
    }

    public String getFile_type() {
        return this.file_type;
    }

    public String getIcon() {
        return this.icon;
    }

    public Integer getId() {
        return this.f34856id;
    }

    public String getName() {
        return this.name;
    }

    public String getUrl() {
        return this.url;
    }

    public void setCate_type(Integer num) {
        this.cate_type = num;
    }

    public void setEndtime(Integer num) {
        this.endtime = num;
    }

    public void setFile_type(String str) {
        this.file_type = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setId(Integer num) {
        this.f34856id = num;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
