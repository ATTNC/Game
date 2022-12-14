package Concretes;

import Abstract.BaseSaleManager;
import Abstract.SaleService;
import Entities.Member;

public class HandSaleManager extends BaseSaleManager implements SaleService {


    @Override
    public void sale(Member member) {

        System.out.println("customer purchase the game by hand " + member.getFirstName() + " " + member.getLastName());

    }
}
