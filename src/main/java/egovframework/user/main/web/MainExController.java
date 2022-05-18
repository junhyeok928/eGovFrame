package egovframework.user.main.web;

import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import egovframework.com.utl.utl.ScriptUtils;
import egovframework.user.main.service.MainExService;

@Controller
public class MainExController {

	@Resource(name = "mainExService")
	private MainExService mainExService;

	@RequestMapping(value = "/user/main/MainEx.do", method = RequestMethod.GET)
	public String loginform() {
		return "egovframework/user/MainEx";
	}

	@RequestMapping(value = "/user/main/MainExAction.do", method = RequestMethod.POST)
	public String login(@RequestParam("userId") String userId, @RequestParam("userPassword") String userPassword,
			HttpServletRequest request, Model model, HttpServletResponse response) throws Exception {
//		Map<String,String[]> reqmap= request.getParameterMap();
//		Map<String,Object> map =new HashMap<String, Object>();
//		for(String key:reqmap.keySet()) {
//			map.put(key, reqmap.get(key)[0]);
//		}
//		String path = "";
		HashMap<String, Object> loginfo = new HashMap<>();
		loginfo.put("userId", userId);
		loginfo.put("userPassword", userPassword);

		String logId = mainExService.selectUserId(loginfo);
		if (logId != null) {
//				path = "egovframework/user/MyPage";
			request.getSession().setAttribute("userId", logId);
			return "egovframework/user/MyPage";
		} else {
//				path = "egovframework/user/MainEx";
			ScriptUtils.alertAndMovePage(response, "로그인실패.", "/user/main/MainEx.do");
//				model.addAttribute("loginchk", 1);
			return null;

		}

	}

	@RequestMapping(value = "/user/main/RegPage.do")
	public String regform() {
		return "egovframework/user/RegPage";
	}

	@RequestMapping(value = "/user/main/RegAction.do")
	public String reg(@RequestParam("userId") String userId, @RequestParam("userPassword") String userPassword)
			throws Exception {
		HashMap<String, Object> reginfo = new HashMap<>();
		reginfo.put("userId", userId);
		reginfo.put("userPassword", userPassword);

		mainExService.regster(reginfo);
		System.out.println("성공");

		return "redirect:/user/main/MainEx.do";
	}

//	@RequestMapping(value = "logout.do")
//	public String logout()
}
