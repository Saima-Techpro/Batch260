package day27collections.real_life_examples;

import java.util.LinkedList;

public class Playlist {
    /*

    Scenario: Music Playlist Management
In a music or video streaming application, a playlist allows users to organize their favorite songs or videos.
The playlist needs to support the following operations effectively:

Add new songs or videos: Users can easily add new items to the playlist at any position (beginning, middle, or end).
Remove songs or videos: Users can remove any song or video from the playlist.
Insert songs or videos at specific positions: Users may want to reorder their playlist by inserting songs in between existing items.
Traversal: Users can go through the playlist sequentially to play the songs or videos.
Why LinkedList is Suitable:
Dynamic size: Unlike arrays, a LinkedList can grow and shrink as needed, allowing for easy addition and removal
of items without the need for resizing or shifting elements.
Efficient insertions and deletions: Adding or removing items in a LinkedList is generally more efficient (O(1) time complexity
for adding/removing at both ends) compared to a ArrayList, especially for large playlists where songs may be frequently added or removed.
This example illustrates how a LinkedList can effectively manage a playlist, allowing for dynamic and flexible
operations that enhance user experience.

    How it works:
Playlist class: Contains a LinkedList<String> to store the songs.
addSong(): Adds a song to the end of the playlist.
removeSong(): Removes a specified song from the playlist and handles cases where the song may not be found.
insertSong(): Inserts a song at a specified index, checking for valid index bounds.
displayPlaylist(): Displays the current songs in the playlist.
     */
    private LinkedList<String> songs;

    public Playlist() {
        songs = new LinkedList<>();
    }

    // Add a song to the end of the playlist
    public void addSong(String song) {
        songs.add(song);
        System.out.println("Added song: " + song);
    }

    // Remove a song from the playlist
    public void removeSong(String song) {
        if (songs.remove(song)) {
            System.out.println("Removed song: " + song);
        } else {
            System.out.println("Song not found: " + song);
        }
    }

    // Insert a song at a specific position
    public void insertSong(int index, String song) {
        if (index >= 0 && index <= songs.size()) {
            songs.add(index, song);
            System.out.println("Inserted song: " + song + " at index " + index);
        } else {
            System.out.println("Index out of bounds: " + index);
        }
    }

    // Display the current playlist
    public void displayPlaylist() {
        System.out.println("Current Playlist: " + songs);
    }

    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        // Adding songs to the playlist
        playlist.addSong("Song A");
        playlist.addSong("Song B");
        playlist.addSong("Song C");

        // Displaying the playlist
        playlist.displayPlaylist();

        // Inserting a song at a specific position
        playlist.insertSong(1, "Song D");

        // Displaying the updated playlist
        playlist.displayPlaylist();

        // Removing a song from the playlist
        playlist.removeSong("Song B");
        playlist.displayPlaylist();

        // Attempting to remove a non-existing song
        playlist.removeSong("Song X");
    }
}