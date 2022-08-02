package spring.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>(); //동시성때문에 ConcurrnetHashMap를 쓰는것이 맞다.

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) { //findById를 할때
        return store.get(memberId);         //store에서 get해서 넘어온 memberId를 찾는다.
    }
}
