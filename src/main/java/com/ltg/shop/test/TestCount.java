package com.ltg.shop.test;


import com.ltg.shop.service.impl.CountPriceImpl;

public class TestCount {
    public static void main(String[] args) {

        // 买两斤苹果，三斤草莓
        Double price1 = new CountPriceImpl().twoFruitsPrice(2, 3);
        System.out.println("买两斤苹果，三斤草莓花费: "+price1);

        // 买两斤苹果，三级草莓，四斤芒果
        Double price2 = new CountPriceImpl().threeFruitsPrice(2, 3,4);
        System.out.println("买两斤苹果，三级草莓，四斤芒果花费: "+price2);

        // 买两斤苹果，三级草莓，四斤芒果，草莓打八折。
        Double price3 = new CountPriceImpl().discountFruitsPrice(2, 3, 4, 8.0);
        System.out.println("两斤苹果，三级草莓，四斤芒果，草莓打八折共花费: "+price3);

        // 买五斤苹果，六斤草莓，七斤芒果，满100减10
        Double price4 = new CountPriceImpl().discountFruitsPrice2(5, 6, 7, 100, 10);
        System.out.println("买五斤苹果，六斤草莓，七斤芒果，满100减10 共花费: "+price4);

    }
}
