package by.tc.task01.entity;

import java.io.Serializable;

public class Speakers implements Serializable, Appliance {

	private static final long serialVersionUID = 731156309680719188L;

	private double power_consumption;
	private int number_of_speakers;
	private String frequencyLange;
	private double cordLength;

	public double getPower_consumption() {
		return power_consumption;
	}

	public void setPower_consumption(double power_consumption) {
		this.power_consumption = power_consumption;
	}

	public int getNumber_of_speakers() {
		return number_of_speakers;
	}

	public void setNumber_of_speakers(int number_of_speakers) {
		this.number_of_speakers = number_of_speakers;
	}

	public String getFrequencyLange() {
		return frequencyLange;
	}

	public void setFrequencyLange(String frequencyLange) {
		this.frequencyLange = frequencyLange;
	}

	public double getCordLength() {
		return cordLength;
	}

	public void setCordLength(double cordLength) {
		this.cordLength = cordLength;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cordLength);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((frequencyLange == null) ? 0 : frequencyLange.hashCode());
		result = prime * result + number_of_speakers;
		temp = Double.doubleToLongBits(power_consumption);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Speakers other = (Speakers) obj;
		if (Double.doubleToLongBits(cordLength) != Double.doubleToLongBits(other.cordLength))
			return false;
		if (frequencyLange == null) {
			if (other.frequencyLange != null)
				return false;
		} else if (!frequencyLange.equals(other.frequencyLange))
			return false;
		if (number_of_speakers != other.number_of_speakers)
			return false;
		if (Double.doubleToLongBits(power_consumption) != Double.doubleToLongBits(other.power_consumption))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " : POWER_CONSUMPTION=" + power_consumption + ", NUMBER_OF_SPEAKERS="
				+ number_of_speakers + ", FREQUENCY_RANGE=" + frequencyLange + ", CORD_LENGTH=" + cordLength + ";";
	}
//	Speakers : POWER_CONSUMPTION=15, NUMBER_OF_SPEAKERS=2, FREQUENCY_RANGE=2-4, CORD_LENGTH=2;
}