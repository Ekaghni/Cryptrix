package com.generic_corp.cryptrix.model;

public class UserData {

    String userName;
    String desc;
    Integer imageUrl;
    private String RowId;

    public UserData(String RowId,String userName, String desc, Integer imageUrl) {
        this.RowId = RowId;
        this.userName = userName;
        this.desc = desc;
        this.imageUrl = imageUrl;
    }
    public  String getRowId(){
        return RowId;
    }

    public void setRowId(String rowId){
        RowId = rowId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }
}
