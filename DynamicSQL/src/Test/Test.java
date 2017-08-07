package Test;

import mapper.EmployeeMapper;
import model.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
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
        HashMap<String,Object> params = new HashMap<>();
        //params.put("id",1);
        List<Employee> employees = em.selectEmployeeByIdLike(params);
        System.out.println(employees);
        sqlSession.commit();
        sqlSession.close();
    }
}
