package com.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.apache.tomcat.jdbc.pool.DataSource;

import com.model.bean.MemberBean;

public class MemberDAO {

	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;

	public void getCon() {
		try {
			Context ctx = new InitialContext();
			Context env = (Context) ctx.lookup("java:comp/env");
			DataSource ds = (DataSource) env.lookup("jdbc/pool");
			con = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 회원 한사람 정보 저장
	public void insertMember(MemberBean bean) throws SQLException {
		try {
			getCon();
			String insertSql = "INSERT INTO MEMBER VALUES(?,?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(insertSql);
			pstmt.setString(1, bean.getId());
			pstmt.setString(2, bean.getPassword());
			pstmt.setString(3, bean.getEmail());
			pstmt.setString(4, bean.getTel());
			pstmt.setString(5, bean.getHobby());
			pstmt.setString(6, bean.getJob());
			pstmt.setString(7, bean.getAge());
			pstmt.setString(8, bean.getInfo());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
	}
	
	public ArrayList<MemberBean> getAllMemberList() throws SQLException{
		ArrayList<MemberBean> memberList = new ArrayList<MemberBean>();
		try {
			getCon();
			String selectSql = "SELECT * FROM MEMBER";
			pstmt = con.prepareStatement(selectSql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberBean bean = new MemberBean();
				bean.setId(rs.getString(1));
				bean.setPassword(rs.getString(2));
				bean.setEmail(rs.getString(3));
				bean.setTel(rs.getString(4));
				bean.setHobby(rs.getString(5));
				bean.setJob(rs.getString(6));
				bean.setAge(rs.getString(7));
				bean.setInfo(rs.getString(8));
				memberList.add(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return memberList;
	}
}
