package com.spring4.tr;

import java.util.Map;

import org.apache.log4j.Logger;

public class DeptLogic {
	Logger logger = Logger.getLogger(DeptLogic.class);
	//@Autowired
	private DeptDao deptDao = null;
	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}
	public int deptInsert(Map<String,Object> pMap) {
		logger.info("deptInsert 호출성공");
		int result = 0;
		deptDao.deptInsert(pMap);
		return result;
	}

}
