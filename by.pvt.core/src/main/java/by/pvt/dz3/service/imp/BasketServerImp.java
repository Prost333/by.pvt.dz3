package by.pvt.dz3.service.imp;

import by.pvt.dz3.mapping.BasketMapping;
import by.pvt.dz3.repository.BasketRepository;
import by.pvt.dz3.service.BasketService;

public class BasketServerImp implements BasketService {
    private BasketRepository basketRepository;
    private BasketMapping basketMapping;

    public BasketServerImp(BasketRepository basketRepository, BasketMapping basketMapping) {
        this.basketRepository = basketRepository;
        this.basketMapping = basketMapping;
    }

    public BasketRepository getBasketRepository() {
        return basketRepository;
    }

    public void setBasketRepository(BasketRepository basketRepository) {
        this.basketRepository = basketRepository;
    }

    public BasketMapping getBasketMapping() {
        return basketMapping;
    }

    public void setBasketMapping(BasketMapping basketMapping) {
        this.basketMapping = basketMapping;
    }
}
