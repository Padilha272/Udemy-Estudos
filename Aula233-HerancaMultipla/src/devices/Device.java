package devices;

public abstract class Device {

	private String SerialNumber;

	public Device(String serialNumber) {
		SerialNumber = serialNumber;
	}

	public String getSerialNumber() {
		return SerialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		SerialNumber = serialNumber;
	}

	
	public abstract void processDoc(String doc);
	
	
}
