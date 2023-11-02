package br.com.junior.builder;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.junior.domain.House;

@SpringBootTest
class BuilderApplicationTests {

	@Test
	void testHouseBuild() {

		House house = new House.HouseBuilder()
				.buildWalls(4)
				.buildDoors(2)
				.buildWindows(6)
				.buildRoof(1)
				.buildGarage(1)
				.buildSwimmingPool(1)
				.build();

		house.toString();

		assertEquals(house.getNumberOfWalls(), 4);
		assertEquals(house.getNumberOfDoors(), 2);
		assertEquals(house.getNumberOfWindows(), 6);
		assertEquals(house.getNumberOfRoof(), 1);
		assertEquals(house.getNumberOfGarage(), 1);
		assertEquals(house.getNumberOfSwimmingPool(), 1);
	}

	@Test
	void testHouseBuildWithOutImprovements() {
		House house = new House.HouseBuilder()
				.buildWalls(4)
				.buildDoors(2)
				.buildWindows(6)
				.buildRoof(1)
				.build();

		house.toString();

		assertEquals(house.getNumberOfWalls(), 4);
		assertEquals(house.getNumberOfDoors(), 2);
		assertEquals(house.getNumberOfWindows(), 6);
		assertEquals(house.getNumberOfRoof(), 1);
		assertEquals(house.getNumberOfGarage(), 0);
		assertEquals(house.getNumberOfSwimmingPool(), 0);

	}

}
