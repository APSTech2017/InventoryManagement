package com.apstech.models;

/**
 * model class for vehicles
 * @author Sameer-Suju
 * @since 01/20/2017
 */

public class VehicleDetails {
	private String vinNumber;
	private String make;
	private String model;
	private String bodyType;
	private int year;
	private String vehicleColor;
	private String transmission;
	private String wheelDrive;
	private String engineType;
	private String fuelType;
	public String getVinNumber() {
		return vinNumber;
	}
	public void setVinNumber(String vinNumber) {
		this.vinNumber = vinNumber;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBodyType() {
		return bodyType;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getVehicleColor() {
		return vehicleColor;
	}
	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public String getWheelDrive() {
		return wheelDrive;
	}
	public void setWheelDrive(String wheelDrive) {
		this.wheelDrive = wheelDrive;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	
	
}
