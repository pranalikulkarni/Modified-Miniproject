package com.cg.asset.service;

import java.util.ArrayList;
import java.util.regex.Pattern;

import com.cg.asset.dao.AssetDaoImpl;
import com.cg.asset.dao.IAssetDao;
import com.cg.asset.dto.Asset;
import com.cg.asset.exception.AssetException;

public class AssetServiceImpl implements IAssetService {
	IAssetDao dao = null;
	
	public ArrayList<Asset> viewRequestsByManager(int mgrId) throws AssetException
	{
		dao = new AssetDaoImpl();
		return dao.viewRequestsByManager(mgrId);
		
	}
	

	

	@Override
	public int login(String string, Asset b) throws AssetException {
		dao = new AssetDaoImpl();
		return dao.login(string,b);
	}

	@Override
	public int addDetails(Asset b) throws AssetException {
		dao = new AssetDaoImpl();
		return dao.addDetails(b);
	}


	

	@Override
	public Asset raiseRequest(Asset bean) throws AssetException {
		dao = new AssetDaoImpl();
		return dao.raiseRequest(bean);
	}

	@Override
	public int insertRequests(Asset bean) throws AssetException {
		dao = new AssetDaoImpl();
		return dao.insertRequests(bean);
	}

	@Override
	public int checkAsset(int assetId) throws AssetException {
		dao = new AssetDaoImpl();
		return dao.checkAsset(assetId);
	}

	@Override
	public int approveRequest( int allocationId)
			throws AssetException {
		dao = new AssetDaoImpl();
		return dao.approveRequest( allocationId);
	}

	@Override
	public ArrayList<Asset> retrieveDetails() throws AssetException {
		dao = new AssetDaoImpl();
		return dao.retrieveDetails();
	}

	@Override
	public void setStatus(int allocId, String rejectStatus) throws AssetException {
		dao = new AssetDaoImpl();
		 dao.setStatus(allocId, rejectStatus);
	}


	@Override
	public boolean doesIdExist(int retMgrId) throws AssetException {
		dao= new AssetDaoImpl();
		return dao.doesIdExist(retMgrId);
	}


	public boolean checkPassword(String pass) {
		// TODO Auto-generated method stub
		String checkPass = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
		return (Pattern.matches(checkPass, pass))?true:false;
	}



	public boolean checkAssetQuantity(int quantity) {
		// TODO Auto-generated method stub
		return (quantity>0 && quantity<=100)?true:false;
		
	}


	@Override
	public int modifyAssetQuantity(String assetName, int quantity, int flag)
			throws AssetException {
		dao= new AssetDaoImpl();
		return dao.modifyAssetQuantity(assetName,quantity,flag);
	}


	@Override
	public int modifyDesc(String assetDesc1, String assetName1)
			throws AssetException {
		dao= new AssetDaoImpl();
		return dao.modifyDesc(assetDesc1,assetName1);
	}


	@Override
	public int validateAssetName(String assetName) throws AssetException {
		dao= new AssetDaoImpl();
		return dao.validateAssetName(assetName);
	}




	@Override
	public int checkassetName(String assetName) {
		// TODO Auto-generated method stub
		return dao.checkassetName(assetName);
	}




	@Override
	public int validateQuantity(int quantity1,String assetName) {
		// TODO Auto-generated method stub
		return dao.validateQuantity(quantity1,assetName);
	}


	
	

}
