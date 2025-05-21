package umc.study.repository.StoreRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import umc.study.domain.Store;

import java.util.Optional;

public interface StoreRepository extends JpaRepository<Store, Long>, StoreRepositoryCustom {
    Optional<Store> findByName(String name);
}