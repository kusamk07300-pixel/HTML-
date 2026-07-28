package net.babycat.live.platform.widget.nine;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* JADX INFO: loaded from: classes3.dex */
public final class Div implements Externalizable {
    public int start;
    public int stop;

    public Div() {
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        this.start = objectInput.readByte();
        this.stop = objectInput.readByte();
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(this.start);
        objectOutput.writeByte(this.stop);
    }

    public Div(int i10, int i11) {
        this.start = i10;
        this.stop = i11;
    }
}
