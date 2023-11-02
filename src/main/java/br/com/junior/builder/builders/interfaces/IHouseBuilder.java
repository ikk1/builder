package br.com.junior.builder.builders.interfaces;

import br.com.junior.domain.House;
import br.com.junior.domain.House.HouseBuilder;

public interface IHouseBuilder {

    HouseBuilder buildWalls(int numberOfWalls);
    HouseBuilder buildDoors(int numberOfDoors);
    HouseBuilder buildWindows(int numberOfWindows);
    HouseBuilder buildRoof(int numberOfRoof);
    HouseBuilder buildGarage(int numberOfGarage);
    HouseBuilder buildSwimmingPool(int numberOfSwimmingPool);
    House build();

}
