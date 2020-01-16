package dept;

import java.util.ArrayList;

public interface DeptDAO {
	int insert(DeptDTO user);
	int delete(String deptno);
	ArrayList<DeptDTO> deptList();
}
