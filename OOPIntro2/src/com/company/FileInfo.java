package com.company;

import java.util.Date;

public class FileInfo {

    /* Bir dosyanın ........................... vardır */

    private int size;
    private Date createdDate;
    private String name;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /* Bir dosyanın .......... yapar |  ............... yapılır*/

    public void Save(String data){
        System.out.println(data + " kaydedildi");
    }
    public String Read(String path){
        return "Sample data";
    }
}
