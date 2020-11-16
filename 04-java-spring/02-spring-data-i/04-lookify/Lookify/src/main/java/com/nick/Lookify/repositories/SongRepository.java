package com.nick.Lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nick.Lookify.models.Song;

public interface SongRepository extends CrudRepository<Song, Long> {

	//List of All songs in "songs"
	List<Song>findAll();
	//Search for Song by title 
	List<Song>findByTitleContaining(String search);
	//Search for Song by Artist
	List<Song> findByArtistContaining(String artist);
    //find top 10 by rating
    List<Song> findTop10ByOrderByRatingDesc();
}
