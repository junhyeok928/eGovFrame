package egovframework.user.main.service.impl;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.user.main.service.MainExService;

@Service("mainExService")
public class MainExServiceImpl extends EgovAbstractServiceImpl implements MainExService {
	@Resource(name = "MainExDAO")
	private MainExDAO mainexDAO;

	@Override
	public String selectUserId(HashMap<String, Object> login) throws Exception {
		return mainexDAO.selectUserId(login);
	}

	@Override
	public void regster(HashMap<String, Object> reg) throws Exception {
		mainexDAO.regster(reg);
	}
}
