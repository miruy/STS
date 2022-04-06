package a.b.c.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import a.b.c.model.AppraisalVO;
import a.b.c.model.BookInfoVO;
import a.b.c.model.MemberVO;
import a.b.c.repository.AppraisalDAO;

@Service
public class AppraisalServiceImpl implements AppraisalService {

	private AppraisalDAO appraisalDAO;
	
	// appraisalDAOsetter
	@Autowired
	public void setAppraisalDAO(AppraisalDAO appraisalDAO) {
		this.appraisalDAO = appraisalDAO;
	}

	// 도서 전체 목록
	@Override
	public List<BookInfoVO> findAllBook() {
		return appraisalDAO.findAllBook();
	}

	// 도서 상세보기
	@Override
	public BookInfoVO bookDetail(String isbn) {
		return appraisalDAO.bookDetail(isbn);
	}

	//평가(코멘트) 작성
	@Override
	public void writeComment(AppraisalVO appraisal) {
		appraisalDAO.writeComment(appraisal);
	}
	
	
	//회원(한명) 정보 보기 
	@Override
	public MemberVO memberInfo(Long mem_num) {
		return appraisalDAO.memberInfo(mem_num);
	}
}







