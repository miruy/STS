package a.b.c.repository;

import java.util.List;

import a.b.c.model.BookInfoVO;

public interface AppraisalDAO {
	
	// 상세,평가 페이지에서 사용되는 기능을 모아놓은 인터페이스
	 
	public List<BookInfoVO> findAllBook();	//전체 도서 목록 
	
	
	
//	public List<Book> findAll();	//전체 도서 목록
//	public Book findById(Long id);	//도서 상세 정보 보기
//	public void save(Book book);	//도서 등록
//	public List<Book> search(String option, String keyword);	//도서 이름 또는 저자로 검색(or연산자 이용하여 쿼리문 작성 예정)
//	public Book findByIsbn(String isbn);	//일련번호로 검색(등록되어 있는 도서는 에러발생)
}
