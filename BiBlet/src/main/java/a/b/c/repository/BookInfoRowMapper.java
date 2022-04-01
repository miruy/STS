package a.b.c.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import a.b.c.model.BookInfoVO;

public class BookInfoRowMapper implements RowMapper<BookInfoVO>{
	public BookInfoVO mapRow(ResultSet rs, int rowNum) throws SQLException{
		BookInfoVO bookInfo = new BookInfoVO(
								rs.getString("BOOK_NAME"),
								rs.getString("PUBLISHER"),
								rs.getString("AUTHOR"),
								rs.getDate("PRODUC_YEAR"),
								rs.getInt("BOOK_PAGE"),
								rs.getString("BOOK_CATEGORY"),
								rs.getString("AGE_GRADE"),
								rs.getString("BOOK_SUM"),
								rs.getString("BOOK_COVER"));
		bookInfo.setIsbn(rs.getString("ISBN"));
		return bookInfo;
	}
}
