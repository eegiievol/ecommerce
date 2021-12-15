package gr0102.projectecommercewaa.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class User{

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    long id;
    String name;
    String username;
    String password;

    private String lastname;
    private String email;
    private Date birthDate;
    private String phone;
    private Date registeredDate;
    private boolean isEnabled;

    public boolean isEnabled(){
        return this.isEnabled;
    }

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "USER_ROLES", joinColumns = {
            @JoinColumn(name = "USER_ID") }, inverseJoinColumns = {
            @JoinColumn(name = "ROLE_ID") })
    private Set<Role> roles;

}
