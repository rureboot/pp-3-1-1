package kata.pp311.service;



import kata.pp311.model.User;

import java.util.List;

public interface UserService {
    void addOrEditUser(User user);
    User findById(Long id);
    List<User> findAll();
    void  deleteById(Long id);
}
