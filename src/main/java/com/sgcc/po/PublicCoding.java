package com.sgcc.po;

public class PublicCoding {
    private String gencodeid;

    private String value;

    private String name;

    private String type;

    private String parentid;

    private Integer gdesc;

    private Short isdelete;

    public String getGencodeid() {
        return gencodeid;
    }

    public void setGencodeid(String gencodeid) {
        this.gencodeid = gencodeid;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public Integer getGdesc() {
        return gdesc;
    }

    public void setGdesc(Integer gdesc) {
        this.gdesc = gdesc;
    }

    public Short getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Short isdelete) {
        this.isdelete = isdelete;
    }
}