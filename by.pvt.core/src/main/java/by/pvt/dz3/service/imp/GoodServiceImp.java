package by.pvt.dz3.service.imp;

import by.pvt.dz3.mapping.GoodMapping;
import by.pvt.dz3.repository.GoodRepository;
import by.pvt.dz3.service.GoodService;

public class GoodServiceImp implements GoodService {
    private GoodMapping goodMapping;
    private GoodRepository goodRepository;

    public GoodServiceImp(GoodMapping goodMapping, GoodRepository goodRepository) {
        this.goodMapping = goodMapping;
        this.goodRepository = goodRepository;
    }

    public GoodMapping getGoodMapping() {
        return goodMapping;
    }

    public void setGoodMapping(GoodMapping goodMapping) {
        this.goodMapping = goodMapping;
    }

    public GoodRepository getGoodRepository() {
        return goodRepository;
    }

    public void setGoodRepository(GoodRepository goodRepository) {
        this.goodRepository = goodRepository;
    }
}
