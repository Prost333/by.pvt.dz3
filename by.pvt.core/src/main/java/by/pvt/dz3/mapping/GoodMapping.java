package by.pvt.dz3.mapping;

import by.pvt.dz3.domain.Good;
import by.pvt.dz3.dto.GoodRequest;
import by.pvt.dz3.dto.GoodResponse;
import by.pvt.dz3.repository.GoodRepository;


public class GoodMapping {

    public GoodResponse responseGood(Good good) {
        GoodResponse goodResponse = new GoodResponse(good.getName(), good.getId(), good.getType(),
                good.getPrice(), good.getCode());
        return goodResponse;
    }

    public Good requestGood(GoodRequest goodRequest) {
        GoodRepository goodRepository = new GoodRepository();
        return goodRepository.findIDGood(goodRequest.getId());
    }
}
