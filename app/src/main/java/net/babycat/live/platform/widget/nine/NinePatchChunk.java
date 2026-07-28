package net.babycat.live.platform.widget.nine;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class NinePatchChunk implements Externalizable {
    public static final int DEFAULT_DENSITY = 160;
    public static final int NO_COLOR = 1;
    public static final int TRANSPARENT_COLOR = 0;
    public int[] colors;
    public ArrayList<Div> xDivs;
    public ArrayList<Div> yDivs;
    public boolean wasSerialized = true;
    public Rect padding = new Rect();

    public static void A(Bitmap bitmap, NinePatchChunk ninePatchChunk) throws WrongPaddingException {
        int width = bitmap.getWidth() - 2;
        int height = bitmap.getHeight() - 2;
        ArrayList<Div> arrayListN = n(bitmap, bitmap.getHeight() - 1);
        if (arrayListN.size() > 1) {
            throw new WrongPaddingException("Raw padding is wrong. Should be only one horizontal padding region");
        }
        ArrayList<Div> arrayListO = o(bitmap, bitmap.getWidth() - 1);
        if (arrayListO.size() > 1) {
            throw new WrongPaddingException("Column padding is wrong. Should be only one vertical padding region");
        }
        if (arrayListN.size() == 0) {
            arrayListN.add(ninePatchChunk.xDivs.get(0));
        }
        if (arrayListO.size() == 0) {
            arrayListO.add(ninePatchChunk.yDivs.get(0));
        }
        Rect rect = new Rect();
        ninePatchChunk.padding = rect;
        rect.left = arrayListN.get(0).start;
        ninePatchChunk.padding.right = width - arrayListN.get(0).stop;
        ninePatchChunk.padding.top = arrayListO.get(0).start;
        ninePatchChunk.padding.bottom = height - arrayListO.get(0).stop;
    }

    public static void B(Bitmap bitmap, NinePatchChunk ninePatchChunk) throws DivLengthException {
        ArrayList<Div> arrayListN = n(bitmap, 0);
        ninePatchChunk.xDivs = arrayListN;
        if (arrayListN.size() == 0) {
            throw new DivLengthException("must be at least one horizontal stretchable region");
        }
        ArrayList<Div> arrayListO = o(bitmap, 0);
        ninePatchChunk.yDivs = arrayListO;
        if (arrayListO.size() == 0) {
            throw new DivLengthException("must be at least one vertical stretchable region");
        }
    }

    public static void a(byte b10) throws DivLengthException {
        if (b10 == 0 || (b10 & 1) != 0) {
            throw new DivLengthException("Div count should be aliquot 2 and more then 0, but was: " + ((int) b10));
        }
    }

    public static NinePatchDrawable b(Context context, Bitmap bitmap, String str) {
        return BitmapType.i(context.getResources(), bitmap, str);
    }

    public static NinePatchDrawable c(Context context, InputStream inputStream, int i10, String str) {
        return g(context, inputStream, i10).a(context.getResources(), str);
    }

    public static NinePatchDrawable d(Context context, InputStream inputStream, String str) {
        return c(context, inputStream, 160, str);
    }

    public static b e(Context context, Bitmap bitmap) {
        BitmapType bitmapTypeH = BitmapType.h(bitmap);
        NinePatchChunk ninePatchChunkE = bitmapTypeH.e(bitmap);
        return new b(bitmapTypeH.j(context.getResources(), bitmap, ninePatchChunkE), ninePatchChunkE);
    }

    public static b f(Context context, InputStream inputStream) {
        return g(context, inputStream, 160);
    }

    public static b g(Context context, InputStream inputStream, int i10) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = i10;
        options.inTargetDensity = i10;
        return e(context, BitmapFactory.decodeStream(inputStream, new Rect(), options));
    }

    public static NinePatchChunk h(Bitmap bitmap) {
        try {
            return i(bitmap, true);
        } catch (RuntimeException unused) {
            return l();
        }
    }

    public static NinePatchChunk i(Bitmap bitmap, boolean z10) throws WrongPaddingException, DivLengthException {
        if (z10 && !u(bitmap)) {
            return l();
        }
        NinePatchChunk ninePatchChunk = new NinePatchChunk();
        B(bitmap, ninePatchChunk);
        A(bitmap, ninePatchChunk);
        z(bitmap, ninePatchChunk);
        return ninePatchChunk;
    }

    public static int[] j(NinePatchChunk ninePatchChunk, int i10, int i11) {
        if (ninePatchChunk == null) {
            return new int[0];
        }
        int[] iArr = new int[m(ninePatchChunk.xDivs, i10).size() * m(ninePatchChunk.yDivs, i11).size()];
        Arrays.fill(iArr, 1);
        return iArr;
    }

    public static void k(NinePatchChunk ninePatchChunk, int i10, int i11) {
        int[] iArrJ = j(ninePatchChunk, i10, i11);
        if (ninePatchChunk != null) {
            ninePatchChunk.colors = iArrJ;
        }
    }

    public static NinePatchChunk l() {
        NinePatchChunk ninePatchChunk = new NinePatchChunk();
        ninePatchChunk.colors = new int[0];
        ninePatchChunk.padding = new Rect();
        ninePatchChunk.yDivs = new ArrayList<>();
        ninePatchChunk.xDivs = new ArrayList<>();
        return ninePatchChunk;
    }

    public static ArrayList<Div> m(ArrayList<Div> arrayList, int i10) {
        int i11;
        int i12;
        ArrayList<Div> arrayList2 = new ArrayList<>();
        if (arrayList != null && arrayList.size() != 0) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                Div div = arrayList.get(i13);
                if (i13 == 0 && (i12 = div.start) != 0) {
                    arrayList2.add(new Div(0, i12 - 1));
                }
                if (i13 > 0) {
                    arrayList2.add(new Div(arrayList.get(i13 - 1).stop, div.start - 1));
                }
                arrayList2.add(new Div(div.start, div.stop - 1));
                if (i13 == arrayList.size() - 1 && (i11 = div.stop) < i10) {
                    arrayList2.add(new Div(i11, i10 - 1));
                }
            }
        }
        return arrayList2;
    }

    public static ArrayList<Div> n(Bitmap bitmap, int i10) {
        ArrayList<Div> arrayList = new ArrayList<>();
        Div divX = null;
        for (int i11 = 1; i11 < bitmap.getWidth(); i11++) {
            divX = x(bitmap.getPixel(i11, i10), divX, i11 - 1, arrayList);
        }
        return arrayList;
    }

    public static ArrayList<Div> o(Bitmap bitmap, int i10) {
        ArrayList<Div> arrayList = new ArrayList<>();
        Div divX = null;
        for (int i11 = 1; i11 < bitmap.getHeight(); i11++) {
            divX = x(bitmap.getPixel(i10, i11), divX, i11 - 1, arrayList);
        }
        return arrayList;
    }

    public static boolean p(Bitmap bitmap) {
        int width = bitmap.getWidth() - 1;
        int height = bitmap.getHeight() - 1;
        for (int i10 = 1; i10 < width; i10++) {
            if (!s(bitmap.getPixel(i10, 0)) || !s(bitmap.getPixel(i10, height))) {
                return false;
            }
        }
        for (int i11 = 1; i11 < height; i11++) {
            if (!s(bitmap.getPixel(0, i11)) || !s(bitmap.getPixel(width, i11))) {
                return false;
            }
        }
        return n(bitmap, 0).size() != 0 && n(bitmap, height).size() <= 1 && o(bitmap, 0).size() != 0 && o(bitmap, width).size() <= 1;
    }

    public static boolean q(Bitmap bitmap, int i10, int i11, int i12, int i13) {
        int pixel = bitmap.getPixel(i10, i12);
        while (i10 <= i11) {
            for (int i14 = i12; i14 <= i13; i14++) {
                if (pixel != bitmap.getPixel(i10, i14)) {
                    return false;
                }
            }
            i10++;
        }
        return true;
    }

    public static boolean r(int i10) {
        return i10 == -16777216;
    }

    public static boolean s(int i10) {
        return v(i10) || r(i10);
    }

    public static boolean t(Bitmap bitmap) {
        int height = bitmap.getHeight() - 1;
        int width = bitmap.getWidth() - 1;
        return v(bitmap.getPixel(0, 0)) && v(bitmap.getPixel(0, height)) && v(bitmap.getPixel(width, 0)) && v(bitmap.getPixel(width, height));
    }

    public static boolean u(Bitmap bitmap) {
        return bitmap != null && bitmap.getWidth() >= 3 && bitmap.getHeight() >= 3 && t(bitmap) && p(bitmap);
    }

    public static boolean v(int i10) {
        return Color.alpha(i10) == 0;
    }

    public static NinePatchChunk w(byte[] bArr) throws ChunkNotSerializedException, DivLengthException, BufferUnderflowException {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder());
        NinePatchChunk ninePatchChunk = new NinePatchChunk();
        int i10 = 0;
        boolean z10 = byteBufferOrder.get() != 0;
        ninePatchChunk.wasSerialized = z10;
        if (!z10) {
            throw new ChunkNotSerializedException();
        }
        byte b10 = byteBufferOrder.get();
        a(b10);
        byte b11 = byteBufferOrder.get();
        a(b11);
        ninePatchChunk.colors = new int[byteBufferOrder.get()];
        byteBufferOrder.getInt();
        byteBufferOrder.getInt();
        ninePatchChunk.padding.left = byteBufferOrder.getInt();
        ninePatchChunk.padding.right = byteBufferOrder.getInt();
        ninePatchChunk.padding.top = byteBufferOrder.getInt();
        ninePatchChunk.padding.bottom = byteBufferOrder.getInt();
        byteBufferOrder.getInt();
        int i11 = b10 >> 1;
        ArrayList<Div> arrayList = new ArrayList<>(i11);
        ninePatchChunk.xDivs = arrayList;
        y(i11, byteBufferOrder, arrayList);
        int i12 = b11 >> 1;
        ArrayList<Div> arrayList2 = new ArrayList<>(i12);
        ninePatchChunk.yDivs = arrayList2;
        y(i12, byteBufferOrder, arrayList2);
        while (true) {
            int[] iArr = ninePatchChunk.colors;
            if (i10 >= iArr.length) {
                return ninePatchChunk;
            }
            iArr[i10] = byteBufferOrder.getInt();
            i10++;
        }
    }

    public static Div x(int i10, Div div, int i11, ArrayList<Div> arrayList) {
        if (r(i10) && div == null) {
            div = new Div();
            div.start = i11;
        }
        if (!v(i10) || div == null) {
            return div;
        }
        div.stop = i11;
        arrayList.add(div);
        return null;
    }

    public static void y(int i10, ByteBuffer byteBuffer, ArrayList<Div> arrayList) {
        for (int i11 = 0; i11 < i10; i11++) {
            Div div = new Div();
            div.start = byteBuffer.getInt();
            div.stop = byteBuffer.getInt();
            arrayList.add(div);
        }
    }

    public static void z(Bitmap bitmap, NinePatchChunk ninePatchChunk) {
        int width = bitmap.getWidth() - 2;
        int height = bitmap.getHeight() - 2;
        ArrayList<Div> arrayListM = m(ninePatchChunk.xDivs, width);
        ArrayList<Div> arrayListM2 = m(ninePatchChunk.yDivs, height);
        ninePatchChunk.colors = new int[arrayListM.size() * arrayListM2.size()];
        int i10 = 0;
        for (Div div : arrayListM2) {
            for (Div div2 : arrayListM) {
                int i11 = div2.start + 1;
                int i12 = div.start + 1;
                if (q(bitmap, i11, div2.stop + 1, i12, div.stop + 1)) {
                    int pixel = bitmap.getPixel(i11, i12);
                    if (v(pixel)) {
                        pixel = 0;
                    }
                    ninePatchChunk.colors[i10] = pixel;
                } else {
                    ninePatchChunk.colors[i10] = 1;
                }
                i10++;
            }
        }
    }

    public byte[] C() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate((this.xDivs.size() * 8) + 32 + (this.yDivs.size() * 8) + (this.colors.length * 4)).order(ByteOrder.nativeOrder());
        Integer num = 1;
        byteBufferOrder.put(num.byteValue());
        byteBufferOrder.put(Integer.valueOf(this.xDivs.size() * 2).byteValue());
        byteBufferOrder.put(Integer.valueOf(this.yDivs.size() * 2).byteValue());
        byteBufferOrder.put(Integer.valueOf(this.colors.length).byteValue());
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        if (this.padding == null) {
            this.padding = new Rect();
        }
        byteBufferOrder.putInt(this.padding.left);
        byteBufferOrder.putInt(this.padding.right);
        byteBufferOrder.putInt(this.padding.top);
        byteBufferOrder.putInt(this.padding.bottom);
        byteBufferOrder.putInt(0);
        for (Div div : this.xDivs) {
            byteBufferOrder.putInt(div.start);
            byteBufferOrder.putInt(div.stop);
        }
        for (Div div2 : this.yDivs) {
            byteBufferOrder.putInt(div2.start);
            byteBufferOrder.putInt(div2.stop);
        }
        for (int i10 : this.colors) {
            byteBufferOrder.putInt(i10);
        }
        return byteBufferOrder.array();
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        byte[] bArr = new byte[objectInput.readInt()];
        objectInput.read(bArr);
        try {
            NinePatchChunk ninePatchChunkW = w(bArr);
            this.wasSerialized = ninePatchChunkW.wasSerialized;
            this.xDivs = ninePatchChunkW.xDivs;
            this.yDivs = ninePatchChunkW.yDivs;
            this.padding = ninePatchChunkW.padding;
            this.colors = ninePatchChunkW.colors;
        } catch (ChunkNotSerializedException | DivLengthException unused) {
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte[] bArrC = C();
        objectOutput.writeInt(bArrC.length);
        objectOutput.write(bArrC);
    }
}
