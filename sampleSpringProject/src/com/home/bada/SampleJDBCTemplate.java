/**
 * 
 */
package com.home.bada;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javax.sql.DataSource;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author bharadwaj
 *
 */
public class SampleJDBCTemplate {

    /**
     * Log4j Logger that is used to log information and some debug statements.
     */
	protected static Logger logger = Logger.getLogger("SampleLogger");
    /**
    *
    */
  // private final ResourceBundle rs = ResourceBundle.getBundle("SampleSqlStmts");
   private final ResourceBundle tv = ResourceBundle.getBundle("samplesql");
    /*resource bundle will read .propertiesfile*/
    /**
     * Object for DataSource.
     */
    public DataSource dataSource;
    public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	/**
     * Object for JdbcTemplate.
     */
    public JdbcTemplate jdbcTemplateObject;
	
//    public SampleJDBCTemplate (final DataSource ds) {
//        this.dataSource = ds;
//        this.jdbcTemplateObject = new JdbcTemplate(ds);
//    }
    
    public JdbcTemplate getJdbcTemplateObject() {
		return jdbcTemplateObject;
	}

	public void setJdbcTemplateObject(JdbcTemplate jdbcTemplateObject) {
		this.jdbcTemplateObject = jdbcTemplateObject;
	}

	/**
     * To get user id from given hash.
     * 
     * @param inpStr
     *            passed to get the user id
	 * @return 
     * @return String userid id prepared
     */
   /* public final String getInfoFromDB(final String inpStr) {
    String outputStr = "";
    final String sql = rs.getString("SampleSqls.Select1");
    logger.debug("====>sql:"+sql);
    logger.debug("====>inpStr:"+inpStr);
    outputStr = jdbcTemplateObject.queryForObject(sql, new Object[] { inpStr }, String.class);
    return outputStr;
    }
    */
    
    public final String getInfoFromDB(final int a ) {
        String outputStr1 = "";
        final String sql1 = tv.getString("SampleSqls.Select");
        logger.debug("====>sql:"+sql1);
        logger.debug("====>inpStr:"+a);
        outputStr1 = jdbcTemplateObject.queryForObject(sql1, new Object[] { a }, String.class);
        return outputStr1;
    }
    
    public final List<Map<String,Object>> getInfoFromDBMulOut(final int inpInt ) {
        final String sql = tv.getString("SampleSql.Select2");
        logger.debug("====>sql:"+sql);
        logger.debug("====>inpStr:"+inpInt);
        List<Map<String,Object>> outputStr1 = jdbcTemplateObject.queryForList(sql, new Object[] { inpInt });
        logger.debug("====>outputStr1:"+outputStr1);
        return outputStr1;
    }
    
    
    
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		logger.debug("=====X=====");
	}

}
