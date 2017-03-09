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
 * �ӽ���н�è����Ϣȡ������List
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
	
	//查询分页
	
			public List<Pet> petList(String kind,int pageNo) {
				Connection con = null;
				try {
					con = DbUtil.getCon();
					if(pageNo==0){
						pageNo =1;//默认当前页是第一页，如何从jsp页面中获取pageNo的值
					}
					 System.out.print("***************");
					System.out.print(pageNo);
					System.out.print("************");
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
			
		
		
		//计算总的页数
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
