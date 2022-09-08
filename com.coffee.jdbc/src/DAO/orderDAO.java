package DAO;
import VO.MenuInfoVO;
import util.Common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class orderDAO {


    public void orderInsert(int mno, String optionCode, String optionCount) {
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Scanner sc = new Scanner(System.in);
        seqOrderNoDAO seqOdNo = new seqOrderNoDAO();
        seqOdNo.seqOrderNo();

        String sql = "INSERT INTO ORDER_INFO (ORDER_DATE, ORDER_NO, MNO, OPTION_CODE, OPTION_COUNT) "
                + "VALUES (SYSDATE, ?, ?, ?, ?)";

        try {
            conn = Common.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, mno);
            pstmt.setInt(2, mno);
            pstmt.setString(2, optionCode);
            pstmt.setString(3, optionCount);
            pstmt.executeUpdate();
            int ret = stmt.executeUpdate(sql);
            System.out.println("Return : " + ret);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Common.close(pstmt);
        Common.close(conn);
    }





}