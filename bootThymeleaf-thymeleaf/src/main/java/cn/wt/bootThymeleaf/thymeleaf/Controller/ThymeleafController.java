package cn.wt.bootThymeleaf.thymeleaf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ThymeleafController {
	@RequestMapping("/show")
	public String show(Model model) {
		model.addAttribute("msg", "大家晚上好");
		return "message/message_show";	//要跳转的路径
	}
}
