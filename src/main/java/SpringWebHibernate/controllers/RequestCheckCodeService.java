package SpringWebHibernate.controllers;

import com.huipay.oms.entity.CheckCode;
import com.huipay.oms.entity.CheckCodeType;
import com.huipay.oms.manager.CheckCodeManager;
import org.hibernate.annotations.Check;
import org.springframework.stereotype.Service;
import sun.util.calendar.BaseCalendar;

import javax.transaction.Transactional;


/**
 * Created by Thoughtworks on 15/8/19.
 */
@Service
public class RequestCheckCodeService {

    public static final int MAX_REQUEST_INTERVAL = 60 * 1000;
    private CheckCodeManager codeManager = CheckCodeManager.getInstance();

    public boolean hasRequestTooFast(String pyhoneNum) {
        CheckCode oldCheckCode = codeManager.getLastSendCode(pyhoneNum);
        return oldCheckCode != null && new java.util.Date().getTime() - oldCheckCode.getSendTime().getTime() < MAX_REQUEST_INTERVAL;
    }

    private CheckCode createRegistNewCode(String phoneNum, String checkCodeString){
        CheckCode code = new CheckCode();
        code.setMobilePhone(phoneNum);
        return code;
    }

    @Transactional
    public void saveCheckCode(String pyhoneNum, String checkCode){
//        codeManager.addCheckCode();
    }

}
