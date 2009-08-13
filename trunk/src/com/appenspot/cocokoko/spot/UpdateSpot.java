package com.appenspot.cocokoko.spot;

import java.io.IOException;
import java.util.*;

import javax.jdo.PersistenceManager;
import javax.jdo.Transaction;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.appenspot.cocokoko.data.SpotDate;
import com.appenspot.cocokoko.data.PMF;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

public class UpdateSpot extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
    throws IOException, NumberFormatException{
    
        PersistenceManager pm = PMF.get().getPersistenceManager();
        
        /* スポットデータ取得 */
        Integer spotID = Integer.valueOf(req.getParameter("spotID"));
        SpotDate spotdata = pm.getObjectById(SpotDate.class,spotID);
        
        /* ユーザデータ取得 */
        UserService userService = UserServiceFactory.getUserService();
        User user = userService.getCurrentUser();
        
        /* トランザクションの宣言 */
        Transaction tx = pm.currentTransaction();
        
        try {
            /* トランザクション開始 */
            tx.begin();
            
            /* データ更新 */
            spotdata.setCategoryID(Integer.valueOf(req.getParameter("categoryID")));
            spotdata.setSpotNm(req.getParameter("spotNm"));
            spotdata.setLAT(Double.valueOf(req.getParameter("lat")));
            spotdata.setLNG(Double.valueOf(req.getParameter("lng")));
            spotdata.setMemo(req.getParameter("memo"));
            spotdata.setUrl(req.getParameter("url"));
            if (user != null) {
                spotdata.setAddUserNm(user.getNickname());
            } else {
                spotdata.setAddUserNm(null);
            }
            spotdata.setAddDate(new Date());
            
            /* コミット */
            tx.commit();
        } finally {
            /* コミットされていない場合、ロールバック */
            if (tx.isActive()) {
                tx.rollback();
            }
            pm.close();
        }
        
        /* 更新後のページ更新 */
        
     }
}