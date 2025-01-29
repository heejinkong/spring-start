package jpabook.jpashop.service;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true) // 데이터 변경과 관련된 것은 트랜잭션 안에서
@RequiredArgsConstructor
public class MemberService {

    private final MemberRespository memberRespository;

    //회원 가입
    @Transactional
    public Long join(Member member) {
        validateDuplicateMember(member); // 중복회원 검증
        memberRespository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        List<Member> findMembers = memberRespository.findByName(member.getName());
        if(!findMembers.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }

    }

    //회원 전체 조회
    public List<Member> findMembers() {
        return memberRespository.findAll();
    }

    public Member findOne(Long memberId) {
        return memberRespository.findOne(memberId);
    }
}

