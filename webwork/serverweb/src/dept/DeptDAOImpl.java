package dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import fw.DBUtil;

public class DeptDAOImpl implements DeptDAO {

	public DeptDAOImpl() {
	}

	public int insert(DeptDTO user) {
		System.out.println("dao");
		String sql = "insert into mydept values(?,?,?,?,?)";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, user.getDeptno());
			ptmt.setString(2, user.getDeptname());
			ptmt.setString(3, user.getLoc());
			ptmt.setString(4, user.getTel());
			ptmt.setString(5, user.getMgr());
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, ptmt, null);
		}
		return result;
	}

	public int delete(String deptno) {
		String sql = "delete from mydept where deptno=?";
		PreparedStatement ptmt = null;
		Connection con = null;
		int result =0;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, deptno);
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, ptmt,null);
		}
		return result;
	}
	
	
	
	public ArrayList<DeptDTO> deptList() {
		ArrayList<DeptDTO> deptList = new ArrayList<DeptDTO>();
		DeptDTO dept = null;
		String sql = "select * from mydept";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		boolean nullcheck = true;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();

			while (rs.next()) {
				dept = new DeptDTO(rs.getString(1), rs.getString(2),
						rs.getString(3), rs.getString(4), rs.getString(5));
				deptList.add(dept);
				nullcheck = false;
			}
			if (nullcheck) {
				System.out.println("조회된 데이터가 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, ptmt, rs);
		}
		return deptList;

	}
}
