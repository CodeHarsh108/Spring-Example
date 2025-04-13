package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider database = new UserDatabaseProvider();
        UserManager userManagerwithdb = new UserManager(database);
        System.out.println(userManagerwithdb.getUserInfo());

        UserDataProvider webservice = new WebServiceDataProvider();
        UserManager ws = new UserManager(webservice);
        System.out.println(ws.getUserInfo());
    }
}