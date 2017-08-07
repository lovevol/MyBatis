package mapper;

import model.Employee;

import java.util.HashMap;
import java.util.List;

public interface EmployeeMapper {
    /**
     * 条件查询
     * @param params 参数(可传递id，也可不传递)
     * @return employees
     */
    List<Employee> selectEmployeeByIdLike(HashMap<String,Object> params);
}
