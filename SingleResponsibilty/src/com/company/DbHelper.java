package com.company;

public class DbHelper {
    private Connection connection;

    public DbHelper(String connectionString){
      connection = new Connection(connectionString);
    }

    public int ExecuteNonQuery(String commandText, String[] names, Object[] params){
        Command command = getCommand(commandText, names, params);
        return command.ExecuteNonQuery();
    }

    private Command getCommand(String commandText, String[] names, Object[] params) {
        Command command = new Command(commandText,connection);
        addParametersToCommand(names, params, command);
        return command;
    }

    private void addParametersToCommand(String[] names, Object[] params, Command command) {
        for (int i = 0; i < names.length ; i++) {
            command.AddParameter(names[i], params[i]);
        }
    }

}
