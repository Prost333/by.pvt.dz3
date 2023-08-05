package by.pvt.dz3.config;

import by.pvt.dz3.mapping.BasketMapping;
import by.pvt.dz3.mapping.GoodMapping;
import by.pvt.dz3.mapping.UserMapping;
import by.pvt.dz3.repository.BasketRepository;
import by.pvt.dz3.repository.GoodRepository;
import by.pvt.dz3.repository.UserRepository;
import by.pvt.dz3.service.BasketService;
import by.pvt.dz3.service.GoodService;
import by.pvt.dz3.service.UserService;
import by.pvt.dz3.service.imp.BasketServerImp;
import by.pvt.dz3.service.imp.GoodServiceImp;
import by.pvt.dz3.service.imp.UserServerImp;

public class ApplicationContext {
    private static ApplicationContext applicationContext;
    private final UserRepository userRepository;
    private final GoodRepository goodRepository;
    private final GoodMapping goodMapping;
    private final UserMapping userMapping;
    private final UserService userService;
    private  final GoodService goodService;
    private  final BasketService basketService;
    private   BasketMapping basketMapping;
    private   BasketRepository basketRepository;


    private ApplicationContext( ) {
        this.userRepository = new UserRepository();
        this.goodRepository = new GoodRepository();
        this.goodMapping = new GoodMapping();
        this.userMapping = new UserMapping();
        this.userService =  new UserServerImp(userRepository,userMapping);
        this.goodService = new GoodServiceImp(goodMapping,goodRepository);
        this.basketService = new BasketServerImp(basketRepository, basketMapping);
        this.basketMapping = new BasketMapping();
        this.basketRepository = new BasketRepository();
    }
    public static ApplicationContext getInstance(){
        if (applicationContext==null){
            applicationContext=new ApplicationContext();
        }
        return applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static void setApplicationContext(ApplicationContext applicationContext) {
        ApplicationContext.applicationContext = applicationContext;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public GoodRepository getGoodRepository() {
        return goodRepository;
    }

    public GoodMapping getGoodMapping() {
        return goodMapping;
    }

    public UserMapping getUserMapping() {
        return userMapping;
    }

    public UserService getUserService() {
        return userService;
    }

    public GoodService getGoodService() {
        return goodService;
    }

    public BasketService getBasketService() {
        return basketService;
    }

    public BasketMapping getBasketMapping() {
        return basketMapping;
    }

    public void setBasketMapping(BasketMapping basketMapping) {
        this.basketMapping = basketMapping;
    }

    public BasketRepository getBasketRepository() {
        return basketRepository;
    }

    public void setBasketRepository(BasketRepository basketRepository) {
        this.basketRepository = basketRepository;
    }
}
