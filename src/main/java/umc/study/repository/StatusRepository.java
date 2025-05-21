package umc.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.study.domain.mapping.MemberMission;

public interface StatusRepository extends JpaRepository<MemberMission, Long> {
}