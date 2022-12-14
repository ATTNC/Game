package Concretes;

import Abstract.BaseSaleManager;
import Abstract.MemberCheckService;
import Abstract.SaleService;
import Adapters.MernisServiceAdapter;
import Entities.Campaign;
import Entities.Member;

public class OnlineSaleManager extends BaseSaleManager implements SaleService {


    private MemberCheckService memberCheckService;

    public OnlineSaleManager(MemberCheckService memberCheckService) {
        this.memberCheckService = memberCheckService;
    }

    @Override
    public void sale(Member member) {

        System.out.println("customer purchase the game online " + member.getFirstName() + " " + member.getLastName());

    }

    @Override
    public void saleWithCampaign(Member member, Campaign campaign) {

        if (memberCheckService.checkIfRealMember(member)) {
            super.saleWithCampaign(member, campaign);
            System.out.println("Confirmed member ***Mernis Check***");
            System.out.println("Purchased at 5% off. " + " Campaign Code: #1 " + campaign.getName() + " Customer name: " + member.getFirstName() + " " + member.getLastName());
        } else {
            System.out.println("Not a valid member. Campaign not available ");
        }


    }
}
