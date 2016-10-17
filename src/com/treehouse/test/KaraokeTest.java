package com.treehouse.test;

import java.util.HashSet;
import java.util.Set;

import com.treehouse.model.Song;
import com.treehouse.model.SongBook;

public class KaraokeTest {

	public static void main(String[] args) {
		Song song = new Song(
				"Michael Jackson",
				"Beat It",
				"https://www.youtube.com/watch?v=pvdrN3GJFZo&list=RDpvdrN3GJFZo"
				); 
		
		SongBook songBook = new SongBook();
		System.out.printf("Adding %s %n", song);
		songBook.addSong(song);
		System.out.printf("SongBook collection total: %d", 
				songBook.getCountSongBook());
		

	}

}
