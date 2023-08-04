package by.pvt.dz3.repository;

import by.pvt.dz3.domain.Basket;
import by.pvt.dz3.domain.Good;

import java.util.ArrayList;
import java.util.List;

public class BasketRepository extends FileWorker{
    public static List<Basket> goodList = new ArrayList<>();
    public static String way = "C:\\Project Java\\by.pvt.dz3\\by.pvt.core\\src\\main\\java\\by\\pvt\\hw3\\data\\Basket.txt";
}
