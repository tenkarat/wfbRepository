package com.xr.entity;

import java.util.Date;

public class MS_MeetAttendData {
    private Integer datano;

    private String holderno;

    private String holdername;

    private Integer meetno;

    private String meetname;

    private Integer roomno;

    private String roomname;

    private Date attenddate;

    private String status;

    private String typename;

    private String deptno;

    private String deptname;

    public Integer getDatano() {
        return datano;
    }

    public void setDatano(Integer datano) {
        this.datano = datano;
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

    public Integer getRoomno() {
        return roomno;
    }

    public void setRoomno(Integer roomno) {
        this.roomno = roomno;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname == null ? null : roomname.trim();
    }

    public Date getAttenddate() {
        return attenddate;
    }

    public void setAttenddate(Date attenddate) {
        this.attenddate = attenddate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno == null ? null : deptno.trim();
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }
}