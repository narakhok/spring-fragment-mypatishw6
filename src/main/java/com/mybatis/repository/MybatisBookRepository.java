package com.mybatis.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.mybatis.model.Book;

@Repository
public interface MybatisBookRepository {
	// id,titlepublishDate,author,page,coverImage
	@Select("SELECT id,title,publishDate,author,page,coverImage from tbbook ")
	public List<Book> findAll();

	@Select("SELECT id,title,publishDate,author,page,coverImage from tbbook WHERE id =#{id}")
	public Book findById(Integer id);

	@Insert("INSERT INTO tbbook(id,title,publishDate,author,page,coverImage)values(#{id},#{title},#{publishDate},#{author},#{page},#{coverImage}) ")
	public boolean save(Book book);

	@Delete("DELETE FROM tbbook where id=#{id}")
	public boolean remove(Integer id);

	@Update("update tbbook set id=#{id},title=#{title},publishDate=#{publishDate},author=#{author},page=#{page},coverImage=#{coverImage} WHERE id=#{id} ")
	public boolean update(Book book);
}
