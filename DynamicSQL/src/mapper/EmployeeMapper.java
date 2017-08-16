package mapper;

import model.Employee;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.List;

public interface EmployeeMapper {
    /**
     * 条件查询
     * @param params 参数(可传递id，也可不传递)
     * @return employees
     */
    List<Employee> selectEmployeeByIdLike(HashMap<String,Object> params);
    List<Employee> selectEmployeeChoose(HashMap<String,Object> params);
    List<Employee> selectEmployeeLike(HashMap<String,Object> params);
    Employee selectEmployeeById(int id);
    void updateEmployeeIfNessary(Employee employee);

    /**
     * 查询id在list中的Employee
     * @param list 存放id的表
     * @return 保存Employee的表
     */
    List<Employee> selectEmployeeIn(List<Integer> list);
}
