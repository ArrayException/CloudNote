package com.aiuiot.cloud_note.service;

import java.util.List;

import com.aiuiot.cloud_note.entity.Book;
import com.aiuiot.cloud_note.util.NoteResult;

public interface BookService {
	public NoteResult<List<Book>> LoadUserBooks(String userId);
	
	public NoteResult<Object> addBook(String userId,String bookName);	//新增笔记本
}