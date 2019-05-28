package com.xr.entity;

import java.util.Date;

public class MS_MeetingData {
    private Integer meetno;

    private String meetname;

    private String holderno;

    private String meettype;

    private String holderno1;

    private Date starttime;

    private Date endtime;

    private String meetcontent;

    private String conforminfo;

    private String applystatus;

    private String holderno2;

    private String holdername2;

    private String holdername3;

    private String meetannex;

    private Integer roomno;

    public Integer getMeetno() {
        return meetno;
    }

    public void setMeetno(Integer meetno) {
        this.meetno = meetno;
    }

    public String getMeetname() {
        return meetname;
    }

    public void setMeetname(String meetname) {
        this.meetname = meetname == null ? null : meetname.trim();
    }

    public String getHolderno() {
        return holderno;
    }

    public void setHolderno(String holderno) {
        this.holderno = holderno == null ? null : holderno.trim();
    }

    public String getMeettype() {
        return meettype;
    }

    public void setMeettype(String meettype) {
        this.meettype = meettype == null ? null : meettype.trim();
    }

    public String getHolderno1() {
        return holderno1;
    }

    public void setHolderno1(String holderno1) {
        this.holderno1 = holderno1 == null ? null : holderno1.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getMeetcontent() {
        return meetcontent;
    }

    public void setMeetcontent(String meetcontent) {
        this.meetcontent = meetcontent == null ? null : meetcontent.trim();
    }

    public String getConforminfo() {
        return conforminfo;
    }

    public void setConforminfo(String conforminfo) {
        this.conforminfo = conforminfo == null ? null : conforminfo.trim();
    }

    public String getApplystatus() {
        return applystatus;
    }

    public void setApplystatus(String applystatus) {
        this.applystatus = applystatus == null ? null : applystatus.trim();
    }

    public String getHolderno2() {
        return holderno2;
    }

    public void setHolderno2(String holderno2) {
        this.holderno2 = holderno2 == null ? null : holderno2.trim();
    }

    public String getHoldername2() {
        return holdername2;
    }

    public void setHoldername2(String holdername2) {
        this.holdername2 = holdername2 == null ? null : holdername2.trim();
    }

    public String getHoldername3() {
        return holdername3;
    }

    public void setHoldername3(String holdername3) {
        this.holdername3 = holdername3 == null ? null : holdername3.trim();
    }

    public String getMeetannex() {
        return meetannex;
    }

    public void setMeetannex(String meetannex) {
        this.meetannex = meetannex == null ? null : meetannex.trim();
    }

    public Integer getRoomno() {
        return roomno;
    }

    public void setRoomno(Integer roomno) {
        this.roomno = roomno;
    }
}