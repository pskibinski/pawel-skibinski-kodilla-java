package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {

    @Test
    public void connectionTest() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConn());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConn().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        //Then
        int counter = 0;

        while(rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
            rs.getString("FIRST_NAME") + ", " + rs.getString("LAST_NAME"));
            counter++;
        }
        rs.close();
            statement.close();
            Assert.assertEquals(5, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        //When
        String sqlQuery =   "SELECT FIRST_NAME, LAST_NAME " +
                            "FROM USERS U, POSTS P " +
                            "WHERE U.ID = P.USER_ID " +
                            "GROUP BY P.USER_ID " +
                            "HAVING COUNT(*) > 1";

        Statement statement = dbManager.getConn().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        //Then
        int counter = 0;

        while(rs.next()) {
            System.out.println(rs.getString("FIRST_NAME") + " " + rs.getString("LAST_NAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(2, counter);
    }
}
