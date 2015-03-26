package com.drabek.aspect;


import com.drabek.CompactDisc;
import com.drabek.aspect.introduction.DefaultEncoreable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = TrackCounterConfig.class)
public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TrackCounterConfig.class);

        //APSECT with PARAM
        CompactDisc cd = context.getBean(CompactDisc.class);
        TrackCounter counter = context.getBean(TrackCounter.class);
        cd.playTrack(2);
        cd.playTrack(1);
        cd.playTrack(2);
        System.out.println("OUT: " + counter.getPlayCount(2));

        //INTRODUCTION
        Performance performance = context.getBean(Performance.class);
        performance.perform();
        Encoreable encoreable = (Encoreable) performance;
        encoreable.performEncore();
    }
}
