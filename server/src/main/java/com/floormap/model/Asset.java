package com.floormap.model;

public class Asset {

	private String assetType;
	private String assetNo;
	
	public String getAssetType() {
		return assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}
	public String getAssetNo() {
		return assetNo;
	}
	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}
	@Override
	public String toString() {
		return "Asset [assetType=" + assetType + ", assetNo=" + assetNo + "]";
	}
	
	
}
