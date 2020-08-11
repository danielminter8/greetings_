package services;

public interface Greets {

    String addNameToDB(String name);
    String getNameCount(String name);
    int totalUniqueUsersGreeted();
    Object getAllNamesGreeted();
    String deleteAllNames();
    Boolean checkIfNameExist(String name);

}
