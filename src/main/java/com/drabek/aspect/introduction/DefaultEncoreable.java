package com.drabek.aspect.introduction;

import com.drabek.aspect.Encoreable;

public class DefaultEncoreable implements Encoreable{
    @Override
    public void performEncore() {
        System.out.println("Performing encore!");
    }
}
