package Abstract;

import Entities.Campaign;
import Entities.Member;

public abstract class BaseSaleManager implements SaleService {

    @Override
    public void sale(Member member) {

        System.out.println("Customer purchase the game" + member.getFirstName() + " " + member.getLastName());


    }

    @Override
    public void saleWithCampaign(Member member, Campaign campaign) {

    }
}



