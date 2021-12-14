package gr0102.projectecommercewaa.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
abstract class User extends Role{
    enum UserStatus
    {
        REGISTERED, APPROVED, DISABLED;
    }


    private String name;
    private String fName;
    private String lName;
    private String email;
    private String password;
    private Date birthDate;
    private String phone;
    private UserStatus status;
    private Date registeredDate;
}
