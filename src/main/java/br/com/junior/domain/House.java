package br.com.junior.domain;

import br.com.junior.builder.builders.interfaces.IHouseBuilder;

public class House {

    private int numberOfWalls;
    private int numberOfDoors;
    private int numberOfWindows;
    private int numberOfRoof;
    private int numberOfGarage;
    private int numberOfSwimmingPool;

    public int getNumberOfWalls() {
        return numberOfWalls;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public int getNumberOfRoof() {
        return numberOfRoof;
    }

    public int getNumberOfGarage() {
        return numberOfGarage;
    }

    public int getNumberOfSwimmingPool() {
        return numberOfSwimmingPool;
    }

    private House(int numberOfWalls, int numberOfDoors, int numberOfWindows, int numberOfRoof, int numberOfGarage,
            int numberOfSwimmingPool) {
        this.numberOfWalls = numberOfWalls;
        this.numberOfDoors = numberOfDoors;
        this.numberOfWindows = numberOfWindows;
        this.numberOfRoof = numberOfRoof;
        this.numberOfGarage = numberOfGarage;
        this.numberOfSwimmingPool = numberOfSwimmingPool;
    }

    @Override
    public String toString() {
        return "House [numberOfWalls=" + numberOfWalls + ", numberOfDoors=" + numberOfDoors + ", numberOfWindows="
                + numberOfWindows + ", numberOfRoof=" + numberOfRoof + ", numberOfGarage=" + numberOfGarage
                + ", numberOfSwimmingPool=" + numberOfSwimmingPool + "]";
    }

    public static class HouseBuilder implements IHouseBuilder {

        private int numberOfWalls;
        private int numberOfDoors;
        private int numberOfWindows;
        private int numberOfRoof;
        private int numberOfGarage;
        private int numberOfSwimmingPool;

        @Override
        public HouseBuilder buildWalls(int numberOfWalls) {
            this.numberOfWalls = numberOfWalls;
            return this;
        }

        @Override
        public HouseBuilder buildDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
            return this;
        }

        @Override
        public HouseBuilder buildWindows(int numberOfWindows) {
            this.numberOfWindows = numberOfWindows;
            return this;
        }

        @Override
        public HouseBuilder buildRoof(int numberOfRoof) {
            this.numberOfRoof = numberOfRoof;
            return this;
        }

        @Override
        public HouseBuilder buildGarage(int numberOfGarage) {
            this.numberOfGarage = numberOfGarage;
            return this;
        }

        @Override
        public HouseBuilder buildSwimmingPool(int numberOfSwimmingPool) {
            this.numberOfSwimmingPool = numberOfSwimmingPool;
            return this;
        }

        @Override
        public House build() {
            return new House(numberOfWalls, numberOfDoors, numberOfWindows, numberOfRoof, numberOfGarage,
                    numberOfSwimmingPool);
        }
    }
}
