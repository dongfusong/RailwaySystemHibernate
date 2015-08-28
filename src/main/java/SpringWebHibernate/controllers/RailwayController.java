package SpringWebHibernate.controllers;

import SpringWebHibernate.models.NodeStation;
import SpringWebHibernate.models.RailwayService;
import SpringWebHibernate.models.ResponseResult;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by huipay on 15/8/10.
 */
@Controller
public class RailwayController {

    @Autowired
    private RailwayService stationService;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    //addEdge?firstName=value&lastName=value1
    @RequestMapping("/addEdge/{srcName}/{dstName}/{distance}")//rest
    @ResponseBody
    public ResponseResult addEdge(@PathVariable String srcName, @PathVariable String dstName,@PathVariable Long distance){
        stationService.addRailwayEdge(srcName, dstName, distance.intValue());
        return new ResponseResult("success");
    }

    @RequestMapping(value = "/createNode", method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult createNode(@RequestBody NodeStation nodeStation){
        System.out.println(nodeStation);
        stationService.save(nodeStation);
        return new ResponseResult("success");
    }

}
