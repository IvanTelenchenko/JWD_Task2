package by.tc.task01.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

public class SpeakersFactory implements ApplianceFactory {

	@Override
	public Appliance createElectronic(String[] value) {

//		Speakers : POWER_CONSUMPTION=15, NUMBER_OF_SPEAKERS=2, FREQUENCY_RANGE=2-4, CORD_LENGTH=2

		Speakers speak = new Speakers();

		speak.setPower_consumption(Double.parseDouble(value[0]));
		speak.setNumber_of_speakers(Integer.parseInt(value[1]));
		speak.setFrequencyLange(value[2]);
		speak.setCordLength(Double.parseDouble(value[3]));

		return speak;
	}

}
