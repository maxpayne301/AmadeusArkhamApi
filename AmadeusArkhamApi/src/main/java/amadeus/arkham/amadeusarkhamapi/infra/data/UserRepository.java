package amadeus.arkham.amadeusarkhamapi.infra.data;

import amadeus.arkham.amadeusarkhamapi.domain.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Procedure
    void insertUser(@Param("username") String username, @Param("email") String email, @Param("password") String password);

    boolean existsByEmail(String email);
    boolean existsByUsername(String username);
    User findByUsername(String username);
}

