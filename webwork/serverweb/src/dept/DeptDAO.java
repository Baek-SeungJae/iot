package dept;

import java.util.ArrayList;

public interface DeptDAO {
	int insert(DeptDTO user);
	int delete(String deptno);
	public DeptDTO readDept(String DeptNo);
	ArrayList<DeptDTO> deptList();
}
