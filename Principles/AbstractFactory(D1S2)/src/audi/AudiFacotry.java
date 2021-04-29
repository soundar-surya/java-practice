package audi;

import abstractClasses.Factory;
import abstractClasses.HeadLight;
import abstractClasses.Tire;

public class AudiFacotry extends Factory
{

	@Override
	public HeadLight makeHeadLight() 
	{
		return new AudiHeadLight();
	}

	@Override
	public Tire makeTire()
	{
		return new AudiTire();
	}

}
