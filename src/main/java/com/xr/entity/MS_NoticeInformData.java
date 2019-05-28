package com.xr.entity;

public class MS_NoticeInformData {
    private Integer noticeno;

    private String holderno;

    private String holdername;

    private String noticecontent;

    private Integer meetno;

    private String isattend;

    private String reasontext;

    private String holderno2;

    public Integer getNoticeno() {
        return noticeno;
    }

    public void setNoticeno(Integer noticeno) {
        this.noticeno = noticeno;
    }

    public String getHolderno() {
        return holderno;
    }

    public void setHolderno(String holderno) {
        this.holderno = holderno == null ? null : holderno.trim();
    }

    public String getHoldername() {
        return holdername;
    }

    public void setHoldername(String holdername) {
        this.holdername = holdername == null ? null : holdername.trim();
    }

    public String getNoticecontent() {
        return noticecontent;
    }

    public void setNoticecontent(String noticecontent) {
        this.noticecontent = noticecontent == null ? null : noticecontent.trim();
    }

    public Integer getMeetno() {
        return meetno;
    }

    public void setMeetno(Integer meetno) {
        this.meetno = meetno;
    }

    public String getIsattend() {
        return isattend;
    }

    public void setIsattend(String isattend) {
        this.isattend = isattend == null ? null : isattend.trim();
    }

    public String getReasontext() {
        return reasontext;
    }

    public void setReasontext(String reasontext) {
        this.reasontext = reasontext == null ? null : reasontext.trim();
    }

    public String getHolderno2() {
        return holderno2;
    }

    public void setHolderno2(String holderno2) {
        this.holderno2 = holderno2 == null ? null : holderno2.trim();
    }
}