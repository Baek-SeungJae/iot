package dept;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DeptDAOImpl {
	@Autowired
	JdbcTemplate mytemplate;
	public int count() {
		return mytemplate.queryForObject("select count(*) from dept",Integer.class);
	}
	
	public int insert(String deptno, String deptname) {
		String sql = "insert into dept(deptno, deptname) values(?,?)";
		return mytemplate.update(sql, deptno, deptname);
	}
	
	public int update(String deptno, String deptname) {
		String sql = "update dept set deptname=? where deptno=?";
		return mytemplate.update(sql, deptname, deptno);
	}
	public List<DeptDTO> selectAll(){
		return mytemplate.query("select deptno,deptname from dept", new MyDeptRowMapper());
	}
}
