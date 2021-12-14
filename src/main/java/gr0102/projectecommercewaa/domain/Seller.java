package gr0102.projectecommercewaa.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Seller extends User{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String shopName;


}
