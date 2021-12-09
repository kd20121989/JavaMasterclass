package com.company;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String title,
            artist;
    private SongList songs;

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title,duration));
    }

    public boolean addToPlayList(int trackNumber, List<Song> playList) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if (checkedSong!=null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track "+trackNumber);
        return false;
    }
    public boolean addToPlayList(String title, List<Song> playList) {
        Song checkedSong = songs.findSong(title);
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

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private Song findSong(String title) {
            for (Song checkedSong: this.songs) {
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }
        public Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if ((0<index)&&(index<songs.size())) {
                return songs.get(index);
            }
            return null;
        }
    }
}
