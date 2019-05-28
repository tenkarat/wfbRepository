package com.xr.entity;

public class HolderPhotoWithBLOBs extends HolderPhoto {
    private byte[] dataphoto;

    private byte[] idphoto;

    public byte[] getDataphoto() {
        return dataphoto;
    }

    public void setDataphoto(byte[] dataphoto) {
        this.dataphoto = dataphoto;
    }

    public byte[] getIdphoto() {
        return idphoto;
    }

    public void setIdphoto(byte[] idphoto) {
        this.idphoto = idphoto;
    }
}