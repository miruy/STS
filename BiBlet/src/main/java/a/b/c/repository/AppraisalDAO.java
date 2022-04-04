package a.b.c.repository;

import java.util.List;

import a.b.c.model.BookInfoVO;

public interface AppraisalDAO {
	
	// 상세,평가 페이지에서 사용되는 기능을 모아놓은 인터페이스
	
	public abstract List<BookInfoVO> findAllBook();	//전체 도서 목록 
	
	
}
