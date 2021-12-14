package gr0102.projectecommercewaa.repository;

import gr0102.projectecommercewaa.domain.Seller;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepo extends CrudRepository<Seller, Long> {
}
