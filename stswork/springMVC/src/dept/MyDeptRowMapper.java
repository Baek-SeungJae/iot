package dept;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

//조회한 레코드를 어떤 객체로 변환해야 하는지를 구현
/*
 * while(rs.next()){
 *	//----------------------------------------------------------
 * 	DTO dto = newDTO(rs.getString(1),.....);
 *  //----------------------------------------------------------
 * 	list.add(dto)
*/
public class MyDeptRowMapper implements RowMapper<DeptDTO>{
	@Override
	public DeptDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		System.out.println("mapRow=>"+rowNum);
		DeptDTO dept = new DeptDTO(rs.getString(1),rs.getString(2));
		return dept;
	}
}
