package com.atguigu.gmallpublisher.service;

import java.math.BigDecimal;
import java.util.Map;

public interface SugarService {

    BigDecimal getGmv(String date);

    Map<String, BigDecimal> getGmvByTrademark(String date, int limit);

    Map<String, Long> getOrderCountByProvince(String date);
}
