package com.xr.entity;

public class HolderPhoto {
    private Integer id;

    private String holderno;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHolderno() {
        return holderno;
    }

    public void setHolderno(String holderno) {
        this.holderno = holderno == null ? null : holderno.trim();
    }
}