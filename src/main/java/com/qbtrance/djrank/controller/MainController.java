package com.qbtrance.djrank.controller;

import com.qbtrance.djrank.dao.ArtistDAO;
import com.qbtrance.djrank.dao.ArtistDAOImpl;
import com.qbtrance.djrank.dao.JDBCDerbyDaoImpl;
import com.qbtrance.djrank.dao.JDBCSpringApplicationContext;
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
        visitNumber++;
        JDBCSpringApplicationContext dao1 = new JDBCSpringApplicationContext();




        //JDBCSpringApplicationContext dao = new JDBCSpringApplicationContext();

        try {
            dao1.getArtist();
            //derby.getArtist(1);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Exception + " + e.getMessage());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return "Main from main controller, you are the visitor number: " + visitNumber;
    }
}
