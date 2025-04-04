package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDb = new UserManager(databaseProvider);

        System.out.println(userManagerWithDb.getUserInfo());

        UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserManager userManagerWithWs = new UserManager(webServiceProvider);

        System.out.println(userManagerWithWs.getUserInfo());
    }
}
