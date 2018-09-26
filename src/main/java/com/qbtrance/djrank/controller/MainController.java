package com.qbtrance.djrank.controller;

import com.qbtrance.djrank.dao.JDBCSpringApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
public class MainController {

    static int visitNumber;

    {
        visitNumber=0;
    }

    @RequestMapping("/")
    public String main(){
        System.out.println("Into MainController");
        visitNumber++;
        return "Main from main controller, you are the visitor number: " + visitNumber;
    }

    @RequestMapping("/test")
    public void test(){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        JDBCSpringApplicationContext dao = ctx.getBean("jdbcSpringApplicationContext", JDBCSpringApplicationContext.class);

        //JDBCSpringApplicationContext dao = new JDBCSpringApplicationContext();

        try {
            dao.getArtists();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
