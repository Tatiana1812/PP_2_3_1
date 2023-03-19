package web.dao;


import java.util.List;
import web.model.User;

public interface UserDao {
    List<User> getAll();
    User getUserById(Long id);
    void add(User user);
    void delete(Long id);
    void update(User user);
}
