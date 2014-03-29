package net.wincn.config;

import com.jfinal.config.*;
import com.jfinal.render.ViewType;
import net.wincn.route.SiteRoutes;

/**
 * Description:
 * Author: gefangshuai
 * Create: 2014-03-28 21:52
 */
public class Config extends JFinalConfig{
    @Override
    public void configConstant(Constants me) {
        me.setViewType(ViewType.JSP);
        me.setBaseViewPath("WEB-INF/views");
        me.setDevMode(true);
    }

    @Override
    public void configRoute(Routes me) {
        me.add(new SiteRoutes());
    }

    @Override
    public void configPlugin(Plugins me) {

    }

    @Override
    public void configInterceptor(Interceptors me) {

    }

    @Override
    public void configHandler(Handlers me) {

    }
}
