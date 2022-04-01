package a.b.c.service;

import java.util.List;

import a.b.c.model.BookInfoVO;

public interface BookInfoService {
	public abstract List<BookInfoVO> findAllBook();
	
}
