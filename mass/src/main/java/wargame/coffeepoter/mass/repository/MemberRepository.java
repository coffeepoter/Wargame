package wargame.coffeepoter.mass.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wargame.coffeepoter.mass.domain.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
