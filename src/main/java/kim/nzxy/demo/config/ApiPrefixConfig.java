package kim.nzxy.demo.config;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author ly-chn
 */
@Component
public class ApiPrefixConfig implements WebMvcConfigurer {
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        // 给包名以xx结尾的添加统一后缀
        for (String prefix : new String[]{"article", "system"}) {
            configurer.addPathPrefix(prefix, c -> c.getPackageName().endsWith(prefix));
        }
        // c即具体controller类
        configurer.addPathPrefix("前缀", c -> {
            // 是否有相关注解啦
            boolean annotationPresent = c.isAnnotationPresent(RestController.class);
            // 类名啦
            String name = c.getName();
            // 等等你想要的其它的啦
            return false;
        });
    }
}
