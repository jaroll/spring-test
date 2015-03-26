package com.drabek;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;

import java.lang.annotation.*;
import java.util.ArrayList;

public class App {

    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");

        MediaPlayer bean = applicationContext.getBean(MediaPlayer.class);
        System.out.println( "Hello World!" );


    }

//    @Scheduled(cron = )
//    public void aa(){
//
//    }
}

