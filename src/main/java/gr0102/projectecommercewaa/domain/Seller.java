package gr0102.projectecommercewaa.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Seller extends User{

    private String shopName;

//    @OneToMany(mappedBy = "seller")
//    @JsonManagedReference
//    private List<Product> products;

}
