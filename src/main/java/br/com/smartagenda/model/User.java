package br.com.smartagenda.model;

import br.com.smartagenda.PasswordEncoder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Entity
public class User extends AbstractEntity{
    static PasswordEncoder passwordEncoder;
    @NotEmpty
    @Column(unique = true)
    private String username;
    @NotEmpty
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;//passwordEncoder.encoder(password);
    }
}