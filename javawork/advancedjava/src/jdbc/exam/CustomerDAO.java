package jdbc.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDAO {
	public CustomerDAO() {}
	
	public int insert(CustomerDTO customer) {
		String sql = "insert into customer values(?,?,?,to_char(sysdate,'YYYY/MM/DD'),?,?)";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, customer.getId());
			ptmt.setString(2, customer.getPass());
			ptmt.setString(3, customer.getName());
			ptmt.setInt(4, customer.getPoint());
			ptmt.setString(5, customer.getAddr());
			result = ptmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, ptmt, null);
		}
		return result;
	}
	
	public int update(String id, String addr) {
		String sql = "update customer set addr=? where id=?";
		PreparedStatement ptmt = null;
		Connection con = null;
		int result = 0;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, addr);
			ptmt.setString(2, id);
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, ptmt,null);
		}
		return result;
	}
	
	public int delete(String id) {
		String sql = "delete from customer where id=?";
		PreparedStatement ptmt = null;
		Connection con = null;
		int result =0;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, ptmt,null);
		}
		return result;
	}
}
