package com.imooc.game_pingtu.utils;

import android.graphics.Bitmap;

/**
 * Created by Administrator on 2015/8/10.
 */
public class ImagePiece {
    private int index;
    private Bitmap bitmap;
    public ImagePiece(){

    }
    public ImagePiece(int index,Bitmap bitmap){
        this.index = index;
        this.bitmap = bitmap;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "ImagePiece[index="+index+",bitmap="+bitmap+"]";
    }
}
