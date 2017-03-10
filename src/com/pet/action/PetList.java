package com.pet.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pet.dao.DaoFactory;
import com.pet.dao.PetDao;
import com.pet.dao.IPetDao;
import com.pet.model.Pet;
import com.pet.util.DbUtil;
/**
 * 锟接斤拷锟斤拷薪锟矫拷锟斤拷锟较⑷★拷锟斤拷锟斤拷锟絃ist
 * @author Cedo
 *
 */
public class PetList {
	private IPetDao petDao = DaoFactory.getDogsDao();
	
	public List<Pet> petList(String kind) {
		Connection con = null;
		try {
			con = DbUtil.getCon();
			ResultSet rs = petDao.petList(con, kind);
			List<Pet> list = new ArrayList<Pet>();
			while(rs.next()) {
				Pet dog = new Pet();
				dog.setName(rs.getString("name"));
				dog.setHabit(rs.getString("habit"));
				dog.setHobby(rs.getString("hobby"));
				dog.setPhotoAddress(rs.getString("photoAddress"));
				list.add(dog);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
				DbUtil.close(con);
		}
	}
	
	//鏌ヨ鍒嗛〉
	
			public List<Pet> petList(String kind,int pageNo) {
				Connection con = null;
				try {
					con = DbUtil.getCon();
					if(pageNo==0){
						pageNo =1;//榛樿褰撳墠椤垫槸绗竴椤碉紝濡備綍浠巎sp椤甸潰涓幏鍙杙ageNo鐨勫�
					}
					
					ResultSet rs = petDao.petList(con, kind,pageNo);
					List<Pet> list = new ArrayList<Pet>();
					while(rs.next()) {
						Pet dog = new Pet();
						dog.setName(rs.getString("name"));
						dog.setHabit(rs.getString("habit"));
						dog.setHobby(rs.getString("hobby"));
						dog.setPhotoAddress(rs.getString("photoAddress"));
						list.add(dog);
					}
					return list;
				} catch (Exception e) {
					e.printStackTrace();
					return null;
				} finally {
					if(con != null) {
						try {
							DbUtil.close(con);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}
			
		
		
		//璁＄畻鎬荤殑椤垫暟
			public int getPage(String kind){
				int recordCount = 0;
				int t1 = 0, t2 = 0;
				Connection con = null;
				try {
					con = DbUtil.getCon();
					ResultSet rs = petDao.petList(con,kind);
					List<Pet> list = new ArrayList<Pet>();
					while(rs.next()) {
						Pet dog = new Pet();
						dog.setName(rs.getString("name"));
						dog.setHabit(rs.getString("habit"));
						dog.setHobby(rs.getString("hobby"));
						dog.setPhotoAddress(rs.getString("photoAddress"));
						list.add(dog);
					}
					recordCount = list.size();
					t1 = recordCount % 5;
					t2 = recordCount / 5;
					}catch(Exception e){
						e.printStackTrace();
						return 1;
				}
				if (t1 != 0) {
					t2 = t2 + 1;
				}
				return t2;
				
			}
}
