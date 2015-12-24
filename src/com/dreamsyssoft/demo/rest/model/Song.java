package com.dreamsyssoft.demo.rest.model;


public class Song{
	private boolean experimental;
	private boolean hipHop;
	private boolean indie;
	private boolean deepHouse;
	
	public Song(){}
	
	public Song(boolean experimental, boolean hipHop, boolean indie, boolean deepHouse){
		this.experimental = experimental;
		this.hipHop = hipHop;
		this.indie = indie;
		this.deepHouse = deepHouse;
	}
	
	public boolean isExperimental() {
		return experimental;
	}
	public void setExperimental(boolean experimental) {
		this.experimental = experimental;
	}
	public boolean isHipHop() {
		return hipHop;
	}
	public void setHipHop(boolean hipHop) {
		this.hipHop = hipHop;
	}
	public boolean isIndie() {
		return indie;
	}
	public void setIndie(boolean indie) {
		this.indie = indie;
	}
	public boolean isDeepHouse() {
		return deepHouse;
	}
	public void setDeepHouse(boolean deepHouse) {
		this.deepHouse = deepHouse;
	}
}