package Brip.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("account")
public class AccountController {
@RequestMapping("change")
public String change(){
	return "user/account/changepw";
}
}
