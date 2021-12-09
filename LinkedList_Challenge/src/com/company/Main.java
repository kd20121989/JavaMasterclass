package com.company;

import java.util.*;

public class Main {

    private static List<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer",4.6);
        album.addSong("Love don't mean a thing",4.22);
        album.addSong("Holy man",4.3);
        album.addSong("Hold on",5.6);
        album.addSong("Lady double dealer",3.21);
        album.addSong("You can't do it right",6.23);
        album.addSong("High ball shooter",4.27);
        album.addSong("The gypsy",4.2);
        album.addSong("Soldier of fortune",3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock",5.44);
        album.addSong("I put the finger on you",3.25);
        album.addSong("Lets go",3.45);
        album.addSong("Inject the venom",3.33);
        album.addSong("Snowballed",4.51);
        album.addSong("Evil walks",3.45);
        album.addSong("C.O.D.",5.25);
        album.addSong("Breaking the rules",5.32);
        album.addSong("Night of the long knives",5.12);
        albums.add(album);

        List<Song> playList = new ArrayList<>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList); // Does not exist
        albums.get(0).addToPlayList(9,playList);
        albums.get(1).addToPlayList(8,playList);
        albums.get(1).addToPlayList(3,playList);
        albums.get(1).addToPlayList(2,playList);
        albums.get(1).addToPlayList(24,playList); // Does not exist

        play(playList);
    }

    private static void play(List<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing "+listIterator.next().toString());
        }
        printMenu();

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Turning player off.");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing "+listIterator.next().toString());
                    } else {
                        System.out.println("End of playlist reached");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing "+listIterator.previous().toString());
                    } else {
                        System.out.println("Beginning of playlist reached");
                        goingForward = false;
                    }
                    break;
                case 3:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now playing "+listIterator.previous().toString());
                            goingForward = false;
                        } else {
                            System.out.println("Beginning of playlist reached");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing "+listIterator.next().toString());
                            goingForward = true;
                        } else {
                            System.out.println("End of playlist reached");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    if (1<playList.size()) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().toString());
                            goingForward = true;
                        } else {
                            if (listIterator.hasPrevious()) {
                                System.out.println("Now playing " + listIterator.previous().toString());
                                goingForward = false;
                            }
                        }
                    } else {
                        System.out.println("Last song deleted from playlist\n" +
                                "Closing player.");
                        quit=true;
                        return;
                    }
                    break;
                case 6:
                    printMenu();
                    break;
            }
        }

    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n"+
                "1 - forward to next song\n"+
                "2 - back to previous song\n"+
                "3 - replay current song\n"+
                "4 - display songs in playlist\n"+
                "5 - remove playing song from playlist\n"+
                "6 - print menu options");
    }

    private static void printList(List<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("______________________________");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("______________________________");
    }
}