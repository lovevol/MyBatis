package mapper;

import model.User;

public interface UserMapper {
    /**
     * 按照id选择用户
     * @param id 用户id
     * @return User
     */
    User selectUserById(int id);
}
