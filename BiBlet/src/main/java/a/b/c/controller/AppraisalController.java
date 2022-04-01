package a.b.c.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import a.b.c.model.BookInfoVO;
import a.b.c.service.BookInfoService;

@Controller
//@SessionAttributes("BookInfoVO")
@RequestMapping("/AppraisalPage")		//도서 정보와 코멘트 창이 같이 있으므로 상세페이지로 통일
public class AppraisalController {
	
	private BookInfoService bookInfoService;
	
	@Autowired
	public AppraisalController(BookInfoService bookInfoService) {
		this.bookInfoService = bookInfoService;
	}
	
	//모든 도서 정보 불러오기
	@GetMapping("/list") 
	public String findAllBook(Model model) {
		List<BookInfoVO> books = bookInfoService.findAllBook();
		
		model.addAttribute("books", books);
		return "books/book_list";
	}
}
