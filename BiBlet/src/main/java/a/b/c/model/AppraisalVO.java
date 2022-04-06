package a.b.c.model;

public class AppraisalVO {
			
			private Long mem_num;	//회원 번호(PK,FK)
			private String isbn;	//도서 일련번호(PK,FK)
			private String star;	//별점
			private String book_comment;	//코멘트(평가)
			private String start_date;	//도서 구독 시작 날짜
			private String end_date;	//도서 구독 완료 날짜
			private String co_prv;	//코멘트 공개 여부
			 
			public AppraisalVO(){}
			
			public AppraisalVO(Long mem_num, String isbn, String star, String book_comment, 
					String start_dater, String end_date, String co_prv) {
				this.mem_num = mem_num;
				this.isbn = isbn;
				this.star = star;
				this.book_comment = book_comment;
				this.start_date = start_dater;
				this.end_date = end_date;
				this.co_prv = co_prv;
			}

			public Long getMem_num() {
				return mem_num;
			}

			public void setMem_num(Long mem_num) {
				this.mem_num = mem_num;
			}

			public String getIsbn() {
				return isbn;
			}

			public void setIsbn(String isbn) {
				this.isbn = isbn;
			}

			public String getStar() {
				return star;
			}

			public void setStar(String star) {
				this.star = star;
			}

			public String getBook_comment() {
				return book_comment;
			}

			public void setBook_comment(String book_comment) {
				this.book_comment = book_comment;
			}

			public String getStart_date() {
				return start_date;
			}

			public void setStart_date(String start_date) {
				this.start_date = start_date;
			}

			public String getEnd_date() {
				return end_date;
			}

			public void setEnd_date(String end_date) {
				this.end_date = end_date;
			}

			public String getCo_prv() {
				return co_prv;
			}

			public void setCo_prv(String co_prv) {
				this.co_prv = co_prv;
			}
			
}
