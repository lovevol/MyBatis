package Test;

import mapper.EmployeeMapper;
import model.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: liuhao
 * Date: 2017/8/7
 * Time: 10:49
 */
public class Test {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeMapper em = sqlSession.getMapper(EmployeeMapper.class);
        //HashMap<String,Object> params = new HashMap<>();
        //params.put("state","ACTIVE");
        //params.put("id",1);
        //params.put("loginname","jack");
        //params.put("password","123456");
        //Employee employee = em.selectEmployeeById(1);
        //employee.setName("哈哈哈");
        List<Integer> idList = new ArrayList<>();
        idList.add(1);
        idList.add(2);
        idList.add(3);
        List<Employee> employees = em.selectEmployeeIn(idList);
        System.out.println(employees);
        sqlSession.commit();
        sqlSession.close();
    }
}
