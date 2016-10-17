package com.treehouse.model;

import java.util.ArrayList;
import java.util.List;

public class SongBook {
	private List<Song> songs;

	public SongBook() {
		super();
		this.songs = new ArrayList<Song>();
	}

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
	
	// methods
	// user can add songs to SongBook collection
	public void addSong(Song song) {
		this.songs.add(song);
	}
	
	// get size of SongBook collection
	public int getCountSongBook() {
		return this.songs.size();
	}
}
