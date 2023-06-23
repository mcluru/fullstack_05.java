package com.lec.ex03_connector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.lec.ex02_board.BoardVO;

public class MyDBConnection {

	public static void main(String[] args) {
		
		Connection conn = JDBCConnector.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement("select * from board");
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setBno(rs.getInt(1));
				vo.setSubject(rs.getString("subject"));
				vo.setWriter(rs.getString("writer"));
				vo.setContent(rs.getString("content"));
			}
		} catch (Exception e) {
			System.out.println("DB접속 실패");
		} finally {
			JDBCConnector.close(conn,pstmt,rs);
		}
		
		
		
	}

}
