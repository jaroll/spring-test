package com.drabek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CdPlayer implements MediaPlayer{

    @Autowired
    private CompactDisc compactDisc;

//    @Autowired
//    public CdPlayer(CompactDisc compactDisc){
//        this.compactDisc = compactDisc;
//    }

    @Override
    public void play() {
        compactDisc.play();
    }
}
