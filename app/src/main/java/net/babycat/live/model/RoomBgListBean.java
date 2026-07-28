package net.babycat.live.model;

import o7.b;

/* JADX INFO: loaded from: classes4.dex */
public class RoomBgListBean implements b {
    public static final int ROOMBG = 1;
    public static final int ROOMSET = 2;
    private String background;
    private String ext;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private Integer f34884id;
    private String img;
    private boolean isSelect;
    private String room_id;
    private int type;

    public String getBackground() {
        return this.background;
    }

    public String getExt() {
        return this.ext;
    }

    public Integer getId() {
        return this.f34884id;
    }

    public String getImg() {
        return this.img;
    }

    @Override // o7.b
    public int getItemType() {
        return this.type;
    }

    public String getRoom_id() {
        return this.room_id;
    }

    public int getType() {
        return this.type;
    }

    public boolean isSelect() {
        return this.isSelect;
    }

    public void setBackground(String str) {
        this.background = str;
    }

    public void setExt(String str) {
        this.ext = str;
    }

    public void setId(Integer num) {
        this.f34884id = num;
    }

    public void setImg(String str) {
        this.img = str;
    }

    public void setRoom_id(String str) {
        this.room_id = str;
    }

    public void setSelect(boolean z10) {
        this.isSelect = z10;
    }

    public void setType(int i10) {
        this.type = i10;
    }
}
