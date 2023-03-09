package com.ltg.shop.service;

/**
 * 付款方案
 * @author ltg
 * @date 2023.03.09
 */
public interface CountPrice {

    /**
     * 苹果和草莓的总价格。
     * @param appleSize
     * @param strawberrySize
     * @return
     */
    Double twoFruitsPrice(Integer appleSize, Integer strawberrySize);

    /**
     * 苹果草莓和芒果的总价格。
     * @param appleSize
     * @param strawberrySize
     * @param mangoSize
     * @return
     */
    Double threeFruitsPrice(Integer appleSize, Integer strawberrySize, Integer mangoSize);

    /**
     * 草莓八折后的总价格
     * @param appleSize
     * @param strawberrySize
     * @param mangoSize
     * @param discount 草莓打 discount 折
     * @return
     */
    Double discountFruitsPrice(Integer appleSize, Integer strawberrySize, Integer mangoSize, Double discount);

    /**
     * 满减优惠。
     *
     * @param appleSize
     * @param strawberrySize
     * @param mangoSize
     * @param top            满 top 元。
     * @param discount       优惠 discount 元。
     * @return
     */
     Double discountFruitsPrice2(Integer appleSize, Integer strawberrySize, Integer mangoSize, Integer top, Integer discount);

}
