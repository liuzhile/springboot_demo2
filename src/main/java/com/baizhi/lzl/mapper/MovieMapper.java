package com.baizhi.lzl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baizhi.lzl.entity.Category;
import com.baizhi.lzl.entity.Movie;

public interface MovieMapper {
	
	public List<Movie> queryByPage(@Param("curPage") Integer curPage, @Param("pageSize") Integer pageSize);
	public Integer getTotalRows();
	public Movie query(Integer id);
	public void update(Movie m);
	public List<Category> getCategorys();
	
}
