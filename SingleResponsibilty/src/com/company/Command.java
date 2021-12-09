package com.company;

public class Command {
    private String commandText;
    private Object[] parameters;
    private Connection connection;

    public void AddParameter(String name, Object value){

    }

    public Command(String commandText, Connection connection){
        this.commandText = commandText;
        this.connection = connection;
    }

    public int ExecuteNonQuery(){
        this.connection.Open();
        System.out.println(commandText + " sorgusu çalıştı...");
        this.connection.Close();
        return 1;
    }
}
