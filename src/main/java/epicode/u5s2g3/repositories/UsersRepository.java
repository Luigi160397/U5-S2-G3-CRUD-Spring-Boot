package epicode.u5s2g3.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import epicode.u5s2g3.entities.User;

@Repository
public interface UsersRepository extends JpaRepository<User, UUID> {

}
