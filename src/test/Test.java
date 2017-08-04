package test;

import model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: liuhao
 * Date: 2017/8/4
 * Time: 14:44
 */
public class Test {
    public static void main(String[] args) {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new  SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            //User user = new User("lh","123456",21);
            //sqlSession.insert("mapper.UserMapper.save",user);
            int id = 1;
            //User user = sqlSession.selectOne("mapper.UserMapper.selectUserById",id);
            //user.setUserName("刘豪");
            //sqlSession.update("mapper.UserMapper.updateUserById",user);
            //sqlSession.delete("mapper.UserMapper.deleteUserById",id);
            List<Map<String,Object>> list = sqlSession.selectList("mapper.UserMapper.selectUserAsMap");
           for (Map<String,Object> row: list){
                System.out.print(row);
           }
            sqlSession.commit();
            sqlSession.close();
            //System.out.println(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
