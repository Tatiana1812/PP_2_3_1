package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;
@Service
@Transactional
public class UserServiceImp implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> getAll(){
        return userDao.getAll();
    }
    @Override
    public void add(User user){userDao.add(user);}
    @Override
    public void delete(Long id){userDao.delete(id);}
    @Override
    public User getUserById(Long id){return userDao.getUserById(id);}
    @Override
    public void update(User user){userDao.update(user);}
}