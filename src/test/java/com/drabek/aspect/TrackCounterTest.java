package com.drabek.aspect;

import com.drabek.CompactDisc;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class TrackCounterTest extends TestCase {

    @Autowired
    private CompactDisc cd;

    @Autowired
    private TrackCounter counter;

    @Test
    public void testTrackCounter(){

        cd.playTrack(0);
        cd.playTrack(1);
        cd.play();
        cd.playTrack(1);
        cd.play();

        assertEquals(1, counter.getPlayCount(0));
        assertEquals(2, counter.getPlayCount(1));
    }

}