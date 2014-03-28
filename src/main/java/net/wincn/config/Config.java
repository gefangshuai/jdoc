package net.wincn.config;

import com.jfinal.config.*;
import net.wincn.route.SiteRoutes;

/**
 * Description:
 * Author: gefangshuai
 * Create: 2014-03-28 21:52
 */
public class Config extends JFinalConfig{
    @Override
    public void configConstant(Constants me) {

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
