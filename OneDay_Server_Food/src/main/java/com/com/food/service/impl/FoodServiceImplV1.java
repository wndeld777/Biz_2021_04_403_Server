package com.com.food.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.com.food.model.FoodDTO;
import com.com.food.model.FoodVO;
import com.com.food.service.DBContract;
import com.com.food.service.DBInfo;
import com.com.food.service.FoodService;

public class FoodServiceImplV1 implements FoodService{
	
	protected Connection dbConn;
	public FoodServiceImplV1() {
		this.dbConn = DBContract.getDBConnection();
	}
	
	protected List<FoodDTO> select(PreparedStatement pStr) throws SQLException{
		List<FoodDTO> foodList = new ArrayList<FoodDTO>();
		ResultSet rSet = pStr.executeQuery();
		while(rSet.next()) {
			FoodDTO foodDTO = new FoodDTO();
			foodDTO.setFo_fcode(rSet.getString(DBInfo.FOOD.fo_fcode));
			foodDTO.setFo_fcode(rSet.getString(DBInfo.FOOD.fo_fname));
			foodDTO.setFo_fcode(rSet.getString(DBInfo.FOOD.fo_dname));
			foodDTO.setFo_fcode(rSet.getString(DBInfo.FOOD.fo_vname));
			foodDTO.setFo_fcode(rSet.getString(DBInfo.FOOD.fo_size));
			foodDTO.setFo_fcode(rSet.getString(DBInfo.FOOD.fo_gram));
			foodDTO.setFo_fcode(rSet.getString(DBInfo.FOOD.fo_kcal));
			foodDTO.setFo_fcode(rSet.getString(DBInfo.FOOD.fo_protein));
			foodDTO.setFo_fcode(rSet.getString(DBInfo.FOOD.fo_fat));
			foodDTO.setFo_fcode(rSet.getString(DBInfo.FOOD.fo_carbo));
			foodDTO.setFo_fcode(rSet.getString(DBInfo.FOOD.fo_sugars));
			foodList.add(foodDTO);
		}
		rSet.close();
		return foodList;
	}
	
	@Override
	public void insert(FoodVO foodVO) {

		String sql = " INSERT INTO tbl_myfoods ";
		sql += " (mf_seq, mf_date, mf_fcode, mf_eat) ";
		sql += " VALUSE(?,?,?,?) ";
		System.out.println(sql);
		
		PreparedStatement pStr = null;
		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, foodVO.getFo_seq());
			pStr.setString(2, foodVO.getFo_date());
			pStr.setString(3, foodVO.getFo_fcode());
			pStr.setInt(4, foodVO.getFo_eat());
			pStr.executeUpdate();
			pStr.close();
			
			System.out.println("INSERT OK!!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<FoodDTO> selectAll() {
		String sql = " SELECT * FROM view_식품정보 ";
		PreparedStatement pStr = null;
		
		try {
			pStr = dbConn.prepareStatement(sql);
			List<FoodDTO> foodList = this.select(pStr);
			pStr.close();
			return foodList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public FoodDTO findByFood(String fo_fcode) {

		String sql = " SELECT * FROM view_식품정보 ";
		sql += " WHERE 식품코드 = ? ";
		PreparedStatement pStr = null;
		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, fo_fcode.trim());
			
			List<FoodDTO> foodList = this.select(pStr);
			if(foodList != null && foodList.size() > 0) {
				pStr.close();
				return foodList.get(0);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public void findBySize() {
		// TODO Auto-generated method stub
		
	}

}
