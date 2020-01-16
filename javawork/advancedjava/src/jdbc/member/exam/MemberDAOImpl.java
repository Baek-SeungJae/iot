package jdbc.member.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAOImpl implements MemberDAO{
	
	public MemberDAOImpl(){}
	
	
	public int insert(MemberDTO user) {
		String sql = "insert into member values(?,?,?,?,?,sysdate,1000)";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, user.getId());
			ptmt.setString(2, user.getPass());
			ptmt.setString(3, user.getName());
			ptmt.setString(4, user.getAddr());
			ptmt.setString(5, user.getDeptno());
			result = ptmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, ptmt, null);
		}
		return result;
	}
	
	public int update(String id, String addr) {
		
		String sql = "update member set addr=? where id=?";
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
		String sql = "delete from member where id=?";
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
	
	public ArrayList<MemberDTO> memberList() {
		ArrayList<MemberDTO> memberList = new ArrayList<MemberDTO>();
		MemberDTO member = null;
		String sql = "select * from member";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		boolean nullcheck = true;
		try {
			con = DBUtil.getConnect();
			ptmt =  con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			
			while(rs.next()) {
				member = new MemberDTO(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDate(6),rs.getInt(7));
				memberList.add(member);
				nullcheck = false;
			}
			if(nullcheck)
			{
				System.out.println("조회된 데이터가 없습니다.");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, ptmt, rs);
		}
		return memberList;
	}
	
	public ArrayList<MemberDTO> findByAddr(String addr) {
		ArrayList<MemberDTO> memberList = new ArrayList<MemberDTO>();
		MemberDTO member = null;
		String sql = "select * from member where addr like ?";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		boolean nullcheck = true;
		try {
			con = DBUtil.getConnect();
			ptmt =  con.prepareStatement(sql);
			ptmt.setString(1,"%"+addr+"%");
			rs = ptmt.executeQuery();
			
			while(rs.next()) {
				member = new MemberDTO(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDate(6),rs.getInt(7));
				memberList.add(member);
				nullcheck = false;
			}
			if(nullcheck)
			{
				System.out.println("조회된 데이터가 없습니다.");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, ptmt, rs);
		}
		return memberList;
	}
	
	public MemberDTO login(String id, String pass)
	{
		MemberDTO member = null;
		String sql = "select * from member where id=? AND pass =?";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			ptmt =  con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setString(2, pass);
			rs = ptmt.executeQuery();
			
			if(rs.next()) {
				member = new MemberDTO(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)+rs.getDate(6)+rs.getInt(7));
				System.out.println("로그인 성공");
			}
			else
			{
				System.out.println("로그인 실패");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, ptmt, rs);
		}
		return member;
	}
	
}
