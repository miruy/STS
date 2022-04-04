package a.b.c.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import a.b.c.HomeController;
import a.b.c.model.BookInfoVO;
import a.b.c.service.BookInfoService;

@Controller
@SessionAttributes("BookInfoVO")
@RequestMapping("/AppraisalPage")		//도서 정보와 코멘트 창이 같이 있으므로 상세페이지로 통일
public class AppraisalController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	private BookInfoService bookInfoService;
	
	@Autowired
	public AppraisalController(BookInfoService bookInfoService) {
		this.bookInfoService = bookInfoService;
	}
	
	//모든 도서 정보 불러오기
	@RequestMapping(value="/list") 
	public String findAllBook(Model model) {
		List<BookInfoVO> books = bookInfoService.findAllBook();
		
		for(BookInfoVO book : books) {
			logger.debug("isbn:"+book.getIsbn());
			logger.debug("Book_name:"+book.getBook_name());
			logger.debug("Publisher:"+book.getPublisher());
			logger.debug("Author:"+book.getAuthor());
			//logger.debug("Produc_year:"+book.getProduc_year().toString());
			logger.debug("Book_page:"+Integer.toString(book.getBook_page()));
			logger.debug("Book_category:"+book.getBook_category());
			logger.debug("Age_grade:"+book.getAge_grade());
			logger.debug("Book_sum:"+book.getBook_sum());
			logger.debug("Book_cover:"+book.getBook_cover());
			
			
		}
		
		model.addAttribute("books", books);
//		System.out.println(books.get(2).getIsbn());
		return "/books/bookInfoList";
	}
}
