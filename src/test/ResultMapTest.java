package test;

import model.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: liuhao
 * Date: 2017/8/4
 * Time: 17:11
 */
public class ResultMapTest {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Student> studentList = sqlSession.selectList("mapper.UserMapper.selectStudent");
        for (Student s:studentList){
            System.out.println(s);
        }
        List<model.Class> classes = sqlSession.selectList("mapper.UserMapper.selectClass");
        for (model.Class c:classes){
            System.out.println(c);
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
