package mercedes;

import abstractClasses.Factory;
import abstractClasses.HeadLight;
import abstractClasses.Tire;

public class MercedesFactory extends Factory {

	@Override
	public HeadLight makeHeadLight() {
		return new MercedesHeadLight();
	}

	@Override
	public Tire makeTire() {
	return new MercedesTire();
	}

}
