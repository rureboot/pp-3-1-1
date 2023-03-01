package kata.pp312.service;

import kata.pp312.model.User;
import kata.pp312.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {


    private final UserRepository repository;

    @Autowired
    public UserServiceImp(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addOrEditUser(User user) {
        repository.save(user);
    }

    @Override
    public User findById(Long id) {


        return repository.findById(id).orElse(null);
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
