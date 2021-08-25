package co.eci.edu.ieti.apirest.data;

import co.eci.edu.ieti.apirest.dto.UserDto;

import java.util.Date;

public class User {
    private String id;

    private String name;

    private String email;

    private String lastName;

    private Date created;

    public User(UserDto userDto){
        this.name=userDto.getName();
        this.email=userDto.getEmail();
        this.lastName=userDto.getLastName();
        this.created = userDto.getCreated();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
