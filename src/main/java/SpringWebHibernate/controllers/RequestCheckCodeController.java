package SpringWebHibernate.controllers;

import com.huipay.ErrorCode;
import com.huipay.oms.entity.CheckCode;
import com.huipay.oms.manager.CheckCodeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.transaction.Transactional;

/**
 * Created by Thoughtworks on 15/8/19.
 */
@Controller
public class RequestCheckCodeController {
    @Autowired
    private RequestCheckCodeService requestCheckCodeService;

    @RequestMapping("/huipayDeliverWater/regist/checkCode/{pyhone_num}/")
    @ResponseBody
    String requestCheckBody(@PathVariable String pyhoneNum){
//        String errorCode = "";
//        if (hasRegist(pyhoneNum)){
//            return ErrorCode.getByCode("20137").toString();
//        }
//        CheckCodeManager.getInstance().addCheckCode(new CheckCode());
//        if (requestCheckCodeService.hasRequestTooFast(pyhoneNum)){
//
//        }
//          requestCheckCodeService.saveCheckCode();
        return "home";
    }

    private boolean hasRegist(String pyhoneNum) {
        return false;
    }


}
