package com.company;

public class Connection {
    private String connectionString;
    public Connection(String connectionString){
        this.connectionString=connectionString;
    }
    public void Open(){
        System.out.println("Açıldı");
    }
    public void Close(){
        System.out.println("Kapandı");

    }

}
