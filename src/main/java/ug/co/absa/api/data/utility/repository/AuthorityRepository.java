package ug.co.absa.api.data.utility.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ug.co.absa.api.data.utility.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
