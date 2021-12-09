package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Album {
    private String title,
    artist;
    private ArrayList<Song> songs;

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    private Song findSong(String title) {
        for (Song checkedSong: this.songs) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    public boolean removeSong(String title) {
        Song checkedSong = findSong(title);
        if (checkedSong!= null) {
            this.songs.remove(checkedSong);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, List<Song> playList) {
        int index = trackNumber-1;
        if (0<=index && index <= this.songs.size()) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track "+trackNumber);
        return false;
    }
    public boolean addToPlayList(String title, List<Song> playList) {
        Song checkedSong = findSong(title);
        if (checkedSong!= null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song "+title+" is not in this album");
        return false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSongs() {
        return songs.toString();
    }
}
