package com.nick.Lookify.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nick.Lookify.models.Song;
import com.nick.Lookify.repositories.SongRepository;


@Service
public class SongService {

private SongRepository sRepo;
	
	public SongService(SongRepository sRepo) {
		this.sRepo = sRepo;
	}
	
	public Song getOneSong(Long id) {
		return this.sRepo.findById(id).orElse(null);
	}
	
    public List<Song> getAllSongs() {
        return this.sRepo.findAll();
    }
	
	public Song createSong(Song newSong) {
		return this.sRepo.save(newSong);
	}
	
	public Song updateSong(Song updatedSong) {
		return this.sRepo.save(updatedSong);
	}
	
	public void deleteSong(Long id) {
		this.sRepo.deleteById(id);
	}
	public List<Song> searchForSongByArtist(String artist) {
		return this.sRepo.findByArtistContaining(artist);
	}
	public List<Song> getTopTenByRating() {
		return this.sRepo.findTop10ByOrderByRatingDesc();
	}
}
