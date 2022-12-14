package Concretes;

import Abstract.MemberCheckService;
import Entities.Member;

public class MemberCheckManager implements MemberCheckService {


    @Override
    public boolean checkIfRealMember(Member member) {


        return true;
    }
}
