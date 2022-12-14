package Abstract;

import Entities.Campaign;
import Entities.Member;

public interface SaleService {

    void sale(Member member);

    void saleWithCampaign(Member member, Campaign campaign);
}
