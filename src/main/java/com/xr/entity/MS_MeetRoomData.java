package com.xr.entity;

public class MS_MeetRoomData {
    private Integer roomno;

    private String roomcode;

    private String roomname;

    private String roomaddress;

    private Integer capacity;

    private String doorlist;

    private String devicesinfo;

    private String isshadow;

    private String wifi;

    public Integer getRoomno() {
        return roomno;
    }

    public void setRoomno(Integer roomno) {
        this.roomno = roomno;
    }

    public String getRoomcode() {
        return roomcode;
    }

    public void setRoomcode(String roomcode) {
        this.roomcode = roomcode == null ? null : roomcode.trim();
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname == null ? null : roomname.trim();
    }

    public String getRoomaddress() {
        return roomaddress;
    }

    public void setRoomaddress(String roomaddress) {
        this.roomaddress = roomaddress == null ? null : roomaddress.trim();
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getDoorlist() {
        return doorlist;
    }

    public void setDoorlist(String doorlist) {
        this.doorlist = doorlist == null ? null : doorlist.trim();
    }

    public String getDevicesinfo() {
        return devicesinfo;
    }

    public void setDevicesinfo(String devicesinfo) {
        this.devicesinfo = devicesinfo == null ? null : devicesinfo.trim();
    }

    public String getIsshadow() {
        return isshadow;
    }

    public void setIsshadow(String isshadow) {
        this.isshadow = isshadow == null ? null : isshadow.trim();
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi == null ? null : wifi.trim();
    }
}