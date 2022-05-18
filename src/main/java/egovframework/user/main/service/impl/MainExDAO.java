package egovframework.user.main.service.impl;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;

@Repository("MainExDAO")
public class MainExDAO extends EgovComAbstractDAO {
	// 로그인
	public String selectUserId(HashMap<String, Object> login) throws Exception {
		return selectOne("MainExDAO.selectUserId", login);
	}

	// 회원가입
	public void regster(HashMap<String, Object> reg) throws Exception {
		insert("MainExDAO.register", reg);
	}
}
