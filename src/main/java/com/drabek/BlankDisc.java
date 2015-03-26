package com.drabek;


import com.google.common.collect.Lists;

import java.util.List;

public class BlankDisc implements CompactDisc{
    private String title;
    private String artist;
    private List<String> tracks = Lists.newArrayList();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public void addTrack(String track){
        tracks.add(track);
    }

    @Override
    public void play() {
        tracks.stream().forEach(c -> System.out.println("PLAYING track: "+c));
    }

    @Override
    public void playTrack(int trackNumber) {
        System.out.println("PLAYING track: "+trackNumber+ " title: "+ tracks.get(trackNumber));
    }
}
