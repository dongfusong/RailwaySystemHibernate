package SpringWebHibernate.models;

/**
 * Created by Thoughtworks on 15/8/12.
 */
public class ResponseResult {
    private String resultInfo;


    public ResponseResult(String resultInfo) {
        this.resultInfo = resultInfo;
    }

    public String getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }
}

