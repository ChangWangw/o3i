package com.jc.login;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Change
 */
public class LoginHandlerIntercepter implements HandlerInterceptor {


//    LoggerFactory.getLogger(LoginInterceptor.class);
    /**
     * @param request
     * @param response
     * @param arg2
     * @param arg3
     * @throws Exception 进入视图渲染之后调用此方法用来收尾清理资源
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object arg2, Exception arg3) throws Exception {

    }

    /**
     * @param arg0
     * @param arg1
     * @param arg2
     * @param arg3
     * @throws Exception controller处理之后在进入view之前调用此方法
     */
    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3) throws Exception {

    }

    /**
     * @param request
     * @param arg1
     * @param arg2
     * @return true or false
     * @throws Exception 进入controller之前调用此方法
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse arg1, Object arg2) throws Exception {
//        String requestURI = request.getRequestURI();
//        //准备跳转前,拦截到请求，先判断session中是否有值，即是用户名密码是否存在的指标
//        if (requestURI.indexOf("login.do") > 0) {
//            HttpSession session = null;
//            return true;
//        } else {
            return true;
//        }
//            try {
//                System.out.println(session.getAttribute("user"));
//            } catch (Exception e) {
//                System.out.println("无session");
//                e.printStackTrace();
//            }
        //requestURI.indexOf("successLogin.do")>0
        //mapKey在loginUser方法中已经事先放入session了，这里取出判断，是否为空
        //需要注意的是:model.addAttribute放入的数据，在request中get不到
//            Object attribute = request.getSession().getAttribute("user");
//            if(attribute!=null){
//                return true;
//                非空说明数据库中存在对应帐号
//            }else{
//                没有登陆，转向登陆界面
//                request.getRequestDispatcher("/index.jsp").forward(request,arg1);
//                return false;
//            }
//        }else{
//            request.getRequestDispatcher("/index.jsp").forward(request,arg1);
//            return false;
//        }
    }
}
