package multi.erp.board;

import java.util.HashMap;
import java.util.List;
//mybatis의 핵심클래스를 이용해서 작성
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("boardDAO")
public class BoardDAOImpl implements BoardDAO {
	
	@Autowired
	SqlSession sqlSession;
	@Override
	public List<BoardVO> boardList() {
		return sqlSession.selectList("multi.erp.board.listall");
		//mapper에 포함한 sql문 id 등록(namespace)포함
		//select문의 결과가 여러개의 레코드를 반환하는 경우 사용
	}

	@Override
	public int insert(BoardVO board) {
		return sqlSession.insert("multi.erp.board.insert", board);
	}

	@Override
	public List<BoardVO> searchList(String search) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	//검색어별로 조회 - 동적 SQL 활용
	public List<BoardVO> searchList(String tag, String search) {
		Map<String,String> map = new HashMap<String, String>();
		map.put("tag", tag);
		map.put("search", search);
		return sqlSession.selectList("multi.erp.board.dynamicSearch",map);
	}

	@Override
	public List<BoardVO> pageList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardVO read(String board_no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(BoardVO board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String board_no) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BoardVO> categorySearch(String category) {
		
		return sqlSession.selectList("multi.erp.board.categorySearch",category);
	}
	
}
