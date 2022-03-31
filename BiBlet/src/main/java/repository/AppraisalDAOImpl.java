package repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import model.BookInfoVO;

public class AppraisalDAOImpl {
	
	// 상세,평가 페이지에서 사용되는 기능을 모아놓은 인터페이스를 구현한 클래스
	
	private SqlSessionTemplate sqlSessionTemplate;
	
	public AppraisalDAOImpl(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	public List<BookInfoVO> findAllBook(){
		return sqlSessionTemplate.selectList("findAllBook");
	}
	
	
	
	
	
	
//private SqlSessionTemplate sqlSessionTemplate;
//	
//	public BookDaoImpl(SqlSessionTemplate sqlSessionTemplate) {
//		this.sqlSessionTemplate = sqlSessionTemplate;
//	}
//	
//	//도서 전체 목록
//	@Override
//	public List<Book> findAll(){
//		return sqlSessionTemplate.selectList("findAll");
//	}
}
