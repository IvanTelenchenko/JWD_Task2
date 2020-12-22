package by.tc.task01.entity;

import java.io.Serializable;

public class Laptop implements Appliance, Serializable {

	private static final long serialVersionUID = 5193393431699113711L;

	private double batteryCapacity;
	private String OS;
	private int memoryRom;
	private int systemMemory;
	private double CPU;
	private double displayInchs;

	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public int getSystemMemory() {
		return systemMemory;
	}

	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}

	public double getCPU() {
		return CPU;
	}

	public void setCPU(double cPU) {
		CPU = cPU;
	}

	public double getDisplayInchs() {
		return displayInchs;
	}

	public void setDisplayInchs(double displayInchs) {
		this.displayInchs = displayInchs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(CPU);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((OS == null) ? 0 : OS.hashCode());
		temp = Double.doubleToLongBits(batteryCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(displayInchs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + memoryRom;
		result = prime * result + systemMemory;
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
		Laptop other = (Laptop) obj;
		if (Double.doubleToLongBits(CPU) != Double.doubleToLongBits(other.CPU))
			return false;
		if (OS == null) {
			if (other.OS != null)
				return false;
		} else if (!OS.equals(other.OS))
			return false;
		if (Double.doubleToLongBits(batteryCapacity) != Double.doubleToLongBits(other.batteryCapacity))
			return false;
		if (Double.doubleToLongBits(displayInchs) != Double.doubleToLongBits(other.displayInchs))
			return false;
		if (memoryRom != other.memoryRom)
			return false;
		if (systemMemory != other.systemMemory)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " : BATTERY_CAPACITY=" + batteryCapacity + ", OS=" + OS + ", MEMORY_ROM="
				+ memoryRom + ", SYSTEM_MEMORY=" + systemMemory + ", CPU=" + CPU + ", DISPLAY_INCHS=" + displayInchs
				+ ";";
	}

//	Laptop : BATTERY_CAPACITY=1, OS=Windows, MEMORY_ROM=4000, SYSTEM_MEMORY=1000, CPU=1.2, DISPLAY_INCHS=18;
}
