package co.eci.edu.ieti.apirest.service.impl;

import co.eci.edu.ieti.apirest.data.User;
import co.eci.edu.ieti.apirest.service.UserService;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class UserServiceHashMap implements UserService {
    private final HashMap<String, User> hashMap = new HashMap<String, User>();

    @Override
    public User create(User user) {
        hashMap.put(user.getId(), user);
        return user;
    }

    @Override
    public User findById(String id) {
        return hashMap.get(id);
    }

    @Override
    public List<User> all() {
        List<User> response = new ArrayList<>();
        for (String key : hashMap.keySet()) {
            response.add(hashMap.get(key));
        }
        return response;
    }

    @Override
    public void deleteById(String id) {
        hashMap.remove(id);
    }

    @Override
    public User update(User user, String userId) {
        hashMap.put(userId,user);
        return user;
    }
}
