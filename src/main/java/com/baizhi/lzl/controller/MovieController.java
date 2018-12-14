package com.baizhi.lzl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import com.baizhi.lzl.dto.MoviePageDto;
import com.baizhi.lzl.entity.Category;
import com.baizhi.lzl.entity.Movie;
import com.baizhi.lzl.service.MovieService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {
	@Autowired
	private MovieService movieService;
	@RequestMapping("show")
	public MoviePageDto queryByPage(Integer page,Integer rows){
		
		return movieService.queryByPage(page, rows);
	} 
	@RequestMapping("query")
	public Movie query(Integer tid) {
		return movieService.query(tid);
	}
	@RequestMapping("update")
	public void update(Movie m) {
		movieService.update(m);
	}
	@RequestMapping("getCategorys")
	public List<Category> getCategorys() {
		return movieService.getCategorys();
	}
}
