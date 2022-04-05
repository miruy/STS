package a.b.c.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import a.b.c.HomeController;
import a.b.c.model.AppraisalVO;
import a.b.c.model.BookInfoVO;
import a.b.c.service.BookInfoService;

@Controller
@SessionAttributes("BookInfoVO")
@RequestMapping("/AppraisalPage")		
public class AppraisalController {
	//DB데이터 확인용 Debug코드
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	private BookInfoService bookInfoService;
	
	@Autowired
	public AppraisalController(BookInfoService bookInfoService) {
		this.bookInfoService = bookInfoService;
	}
	
	//모든 도서 정보 불러오기
	@GetMapping(value="/list") 
	public String findAllBook(Model model) {
		List<BookInfoVO> books = bookInfoService.findAllBook();
		
//		DB에서 불러온 데이터 확인용
//		for(BookInfoVO book : books) {
//			logger.debug("isbn:"+book.getIsbn());
//			logger.debug("Book_name:"+book.getBook_name());
//			logger.debug("Publisher:"+book.getPublisher());
//			logger.debug("Author:"+book.getAuthor());
//			//logger.debug("Produc_year:"+book.getProduc_year().toString());
//			logger.debug("Book_page:"+Integer.toString(book.getBook_page()));
//			logger.debug("Book_category:"+book.getBook_category());
//			logger.debug("Age_grade:"+book.getAge_grade());
//			logger.debug("Book_sum:"+book.getBook_sum());
//			logger.debug("Book_cover:"+book.getBook_cover());	
//		}
		model.addAttribute("books", books);
		return "/books/bookInfoList";
	}
	
	
	
	
	//도서 정보 상세보기 및 평가(코멘트)작성(Form)
	@GetMapping(value="/read/{isbn}")
	public String bookDetail(@PathVariable("isbn") String isbn, Model model) {
		BookInfoVO book = bookInfoService.bookDetail(isbn);
		
		if(book == null) {
			return "redirect:/books/bookInfoList";
		}
		model.addAttribute("book", book);
		return "books/bookDetailAndComment";
	}
	
	
	//평가(코멘트)작성(Form)
//	@GetMapping(value="/read/{isbn}")
//	public String writComment() {
//		
//	}
}

















