package com.pet.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pet.dao.DaoFactory;
import com.pet.dao.IStrayPetDao;
import com.pet.model.Pet;
import com.pet.model.StrayPet;
import com.pet.util.DbUtil;


/**
 * �ӽ���н�����è����Ϣȡ������List
 * @author Cedo
 *
 */
public class StrayPetList {
	private IStrayPetDao strayPetDao = DaoFactory.getStrayPetDao();
	
	public List<StrayPet> strayPetList(String kind) {
		Connection con = null;
		try {
			con = DbUtil.getCon();
			ResultSet rs = strayPetDao.strayPetList(con, kind);
			List<StrayPet> list = new ArrayList<StrayPet>();
			while(rs.next()) {
				StrayPet strayPet = new StrayPet();
				strayPet.setId(rs.getInt("id"));
				strayPet.setName(rs.getString("name"));
				strayPet.setKind(rs.getString("kind"));
				strayPet.setSex(rs.getString("sex"));
				strayPet.setHobby(rs.getString("hobby"));
				strayPet.setFoundAddress(rs.getString("foundAddress"));
				list.add(strayPet);
				System.out.println();
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			DbUtil.close(con);
		}
		
	}
}
