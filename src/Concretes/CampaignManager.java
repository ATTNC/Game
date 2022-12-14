package Concretes;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {


    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println("campaign added.");
    }

    @Override
    public void deleteCampaign(Campaign campaign) {
        System.out.println("campaign deleted.");
    }

    @Override
    public void updateCampaign(Campaign campaign) {
        System.out.println("campaign updated.");
    }
}
