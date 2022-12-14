import Abstract.BaseSaleManager;
import Abstract.MemberCheckService;
import Adapters.MernisServiceAdapter;
import Concretes.CampaignManager;
import Concretes.HandSaleManager;
import Concretes.OnlineSaleManager;
import Entities.Campaign;
import Entities.Member;
import Entities.Sale;

public class Main {


    public static void main(String[] args) {

        MernisServiceAdapter mernisServiceAdapter = new MernisServiceAdapter();
        Member member = new Member();
        member.setFirstName("Abdullah");
        member.setLastName("Tütüncü");
        member.setNationalityId("Enter your Nationality Number ");
        member.setDateOfBirth(1999);

        BaseSaleManager baseSaleManager = new OnlineSaleManager(mernisServiceAdapter);
        baseSaleManager.sale(member);
        baseSaleManager.saleWithCampaign(member, new Campaign(1, "OnlineSaleCampaign"));


    }
}