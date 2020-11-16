package com.nick.Lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nick.Lookify.models.Song;
import com.nick.Lookify.services.SongService;

@Controller
public class SongController {

private SongService sService;
	
	public SongController(SongService sService) {
		this.sService = sService;
	}
	@GetMapping("/")
	public String lookifyHome() {
		return "homePage.jsp";
	}
	
	@GetMapping("/dashboard")
	public String index(Model model, @ModelAttribute("song") Song song) {
		List<Song> songs = sService.getAllSongs();
		model.addAttribute("allSongs", songs);
		return "index.jsp";
	}
	@GetMapping("/search/topTen")
	public String topTen(Model model) {
		List<Song> topTen = sService.getTopTenByRating();
		model.addAttribute("topTen", topTen);
		return "topTen.jsp";
	}
	
	@GetMapping("/search/songs")
	public String Search(@RequestParam("artist") String artist, Model model) {
		List<Song> song = sService.searchForSongByArtist(artist);
		model.addAttribute("artist", artist);
		model.addAttribute("songsByArtist", song);
		return "artistSongs.jsp";
	}
	
	@GetMapping("/song/new")
	public String createSongPage(@ModelAttribute("song") Song song, Model model) {
		return "newSong.jsp";
	}
	@PostMapping("/song/new")
	public String createSongPage(@Valid @ModelAttribute("song") Song song, BindingResult result) {
		if (result.hasErrors()) {
			return "newSong.jsp";
		}
		else {
			sService.createSong(song);
			return "redirect:/dashboard";
		}
	}
	@GetMapping("/song/{id}")
	public String showSong(Model model, @PathVariable("id") Long id) {
		Song song = sService.getOneSong(id);
		model.addAttribute("song", song);
		return "showSong.jsp";
	}
	
    @GetMapping("/song/delete/{id}")
    public String deleteSong(@PathVariable("id") Long id) {
    	this.sService.deleteSong(id);
    	return "redirect:/dashboard";
    }
    
}
