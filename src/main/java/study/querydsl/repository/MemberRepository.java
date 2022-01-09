package study.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import study.querydsl.dto.MemberSearchCondition;
import study.querydsl.dto.MemberTeamDto;
import study.querydsl.entity.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom, QuerydslPredicateExecutor {
    // select m from Member m where m.username / findBy~ 와 매칭되어 만들어준다
    List<Member> findByUsername(String username);

    @Override
    List<MemberTeamDto> search(MemberSearchCondition condition);
}
