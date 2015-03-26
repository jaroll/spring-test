package com.drabek;

import org.springframework.stereotype.Component;

@Component
public class BeatlesCd implements CompactDisc {

    @Override
    public void play() {
        System.out.println("PLAYING BEATLES");
    }

    @Override
    public void playTrack(int trackNumber) {
        System.out.println("Playing "+trackNumber+" track");
    }
}
