package egovframework.user.main.service;

import java.util.HashMap;

public interface MainExService {
	public String selectUserId(HashMap<String, Object> login) throws Exception;

	public void regster(HashMap<String, Object> reg) throws Exception;
}
