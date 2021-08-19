package co.eci.edu.ieti.apirest.service.impl;

import co.eci.edu.ieti.apirest.data.User;
import co.eci.edu.ieti.apirest.service.UserService;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class UserServiceImpl implements UserService {
    private final HashMap<String, String> hashMap = new HashMap<String,String>();

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User findById(String id) {
        return null;
    }

    @Override
    public List<User> all() {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public User update(User user, String userId) {
        return null;
    }
}
