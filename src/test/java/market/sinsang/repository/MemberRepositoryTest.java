package market.sinsang.repository;

import market.sinsang.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest
@Transactional
@Rollback(value = false)
public class MemberRepositoryTest {
    @Autowired MemberRepository memberRepository;

    @Test
    public void testMember() {
        Member member = new Member();
        member.setName("memberA");
        Long saveId = memberRepository.save(member);

        Member findMember = memberRepository.findOne(saveId);

        Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
    }
}