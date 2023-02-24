package kata.pp312.dao;



import kata.pp312.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User,Long > {


}
