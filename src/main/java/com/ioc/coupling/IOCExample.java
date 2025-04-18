package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIocLooseCouplingExample.xml");
        UserManager userManagerwithdb =
                (UserManager) context.getBean("userManagerWithUserDataProvider");
        System.out.println(userManagerwithdb.getUserInfo());

        UserManager ws =
                (UserManager) context.getBean("userManagerWithWebServiceDataProvider");
        System.out.println(ws.getUserInfo());
    }
}