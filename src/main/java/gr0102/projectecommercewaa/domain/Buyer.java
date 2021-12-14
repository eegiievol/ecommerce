package gr0102.projectecommercewaa.domain;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
public class Buyer extends User{

//    @OneToMany(mappedBy = "buyer")
//    @JsonManagedReference
//    private List<Orders> orders;

}
