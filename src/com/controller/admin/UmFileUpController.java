package com.controller.admin;


import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/4/22.
 */
@Controller
@RequestMapping("/umfileup")
public class UmFileUpController{
    static Map<String, String> infoMap = new HashMap<>();
    static {
        infoMap.put("SUCCESS", "SUCCESS"); //默认成功
        infoMap.put("NOFILE", "未包含文件上传域");
        infoMap.put("TYPE", "不允许的文件格式");
        infoMap.put("SIZE", "文件大小超出限制");
        infoMap.put("ENTYPE", "请求类型ENTYPE错误");
        infoMap.put("REQUEST", "上传请求异常");
        infoMap.put("IO", "IO异常");
        infoMap.put("DIR", "目录创建失败");
        infoMap.put("UNKNOWN", "未知错误");
    }

    @ResponseBody
    @RequestMapping("/fileUp")
    public String fileUp( HttpServletRequest request, ModelMap model,String callback) {
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        MultipartFile file = multipartRequest.getFile("upfile");

        String path = request.getSession().getServletContext().getRealPath("upload");
        String fileName = file.getOriginalFilename();
//        String fileName = new Date().getTime()+".jpg";
        File targetFile = new File(path, fileName);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }

        //保存
        try {
            file.transferTo(targetFile);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Map<String,String> data=new HashMap<>();
        data.put("name",fileName);
        data.put("originalName",fileName);
        data.put("state",infoMap.get("SUCCESS"));
        data.put("type", file.getContentType());
        data.put("size",String.valueOf(file.getSize()));
        data.put("url","/upload/"+fileName);
        if( callback == null ){
            return JSON.toJSON(data).toString();
        }else{
            return ("<script>"+ callback +"(" + JSON.toJSON(data) + ")</script>");
        }

    }
}
