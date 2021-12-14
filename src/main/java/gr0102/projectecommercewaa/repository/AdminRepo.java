package gr0102.projectecommercewaa.repository;

import gr0102.projectecommercewaa.domain.Admin;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends CrudRepository<Admin, Long> {

    void deleteAdminById(long id);
    Admin getAdminById(long id);
}
