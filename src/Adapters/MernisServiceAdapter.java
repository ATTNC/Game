package Adapters;

import Abstract.MemberCheckService;
import Entities.Member;
import MernisReferance.RQSKPSPublicSoap;

public class MernisServiceAdapter implements MemberCheckService {


    RQSKPSPublicSoap mernisclient = new RQSKPSPublicSoap();

    @Override
    public boolean checkIfRealMember(Member member) {


        try {
            return mernisclient.TCKimlikNoDogrula(Long.parseLong(member.getNationalityId()), member.getFirstName(), member.getLastName(), member.getDateOfBirth());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}