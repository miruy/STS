package a.b.c.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import a.b.c.model.BookInfoVO;
import a.b.c.repository.AppraisalDAO;

@Service
public class BookInfoServiceImpl implements BookInfoService{
	
	private AppraisalDAO appraisalDAO;

	//appraisalDAOsetter만들기
	@Autowired
	public void setAppraisalDAO(AppraisalDAO appraisalDAO) {
		this.appraisalDAO = appraisalDAO;
	}
	
	@Override
	public List<BookInfoVO> findAllBook() {
		return appraisalDAO.findAllBook();
	}
}
