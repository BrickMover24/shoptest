package com.ltg.shop.service.impl;


import com.ltg.shop.entity.Shop;
import com.ltg.shop.service.CountPrice;

/**
 * 付款实现
 * @author ltg
 * @date 2023.03.09
 */
public class CountPriceImpl implements CountPrice {

    /**
     * 苹果和草莓的总价格。
     * @param appleSize
     * @param strawberrySize
     * @return
     */
    @Override
    public Double twoFruitsPrice(Integer appleSize, Integer strawberrySize) {
        return threeFruitsPrice(appleSize,strawberrySize,0);
    }

    /**
     * 苹果草莓和芒果的总价格。
     * @param appleSize
     * @param strawberrySize
     * @param mangoSize
     * @return
     */
    @Override
    public Double threeFruitsPrice(Integer appleSize, Integer strawberrySize, Integer mangoSize) {
        return discountFruitsPrice(appleSize,strawberrySize,mangoSize,0.0);
    }

    /**
     * 草莓八折后的总价格
     * @param appleSize
     * @param strawberrySize
     * @param mangoSize
     * @param discount 草莓打 discount 折
     * @return
     */
    @Override
    public Double discountFruitsPrice(Integer appleSize, Integer strawberrySize, Integer mangoSize,Double discount) {
        Shop shop = new Shop();
        Double applePrice = appleSize * shop.getApplePrice();
        Double mangoPrice = mangoSize * shop.getMangoPrice();
        double strawberryPrice=0;
        if (discount>0){
            strawberryPrice = strawberrySize * shop.getStrawberryPrice()*discount /  10;
        }else {
            strawberryPrice = strawberrySize * shop.getStrawberryPrice();
        }
        return applePrice+strawberryPrice+ mangoPrice;
    }

    /**
     * 满减优惠。
     * @param appleSize
     * @param strawberrySize
     * @param mangoSize
     * @param top 满 top 元。
     * @param discount 优惠 discount 元。
     * @return
     */
    @Override
    public Double discountFruitsPrice2(Integer appleSize, Integer strawberrySize, Integer mangoSize, Integer top, Integer discount) {
        Double sum = threeFruitsPrice(appleSize, strawberrySize, mangoSize);
        if (sum >= top) {
            Double multiple = sum / 100;
            sum = sum - multiple.intValue() * discount;
        }
        return sum;
    }
}
