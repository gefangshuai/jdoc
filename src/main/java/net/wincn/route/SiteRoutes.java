package net.wincn.route;

import com.jfinal.config.Routes;
import net.wincn.controller.DemoController;
import net.wincn.controller.GenerateController;
import net.wincn.controller.IndexController;

/**
 * Description:
 * Author: gefangshuai
 * Create: 2014-03-28 21:45
 */
public class SiteRoutes extends Routes{
    @Override
    public void config() {
        add("/", IndexController.class);
        add("/generate", GenerateController.class);
        add("/demo", DemoController.class);
    }
}
