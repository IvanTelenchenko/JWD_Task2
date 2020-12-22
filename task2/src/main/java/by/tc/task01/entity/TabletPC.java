package by.tc.task01.entity;

import java.io.Serializable;

public class TabletPC implements Serializable, Appliance {

	private static final long serialVersionUID = -1890894715544594537L;

	private double batteryCapacity;
	private int displayInches;
	private int memoryRom;
	private int flashMemoryCapacity;
	private String color;

	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int getDisplayInches() {
		return displayInches;
	}

	public void setDisplayInches(int displayInches) {
		this.displayInches = displayInches;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public int getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}

	public void setFlashMemoryCapacity(int flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(batteryCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + displayInches;
		result = prime * result + flashMemoryCapacity;
		result = prime * result + memoryRom;
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
		TabletPC other = (TabletPC) obj;
		if (Double.doubleToLongBits(batteryCapacity) != Double.doubleToLongBits(other.batteryCapacity))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (displayInches != other.displayInches)
			return false;
		if (flashMemoryCapacity != other.flashMemoryCapacity)
			return false;
		if (memoryRom != other.memoryRom)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " : BATTERY_CAPACITY=" + batteryCapacity + ", DISPLAY_INCHES="
				+ displayInches + ", MEMORY_ROM=" + memoryRom + ", FLASH_MEMORY_CAPACITY=" + flashMemoryCapacity
				+ ", COLOR=" + color + ";";
	}
//	TabletPC : BATTERY_CAPACITY=5, DISPLAY_INCHES=16, MEMORY_ROM=16000, FLASH_MEMORY_CAPACITY=8, COLOR=green;
}