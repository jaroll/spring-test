package com.drabek.aspect;

import com.drabek.BlankDisc;
import com.drabek.CompactDisc;
import com.drabek.aspect.introduction.DefaultEncoreable;
import com.drabek.aspect.introduction.EncoreableIntroducer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

    @Bean
    public CompactDisc sgtPeppers(){
        BlankDisc cd = new BlankDisc();
        cd.setArtist("The Beatles");
        cd.setTitle("Sgt. Pepper's Lonely Hearts Club Band");

        cd.addTrack("Sgt. Pepper's Lonely Hearts Club Band");
        cd.addTrack("Fixing a Hole");
        cd.addTrack("Getting Better");
        return cd;
    }

    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }

    @Bean
    public EncoreableIntroducer encoreableIntroducer(){
        return new EncoreableIntroducer();
    }

    @Bean
    public Performance performance(){
        return new PerformanceImpl();
    }

    @Bean
    public Encoreable encoreable(){
        return new DefaultEncoreable();
    }


}
