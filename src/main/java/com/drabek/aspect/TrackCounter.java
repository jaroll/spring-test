package com.drabek.aspect;

import com.google.common.collect.Maps;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Map;

@Aspect
public class TrackCounter {

    private Map<Integer, Integer> trackCounts = Maps.newHashMap();

    @Pointcut("execution(* com.drabek.CompactDisc.playTrack(int)) && args(trackNumber)")
    public void trackPlay(int trackNumber){}

    @Pointcut("execution(* com.drabek.CompactDisc.play())")
    public void cdPlay(){}

    @Before("trackPlay(trackNumber)")
    public void countTrack(int trackNumber){
        trackCounts.put(trackNumber, getPlayCount(trackNumber) +1);
    }

    @Before("cdPlay()")
    public void makeItLouder(){
        System.out.println("!!!!!!!!!!!!!!!!!!");
    }

    public int getPlayCount(int trackNumber){
        return trackCounts.containsKey(trackNumber) ? trackCounts.get(trackNumber) : 0;
    }



}
